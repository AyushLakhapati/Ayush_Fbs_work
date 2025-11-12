package Demo1;

class Farmer {
    String name;
    int age;
    double landArea;      // in acres
    String location;

    // Default constructor
    Farmer() {
        name = "Not Given";
        age = 35;
        landArea = 10.0;
        location = "Unknown Village";
    }

    // Parameterized constructor
    Farmer(String name, int age, double landArea, String location) {
        this.name = name;
        this.age = age;
        this.landArea = landArea;
        this.location = location;
    }

    String getName() { return name; }
    void setName(String name) { this.name = name; }

    int getAge() { return age; }
    void setAge(int age) { this.age = age; }

    double getLandArea() { return landArea; }
    void setLandArea(double landArea) { this.landArea = landArea; }

    String getLocation() { return location; }
    void setLocation(String location) { this.location = location; }

    void display() {
        System.out.println("Farmer Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Land Area: " + landArea + " acres");
        System.out.println("Location: " + location);
    }
}// farmer class ends here

// Derived class 1
class DairyFarmer extends Farmer {
    int numberOfCows;
    double milkProductionPerDay; // in liters
    String dairyBrandName;
    boolean usesAutomaticMilkingSystem;
   
    DairyFarmer() { // Default constructor
        super();
        numberOfCows = 15;
        milkProductionPerDay = 120.0;
        dairyBrandName = "PureMilk Dairy";
        usesAutomaticMilkingSystem = false;
    }
    // Parameterized constructor
    DairyFarmer(String name, int age, double landArea, String location,
                int numberOfCows, double milkProductionPerDay, String dairyBrandName, boolean usesAutomaticMilkingSystem) {
        super(name, age, landArea, location);
        this.numberOfCows = numberOfCows;
        this.milkProductionPerDay = milkProductionPerDay;
        this.dairyBrandName = dairyBrandName;
        this.usesAutomaticMilkingSystem = usesAutomaticMilkingSystem;
    }

    void display() {
        System.out.println("---- Dairy Farmer ----");
        super.display();
        System.out.println("Number of Cows: " + numberOfCows);
        System.out.println("Milk Production per Day: " + milkProductionPerDay + " liters");
        System.out.println("Dairy Brand Name: " + dairyBrandName);
        System.out.println("Uses Automatic Milking System: " + usesAutomaticMilkingSystem);
    }
}//class DairyFarmer ends here

class PoultryFarmer extends Farmer {
    int numberOfHens;
    double eggProductionPerDay; // in dozens
    String poultryBreedType;
    boolean hasIncubator;

    PoultryFarmer() {
        super();
        numberOfHens = 100;
        eggProductionPerDay = 20.0;
        poultryBreedType = "Broiler";
        hasIncubator = true;
    }

    PoultryFarmer(String name, int age, double landArea, String location,
                  int numberOfHens, double eggProductionPerDay, String poultryBreedType, boolean hasIncubator) {
        super(name, age, landArea, location);
        this.numberOfHens = numberOfHens;
        this.eggProductionPerDay = eggProductionPerDay;
        this.poultryBreedType = poultryBreedType;
        this.hasIncubator = hasIncubator;
    }

    void display() {
        System.out.println("---- Poultry Farmer ----");
        super.display();
        System.out.println("Number of Hens: " + numberOfHens);
        System.out.println("Egg Production per Day: " + eggProductionPerDay + " dozens");
        System.out.println("Poultry Breed Type: " + poultryBreedType);
        System.out.println("Has Incubator: " + hasIncubator);
    }
}//class poultryfarmer ends here

class OrganicFarmer extends Farmer {
    double organicLandArea; // in acres
    String mainCropType;
    boolean usesCompost;
    boolean certifiedOrganic;

    OrganicFarmer() {
        super();
        organicLandArea = 8.0;
        mainCropType = "Vegetables";
        usesCompost = true;
        certifiedOrganic = false;
    }

    OrganicFarmer(String name, int age, double landArea, String location,
                  double organicLandArea, String mainCropType, boolean usesCompost, boolean certifiedOrganic) {
        super(name, age, landArea, location);
        this.organicLandArea = organicLandArea;
        this.mainCropType = mainCropType;
        this.usesCompost = usesCompost;
        this.certifiedOrganic = certifiedOrganic;
    }

    void display() {
        System.out.println("---- Organic Farmer ----");
        super.display();
        System.out.println("Organic Land Area: " + organicLandArea + " acres");
        System.out.println("Main Crop Type: " + mainCropType);
        System.out.println("Uses Compost: " + usesCompost);
        System.out.println("Certified Organic: " + certifiedOrganic);
    }
}//class OrganicFarmer ends here

public class testfarmer {
    public static void main(String[] args) {
        DairyFarmer df1 = new DairyFarmer("Ramesh", 45, 12.5, "Pune", 25, 180.0, "FreshFarm Dairy", true);
        PoultryFarmer pf1 = new PoultryFarmer("Suresh", 38, 6.0, "Nashik", 200, 35.0, "Layer", true);
        OrganicFarmer of1 = new OrganicFarmer("Mahesh", 50, 9.5, "Satara", 9.0, "Tomatoes", true, true);

        df1.display();
        System.out.println();
        pf1.display();
        System.out.println();
        of1.display();
    }
}

