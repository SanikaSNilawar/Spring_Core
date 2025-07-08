package in.sp.resources;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import in.sp.beans.Student;

@Configuration
public class SpringConfigfile {
  @Bean  // this method creates bean object
	 public Student StdId(){  
	  //StdId1--method name --bean object name is StdId
		 
		 Student std=new Student();
		 std.setName("Sanika_Nilawar");
		 std.setRollno(241);
		 std.setEmail("san@gmail.com");
		 
		 return std;  //student class ka reference return karega
	 }
       //we can also write as @Bean("StuObj")---name of bean 
       //and  change the name of method 
}
