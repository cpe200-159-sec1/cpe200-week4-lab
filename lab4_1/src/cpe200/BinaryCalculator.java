package cpe200;

import java.math.BigDecimal;

public class BinaryCalculator {
    private Operand firstOperand;
    private Operand secondOperand;

    public BinaryCalculator() {
    }

    public void setFirstOperand(Operand operand)
    {
        this.firstOperand=operand;
    }


    public void setSecondOperand(Operand operand)
    {
        this.secondOperand=operand;
    }

    public String add()
    {
        BigDecimal num1=new BigDecimal(firstOperand.getOperand());
        BigDecimal num2=new BigDecimal(secondOperand.getOperand());
        BigDecimal sent=num1.add(num2);
        return sent.stripTrailingZeros().toString();
    }

    public String subtract()
    {
        BigDecimal num1=new BigDecimal(firstOperand.getOperand());
        BigDecimal num2=new BigDecimal(secondOperand.getOperand());
        BigDecimal sent=num1.subtract(num2);
        return sent.stripTrailingZeros().toString();
    }

    public String multiply()
    {
        BigDecimal num1=new BigDecimal(firstOperand.getOperand());
        BigDecimal num2=new BigDecimal(secondOperand.getOperand());
        BigDecimal sent=num1.multiply(num2);
        return sent.stripTrailingZeros().toString();
    }

    /* This method should throw an exception when divide by zero */
    public String division()
    {
        BigDecimal num1=new BigDecimal(firstOperand.getOperand());
        BigDecimal num2=new BigDecimal(secondOperand.getOperand());
        if(num2.stripTrailingZeros().toString()=="0")
        {
            System.out.println("ERROR because number 2 is zero");
            return null;
        }
        else
        {
            BigDecimal sent=num1.divide(num2,5,5);
            return sent.stripTrailingZeros().toString();
        }
    }

    public String power()
    {
        BigDecimal num1=new BigDecimal(firstOperand.getOperand());
        BigDecimal num2=new BigDecimal(secondOperand.getOperand());
        double dnum1=num1.doubleValue();
        double dnum2=num2.doubleValue();
        Operand temp=new Operand(Math.pow(dnum1,dnum2));
        BigDecimal sent=new BigDecimal(temp.getOperand());
        return sent.stripTrailingZeros().toString();
    }

}
