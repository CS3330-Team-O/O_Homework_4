package edu.mu;

public class Truck extends Vehicle{
	public Truck() {

	}

	public Truck(String brand, String make, long modelYear, double price, VehicleColor color, FuelType fuelType, double mileage, double mass, int cylinders, double gasTankCapacity, StartMechanism startType) {
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

	public void copy(Truck truck1) {
		this.brand = truck1.brand;
		this.make = truck1.make;
		this.color = truck1.color;
		this.modelYear = truck1.modelYear;
		this.price = truck1.price;
		this.fuelType = truck1.fuelType;
		this.mileage = truck1.mileage;
		this.mass = truck1.mass;
		this.cylinders = truck1.cylinders;
		this.gasTankCapacity = truck1.gasTankCapacity;
		this.startType = truck1.startType;
	}

	@Override
	public double calculateMaintenanceCost(double distance) {
		double maintenanceCost;
		maintenanceCost=distance * mass
				* (2024-modelYear) *
				cylinders * 0.002;
		return maintenanceCost;
	}

	@Override
	public double calculateFuelEfficiency(double distance, double fuelPrice) {
		double fuelEfficiency;
		fuelEfficiency = cylinders *
				gasTankCapacity * fuelPrice /
				distance * 0.1;

		return fuelEfficiency;
	}

	@Override
	public void startEngine() {
		System.out.println(this.startType);

	}

}
