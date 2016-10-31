package cpe200;

public class Operand {
    private String operand;

    public Operand(String operand) {
        this.operand = operand;
    }

    public Operand(int operand) {
    this.operand = Integer.toString(operand);
    }

    public Operand(double operand) {
        this.operand = Double.toString(operand);
    }

    public void setOperrand(String operand)
    {
            this.operand=operand;
    }

    public String getOperand()
    {
     return operand;
    }


}
