class Vehicle {
	private int passengers;
	private int fuelcap;
    private int mpg;
    
    Vehicle(int p, int f, int m) {
        passengers = p;
        fuelcap = f;
        mpg = m;
    }

    // return the range
    int range() {
        return mpg * fuelcap;
    }

    // compute fuel needed for a certain distance
    double fuelNeeded(int miles) {
        return (double) miles/mpg;
    }

    // accessor methods for member variables
    int getPassengers() { return passengers; }
    int getFuelcap() { return fuelcap; }
    int getMpg () { return mpg; }
    void setPassengers(int p) { passengers = p; }
    void setFuelCap(int f) { fuelcap = f; }
    void setMpg(int m) { mpg = m; }
}

class Truck extends Vehicle {
    private int cargocap; // cargocapacity in kg
    
    Truck(int p, int f, int m, int c) {
        super(p, f, m);
        cargocap = c;
    }

    // accessor methods for cargocap
    int getCargo() { return cargocap; }
    void putCargo(int c) { cargocap = c; }
}

class TruckDemo {
    public static void main(String[] args) {
        Truck semi = new Truck(2, 200, 7, 44000);
        Truck pickup = new Truck(3, 28, 15, 2000);
        double gallons;
        int dist = 252;

        gallons = semi.fuelNeeded(dist);

        System.out.println("Semi can carry " + semi.getCargo() + " pounds.");
        System.out.println("To go " + dist + " miles semi needs " + gallons + " gallons of fuel.");

        gallons = pickup.fuelNeeded(dist);

        System.out.println("Pickup can carry " + pickup.getCargo() + " pounds.");
        System.out.println("To go " + dist + " miles pikcup needs " + gallons + " gallons of fuel.");
    }
}