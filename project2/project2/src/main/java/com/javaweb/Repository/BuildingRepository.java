package com.javaweb.Repository;

import java.util.List;

import com.javaweb.Repository.Entity.BuildingEntity;

public interface BuildingRepository {
 List<BuildingEntity> findAll(String name, Long districtId, Double floorArea, String ward,
         String street, Integer numberOfBasements, String orientation,
         String level, Double floorAreaFrom, Double floorAreaTo,
         Long rentPriceFrom, Long rentPriceTo, String managerName,
         String managerPhone, String staffInCharge, String buildingType);
}
