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
        BigDecimal first = new BigDecimal(firstOperand.getData());
        BigDecimal second = new BigDecimal(secondOperand.getData());

        BigDecimal out = first.add(second);

        return out.stripTrailingZeros().toString();
    }

    public String subtract() {
        BigDecimal first = new BigDecimal(firstOperand.getData());
        BigDecimal second = new BigDecimal(secondOperand.getData());

        BigDecimal out = first.subtract(second);

        return out.stripTrailingZeros().toString();
    }

    public String multiply() {
        BigDecimal first = new BigDecimal(firstOperand.getData());
        BigDecimal second = new BigDecimal(secondOperand.getData());

        BigDecimal out = first.multiply(second);

        return out.stripTrailingZeros().toString();
    }

    public String division() throws ArithmeticException {
        BigDecimal first = new BigDecimal(firstOperand.getData());
        BigDecimal second = new BigDecimal(secondOperand.getData());

        BigDecimal out = first.divide(second,5,4);

        return out.stripTrailingZeros().toString();
    }

    public String power() {
        BigDecimal first = new BigDecimal(firstOperand.getData());
        BigDecimal second = new BigDecimal(secondOperand.getData());
        BigDecimal out = first.pow(second.intValue());

        return out.stripTrailingZeros().toString();
    }

}
