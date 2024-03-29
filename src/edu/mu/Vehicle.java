package edu.mu;

public abstract class Vehicle {
	protected String type;
	protected String brand;
	protected String make;
	protected long modelYear;
	protected double price;
	protected VehicleColor color;
	protected FuelType fuelType;
	protected double mileage;
	protected double mass;
	protected int cylinders;
	protected double gasTankCapacity;
	protected StartMechanism startType;
	

	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public Long getModelYear() {
		return modelYear;
	}
	public void setModelYear(Long modelYear) {
		this.modelYear = modelYear;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public VehicleColor getColor() {
		return color;
	}
	public void setColor(VehicleColor color) {
		this.color = color;
	}
	public FuelType getFuelType() {
		return fuelType;
	}
	public void setFuelType(FuelType fuelType) {
		this.fuelType = fuelType;
	}
	public double getMileage() {
		return mileage;
	}
	public void setMileage(double mileage) {
		this.mileage = mileage;
	}
	public double getMass() {
		return mass;
	}
	public void setMass(double mass) {
		this.mass = mass;
	}
	public int getCylinders() {
		return cylinders;
	}
	public void setCylinders(int cylinders) {
		this.cylinders = cylinders;
	}
	public double getGasTankCapacity() {
		return gasTankCapacity;
	}
	public void setGasTankCapacity(double gasTankCapacity) {
		this.gasTankCapacity = gasTankCapacity;
	}
	public StartMechanism getStartType() {
		return startType;
	}
	public void setStartType(StartMechanism startType) {
		this.startType = startType;
	}
  
	public static FuelType convertStringToFuelType(String fuelType) {
		switch (fuelType) {
			case "GASOLINE":
				return FuelType.GASOLINE;
			case "DIESEL":
				return FuelType.DIESEL;
			case "ELECTRIC":
				return FuelType.ELECTRIC;
			default:
				return FuelType.HYBRID;
		}
	}
	
	public static StartMechanism convertStringToStartMechanism(String startType) {
		switch (startType) {
			case "KEYSTART":
				return StartMechanism.KEYSTART;
			case "KICKSTART":
				return StartMechanism.KICKSTART;
			default:
				return StartMechanism.PUSHSTART;
		}
	}
	
	public static VehicleColor convertStringToVehicleColor(String color) {
		switch (color) {
			case "WHITE":
				return VehicleColor.WHITE;
			case "BLACK":
				return VehicleColor.BLACK;
			case "RED":
				return VehicleColor.RED;
			case "YELLOW":
				return VehicleColor.YELLOW;
			case "GRAY":
				return VehicleColor.GRAY;
			case "BLUE":
				return VehicleColor.BLUE;
			default:
				return VehicleColor.BROWN;
			}
		}
  
	@Override
	public String toString() {
		return "Vehicle [brand=" + brand + ", make=" + make + ", modelYear=" + modelYear + ", price=" + price
				+ ", color=" + color + ", fuelType=" + fuelType + ", mileage=" + mileage + ", mass=" + mass
				+ ", cylinders=" + cylinders + ", gasTankCapacity=" + gasTankCapacity + ", startType=" + startType
				+ "]";
	}
	public abstract double calculateMaintenanceCost(double distance);
	public abstract double calculateFuelEfficiency(double distance, double fuelPrice);
	public abstract void startEngine();
}
