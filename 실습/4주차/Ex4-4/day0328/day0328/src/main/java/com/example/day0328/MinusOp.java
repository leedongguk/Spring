package com.example.day0328;

import org.springframework.beans.factory.annotation.Autowired;
import jakarta.annotation.Resource;

public class MinusOp implements OperatorBean {
    @Resource(name="op1")
    Operand operand1;
    @Resource(name="op2")
    Operand operand2;

    public Operand getOperand1() {
        return operand1;
    }
    public void setOperand1(Operand operand1) {
        this.operand1 = operand1;
    }
    public Operand getOperand2() {
        return operand2;
    }
    public void setOperand2(Operand operand2) {
        this.operand2 = operand2;
    }
    /////
    public int calc() {
        return operand1.getValue() - operand2.getValue();
    }
}

