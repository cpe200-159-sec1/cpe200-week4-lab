package cpe200;


import java.math.BigDecimal;
import java.math.RoundingMode;

public class BinaryCalculator {
    private BigDecimal  firstOperand;
    private BigDecimal  secondOperand;

    public BinaryCalculator() {
        firstOperand = new BigDecimal(0);
        secondOperand = new BigDecimal(0);
    }

    public void setFirstOperand(Operand operand) {
        firstOperand = new BigDecimal(operand.getValue());
    }


    public void setSecondOperand(Operand operand) {
        secondOperand = new BigDecimal(operand.getValue());
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
    public String division()  {
        if(secondOperand.equals(0)){
            throw new ArithmeticException();
        }
        return firstOperand.divide(secondOperand,5, RoundingMode.HALF_UP).stripTrailingZeros().toString();
    }


    public String power(){
        return new BigDecimal(String.valueOf( Math.pow( Double.parseDouble(firstOperand.toString()), Double.parseDouble(secondOperand.toString())))).stripTrailingZeros().toString();
    }

}
