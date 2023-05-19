package com.example.day0328;

import org.springframework.context.support.GenericXmlApplicationContext;

public class DIApp2 {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new
                GenericXmlApplicationContext("classpath* : applicationContext.xml");
        OperatorBean operator = (OperatorBean)ctx.getBean("operatorBean");
        int value = operator.calc();
        System.out.println("The result value : " + value);
        ctx.close();
    }
}
