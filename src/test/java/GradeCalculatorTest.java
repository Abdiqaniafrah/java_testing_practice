import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

class GradeCalculatorTest {

    @Test
    void fiftyNineShouldReturnF() {
        // Given
        GradeCalculator underTest = new GradeCalculator();
        // When
        int result = underTest.determineLetterGrade(59);
        // Then
        assertThat(result).isEqualTo('F');

    }

    @Test
    void sixtyNineShouldReturnD() {
        // Given
        GradeCalculator underTest = new GradeCalculator();
        // When
        int result = underTest.determineLetterGrade(69);
        // Then
        assertThat(result).isEqualTo('D');

    }
    @Test
    void seventyNineShouldReturnC() {
        // Given
        GradeCalculator underTest = new GradeCalculator();
        // When
        int result = underTest.determineLetterGrade(79);
        // Then
        assertThat(result).isEqualTo('C');

    }
    @Test
    void eightyNineShouldReturnB() {
        // Given
        GradeCalculator underTest = new GradeCalculator();
        // When
        int result = underTest.determineLetterGrade(89);
        // Then
        assertThat(result).isEqualTo('B');

    }
    @Test
    void ninetyNineShouldReturnA() {
        // Given
        GradeCalculator underTest = new GradeCalculator();
        // When
        int result = underTest.determineLetterGrade(99);
        // Then
        assertThat(result).isEqualTo('A');

    }
    @Test
    void eightNineShouldReturnB() {
        // Given
        GradeCalculator underTest = new GradeCalculator();
        // When
        int result = underTest.determineLetterGrade(80);
        // Then
        assertThat(result).isEqualTo('B');

    }
    @Test
    void ninetyShouldReturnA() {
        // Given
        GradeCalculator underTest = new GradeCalculator();
        // When
        int result = underTest.determineLetterGrade(90);
        // Then
        assertThat(result).isEqualTo('A');

    }
    @Test
    void seventyShouldReturnC() {
        // Given
        GradeCalculator underTest = new GradeCalculator();
        // When
        int result = underTest.determineLetterGrade(70);
        // Then
        assertThat(result).isEqualTo('C');

    }
    @Test
    void sixtyShouldReturnD() {
        // Given
        GradeCalculator underTest = new GradeCalculator();
        // When
        int result = underTest.determineLetterGrade(60);
        // Then
        assertThat(result).isEqualTo('D');
    }
    @Test
    void zeroShouldReturnF() {
        // Given
        GradeCalculator underTest = new GradeCalculator();
        // When
        int result = underTest.determineLetterGrade(0);
        // Then
        assertThat(result).isEqualTo('F');

    }
    @Test
    void negativeZeroShouldReturnIllegalArgumentException() {
        // Given
        GradeCalculator underTest = new GradeCalculator();
        // When
        int result = underTest.determineLetterGrade(-1);
        // Then
        assertThatThrownBy(() -> {
            underTest.determineLetterGrade(-1);
        });
    }
}