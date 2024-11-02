package com.javaweb.Service.Impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaweb.Repository.BuildingRepository;
import com.javaweb.Repository.Entity.BuildingEntity;
import com.javaweb.Service.BuildingService;
import com.javaweb.dto.response.BuildingResponseDto;

@Service
public class BuildingServiceImpl implements BuildingService{
 @Autowired
 private BuildingRepository buildingRepository;
	@Override
	public List<BuildingResponseDto> findAll(String name, Double floorArea, Long districtId, String ward, String street,
			Integer numberOfBasements, String orientation, String level, Double floorAreaFrom, Double floorAreaTo,
			Long rentPriceFrom, Long rentPriceTo, String managerName, String managerPhone, String staffInCharge,
			String buildingType) {
		List<BuildingEntity> buildingEntities = buildingRepository.findAll(name, districtId, floorArea, ward, street, numberOfBasements, orientation, level, floorAreaFrom, floorAreaTo, rentPriceFrom, rentPriceTo, managerName, managerPhone, staffInCharge, buildingType);
		List<BuildingResponseDto> result = new ArrayList<BuildingResponseDto>();
		for(BuildingEntity it : buildingEntities) {
			BuildingResponseDto buildingResponseDto = new BuildingResponseDto();
			buildingResponseDto.setBuildingID(it.getBuildingtype());
			buildingResponseDto.setBuildingName(it.getName());
	        buildingResponseDto.setAddress(it.getDistrictid()+it.getStreet()+it.getWard()); 
	        buildingResponseDto.setNumberOfBasements(it.getNumberofbasement());
	        buildingResponseDto.setManagerName(it.getManagername());
	        buildingResponseDto.setManagerPhone(it.getManagerphonenumber());
	        buildingResponseDto.setFloorArea(it.getFloorarea());
	      
	        result.add(buildingResponseDto);
		}
		return null;
	}


}
