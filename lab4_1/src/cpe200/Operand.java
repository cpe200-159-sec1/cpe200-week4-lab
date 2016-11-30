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

    public void setOperand(String value){
        this.operand = value;
    }

    public String getOperand(){
        return this.operand;
    }
}
