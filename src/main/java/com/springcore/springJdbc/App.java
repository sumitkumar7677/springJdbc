package com.springcore.springJdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Program Started.................." );
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/springJdbc/jdbcConfig.xml");
        JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);
        System.out.println(template);
        
        //Insert Query
        String query = "insert into student (id,name,address) values (?,?,?)";
        
        int result = template.update(query,12345,"Sumit Kumar","Nalanda");
        System.out.println("No of row Inserted : " + result);
        
    }
}
