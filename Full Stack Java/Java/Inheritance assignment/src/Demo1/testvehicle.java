package Demo1;
class vehicle{
	String brandname;
	String modelname;
	int speed;
	vehicle(){//default constructor
		brandname="TATA";
	    modelname="NEXON";
	    speed=90;
	}
	vehicle(String brandname, String modelname ,int speed){
		this.brandname=brandname;
		this.modelname=modelname;
		this.speed=speed;
	}
	String getBrandname() {
		return brandname;
	}
	void setBrandname(String brandname) {
		this.brandname = brandname;
	}
	String getModelname() {
		return modelname;
	}
	void setModelname(String modelname) {
		this.modelname = modelname;
	}
	int getSpeed() {
		return speed;
	}
	void setSpeed(int speed) {
		this.speed = speed;
	}
	void start() {
		System.out.println(brandname + " " + modelname + " is starting...");
	}
	void stop() {
		System.out.println(brandname + " " + modelname + " has stopped.");
	}
	void display() {
		System.out.println("Brandname is:"+this.brandname);
		System.out.println("Modelname is:"+this.modelname);
		System.out.println("Speed of vehicle is:"+this.speed);
	}
	
}//vehicle class ends here
class car extends vehicle{ //car class starts
	String fueltype;
	int seats;
	
	car(){ //default constructor
		super();
		fueltype="Petrol";
		seats=5;
	}
	car(String brandname, String modelname, int speed,String fueltype, int seats){
		super(brandname,modelname,speed);
		this.fueltype=fueltype;
		this.seats=seats;
	}
	String getFueltype() {
		return fueltype;
	}
	void setFueltype(String fueltype) {
		this.fueltype = fueltype;
	}
	int getSeats() {
		return seats;
	}
	void setSeats(int seats) {
		this.seats = seats;
	}
    void playMusic() {
	  System.out.println(brandname + " " + modelname + " is playing music.");
	 }
    void turnOnAC() {
	  System.out.println("Air conditioning turned on in " + brandname + " " + modelname + ".");
	 }
    void display() {
    	super.display();
    	System.out.println("Fueltype of car is:"+this.fueltype);
    	System.out.println("Seats in car are:"+this.seats);
    }
	
}//class car ends here

public class testvehicle {

	public static void main(String[] args) {
		 car c1 = new car();
	        c1.display();
	        c1.start();
	        c1.playMusic();
	        c1.turnOnAC();
	        c1.stop();
	        System.out.println();

	        car c2 = new car("Tesla", "Model S", 200, "Electric", 5);
	        c2.display();
	        c2.start();
	        c2.playMusic();
	        c2.turnOnAC();
	        c2.stop();
	}

}
