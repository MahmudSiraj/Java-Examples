class Vehicle {
	int passengers;
	int fuelcap;
	int mpg;
}

 class VehicleDemo {
	public static void main(String args[]) {
	Vehicle miniVan = new Vehicle();
	int range;

	miniVan.passengers = 6;
	miniVan.fuelcap = 7;
	miniVan.mpg = 21;

	range = miniVan.fuelcap * miniVan.mpg;
	System.out.println("Minivan can carry " + miniVan.passengers + " with a range of " + range);

	}
 }
