package cpe200;


import com.sun.org.apache.bcel.internal.generic.ArithmeticInstruction;
import com.sun.org.apache.xalan.internal.xsltc.dom.AdaptiveResultTreeImpl;

import java.math.BigDecimal;
import java.util.logging.Logger;

public class BinaryCalculator {
    private Operand firstOperand;
    private Operand secondOperand;

    private BigDecimal x;
    private BigDecimal y;

    public BinaryCalculator() {
        x = new BigDecimal(0);
        y = new BigDecimal(0);
    }

    public void setFirstOperand(Operand operand) {
        //firstOperand.setOperand(operand);
        //x = new BigDecimal(firstOperand.getOperand());
        x = new BigDecimal(operand.getOperand());

    }

    public void setSecondOperand(Operand operand) {
        //secondOperand.setOperand(operand);
        //y = new BigDecimal(secondOperand.getOperand());
        y = new BigDecimal(operand.getOperand());
    }

    public String add() {
        return x.add(y).stripTrailingZeros().toString();
    }

    public String subtract() {

        return x.subtract(y).stripTrailingZeros().toString();
    }

    public String multiply() {

        return x.multiply(y).stripTrailingZeros().toEngineeringString();
    }

    /* This method should throw an exception when divide by zero */
    public String division(){
        if(y.equals(0)) throw new ArithmeticException("Math Error");
        else return x.divide(y,5,BigDecimal.ROUND_UP).stripTrailingZeros().toString();
    }

    public String power() {
        int e = y.intValue();
        return x.pow(e).stripTrailingZeros().toString();
    }

}
