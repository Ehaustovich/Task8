package Operations;

public class Sum {
    private double firstNumber;
    private double secondNumber;
    public double sum;

    public Sum(double firstNumber, double secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public void setFirstNumber(double firstNumber) {

        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber) {

        this.secondNumber = secondNumber;
    }

    public double getSum() {
        sum = firstNumber + secondNumber;
        return sum;
    }

}
