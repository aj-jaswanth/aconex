package aconex;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ProbabilityTest {

    @Test
    public void shouldGiveInverseProbability() {
        assertThat(p(0.3).not(), is(p(0.7)));
    }

    private Probability p(double value) {
        return new Probability(value);
    }
}
