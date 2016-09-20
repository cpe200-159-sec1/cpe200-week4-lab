package cpe200;


import java.math.BigDecimal;
import java.text.DecimalFormat;

public class BinaryCalculator {
    private Operand firstOperand;
    private Operand secondOperand;
    private float num = 0f;
    //private int   iNum = 0;
    private float fFirstConNum = 0f;
    private float fSecondConNum = 0f;
    //private int iFirstConNum = 0;
    //private int iSecondConNum = 0;
    private String numberAsString = "";


    public BinaryCalculator() {
        //firstOperand = new (0);
        //secondOperand = new Operand(0);
    }

    public void setFirstOperand(Operand operand) {
        this.firstOperand = operand;
    }


    public void setSecondOperand(Operand operand) {
        this.secondOperand = operand;
    }

    public String add() {
        fConverfload();
        num = fFirstConNum+fSecondConNum;
        numberAsString = Float.toString(num);

        if (fFirstConNum == Math.round(fFirstConNum)) {
            numberAsString = Integer.toString((int)num);
        }

        return numberAsString;

    }

    public String subtract() {
        fConverfload();
        num = fFirstConNum-fSecondConNum;


        numberAsString = Float.toString(num);                                   //debug .0000001

        numberAsString = String.format("%.5f",num);

        numberAsString = Double.toString(Double.parseDouble(numberAsString));


        if (fFirstConNum == Math.round(fFirstConNum)) {
            numberAsString = Integer.toString((int)num);
        }

        return numberAsString;
    }

    public String multiply() {
        fConverfload();
        num = fFirstConNum*fSecondConNum;
        numberAsString = Float.toString(num);

        if (fFirstConNum == Math.round(fFirstConNum)) {
            numberAsString = Integer.toString((int)num);
        }

        return numberAsString;
    }

    /* This method should throw an exception when divide by zero */
    public String division() throws ArithmeticException {
        fConverfload();
        if (fSecondConNum==0){
            throw new ArithmeticException("Error");
        }

        num = fFirstConNum/fSecondConNum;


        numberAsString = Float.toString(num);

        numberAsString = String.format("%.5f",num);

        numberAsString = Double.toString(Double.parseDouble(numberAsString));

        if (num%1==0) {
            numberAsString = Integer.toString((int)num);
        }




        return numberAsString;
    }

    public String power() {

        fConverfload();
        num = (float) Math.pow(fFirstConNum,fSecondConNum);
        numberAsString = Float.toString(num);

        if (fFirstConNum == Math.round(fFirstConNum)) {
            numberAsString = Integer.toString((int)num);
        }

        return numberAsString;
    }

    public void fConverfload(){
        fFirstConNum = new Float(firstOperand.getOperand()).floatValue();
        fSecondConNum = new Float(secondOperand.getOperand()).floatValue();
    }

}
