package cpe200;

import java.math.BigDecimal;

public class BinaryCalculator {
    private Operand firstOperand;
    private Operand secondOperand;
    private BigDecimal first ;
    private BigDecimal sec;


    public BinaryCalculator() {
    }

    public void setFirstOperand(Operand operand) {
        this.firstOperand = operand;
        first = new BigDecimal(firstOperand.getOperand());
    }

    public void setSecondOperand(Operand operand) {
        this.secondOperand = operand;
        sec = new BigDecimal(secondOperand.getOperand());
    }

    public String add() {

        return first.add(sec).stripTrailingZeros().toString();
    }

    public String subtract() {

        return first.subtract(sec).stripTrailingZeros().toString();
    }


    public String multiply() {

        return first.multiply(sec).stripTrailingZeros().toString();
    }

    /* This method should throw an exception when divide by zero */
    public String division() {
        if(sec.compareTo(BigDecimal.ZERO)==0) {
            throw new ArithmeticException("error");
        }
        return first.divide(sec,5,BigDecimal.ROUND_HALF_UP).stripTrailingZeros().toString();
    }

    public String power() {

        return first.pow(sec.intValue()).stripTrailingZeros().toString();
    }

}
