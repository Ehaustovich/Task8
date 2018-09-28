package Operations;

public class Division {

    private double firstNumber;
    private double secondNumber;
    public double div;

    public Division(double firstNumber, double secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public void setFirstNumber(double firstNumber) {

        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber) {

        this.secondNumber = secondNumber;
    }

    public double getDivision() {
        div = firstNumber / secondNumber;
        return div;
    }


}