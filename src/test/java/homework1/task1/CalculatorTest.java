package homework1.task1;

import static org.assertj.core.api.Assertions.*;


public class CalculatorTest {

    public static void main(String[] args) {
        
        assertThat(Calculator.calculateDiscount(22.0, 7.0)).isEqualTo(20.46);
        assertThat(Calculator.calculateDiscount(100.0, 10.0)).isEqualTo(90.0);
        assertThat(Calculator.calculateDiscount(33.0, 0.0)).isEqualTo(33.0);
        assertThatThrownBy(() -> Calculator.calculateDiscount(22, 7)).
                isInstanceOf(ArithmeticException.class);
        assertThatThrownBy(() -> Calculator.calculateDiscount(0, 0)).
                isInstanceOf(ArithmeticException.class);
    }


}
