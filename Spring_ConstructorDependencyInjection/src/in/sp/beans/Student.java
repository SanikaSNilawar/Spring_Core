package in.sp.beans;

public class Student {

	  private String Name;
	  private int rollno;
	  private Address address;
	  
	  public Student(String Name ,int rollno, Address address){
		  this.Name=Name;
		  this.rollno=rollno;
		  this.address=address;
	  }
	  public void display() {
		  System.out.println("Name :" +Name);
		  System.out.println("Rollno :" +rollno);
		  System.out.println("Address :" +address);
		  
	  }
	}


