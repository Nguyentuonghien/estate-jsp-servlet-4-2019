 package com.laptrinhjavaweb.repository.impl;

import com.laptrinhjavaweb.entity.BuildingEntity;
import com.laptrinhjavaweb.repository.IBuildingRepository;

public class BuildingRepository extends AbstractJDBC<BuildingEntity> implements IBuildingRepository{

	/*@Override
	public Long insert(BuildingEntity entity) {
		
		StringBuilder sql = new StringBuilder("INSERT INTO building(name, numberofbasement, buildingarea, district, ward, street, structure, costrent, costdescription, servicecost)");
		sql.append(",carcost, motorbikecost, overtimecost, electricitycost, deposit, payment, timecontract, timedecorator, managername, managerphone, type");
		sql.append(",createdby, modifiedby, createddate, modifieddate) ");
		sql.append(" VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");	
		return null;		
	}
*/
}
