package aconex;

public class Probability {
    private double value;

    public Probability(double value) {
        this.value = value;
    }

    public Probability not() {
        return new Probability(1 - value);
    }

    public Probability and(Probability other) {
        return new Probability(value * other.value);
    }

    public Probability or(Probability other) {
        Probability notThisAndNotOther = applyDemorgansLaw(other);
        return notThisAndNotOther;
    }

    private Probability applyDemorgansLaw(Probability other) {
        Probability notThis = this.not();
        Probability notOther = other.not();
        return (notThis.and(notOther)).not();
    }

    @Override
    public String toString() {
        return "Probability{" +
                "value=" + value +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Probability that = (Probability) o;

        return Double.compare(that.value, value) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(value);
        return (int) (temp ^ (temp >>> 32));
    }
}
