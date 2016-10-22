package cpe200;


import java.math.BigDecimal;

public class BinaryCalculator {
    private Operand firstOperand;
    private Operand secondOperand;

    public BinaryCalculator() {
    }

    public void setFirstOperand(Operand operand) {
        firstOperand = operand;
    }


    public void setSecondOperand(Operand operand) {
        secondOperand = operand;
    }

    public String add() {
        BigDecimal bn1 = new  BigDecimal(firstOperand.get());
        BigDecimal bn2 = new  BigDecimal(secondOperand.get());
        bn1 = bn1.add(bn2);
        BigDecimal bigDecimal = bn1.stripTrailingZeros();
        return bigDecimal.toString();
    }

    public String subtract() {
        BigDecimal bn1 = new  BigDecimal(firstOperand.get());
        BigDecimal bn2 = new  BigDecimal(secondOperand.get());
        bn1 = bn1.subtract(bn2);
        BigDecimal bigDecimal = bn1.stripTrailingZeros();
        return bigDecimal.toString();
    }

    public String multiply() {
        BigDecimal bn1 = new  BigDecimal(firstOperand.get());
        BigDecimal bn2 = new  BigDecimal(secondOperand.get());
        bn1 = bn1.multiply(bn2);
        BigDecimal bigDecimal = bn1.stripTrailingZeros();
        return bigDecimal.toString();
    }

    /* This method should throw an exception when divide by zero */
    public String division() throws ArithmeticException {
        BigDecimal bn1 = new  BigDecimal(firstOperand.get());
        BigDecimal bn2 = new  BigDecimal(secondOperand.get());
        bn1 = bn1.divide(bn2 , 5 , BigDecimal.ROUND_HALF_UP);
        bn1 = bn1.stripTrailingZeros();
        return bn1.toString();
    }

    public String power() {
        BigDecimal bn1 = new  BigDecimal(firstOperand.get());
        BigDecimal bn2 = new  BigDecimal(secondOperand.get());
        bn1 = bn1.pow(bn2.intValue());
        bn1 = bn1.stripTrailingZeros();
        return bn1.toString();


    }

}
