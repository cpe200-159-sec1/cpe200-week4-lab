package cpe200;

import java.math.BigDecimal;

public class BinaryCalculator {
    private String firstOperand, secondOperand;

    public BinaryCalculator()
    {
    }

    public void setFirstOperand(Operand operand)
    {
        this.firstOperand = operand.get();
    }


    public void setSecondOperand(Operand operand)
    {

        this.secondOperand = operand.get();
    }

    public String add()
    {
        BigDecimal a = new BigDecimal(this.firstOperand);
        BigDecimal b = a.add(new BigDecimal(this.secondOperand)).stripTrailingZeros();
        return b.toString();
    }

    public String subtract()
    {
        BigDecimal a = new BigDecimal(this.firstOperand);
        BigDecimal b = a.subtract(new BigDecimal(this.secondOperand)).stripTrailingZeros();
        return b.toString();
    }

    public String multiply()
    {
        BigDecimal a = new BigDecimal(this.firstOperand);
        BigDecimal b = a.multiply(new BigDecimal(this.secondOperand)).stripTrailingZeros();
        return b.toString();
    }

    /* This method should throw an exception when divide by zero */
    public String division()
    {
        BigDecimal a = new BigDecimal(this.firstOperand);
        BigDecimal b = new BigDecimal(this.secondOperand);
        if (b.compareTo(BigDecimal.ZERO) == 0)
            throw new IllegalArgumentException("Argument 'divisor' is 0");
        b = a.divide(b, 5, BigDecimal.ROUND_HALF_UP).stripTrailingZeros();

        return b.toString();
    }

    public String power() {
        BigDecimal a = new BigDecimal(this.firstOperand);
        BigDecimal b = new BigDecimal(this.secondOperand);
        a = a.pow(b.intValue());
        a = a.stripTrailingZeros();
        return a.toString();
    }

}
