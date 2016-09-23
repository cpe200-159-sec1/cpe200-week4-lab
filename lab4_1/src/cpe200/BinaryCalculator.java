package cpe200;


import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
public class BinaryCalculator {
    private Operand firstOperand ;
    private Operand secondOperand;
    private Float solve ;
    private DecimalFormat form = new DecimalFormat("###.#####");
    public BinaryCalculator() {
    }

    public void setFirstOperand(Operand operand) {
        firstOperand = operand;
    }


    public void setSecondOperand(Operand operand) {
        secondOperand = operand;
    }

    public String add() {
        BigDecimal temp1 = new BigDecimal(firstOperand.Getoper());
        BigDecimal temp2 = new BigDecimal(secondOperand.Getoper());
        return temp1.add(temp2).stripTrailingZeros().toString();
    }

    public String subtract() {
        BigDecimal temp1 = new BigDecimal(firstOperand.Getoper());
        BigDecimal temp2 = new BigDecimal(secondOperand.Getoper());
        return temp1.subtract(temp2).stripTrailingZeros().toString();
    }

    public String multiply() {
        BigDecimal temp1 = new BigDecimal(firstOperand.Getoper());
        BigDecimal temp2 = new BigDecimal(secondOperand.Getoper());
        return temp1.multiply(temp2).stripTrailingZeros().toString();
    }
    public String division() throws ArithmeticException {
        BigDecimal temp1 = new BigDecimal(firstOperand.Getoper());
        BigDecimal temp2 = new BigDecimal(secondOperand.Getoper());
        return temp1.divide(temp2,5, RoundingMode.HALF_UP).stripTrailingZeros().toString();
    }

    public String power() {
        solve = Float.parseFloat(firstOperand.Getoper());
              for(int i = 1 ; i < Float.parseFloat(secondOperand.Getoper()) ; i++)
                   solve = solve*Float.parseFloat(firstOperand.Getoper());
               return form.format(solve).toString();
    }
    }

