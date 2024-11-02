package com.javaweb.Api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.javaweb.*;
import com.javaweb.dto.response.*;
import com.javaweb.Service.BuildingService;

public class BuildingAPI {
@Autowired
private BuildingService buildingService;
@GetMapping("/api/buildings")
public List<BuildingResponseDto> getBuildings(
        @RequestParam(required = false) String name,
        @RequestParam(required = false) Double floorArea,
        @RequestParam(required = false) Long districtId,
        @RequestParam(required = false) String ward,
        @RequestParam(required = false) String street,
        @RequestParam(required = false) Integer numberOfBasements,
        @RequestParam(required = false) String orientation,
        @RequestParam(required = false) String level,
        @RequestParam(required = false) Double floorAreaFrom,
        @RequestParam(required = false) Double floorAreaTo,
        @RequestParam(required = false) Long rentPriceFrom,
        @RequestParam(required = false) Long rentPriceTo,
        @RequestParam(required = false) String managerName,
        @RequestParam(required = false) String managerPhone,
        @RequestParam(required = false) String staffInCharge,
        @RequestParam(required = false) String buildingType) {
    return buildingService.findAll(name, floorArea, districtId, ward, street,
            numberOfBasements, orientation, level, floorAreaFrom, floorAreaTo,
            rentPriceFrom, rentPriceTo, managerName, managerPhone, staffInCharge, buildingType);
}
}
