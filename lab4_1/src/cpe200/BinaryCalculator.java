package cpe200;


import java.text.DecimalFormat;

public class BinaryCalculator {
    private Operand firstOperand;
    private Operand secondOperand;
    private Float solve ;
    private DecimalFormat form = new DecimalFormat("###.#####");

    public BinaryCalculator() {
        firstOperand = new Operand(0);
        secondOperand = new Operand(0);
    }

    public void setFirstOperand(Operand operand) {
        firstOperand.setOperand(operand.getOperand());
    }


    public void setSecondOperand(Operand operand) {
        secondOperand.setOperand(operand.getOperand());
    }

    public String add() {
        solve = Float.parseFloat(firstOperand.getOperand())+Float.parseFloat(secondOperand.getOperand());
        return form.format(solve).toString();
    }

    public String subtract() {
        solve = Float.parseFloat(firstOperand.getOperand())-Float.parseFloat(secondOperand.getOperand());
        return form.format(solve).toString();
    }

    public String multiply() {
        solve = Float.parseFloat(firstOperand.getOperand())*Float.parseFloat(secondOperand.getOperand());
        return form.format(solve).toString();
    }

    /* This method should throw an exception when divide by zero */
    public String division() throws ArithmeticException {
        if(Float.parseFloat(secondOperand.getOperand())== 0) throw new RuntimeException("The operation must raise an exception");
        solve = Float.parseFloat(firstOperand.getOperand())/Float.parseFloat(secondOperand.getOperand());
        return form.format(solve).toString();
    }

    public String power() {
        solve = Float.parseFloat(firstOperand.getOperand());
        for(int i = 1 ; i < Float.parseFloat(secondOperand.getOperand()) ; i++)
        solve = solve*Float.parseFloat(firstOperand.getOperand());
        return form.format(solve).toString();
    }

}
