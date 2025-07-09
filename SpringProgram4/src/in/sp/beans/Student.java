package in.sp.beans;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;
@Component("student")
public class Student {
	
	@Value("Nilawar")
	 private String name;
	
	@Value("2011")
     private int rollno;
	
	@Value("20.5f")
	 private float marks;
	 
	 public String getName() {
		return name;
	 }
	 public void setName(String name) {
		this.name = name;
	 }
	 public int getRollno() {
		return rollno;
	 }
	 public void setRollno(int rollno) {
		this.rollno = rollno;
	 }
	 public String getMarks() {
		return marks;
	 }
	 public void setMarks(float marks) {
		this.marks= marks;
	 }
	  public void display() {
		  System.out.println("Name: " +name);
		  System.out.println("Rollno:"+rollno);
		  System.out.println("marks " +marks);
		  
		 
	 }
	}

