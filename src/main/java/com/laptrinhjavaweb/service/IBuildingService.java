package com.laptrinhjavaweb.service;

import com.laptrinhjavaweb.dto.BuildingDTO;

public interface IBuildingService {
	BuildingDTO save(BuildingDTO newBuilding);
	BuildingDTO update(BuildingDTO newBuilding);
	BuildingDTO delete(BuildingDTO newBuilding);
}
