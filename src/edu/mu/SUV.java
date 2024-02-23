package edu.mu;

public class SUV extends Vehicle{
	public SUV() {
		
	}
	
	public SUV(String brand, String make, long modelYear, double price, VehicleColor color, FuelType fuelType, double mileage, double mass, int cylinders, double gasTankCapacity, StartMechanism startType) {
		super.type = "SUV";
		super.brand = brand;
		super.make = make;
		super.color = color;
		super.modelYear = modelYear;
		super.price = price;
		super.fuelType = fuelType;
		super.mileage = mileage;
		super.mass = mass;
		super.cylinders = cylinders;
		super.gasTankCapacity = gasTankCapacity;
		super.startType = startType;
	}
	
	public void copy(SUV suv1) {
		this.brand = suv1.brand;
		this.make = suv1.make;
		this.color = suv1.color;
		this.modelYear = suv1.modelYear;
		this.price = suv1.price;
		this.fuelType = suv1.fuelType;
		this.mileage = suv1.mileage;
		this.mass = suv1.mass;
		this.cylinders = suv1.cylinders;
		this.gasTankCapacity = suv1.gasTankCapacity;
		this.startType = suv1.startType;
	}
	
	@Override
	public double calculateMaintenanceCost(double distance) {
		double maintenanceCost;
		maintenanceCost=distance * mass
				* (2024-modelYear) *
				cylinders * 0.001;
		return maintenanceCost;
	}

	@Override
	public double calculateFuelEfficiency(double distance, double fuelPrice) {
		double fuelEfficiency;
		fuelEfficiency = cylinders *
				gasTankCapacity * fuelPrice /
				distance * 0.05;
		return fuelEfficiency;
	}

	@Override
	public void startEngine() {
		System.out.println(this.startType);
		
	}

}
