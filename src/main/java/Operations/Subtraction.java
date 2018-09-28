package Operations;

public class Subtraction {
    private double firstNumber;
    private double secondNumber;
    public double sub;

    public Subtraction(double firstNumber, double secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public void setFirstNumber(double firstNumber) {

        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber) {

        this.secondNumber = secondNumber;
    }

    public double getSubtraction() {
        sub = firstNumber - secondNumber;
        return sub;
    }
}
