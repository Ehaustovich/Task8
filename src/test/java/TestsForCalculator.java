import org.junit.jupiter.api.Test;
import  static org.junit.jupiter.api.Assertions.assertEquals;

public class TestsForCalculator{

    @Test
    public void TestForSum(){
        Calculator calculator=new Calculator(12.65,-11.5,1);
        assertEquals(1.15,calculator.getResult(),0.0004);
    }

    @Test
    public void TestForSubtraction(){
        Calculator calculator=new Calculator(12.65,-11.5,2);
        assertEquals(24.15,calculator.getResult());
    }

    @Test
    public void TestForMultiplication(){
        Calculator calculator=new Calculator(12.65,-11.5,3);
        assertEquals(-145.475,calculator.getResult());
    }

    @Test
    public void TestForDivision(){
        Calculator calculator=new Calculator(12.65,-11.5,4);
        assertEquals(-1.1,calculator.getResult());
    }

}

