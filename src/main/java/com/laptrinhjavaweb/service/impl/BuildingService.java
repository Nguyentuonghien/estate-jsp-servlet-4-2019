package com.laptrinhjavaweb.service.impl;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.commons.lang.StringUtils;

import com.laptrinhjavaweb.builder.BuildingSearchBuilder;
import com.laptrinhjavaweb.converter.BuildingConverter;
import com.laptrinhjavaweb.dto.BuildingDTO;
import com.laptrinhjavaweb.entity.BuildingEntity;
import com.laptrinhjavaweb.paging.Pageble;
import com.laptrinhjavaweb.repository.IBuildingRepository;
import com.laptrinhjavaweb.repository.impl.BuildingRepository;
import com.laptrinhjavaweb.service.IBuildingService;

public class BuildingService implements IBuildingService{

	private static IBuildingRepository buildingRepository;
	private static BuildingConverter buildingConverter;

	public static IBuildingRepository getBuildingRepository() {
		if (buildingRepository == null) {
			buildingRepository = new BuildingRepository();
		}
		return buildingRepository;
	}

	public static BuildingConverter getBuildingConverter() {
		if (buildingConverter == null) {
			buildingConverter = new BuildingConverter();
		}
		return buildingConverter;
	}

	@Override
	public BuildingDTO save(BuildingDTO buildingDTO) {
		BuildingEntity buildingEntity = buildingConverter.convertToEntity(buildingDTO) ;
		buildingEntity.setCreatedDate(new Timestamp(System.currentTimeMillis()));
		Long id = buildingRepository.insert(buildingEntity);
		return null;
	}

	@Override
	public BuildingDTO update(BuildingDTO buildingDTO) {
		BuildingConverter buildingConverter = new BuildingConverter();
		BuildingEntity buildingEntity = buildingConverter.convertToEntity(buildingDTO);
		buildingEntity.setCreatedDate(new Timestamp(System.currentTimeMillis()));
		buildingRepository.update(buildingEntity);
		return null;
	}

	@Override
	public BuildingDTO delete(BuildingDTO newBuilding) {
		return null;
	}

	@Override
	public List<BuildingDTO> findAll(BuildingSearchBuilder builder, Pageble pageble) {	
		/*//Cách 1: dùng java7
		List<BuildingDTO> results= new ArrayList<>();
		//phải scan tự động:
		Map<String, Object> properties = buildMapSearch(builder);
		//Key phải giống tên trong database:
		List<BuildingEntity> buildingEntities = buildingRepository.findAll(properties, pageble);
		//convert tu entity sang DTO:
		for (BuildingEntity items : buildingEntities) {
			BuildingDTO buildingDTO= buildingConverter.convertToDTO(items);
			results.add(buildingDTO);
		}
		return results;*/

		//Cách 2: dùng java8:
		List<BuildingEntity> buildingEntities = getBuildingRepository().findAll(builder, pageble);	
		List<BuildingDTO> results = buildingEntities.stream()
				.map(item -> buildingConverter.convertToDTO(item))
				.collect(Collectors.toList());
		return results;
	}

}











