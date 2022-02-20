import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

    @Test
    void twoPlusTwoShouldEqualFour() {
        // Given
        SimpleCalculator underTest = new SimpleCalculator(); // local variable

        // When
        // int result is the variable
        // underTest.add then pass the values
        // add is the method invoked
        int result = underTest.add(2, 2);

        // Then
        // created the variable with the answer
        //assertThat the result is equal to the excepted value
//        assertEquals(4, calculator.add(2, 2));
        assertThat(result).isEqualTo(4);
    }
}