
package com.spr1;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.xml.*;
import org.springframework.core.io.*;
import org.springframework.context.*;
import org.springframework.context.support.*;

public class Test1 {


	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//Resource r=new ClassPathResource("applicationContext.xml");
		//BeanFactory b=new XmlBeanFactory(r);
		//Student st=(Student) b.getBean("stobj");
		//System.out.println(st); 
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		Student st=(Student) ac.getBean("stobj");
		//System.out.println(st); 
		StudentDAO std=(StudentDAO)ac.getBean("stdao");
		//std.save(st);
		std.savePS(st);
		System.out.println("Congratulations!! "+ st.getName());
		
		

	}

}
