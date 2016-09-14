package cpe200;


import java.math.BigDecimal;

public class BinaryCalculator {
    private Operand firstOperand;
    private Operand secondOperand;

    public BinaryCalculator() {
        firstOperand = new Operand(0);
        secondOperand = new Operand(0);

    }

    public void setFirstOperand(Operand operand) {
        firstOperand = operand ;
    }

    public void setSecondOperand(Operand operand) {
        secondOperand = operand ;
    }

    public String add() {
        BigDecimal a = new BigDecimal(firstOperand.getOperand());
        BigDecimal b = new BigDecimal(secondOperand.getOperand());

        return a.add(b).stripTrailingZeros().toString();
    }

    public String subtract() {
        BigDecimal a = new BigDecimal(firstOperand.getOperand());
        BigDecimal b = new BigDecimal(secondOperand.getOperand());
        return a.subtract(b).stripTrailingZeros().toString();
    }

    public String multiply() {
        BigDecimal a = new BigDecimal(firstOperand.getOperand());
        BigDecimal b = new BigDecimal(secondOperand.getOperand());

        return a.multiply(b).stripTrailingZeros().toString();
    }

    /* This method should throw an exception when divide by zero */
    public String division() throws ArithmeticException {
        BigDecimal a = new BigDecimal(firstOperand.getOperand());
        BigDecimal b = new BigDecimal(secondOperand.getOperand());
        return a.divide(b,5,BigDecimal.ROUND_HALF_UP).stripTrailingZeros().toString();
    }

    public String power() {

        BigDecimal a = new BigDecimal(firstOperand.getOperand());
        BigDecimal b = new BigDecimal(secondOperand.getOperand());
        return a.pow(b.intValue()).stripTrailingZeros().toString();
    }

}
