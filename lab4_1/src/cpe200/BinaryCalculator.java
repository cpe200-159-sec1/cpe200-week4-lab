package cpe200;


import java.math.BigDecimal;
import java.math.RoundingMode;

public class BinaryCalculator {
    private Operand firstOperand;
    private Operand secondOperand;
    private BigDecimal st;
    private BigDecimal nd;

    public BinaryCalculator() {
        st = new BigDecimal(0);
        nd = new BigDecimal(0);
    }

    public void setFirstOperand(Operand operand) {
        st = new BigDecimal(operand.getOperand());
    }


    public void setSecondOperand(Operand operand) {
        nd = new BigDecimal(operand.getOperand());
    }

    public String add() {
        return st.add(nd).stripTrailingZeros().toString();
    }

    public String subtract() {
        return st.subtract(nd).stripTrailingZeros().toString();
    }

    public String multiply() {
        return st.multiply(nd).stripTrailingZeros().toString();
    }

    /* This method should throw an exception when divide by zero */
    public String division() throws ArithmeticException {
        if (nd.equals(0))
            throw new ArithmeticException();
        return st.divide(nd, 5, RoundingMode.HALF_UP).stripTrailingZeros().toString();
    }

    public String power() {
        //pow method uses int as parameter, therefore, we've to convert BigDecimal to int via intValue method.
        return st.pow(nd.intValue()).stripTrailingZeros().toString();
    }

}
