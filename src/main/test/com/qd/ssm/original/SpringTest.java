package com.qd.ssm.original;

import com.qd.ssm.original.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:config/spring-core.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student);
    }
}
