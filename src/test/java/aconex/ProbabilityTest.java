package aconex;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ProbabilityTest {

    @Test
    public void shouldGiveProbabilityOfAnEventNotOccurring() {
        assertThat(p(0.3).not(), is(p(0.7)));
    }

    @Test
    public void shouldBeAbleToGetAProbabilityOfTwoEventsOccurringTogether() {
        assertThat(p(0.3).and(p(0.3)), is(p(0.09)));
    }

    @Test
    public void shouldBeAbleToGetProbabilityOfAnyOfTheTwoEventsOccurring() {
        assertThat(p(0.4).or(p(0.4)), is(p(0.64)));
    }

    private Probability p(double value) {
        return new Probability(value);
    }
}
