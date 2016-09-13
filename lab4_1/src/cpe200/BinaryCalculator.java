package cpe200;


import java.math.BigDecimal;
import java.math.RoundingMode;

public class BinaryCalculator {
    private BigDecimal firstOperand;
    private BigDecimal secondOperand;

    public BinaryCalculator() {
        firstOperand = new BigDecimal(0);
        secondOperand = new BigDecimal(0);
    }

    public void setFirstOperand(Operand operand) {
        firstOperand=new BigDecimal(operand.getOperand());

    }


    public void setSecondOperand(Operand operand) {
        secondOperand = new BigDecimal(operand.getOperand());
    }

    public String add() {
        return firstOperand.add(secondOperand).stripTrailingZeros().toString();
    }

    public String subtract() {
        return firstOperand.subtract(secondOperand).stripTrailingZeros().toString();
    }

    public String multiply() {
        return firstOperand.multiply(secondOperand).stripTrailingZeros().toString();
    }

    /* This method should throw an exception when divide by zero */
    public String division() {
        if(secondOperand.equals(0)){
            throw new RuntimeException("divide by  zero");
        }
        return firstOperand.divide(secondOperand,5, RoundingMode.HALF_UP).stripTrailingZeros().toString();
    }

    public String power() {
        return firstOperand.pow(secondOperand.intValueExact()).stripTrailingZeros().toString();
    }

}
