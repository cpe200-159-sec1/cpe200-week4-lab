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
       firstOperand.setOperand(operand.getOperand());
    }

    public  Operand getFirstOperand() {
        return  firstOperand;
    }

    public void setSecondOperand(Operand operand) {
        secondOperand.setOperand(operand.getOperand());
    }

    public Operand getSecondOperand() {
        return  secondOperand;
    }

    public String add() {
        BigDecimal first = new BigDecimal(getFirstOperand().getOperand());
        BigDecimal second = new BigDecimal(getSecondOperand().getOperand());
        return first.add(second).stripTrailingZeros().toString();
    }

    public String subtract() {
        BigDecimal first = new BigDecimal(getFirstOperand().getOperand());
        BigDecimal second = new BigDecimal(getSecondOperand().getOperand());
        return first.subtract(second).stripTrailingZeros().toString();
    }

    public String multiply() {
        BigDecimal first = new BigDecimal(getFirstOperand().getOperand());
        BigDecimal second = new BigDecimal(getSecondOperand().getOperand());
        return first.multiply(second).stripTrailingZeros().toString();
    }

    /* This method should throw an exception when divide by zero */
    public String division() throws ArithmeticException {
        BigDecimal first = new BigDecimal(getFirstOperand().getOperand());
        BigDecimal second = new BigDecimal(getSecondOperand().getOperand());
        return first.divide(second,5,BigDecimal.ROUND_HALF_UP).stripTrailingZeros().toString();
    }

    public String power() {
        BigDecimal first = new BigDecimal(getFirstOperand().getOperand());
        BigDecimal second = new BigDecimal(getSecondOperand().getOperand());
        return first.pow(second.intValue()).stripTrailingZeros().toString();
    }

}
