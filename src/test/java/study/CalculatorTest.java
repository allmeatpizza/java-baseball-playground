package study;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.Scanner;

import static org.assertj.core.api.Assertions.assertThat;
public class CalculatorTest {

    Calculator cal;
    Scanner sc;


    @BeforeEach
    void setUp() {
        this.cal = new Calculator();
        this.sc = new Scanner(System.in);
    }

    @Test
    void input() {
        String input = "2 + 3 * 4 / 2";
        assertThat(cal.input(input)).isEqualTo(10);
    }

    @Test
    void sum() {
        assertThat(cal.sum(1,2)).isEqualTo(3);
    }

    @Test
    void minus() {
        assertThat(cal.minus(1,2)).isEqualTo(-1);
    }

    @Test
    void multiplication() {
        assertThat(cal.multiply(1,2)).isEqualTo(2);
    }

    @Test
    void division() {
        assertThat(cal.multiply(0,2)).isEqualTo(0);
    }
}
