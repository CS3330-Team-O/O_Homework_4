# O_Homework_4

<b><h2>Abstract Class: Vehicle (ISAIAH)</h2></b>
<h3>Properties:</h3>
protected String type;
<br />
protected String brand;
<br />
protected String make;
<br />
protected long modelYear;
<br />
protected double price;
<br />
protected VehicleColor color;
<br />
protected FuelType fuelType;
<br />
protected double mileage;
<br />
protected double mass;
<br />
protected int cylinders;
<br />
protected double gasTankCapacity;
<br />
protected StartMechanism startType;
<br />

<h3>Abstract Methods:</h3>
public abstract double calculateMaintenanceCost(double distance)
<br />
public abstract double calculateFuelEfficiency(double distance, double fuelPrice)
<br />
public abstract void startEngine()
<br />

<h3>Sub Classes:</h3>
Car 
<br />
Truck 
<br />
SUV 
<br />
MotorBike
<br />

<h3>Description:</h3>
Vehicle offers an abstract class that encapsulates all given vehicle types in the CSV file as well as necessary abstract methods and getters and setters.

<b><h2>Enums: (ASHLEY)<h2></b>
<h3>FuelType:</h3>
GASOLINE
<br />
DIESEL
<br />
ELECTRIC
<br />
HYBRID
<br />

<h3>StartMechanism:</h3>
KEYSTART
<br />
PUSHSTART
<br />
KICKSTART
<br />

<h3>VehicleColor:</h3>
BLACK
<br />
RED 
<br />
BLUE
<br />
BROWN
<br />
WHITE
<br />
YELLOW
<br />
GRAY
<br />

<b><h2>VehicleManager Class:<h2></b>
<h3>Properties:</h3>
String vehicleFilePath = "./vehicleList.csv"
<br />
public ArrayList <Vehicle> vehicleList = new ArrayList<>()
<br />
private final static double distance = 300.0
<br />
private final static double fuelPrice = 3.25
<br />

<h3>Methods:</h3>
<h4>ASHLEY:</h4>
public VehicleManager(String fileName)
<br />
public VehicleManager()
<br />
public boolean readFromFile(String fileName)
<br />
public boolean removeVehicle(Vehicle vehicle)
<br />
public boolean addVehicle(Vehicle vehicle) 
<br />
public boolean saveVehicleList()
<br />
<h4>SYDNEY</h4>
public void displayAllCarInformation()
<br />
public void displayAllTruckInformation()
<br />
public void displayAllSUVInformation()
<br />
public void displayAllMotorBikeInformation()
<br />
public void displayVehicleInformation(Vehicle v)
<br />
public void displayAllVehicleInformation() 
<br />

<h4>ISAIAH</h4>
private <T> boolean isVehicleType(Vehicle v, Class<T> clazz)
<br />
public int getNumberOfVehichlesByType(@SuppressWarnings("rawtypes") Class clazz)
<br />
<h4>DAVID</h4>
public Vehicle getVehicleWithHighestMaintenanceCost(double distance)
<br />
public Vehicle getVehicleWithLowestMaintenanceCost(double distance)
<br />
public ArrayList<Vehicle> getVehicleWithHighestFuelEfficiency(double distance, double fuelPrice)
<br />
public ArrayList<Vehicle> getVehicleWithLowestFuelEfficiency(double distance, double fuelPrice)
<br />
public double getAverageFuelEfficiencyOfSUVs(double distance, double fuelPrice)
<br />

<h3>Description:</h3>
The VehicleManager class allows for concise pull from a provided csv file of available vehicles organized into one inventory. Each Vehicle has a unique subclass but still fall under the superclass allowing for simple insertion, deletion, queries, and data organization.












