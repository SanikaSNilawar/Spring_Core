package in.sp.main;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import in.sp.resources.SpringConfigFile;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context =new AnnotationConfigApplicationContext(SpringConfigFile.class);
        NamedParameterJdbcTemplate npJDBCTemplate= (NamedParameterJdbcTemplate)context.getBean("npJDBCTemplate");
         Map<String,Object>map=new HashMap<String,Object>();
         map.put("key_rollno", 104);
         map.put("key_name", "Samdiu");
         map.put("key_marks", 22.3f);
        
        String insert_sql_query="INSERT INTO STUDENT VALUES(:key_rollno,:key_name,:key_marks)";
        
        
       int count= npJDBCTemplate.update(insert_sql_query,map);
        if(count>0) {
        	System.out.println("insertion");
        }else {
        	System.out.println("insertion failed");
        }
    }
}

