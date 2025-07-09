package in.sp.beans;

public class Student {
  private String Name;
  private int rollno;
  private Address address;
  
  public String getName() {
	return Name;
  }
  
  //we can only use setter and not getter
  public void setName(String name) {
	Name = name;
  }
  public int getRollno() {
	return rollno;
  }
  public void setRollno(int rollno) {
	this.rollno = rollno;
  }
  public Address getAddress() {
	return address;
  }
  public void setAddress(Address address) {
	this.address = address;
  }
  public void display() {
	  System.out.println("Name :" +Name);
	  System.out.println("Rollno :" +rollno);
	  System.out.println("Address :" +address);
	  
  }
}
