package cpe200;


import java.math.BigDecimal;

public class BinaryCalculator {
    private Operand firstOperand;
    private Operand secondOperand;

    public BinaryCalculator() {
        firstOperand = new Operand("0");
        secondOperand = new Operand("0");
    }

    public void setFirstOperand(Operand operand) {
        firstOperand = operand;
    }


    public void setSecondOperand(Operand operand) {
        secondOperand = operand;

    }

    public String add(){
        BigDecimal first = new BigDecimal(firstOperand.getdata());
        BigDecimal second = new BigDecimal(secondOperand.getdata());
        BigDecimal out = first.add(second);

        return out.stripTrailingZeros().toString();
    }

    public String subtract(){
        BigDecimal first = new BigDecimal(firstOperand.getdata());
        BigDecimal second = new BigDecimal(secondOperand.getdata());
        BigDecimal out = first.subtract(second);

        return out.stripTrailingZeros().toString();


    }

    public String multiply() {

        BigDecimal first = new BigDecimal(firstOperand.getdata());
        BigDecimal second = new BigDecimal(secondOperand.getdata());
        BigDecimal out = first.multiply(second);

        return out.stripTrailingZeros().toString();
    }

    /* This method should throw an exception when divide by zero */
    public String division() throws ArithmeticException {
        BigDecimal first = new BigDecimal(firstOperand.getdata());
        BigDecimal second = new BigDecimal(secondOperand.getdata());
        BigDecimal out = first.divide(second,5,5);

        return out.stripTrailingZeros().toString();
    }

    public String power() {
        BigDecimal first = new BigDecimal(firstOperand.getdata());
        BigDecimal second = new BigDecimal(secondOperand.getdata());
        BigDecimal out = first.pow(second.intValue());

        return out.stripTrailingZeros().toString();
    }

}
