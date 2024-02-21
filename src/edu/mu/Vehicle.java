package edu.mu;

public class Vehicle {
	
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
}
