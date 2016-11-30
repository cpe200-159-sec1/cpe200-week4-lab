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
        firstOperand = operand;
    }


    public void setSecondOperand(Operand operand) {
        secondOperand = operand;
    }

    public String add() {
        BigDecimal first = new BigDecimal(firstOperand.Data());
        BigDecimal second = new BigDecimal(secondOperand.Data());


        return first.add(second).stripTrailingZeros().toString();
    }

    public String subtract() {
        BigDecimal first = new BigDecimal(firstOperand.Data());
        BigDecimal second = new BigDecimal(secondOperand.Data());



        return first.subtract(second).stripTrailingZeros().toString();
    }

    public String multiply() {
        BigDecimal first = new BigDecimal(firstOperand.Data());
        BigDecimal second = new BigDecimal(secondOperand.Data());


        return first.multiply(second).stripTrailingZeros().toString();
    }

    public String division() throws ArithmeticException {
        BigDecimal first = new BigDecimal(firstOperand.Data());
        BigDecimal second = new BigDecimal(secondOperand.Data());


        return first.divide(second,5,6).stripTrailingZeros().toString();
    }

    public String power() {
        BigDecimal first = new BigDecimal(firstOperand.Data());
        BigDecimal second = new BigDecimal(secondOperand.Data());


        return first.pow(second.intValue()).stripTrailingZeros().toString();
    }

}