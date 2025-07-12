package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Address;
import in.sp.beans.Student;

@Configuration
public class SpringConfigFile {

	@Bean
	public Address createaddObj() {
		Address add=new Address();
		add.setH_no(111);
		add.setCityname("Nashik");
		add.setPincode(445102);
	
	return add;
}
	
	@Bean("StdId")
	public Student createstuObj() {
		Student stu=new Student();
		stu.setName("SANIKA");
		stu.setRollno(452);
	//	stu.setAddress();
	
	return stu;
}
}
