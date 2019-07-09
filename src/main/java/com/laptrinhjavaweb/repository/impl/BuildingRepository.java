 package com.laptrinhjavaweb.repository.impl;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.laptrinhjavaweb.builder.BuildingSearchBuilder;
import com.laptrinhjavaweb.entity.BuildingEntity;
import com.laptrinhjavaweb.paging.Pageble;
import com.laptrinhjavaweb.repository.IBuildingRepository;

public class BuildingRepository extends AbstractJDBC<BuildingEntity> implements IBuildingRepository{

	@Override
	public List<BuildingEntity> findAll(BuildingSearchBuilder builder, Pageble pageble) {
		Map<String, Object> properties = buildMapSearch(builder);
		StringBuilder whereClause = new StringBuilder();
		//giá thuê:
		if (builder.getCostRentFrom() != null) {
			whereClause.append(" AND costrent >= "+builder.getCostRentFrom());
		}
		if (builder.getCostRentTo() != null) {
			whereClause.append(" AND costrent <= "+builder.getCostRentTo());
		}
		//diện tích thuê từ...đến...:
		if (builder.getAreaRentFrom() != null || builder.getAreaRentTo() != null) {
			//để append với câu sql trước(phần fillAll() của AbstracJDBC) --> dùng AND:
			whereClause.append(" AND EXISTS (SELECT * FROM rentarea ra WHERE (ra.buildingId = A.id");
			if (builder.getAreaRentFrom() != null) {
				whereClause.append("AND ra.value >= '"+builder.getAreaRentFrom()+"'");
			}
			if (builder.getAreaRentTo() != null) {
				whereClause.append("AND ra.value <= '"+builder.getAreaRentTo()+"'");	
			}
			whereClause.append("))");
		}
		//loại tòa nhà:
		if (builder.getBuildingTypes().length > 0) {
			whereClause.append("AND (A.type LIKE '%"+builder.getBuildingTypes()[0]+"%'");
			//dùng "OR" tức là chỉ cần tòa nhà đó thỏa mãn 1 đk 
			//(tầng trệt  or nguyên căn or nội thât):
			/*for(String type : builder.getBuildingTypes()) {
				if (!type.equals(builder.getBuildingTypes()[0])) {
					whereClause.append(" OR A.type LIKE '%"+type+"%'");
				}				
			}*/
			//java 8:
			Arrays.stream(builder.getBuildingTypes())
			              .filter(item -> !item.equals(builder.getBuildingTypes()[0]))
			              .forEach(item -> whereClause.append(" OR A.type LIKE '%"+item+"%'"));		
			whereClause.append("))");
		}
		return findAll(properties, pageble, whereClause.toString()+"");
	}
	
	private Map<String, Object> buildMapSearch(BuildingSearchBuilder builder) {
		Map<String, Object> result = new HashMap<>();
		try {
			Field[] fields = BuildingSearchBuilder.class.getDeclaredFields();
			for(Field field : fields) {
				if (!field.getName().equals("buildingTypes") && 
						!field.getName().startsWith("costRent") &&
						!field.getName().startsWith("areaRent")) {
					field.setAccessible(true);
					//4 cái còn lại: name, ward, street, numberOfBasement:
					if (field.get(builder) != null) { 
						result.put(field.getName().toLowerCase(), field.get(builder));
					}
				}
			}
		}catch(IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}
		return result;
	}
}
