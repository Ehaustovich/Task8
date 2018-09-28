import Operations.Division;
import Operations.Multiplication;
import Operations.Subtraction;
import Operations.Sum;

public class Calculator {
    private double firstNumber;
    private double secondNumber;
    private int operation;
    private double result;

    public Calculator(double firstNumber, double secondNumber, int operation) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.operation = operation;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public void setOperation(int operation) {
        this.operation = operation;
    }

    public double getResult() {

        if (operation == 1) {
            Sum summa = new Sum(firstNumber, secondNumber);
            result = summa.getSum();
            System.out.println("Сумма = " + summa.sum); //сложение

        } else if (operation == 2) {
            Subtraction subtraction = new Subtraction(firstNumber, secondNumber); //вычитание
            result = subtraction.getSubtraction();
            System.out.println("Разность = " + subtraction.sub);

        } else if (operation == 3) {
            Multiplication multiplication = new Multiplication(firstNumber, secondNumber); //умножение
            result = multiplication.getMultiplication();
            System.out.println("Произведение = " + multiplication.mult);

        } else if (operation == 4) {

            Division division = new Division(firstNumber, secondNumber); //деление
            result = division.getDivision();
            if (Double.isInfinite(result)) {
                throw new ArithmeticException("Деление на 0");
            } else {
                System.out.println("Частное = " + division.div);
            }

        } else System.err.println("Неправильно выбрана операция");
        return result;
    }
}
