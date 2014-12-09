class Person{
	protected String name;
	protected String address;
	protected String phone;
	protected String email;
	
	Person(){
		
	}
	
	Person(String name, String address, String phone, String email){
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.email = email;
	}
	
	
}

class Student extends Person{
	private int classYear;
	final static int FRESHMAN = 1;
	final static int SOPHOMORE = 2;
	final static int JUNIOR = 3;
	final static int SENIOR = 4;
	
	public Student(String name, String address, String phone, String email, String classYear){
		super(name, address, phone, email);
		if(classYear.equalsIgnoreCase("freshman")){
			this.classYear = FRESHMAN;
		}
		else if(classYear.equalsIgnoreCase("sophomore")){
			this.classYear = SOPHOMORE;
		}
		else if(classYear.equalsIgnoreCase("junior")){
			this.classYear = JUNIOR;
		}
		else if(classYear.equalsIgnoreCase("senior")){
			this.classYear = SENIOR;
		}
		
		
	}
	
	public int classYear(){
		return classYear;
	}
	
	public String toString(){
		return name + address + phone +  email + classYear;
	}
}

class Employee extends Person{
	private String office;	
	private double salary;
	private MyDate dateHired;
	
	public Employee(String name, String address, String phone, String email, 
					String office, double salary, MyDate dateHired){
		super(name, address, phone, email);
		this.office = office;
		this.salary = salary;
		this.dateHired = dateHired;
	}
	
	
}

class MyDate{
	private int month;
	private int day;
	private int year;
	
	public MyDate(){
		month = 1;
		day = 1;
		year = 1996;
	}
	
	public MyDate(int month, int day, int year){
		this.month = month;
		this.day = day;
		this.year = year;
	}
	
	public int getDay(){
		return day;
	}
	
	public int getMonth(){
		return month;
	}
	
	public int getYear(){
		return year;
	}
	
	public String toString(){
		return month + "/" + day + "/" + year; 
	}
}
	
	
public class Exercise11_2{
	public static void main(String[] args){
		Person Johnny = new Student("Johnny", "Here", "9044877322", "twickes32@gmail.com", "frEshmaN");
		System.out.println(Johnny.toString());
	}
}
	
	
	