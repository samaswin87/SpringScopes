package com.prototype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        Message message = (Message) context.getBean("prototype");

        message.setMessage("Hi I am First");
        message.printMessage();

        Message message1 = (Message) context.getBean("prototype");
        message1.printMessage();
        
        Message message2 = (Message) context.getBean("prototype");
        message2.setMessage("Hi I am Second");
        message2.printMessage();
        
        message.printMessage();
    }
}
