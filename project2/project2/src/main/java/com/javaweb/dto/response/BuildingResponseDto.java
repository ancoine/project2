package com.javaweb.dto.response;

public class BuildingResponseDto {
	private String buildingID;
	 private String buildingName;
	    private String address;
	    private Integer numberOfBasements;
	    private String managerName;
	    private String managerPhone;
	    private Double floorArea;
	    private Double vacantArea;
	    private Double rentalArea;
	    private Double rentalPrice;
	    private Double serviceFee;
	    private Double brokerageFee;
		public String getBuildingID() {
			return buildingID;
		}
		public void setBuildingID(String buildingID) {
			this.buildingID = buildingID;
		}
		public String getBuildingName() {
			return buildingName;
		}
		public void setBuildingName(String buildingName) {
			this.buildingName = buildingName;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public Integer getNumberOfBasements() {
			return numberOfBasements;
		}
		public void setNumberOfBasements(Integer numberOfBasements) {
			this.numberOfBasements = numberOfBasements;
		}
		public String getManagerName() {
			return managerName;
		}
		public void setManagerName(String managerName) {
			this.managerName = managerName;
		}
		public String getManagerPhone() {
			return managerPhone;
		}
		public void setManagerPhone(int i) {
			this.managerPhone = i;
		}
		public Double getFloorArea() {
			return floorArea;
		}
		public void setFloorArea(Double floorArea) {
			this.floorArea = floorArea;
		}
		public Double getVacantArea() {
			return vacantArea;
		}
		public void setVacantArea(Double vacantArea) {
			this.vacantArea = vacantArea;
		}
		public Double getRentalArea() {
			return rentalArea;
		}
		public void setRentalArea(Double rentalArea) {
			this.rentalArea = rentalArea;
		}
		public Double getRentalPrice() {
			return rentalPrice;
		}
		public void setRentalPrice(Double rentalPrice) {
			this.rentalPrice = rentalPrice;
		}
		public Double getServiceFee() {
			return serviceFee;
		}
		public void setServiceFee(Double serviceFee) {
			this.serviceFee = serviceFee;
		}
		public Double getBrokerageFee() {
			return brokerageFee;
		}
		public void setBrokerageFee(Double brokerageFee) {
			this.brokerageFee = brokerageFee;
		}
}
