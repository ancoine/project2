package com.javaweb.Service;

import java.util.List;

import com.javaweb.dto.response.BuildingResponseDto;

public interface BuildingService {
	 List<BuildingResponseDto> findAll(String name, Double floorArea, Long districtId, String ward,
             String street, Integer numberOfBasements, String orientation,
             String level, Double floorAreaFrom, Double floorAreaTo,
             Long rentPriceFrom, Long rentPriceTo, String managerName,
             String managerPhone, String staffInCharge, String buildingType);
}
