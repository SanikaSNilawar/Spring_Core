package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Student;

public class Main {
   public static void main(String[]args) {
	   String Config_loc="/in/sp/resources/SpringConfig.xml";
	   ApplicationContext context =new ClassPathXmlApplicationContext(Config_loc);
	  
	    Student std=(Student)context.getBean("student");
	    std.display();
   }
}
