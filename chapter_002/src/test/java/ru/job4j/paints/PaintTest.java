package ru.job4j.paints;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Strepped on 29.04.2017.
 */
public class PaintTest {
    /**
     * Test add.
     */
    @Test
    public void printTriangle() {
        Shape shape = new Triangle();
        new Paint().draw(shape);
        String result = shape.pic();
        String expected = String.format("  ^%s ^^^%n^^^^^", System.getProperty("line.separator"));
        assertThat(result, is(expected));
    }

    /**
     * Test add.
     */
    @Test
    public void printSquare() {
        Shape shape = new Square();
        new Paint().draw(shape);
        String result = shape.pic();
        String expected = String.format("^^^^^%s^^^^^%n^^^^^%n^^^^^%n^^^^^", System.getProperty("line.separator"));
        assertThat(result, is(expected));
    }
}

