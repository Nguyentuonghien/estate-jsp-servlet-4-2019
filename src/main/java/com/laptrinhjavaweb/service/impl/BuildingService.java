package com.laptrinhjavaweb.service.impl;

import java.sql.Timestamp;
import java.util.List;
import java.util.Map;

import com.laptrinhjavaweb.builder.BuildingSearchBuilder;
import com.laptrinhjavaweb.converter.BuildingConverter;
import com.laptrinhjavaweb.dto.BuildingDTO;
import com.laptrinhjavaweb.entity.BuildingEntity;
import com.laptrinhjavaweb.paging.Pageble;
import com.laptrinhjavaweb.repository.IBuildingRepository;
import com.laptrinhjavaweb.repository.impl.BuildingRepository;
import com.laptrinhjavaweb.service.IBuildingService;

public class BuildingService implements IBuildingService{

	private IBuildingRepository buildingRepository;
	
	public BuildingService() {
		buildingRepository = new BuildingRepository();
	}
	
	@Override
	public BuildingDTO save(BuildingDTO buildingDTO) {
		BuildingConverter buildingConverter = new BuildingConverter();
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
		
		return null;
	}


}
