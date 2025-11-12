package Demo1;

class student{
	int fid;
	String name;
	int distance;
	static int count=0;
	student(){
		fid=101;
		name="not given";
		distance=10;
		count++;
	}//default constructor
	
    student(int fid, String name, int distance) {
		this.fid = fid;
		this.name = name;
		this.distance = distance;
		count++;
	}//parameterized constructor

	 int getFid() {
		return fid;
	}
	 void setFid(int fid) {
		this.fid = fid;
	}
	 String getName() {
		return name;
	}
	 void setName(String name) {
		this.name = name;
	}
	 int getDistance() {
		return distance;
	}
	 void setDistance(int distance) {
		this.distance = distance;
	}
	 
	static int getCount() {
		return count;
	}

	static void setCount(int count) {
		student.count = count;
	}

	void display() {
		System.out.println("firstbit id is:"+this.fid);
		System.out.println("Name is: "+this.name);
		System.out.println("Distance travelled:"+this.distance);
	}


}//class student ends here

class PlacedStudent extends student{
	
	String companyname;
	String designation;
	
	PlacedStudent(){
		super();
		companyname="xyz";
		designation="pqr";
	}
	
	PlacedStudent(int fid, String name, int distance, String companyname, String designation) {
		super(fid,name,distance);
		this.companyname = companyname;
		this.designation = designation;
	}//parameterized constructor
	
	String getCompanyname() {
		return companyname;
	}
	void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	String getDesignation() {
		return designation;
	}
	void setDesignation(String designation) {
		this.designation = designation;
	}
	void display() {
		System.out.println("firstbit id is:"+this.fid);
		System.out.println("Name is: "+this.name);
		System.out.println("Distance travelled:"+this.distance);
		System.out.println("Company name is:"+this.companyname);
		System.out.println("Designation is:"+this.designation);
	}
	
}// class placestudent ends here
class test{
	public static void main(String[] args) {
		student s1=new student();
		System.out.println("Student count is:"+student.getCount());
		student s2=new student(102,"Ayush",100);
		System.out.println("Student count is:"+student.getCount());
		
		s1.display();
		System.out.println(s1.getName());
		System.out.println();
		PlacedStudent ps1=new PlacedStudent(78, "Rahul", 500, "BCCI", "Coach");
		System.out.println("Student count is:"+student.getCount());
		ps1.display();
		System.out.println(ps1.getName());
		PlacedStudent ps2=new PlacedStudent(45, "Rohit", 46, "BCCI", "Batsman");
		ps2.display();
		System.out.println(ps2.getName());
		
		
		
	}
}

