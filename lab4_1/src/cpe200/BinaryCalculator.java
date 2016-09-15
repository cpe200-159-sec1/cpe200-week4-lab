package cpe200;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BinaryCalculator {
    private String firstOperand;
    private String secondOperand;

    public BinaryCalculator() {
    }

    public void setFirstOperand(Operand operand) {
        this.firstOperand = operand.operand;
    }


    public void setSecondOperand(Operand operand) {
        this.secondOperand = operand.operand;
    }

    public String add() {
        BigDecimal nate = new BigDecimal(this.firstOperand);
        return nate.add(new BigDecimal(this.secondOperand)).stripTrailingZeros().toString();
    }

    public String subtract() {
        BigDecimal nate = new BigDecimal(this.firstOperand);
        return nate.subtract(new BigDecimal(this.secondOperand)).stripTrailingZeros().toString();
    }

    public String multiply() {
        BigDecimal nate = new BigDecimal(this.firstOperand);
        return nate.multiply(new BigDecimal(this.secondOperand)).stripTrailingZeros().toString();
    }

    /* This method should throw an exception when divide by zero */
    public String division() throws ArithmeticException {
        BigDecimal nate = new BigDecimal(this.firstOperand);
        if (new BigDecimal(this.secondOperand).equals(0)){
            throw new IllegalArgumentException("Argument 'divisor' is 0");
        }
        else return nate.divide((new BigDecimal(this.secondOperand)), 5, BigDecimal.ROUND_HALF_UP).stripTrailingZeros().toString();
    }

    public String power() {
        //BigDecimal natee = new BigDecimal(Double.toString(Math.pow(Double.parseDouble(firstOperand), Double.parseDouble(secondOperand))));
        Double a = Double.parseDouble(firstOperand);
        Double b = Double.parseDouble(secondOperand);
        a = Math.pow(a,b);
        BigDecimal nate = new BigDecimal(a.toString()).stripTrailingZeros();
        nate = nate.divide(BigDecimal.ONE, 5, BigDecimal.ROUND_HALF_UP).stripTrailingZeros();
        return nate.toString();
    }

}
