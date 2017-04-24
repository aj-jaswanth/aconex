package aconex;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class RectangleTest {
    @Test
    public void shouldCalculateAreaWhenBothLengthAndBreadthAreZero() {
        Rectangle rectangle = new Rectangle(0, 0);

        Assert.assertThat(rectangle.area(), is(0.0));
    }

    @Test
    public void shouldCalculatePerimeter() {
        Rectangle rectangle = new Rectangle(2, 3);

        Assert.assertThat(rectangle.perimeter(), is(10.0));
    }
}
