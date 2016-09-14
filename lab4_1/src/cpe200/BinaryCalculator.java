package cpe200;
import java.math.BigDecimal;

public class BinaryCalculator {
    private Operand firstOperand;
    private Operand secondOperand;
    private BigDecimal FOP;
    private BigDecimal SOP;
    public BinaryCalculator() {

    }

    public void setFirstOperand(Operand operand) {
        firstOperand = operand;
        FOP = new BigDecimal(firstOperand.getOperand());
    }

    public void setSecondOperand(Operand operand) {
        secondOperand = operand;
        SOP = new BigDecimal(secondOperand.getOperand());
    }

    public String add() {

        return FOP.add(SOP).stripTrailingZeros().toString();
    }

    public String subtract() {

        return FOP.subtract(SOP).stripTrailingZeros().toString();
    }

    public String multiply() {

        return FOP.multiply(SOP).stripTrailingZeros().toString();
    }

    /* This method should throw an exception when divide by zero */
    public String division() throws ArithmeticException {

        if(SOP.equals(0)) {
            throw new ArithmeticException("ERROR");
        }
        return FOP.divide(SOP,5,BigDecimal.ROUND_UP).stripTrailingZeros().toString();
    }

    public String power() {

        return FOP.pow(SOP.intValue()).stripTrailingZeros().toString();
        }

    public Operand getFirstOperand() {
        return firstOperand;
    }

    public Operand getSecondOperand() {
        return secondOperand;
    }
}
