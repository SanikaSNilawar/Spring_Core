package in.sp.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import in.sp.resources.SpringConfigFile;
import in.sp.beans.Student;

public class Main {
    public static void main(String[]args) {
    //	Spring file_loc="in/sp/resources/SpringConfigFile.class";
    	ApplicationContext context= new AnnotationConfigApplicationContext(SpringConfigFile.class);
    	Student std=(Student) context.getBean("student");
    	std.display();
    }
    }
 
