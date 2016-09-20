package cpe200;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.math.BigDecimal;
import java.math.RoundingMode;


public class BinaryCalculator {
    private Operand firstOperand;
    private Operand secondOperand;
    private BigDecimal _firstOperand,_secondOperand;
    private int fo,so;

    public BinaryCalculator() {
        //firstOperand = new BigDecimal(0);
        //secondOperand = new BigDecimal(0);
    }

    public void setFirstOperand(Operand operand) {
        this.firstOperand = operand;
        _firstOperand = new BigDecimal(firstOperand.getOperand());
    }


    public void setSecondOperand(Operand operand) {
        this.secondOperand = operand;
        _secondOperand = new BigDecimal(secondOperand.getOperand());
    }

    public String add() {
        return _firstOperand.add(_secondOperand).stripTrailingZeros().toString();
    }

    public String subtract() {
        return _firstOperand.subtract(_secondOperand).stripTrailingZeros().toString();
    }

    public String multiply() {
        return _firstOperand.multiply(_secondOperand).stripTrailingZeros().toString();
    }

    /* This method should throw an exception when divide by zero */
    public String division(){
        if(secondOperand.equals(0))throw new RuntimeException("Stack underflow");
        else return _firstOperand.divide(_secondOperand,5, BigDecimal.ROUND_HALF_UP).stripTrailingZeros().toString();
    }

    public String power() {
        int i = _secondOperand.intValue();
        return _firstOperand.pow(i).stripTrailingZeros().toString();
    }
    }

