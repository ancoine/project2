package com.javaweb.Repository.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.javaweb.Repository.BuildingRepository;
import com.javaweb.Repository.Entity.BuildingEntity;
@Repository
public class BuildingRepositoryImpl implements BuildingRepository {
     static final String DB_URL="jdbc:mysql://localhost:3307/estatebasic";
     static final String USER="root";
     static final String PASS="123456";
	@Override
	public List<BuildingEntity> findAll(String name, Long districtId, Double floorArea, String ward, String street,
			Integer numberOfBasements, String orientation, String level, Double floorAreaFrom, Double floorAreaTo,
			Long rentPriceFrom, Long rentPriceTo, String managerName, String managerPhone, String staffInCharge,
			String buildingType) {
		List<BuildingEntity> buildings = new ArrayList<>();
		 String sql = "SELECT * FROM building WHERE " +
	                "(name LIKE ? OR ? IS NULL) AND " +
	                "(floorArea = ? OR ? IS NULL) AND " +
	                "(districtId = ? OR ? IS NULL) AND " +
	                "(ward LIKE ? OR ? IS NULL) AND " +
	                "(street LIKE ? OR ? IS NULL) AND " +
	                "(numberOfBasements = ? OR ? IS NULL) AND " +
	                "(orientation LIKE ? OR ? IS NULL) AND " +
	                "(level LIKE ? OR ? IS NULL) AND " +
	                "(floorArea BETWEEN ? AND ? OR (? IS NULL AND ? IS NULL)) AND " +
	                "(rentPrice BETWEEN ? AND ? OR (? IS NULL AND ? IS NULL)) AND " +
	                "(managerName LIKE ? OR ? IS NULL) AND " +
	                "(managerPhone = ? OR ? IS NULL) AND " +
	                "(staffInCharge LIKE ? OR ? IS NULL) AND " +
	                "(buildingType LIKE ? OR ? IS NULL)";

	        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
	             PreparedStatement pstmt = conn.prepareStatement(sql)) {
	            
	            pstmt.setString(1, name != null ? "%" + name + "%" : null);
	            pstmt.setString(2, name);
	            pstmt.setObject(3, floorArea);
	            pstmt.setObject(4, floorArea);
	            pstmt.setObject(5, districtId);
	            pstmt.setObject(6, districtId);
	            pstmt.setString(7, ward != null ? "%" + ward + "%" : null);
	            pstmt.setString(8, ward);
	            pstmt.setString(9, street != null ? "%" + street + "%" : null);
	            pstmt.setString(10, street);
	            pstmt.setObject(11, numberOfBasements);
	            pstmt.setObject(12, numberOfBasements);
	            pstmt.setString(13, orientation != null ? "%" + orientation + "%" : null);
	            pstmt.setString(14, orientation);
	            pstmt.setString(15, level != null ? "%" + level + "%" : null);
	            pstmt.setString(16, level);
	            pstmt.setObject(17, floorAreaFrom);
	            pstmt.setObject(18, floorAreaTo);
	            pstmt.setObject(19, floorAreaFrom);
	            pstmt.setObject(20, floorAreaTo);
	            pstmt.setObject(21, rentPriceFrom);
	            pstmt.setObject(22, rentPriceTo);
	            pstmt.setObject(23, rentPriceFrom);
	            pstmt.setObject(24, rentPriceTo);
	            pstmt.setString(25, managerName != null ? "%" + managerName + "%" : null);
	            pstmt.setString(26, managerName);
	            pstmt.setString(27, managerPhone);
	            pstmt.setString(28, managerPhone);
	            pstmt.setString(29, staffInCharge != null ? "%" + staffInCharge + "%" : null);
	            pstmt.setString(30, staffInCharge);
	            pstmt.setString(31, buildingType != null ? "%" + buildingType + "%" : null);
	            pstmt.setString(32, buildingType);

	            
	            try (ResultSet rs = pstmt.executeQuery()) {
	                while (rs.next()) {
	                    BuildingEntity building = new BuildingEntity();
	                    building.setName(rs.getString("name"));
	                    building.setFloorarea(rs.getDouble("floorArea"));
	                    building.setBuildingtype(buildingType);
	                    building.setWard(rs.getString("ward"));
	                    building.setStreet(rs.getString("street"));
	                    building.setNumberofbasement(rs.getInt("numberOfBasements"));
	                    building.setDirection(rs.getString("orientation"));
	                    building.setLevel(rs.getString("level"));
	                    building.setFloorareafrom(floorAreaFrom);
	                    building.setFloorareato(floorAreaTo);
	                    building.setRentpricefrom(rentPriceFrom);
	                    building.setRentpriceto(rentPriceTo);
	                    building.setManagername(rs.getString("managerName"));
	                    building.setManagerphonenumber(0);
	                    building.setStaffincharge(rs.getString("staffInCharge"));
	                    building.setBuildingtype(rs.getString("buildingType"));
	                    buildings.add(building);
	                }
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }

	        return buildings;
	    }

}
 

