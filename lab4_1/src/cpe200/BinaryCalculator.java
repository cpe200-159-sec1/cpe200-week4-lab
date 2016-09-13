package cpe200;


public class BinaryCalculator {
    private Operand firstOperand;
    private Operand secondOperand;

    public BinaryCalculator() {
    }

    public void setFirstOperand(Operand operand) {
        this.firstOperand = operand;
    }


    public void setSecondOperand(Operand operand) {
        this.secondOperand = operand;
    }

    public String add() {
        return Double.toString(Double.parseDouble(firstOperand.getOperand()) + Double.parseDouble(secondOperand.getOperand())).replaceAll(".0","");
    }

    public String subtract() {
        return null;
    }

    public String multiply() {
        return null;
    }

    /* This method should throw an exception when divide by zero */
    public String division() throws ArithmeticException {
        return null;
    }

    public String power() {
        return null;
    }

}
