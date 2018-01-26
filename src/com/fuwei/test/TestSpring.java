package com.fuwei.test;
  
import com.fuwei.service.CategoryService;
import com.fuwei.service.ProductService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

 
public class TestSpring {
  
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] { "applicationContext.xml" });
        CategoryService s = (CategoryService) context.getBean("f");
        s.list();
    }
}