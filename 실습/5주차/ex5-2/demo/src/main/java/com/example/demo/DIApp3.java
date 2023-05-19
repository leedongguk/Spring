package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class DIApp3
{
    public static void main(String[] args)
    {
        GenericApplicationContext ctx = new
                AnnotationConfigApplicationContext(JavaConfig.class);
        OperatorBean operator1 = (OperatorBean)ctx.getBean("operatorBean");
        OperatorBean operator2 = (OperatorBean)ctx.getBean("operatorBean");
        System.out.println("1: " + operator1 + " , 2: " + operator2);
        ctx.close();
    }
}
