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
        String ans = String.format("%."+ 5 + "f", Double.parseDouble(firstOperand.getOperand()) + Double.parseDouble(secondOperand.getOperand()));
        ans = ans.indexOf(".") < 0 ? ans : ans.replaceAll("0*$", "").replaceAll("\\.$", "");
        return ans;
    }

    public String subtract() {
        String ans = String.format("%."+ 5 + "f", Double.parseDouble(firstOperand.getOperand()) - Double.parseDouble(secondOperand.getOperand()));
        ans = ans.indexOf(".") < 0 ? ans : ans.replaceAll("0*$", "").replaceAll("\\.$", "");
        return ans;
    }

    public String multiply() {
        String ans = String.format("%."+ 5 + "f", Double.parseDouble(firstOperand.getOperand()) * Double.parseDouble(secondOperand.getOperand()));
        ans = ans.indexOf(".") < 0 ? ans : ans.replaceAll("0*$", "").replaceAll("\\.$", "");
        return ans;
    }

    /* This method should throw an exception when divide by zero */
    public String division() throws ArithmeticException {
        if (secondOperand.getOperand().equals("0") || secondOperand.getOperand().equals("0.0")){
            throw new ArithmeticException("Divide by zero");
        }else {
            String ans = String.format("%." + 5 + "f", Double.parseDouble(firstOperand.getOperand()) / Double.parseDouble(secondOperand.getOperand()));
            ans = ans.indexOf(".") < 0 ? ans : ans.replaceAll("0*$", "").replaceAll("\\.$", "");
            return ans;
        }
    }

    public String power() {
        String ans = String.format("%."+ 5 + "f", Math.pow( Double.parseDouble(firstOperand.getOperand()) , Double.parseDouble(secondOperand.getOperand())));
        ans = ans.indexOf(".") < 0 ? ans : ans.replaceAll("0*$", "").replaceAll("\\.$", "");
        return ans;
    }

}
