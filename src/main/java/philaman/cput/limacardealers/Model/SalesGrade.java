package philaman.cput.limacardealers.Model;

/**
 * Created by phila on 3/7/14.
 */
public class SalesGrade {
    private double  rate;
    private String grade;

    private SalesGrade() {
    }

    public SalesGrade(Builder build) {
        this.rate = build.rate;
        this.grade = build.grade;
    }

    public static class Builder{
        private double  rate;
        private String grade;

        public Builder(String grade) {
            this.grade = grade;
        }

        public Builder rate(double value)
        {
            rate=value;
            return this;
        }
        
        public SalesGrade Builder()
        {
            return new SalesGrade(this);
        }       
        
    }

    public double getRate() {
        return rate;
    }

    public String getGrade() {
        return grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SalesGrade SalesGrade = (SalesGrade) o;

        if (!grade.equals(SalesGrade.grade)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return grade.hashCode();
    }
}
