package cpe200;

import java.math.BigDecimal;
import java.math.RoundingMode;
public class BinaryCalculator {
    private Operand firstOperand;
    private Operand secondOperand;

    public BinaryCalculator()
    {
        //this.first.operand = "";
        // this.second.operand = "";
    }

    public void setFirstOperand(Operand operand)
    {
        firstOperand = operand;
    }


    public void setSecondOperand(Operand operand)
    {
        secondOperand = operand;
    }

    public String add()
    {
        BigDecimal temp1 = new BigDecimal(firstOperand.getoperand());
        BigDecimal temp2 =temp1.add(new BigDecimal(secondOperand.getoperand())).stripTrailingZeros();

        return temp2.toString();
    }

    public String subtract()
    {
        BigDecimal temp1 = new BigDecimal(firstOperand.getoperand());
        BigDecimal temp2 =temp1.subtract(new BigDecimal(secondOperand.getoperand())).stripTrailingZeros();
        return temp2.toString();
    }

    public String multiply()
    {
        BigDecimal temp1 = new BigDecimal(firstOperand.getoperand());
        BigDecimal temp2 =  temp1.multiply(new BigDecimal(secondOperand.getoperand())).stripTrailingZeros();
        return temp2.toString();
    }

    /* This method should throw an exception when divide by zero */
    public String division()
    {
        BigDecimal temp1 = new BigDecimal(firstOperand.getoperand());
        BigDecimal temp2 = new BigDecimal(secondOperand.getoperand());
        if(temp2.compareTo(BigDecimal.ZERO)==0)
            throw new IllegalArgumentException("Argument 'divisor' is 0");
        temp2 = temp1.divide(temp2,5, RoundingMode.HALF_UP).stripTrailingZeros();
        return temp2.toString();
    }
    public String power() {
        BigDecimal temp1 = new BigDecimal(firstOperand.getoperand());
        BigDecimal temp2 = new BigDecimal(secondOperand.getoperand());
       temp1 = temp1.pow(temp2.intValue()).stripTrailingZeros();
        return temp1.toString();
    }
}