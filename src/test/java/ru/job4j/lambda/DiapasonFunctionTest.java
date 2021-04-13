package ru.job4j.lambda;


import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class DiapasonFunctionTest {

    @Test
    public void whenLinearFunctionThenLinearResults() {
        DiapasonFunction func = new DiapasonFunction();
        List<Double> result = func.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenQuadraticFunctionThenLinearResults() {
        DiapasonFunction func = new DiapasonFunction();
        List<Double> result = func.diapason(1, 5, x -> x * x);
        List<Double> expected = Arrays.asList(1.0, 4.0, 9.0, 16.0);
        assertThat(result, is(expected));
    }

    @Test
    public void whenExponentialFunctionThenLinearResults() {
        DiapasonFunction func = new DiapasonFunction();
        List<Double> result = func.diapason(1, 4, x -> Math.pow(2.0, x));
        List<Double> expected = Arrays.asList(2.0, 4.0, 8.0);
        assertThat(result, is(expected));
    }
}
