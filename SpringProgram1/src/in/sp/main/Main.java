package in.sp.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Student;


public class Main {
  public static void main(String[]args)
  {
	  String config_loc="/in/sp/resources/applicationContext.xml";
	  ApplicationContext context=new ClassPathXmlApplicationContext(config_loc);
	//spring container gets started here and the instructions we provided gets started
	  
	  Student std1= (Student)context.getBean("StdId1");
	  std1.display();
	  
	  System.out.println("---------------------");
	  
	  Student std2= (Student)context.getBean("StdId2");
	  std2.display();
  }
}
