package org.tnsindia.springIOC;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {
		//creating a object
		/*Airtel a=new Airtel();
		a.calling();
		a.data();
		
		//creating a object
		Jio J=new Jio();
		J.calling();
		J.data();*/
		BeanFactory c=new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("config...lodaded");
        Sim a=c.getBean("Sim",Sim.class);
        a.calling();
        a.data();
        
       /* Jio J=(Jio)c.getBean("Jio");
        J.calling();
        J.data();*/
	}

}
