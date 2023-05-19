package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class JavaConfig
{
    @Bean
    @Scope("prototype")
    public Operand op1()
    {
        Operand op = new Operand();
        op.setValue(10);
        return op;
    }

    @Bean
    @Scope("prototype")
    public Operand op2()
    {
        Operand op = new Operand();
        op.setValue(20);
        return op;
    }

    @Bean
    @Scope("prototype")
    public OperatorBean operatorBean()
    {
        OperatorBean operator = new MinusOp();
        operator.setOperand1(op1());
        operator.setOperand2(op2());
        return operator;
    }
}
