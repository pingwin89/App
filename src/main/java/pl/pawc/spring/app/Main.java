package pl.pawc.spring.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main{
   public static void main(String[] args){
      ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
      PawcBean obj = (PawcBean) context.getBean("pawcBean");
      obj.getMessage();
   }
}