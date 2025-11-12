package Demo1;

class employee {
    int empid;
    String name;
    double salary;

    // Default constructor
    employee() {
        empid = 101;
        name = "not given";
        salary = 30000;
    }

    // Parameterized constructor
    employee(int empid, String name, double salary) {
        this.empid = empid;
        this.name = name;
        this.salary = salary;
    }

    int getEmpid() {
        return empid;
    }

    void setEmpid(int empid) {
        this.empid = empid;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    double getSalary() {
        return salary;
    }

    void setSalary(double salary) {
        this.salary = salary;
    }
    void work() {
        System.out.println(name + " is working on assigned tasks.");
    }

    void display() {
        System.out.println("Employee ID: " + empid);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

// Derived class
class employeemanager extends employee {
    String department;
    int teamSize;

    // Default constructor
    employeemanager() {
        super();
        department = "xyz";
        teamSize = 7;
    }

    // Parameterized constructor
    employeemanager(int empid, String name, double salary, String department, int teamSize) {
        super(empid, name, salary); // Correct order
        this.department = department;
        this.teamSize = teamSize;
    }

    String getDepartment() {
        return department;
    }

    void setDepartment(String department) {
        this.department = department;
    }

    int getTeamSize() {
        return teamSize;
    }

    void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    // Additional behaviours
    void manageTeam() {
        System.out.println(name + " is managing a team of " + teamSize + " members in the " + department + " department.");
    }

    void conductMeeting() {
        System.out.println(name + " is conducting a meeting for the " + department + " team.");
    }

    // display method
    void display() {
        super.display(); // show employee details too
        System.out.println("Department: " + department);
        System.out.println("Team Size: " + teamSize);
    }
}

// Test class
class emptest {
    public static void main(String[] args) {
      //objects for employee class
        employee e1 = new employee();
        e1.display();
        e1.work();
        System.out.println();

        employee e2 = new employee(102, "Ayush", 50000);
        e2.display();
        e2.work();
        System.out.println();

        // Manager objects
        employeemanager em1 = new employeemanager(110, "Rahul", 70000, "Testing", 10);
        em1.display();
        em1.manageTeam();
        em1.conductMeeting();
        System.out.println();

        employeemanager em2 = new employeemanager(112, "Soham", 80000, "Project Management", 15);
        em2.display();
        em2.manageTeam();
        em2.conductMeeting();
    }
}
