package Demo1;
class Device {
    String brand;
    int batteryLevel;
    Device(){//default constructor
    	brand="Samsung";
    	batteryLevel=96;
    }
    Device(String brand,int batteryLevel){//parameterized constructor
    	this.brand=brand;
    	this.batteryLevel=batteryLevel;
    }
    

    String getBrand() {
		return brand;
	}
	void setBrand(String brand) {
		this.brand = brand;
	}
	int getBatteryLevel() {
		return batteryLevel;
	}
	void setBatteryLevel(int batteryLevel) {
		this.batteryLevel = batteryLevel;
	}
	void turnOn() {
		System.out.println(brand + " is turning on..."); 
		}
    void turnOff() { 
    	System.out.println(brand + " is turning off..."); 
    	}
    void display() {
    	System.out.println("Brand name of device is:"+this.brand);
    	System.out.println("Batterylevel of device is:"+this.batteryLevel);
    }
}//class Device ends here

class Smartphone extends Device {
    String osVersion;
    int cameraResolution;
    Smartphone(){ //default constructor
    	super();
    	osVersion="Android 15";
    	cameraResolution=50;
    }
    Smartphone(String brand,int batteryLevel, String osVersion, int cameraResolution){
    	super(brand,batteryLevel);
    	this.osVersion=osVersion;
    	this.cameraResolution=cameraResolution;
    }
      
    String getOsVersion() {
		return osVersion;
	}
	void setOsVersion(String osVersion) {
		this.osVersion = osVersion;
	}
	int getCameraResolution() {
		return cameraResolution;
	}
	void setCameraResolution(int cameraResolution) {
		this.cameraResolution = cameraResolution;
	}
	void takePhoto(){
    	System.out.println("Taking a photo with " + cameraResolution + "MP camera."); 
    	}
    void installApp(String app) { 
    	System.out.println("Installing " + app + " on " + osVersion); 
    	}
    void display() {
    	super.display();
    	System.out.println("osVersion of Smartphone is:"+this.osVersion);
    	System.out.println("cameraResolution of Smartphone is:"+this.cameraResolution);
    }
}// class Smartphone ends here


public class testdevice {

	public static void main(String[] args) {
		Smartphone p1=new Smartphone();
		p1.display();
		p1.turnOn();
		p1.turnOff();
		p1.takePhoto();
		p1.installApp("Facebook");

	}

}
