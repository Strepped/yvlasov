package ru.job4j.condition.triangle;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.number.IsCloseTo.closeTo;

/**
* Test.
*
 * @author Yury Vlasov
 * @since 13.04.2017
 * @version 1.0
*/

public class TriangleTest {
/**
* Test add.
*/
    @Test
    public void areaTriangle() {
	Point a = new Point(1, 1);
	Point b = new Point(-2, 4);
	Point c = new Point(-2, -2);
	Triangle triangle = new Triangle(a, b, c);
	double result = triangle.area();
	double expect = 9.0;
	assertThat(result, closeTo(except, 0.03));
    }
}