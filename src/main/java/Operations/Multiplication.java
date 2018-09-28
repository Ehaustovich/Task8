package Operations;

public class Multiplication {
    private double firstNumber;
    private double secondNumber;
    public double mult;

    public Multiplication(double firstNumber, double secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public void setFirstNumber(double firstNumber) {

        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber)
    {
        this.secondNumber = secondNumber;
    }

    public double getMultiplication() {
        mult = firstNumber * secondNumber;
        return mult;
    }
}