package com.mycompany.app;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
   public static void main(String[] args) {
      ApplicationContext context = new ClassPathXmlApplicationContext("com/beans.xml");
      person obj = (person) context.getBean("person");
      System.out.println( obj.toString());
   }
}