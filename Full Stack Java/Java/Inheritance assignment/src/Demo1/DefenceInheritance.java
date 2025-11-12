package Demo1;

class Defence {
    int noofCasualties;
    String nameOfHerd;
    int noOfMissionPerformed;
    int noOfTroops;
    double budget;
    int noOfDept;
    int noOfVehicle;
    String LocationOfHeadquater;
    String countryName;
    int manPowerCount;

    public int getNoofCasualties() {
		return noofCasualties;
	}

	public void setNoofCasualties(int noofCasualties) {
		this.noofCasualties = noofCasualties;
	}

	public String getNameOfHerd() {
		return nameOfHerd;
	}

	public void setNameOfHerd(String nameOfHerd) {
		this.nameOfHerd = nameOfHerd;
	}

	public int getNoOfMissionPerformed() {
		return noOfMissionPerformed;
	}

	public void setNoOfMissionPerformed(int noOfMissionPerformed) {
		this.noOfMissionPerformed = noOfMissionPerformed;
	}

	public int getNoOfTroops() {
		return noOfTroops;
	}

	public void setNoOfTroops(int noOfTroops) {
		this.noOfTroops = noOfTroops;
	}

	public double getBudget() {
		return budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}

	public int getNoOfDept() {
		return noOfDept;
	}

	public void setNoOfDept(int noOfDept) {
		this.noOfDept = noOfDept;
	}

	public int getNoOfVehicle() {
		return noOfVehicle;
	}

	public void setNoOfVehicle(int noOfVehicle) {
		this.noOfVehicle = noOfVehicle;
	}

	public String getLocationOfHeadquater() {
		return LocationOfHeadquater;
	}

	public void setLocationOfHeadquater(String locationOfHeadquater) {
		LocationOfHeadquater = locationOfHeadquater;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public int getManPowerCount() {
		return manPowerCount;
	}

	public void setManPowerCount(int manPowerCount) {
		this.manPowerCount = manPowerCount;
	}

	// ✅ Default constructor
    Defence() {
        this.noofCasualties = 10;
        this.nameOfHerd = "Central Command";
        this.noOfMissionPerformed = 50;
        this.noOfTroops = 2000;
        this.budget = 150.50;
        this.noOfDept = 5;
        this.noOfVehicle = 120;
        this.LocationOfHeadquater = "New Delhi";
        this.countryName = "India";
        this.manPowerCount = 8000;
    }

    // ✅ Parameterized constructor
    public Defence(int noofCasualties, String nameOfHerd, int noOfMissionPerformed, int noOfTroops,
                   double budget, int noOfDept, int noOfVehicle, String locationOfHeadquater,
                   String countryName, int manPowerCount) {

        this.noofCasualties = noofCasualties;
        this.nameOfHerd = nameOfHerd;
        this.noOfMissionPerformed = noOfMissionPerformed;
        this.noOfTroops = noOfTroops;
        this.budget = budget;
        this.noOfDept = noOfDept;
        this.noOfVehicle = noOfVehicle;
        this.LocationOfHeadquater = locationOfHeadquater;
        this.countryName = countryName;
        this.manPowerCount = manPowerCount;
    }

    // ✅ Display method
    void display() {
        System.out.println("\n--- Defence Department Details ---");
        System.out.println("Name of Herd             : " + this.nameOfHerd);
        System.out.println("Country Name             : " + this.countryName);
        System.out.println("Location of Headquarter  : " + this.LocationOfHeadquater);
        System.out.println("Number of Departments     : " + this.noOfDept);
        System.out.println("Number of Troops          : " + this.noOfTroops);
        System.out.println("Number of Vehicles        : " + this.noOfVehicle);
        System.out.println("Number of Missions Done   : " + this.noOfMissionPerformed);
        System.out.println("Number of Casualties      : " + this.noofCasualties);
        System.out.println("Manpower Count            : " + this.manPowerCount);
        System.out.println("Budget (in billions)      : " + this.budget);
    }
}


// -------------------- Army Class --------------------

class Army extends Defence {
    int noOfTanks;
    int noOfGuns;
    int noOfGrades;
    int noOfBatalian;

    public int getNoOfTanks() {
		return noOfTanks;
	}

	public void setNoOfTanks(int noOfTanks) {
		this.noOfTanks = noOfTanks;
	}

	public int getNoOfGuns() {
		return noOfGuns;
	}

	public void setNoOfGuns(int noOfGuns) {
		this.noOfGuns = noOfGuns;
	}

	public int getNoOfGrades() {
		return noOfGrades;
	}

	public void setNoOfGrades(int noOfGrades) {
		this.noOfGrades = noOfGrades;
	}

	public int getNoOfBatalian() {
		return noOfBatalian;
	}

	public void setNoOfBatalian(int noOfBatalian) {
		this.noOfBatalian = noOfBatalian;
	}

	Army() {
        super();
        this.noOfTanks = 150;
        this.noOfGuns = 500;
        this.noOfGrades = 10;
        this.noOfBatalian = 20;
    }

    Army(int noOfTanks, int noOfGuns, int noOfGrades, int noOfBatalian) {
        super();
        this.noOfTanks = noOfTanks;
        this.noOfGuns = noOfGuns;
        this.noOfGrades = noOfGrades;
        this.noOfBatalian = noOfBatalian;
    }

    void display() {
        super.display();
        System.out.println("\n--- Army Details ---");
        System.out.println("Number of Tanks     : " + this.noOfTanks);
        System.out.println("Number of Guns      : " + this.noOfGuns);
        System.out.println("Number of Grades    : " + this.noOfGrades);
        System.out.println("Number of Batalions : " + this.noOfBatalian);
    }
}


// -------------------- Navy Class --------------------

class Navy extends Defence {
    int noOfShips;
    int noOfSubmarines;
    int noOfTorpedoes;

    public int getNoOfShips() {
		return noOfShips;
	}

	public void setNoOfShips(int noOfShips) {
		this.noOfShips = noOfShips;
	}

	public int getNoOfSubmarines() {
		return noOfSubmarines;
	}

	public void setNoOfSubmarines(int noOfSubmarines) {
		this.noOfSubmarines = noOfSubmarines;
	}

	public int getNoOfTorpedoes() {
		return noOfTorpedoes;
	}

	public void setNoOfTorpedoes(int noOfTorpedoes) {
		this.noOfTorpedoes = noOfTorpedoes;
	}

	Navy() {
        super();
        this.noOfShips = 25;
        this.noOfSubmarines = 8;
        this.noOfTorpedoes = 150;
    }

    Navy(int noOfShips, int noOfSubmarines, int noOfTorpedoes) {
        super();
        this.noOfShips = noOfShips;
        this.noOfSubmarines = noOfSubmarines;
        this.noOfTorpedoes = noOfTorpedoes;
    }

    void display() {
        super.display();
        System.out.println("\n--- Navy Department Details ---");
        System.out.println("Number of Ships        : " + this.noOfShips);
        System.out.println("Number of Submarines   : " + this.noOfSubmarines);
        System.out.println("Number of Torpedoes    : " + this.noOfTorpedoes);
    }
}


// -------------------- Air Class --------------------

class Air extends Defence {
    int noOfMission;
    int noOfSquadron;
    String AircraftType;

    public int getNoOfMission() {
		return noOfMission;
	}

	public void setNoOfMission(int noOfMission) {
		this.noOfMission = noOfMission;
	}

	public int getNoOfSquadron() {
		return noOfSquadron;
	}

	public void setNoOfSquadron(int noOfSquadron) {
		this.noOfSquadron = noOfSquadron;
	}

	public String getAircraftType() {
		return AircraftType;
	}

	public void setAircraftType(String aircraftType) {
		AircraftType = aircraftType;
	}

	Air() {
        super();
        this.noOfMission = 75;
        this.noOfSquadron = 12;
        this.AircraftType = "Rafale";
    }

    Air(int noOfMission, int noOfSquadron, String AircraftType) {
        super();
        this.noOfMission = noOfMission;
        this.noOfSquadron = noOfSquadron;
        this.AircraftType = AircraftType;
    }

    void display() {
        super.display();
        System.out.println("\n--- Air Force Details ---");
        System.out.println("Number of Missions  : " + this.noOfMission);
        System.out.println("Number of Squadrons : " + this.noOfSquadron);
        System.out.println("Aircraft Type       : " + this.AircraftType);
    }
}
// Main Class 

public class DefenceInheritance {
    public static void main(String[] args) {

        System.out.println("=== Using Default Constructors ===");
        Army a1 = new Army();
        a1.display();

        Navy n1 = new Navy();
        n1.display();

        Air af1 = new Air();
        af1.display();

        System.out.println("\n=== Using Parameterized Constructors ===");
        Army a2 = new Army(200, 800, 15, 25);
        a2.display();

        Navy n2 = new Navy(40, 12, 300);
        n2.display();

        Air af2 = new Air(100, 15, "Sukhoi Su-30MKI");
        af2.display();
    }
}
