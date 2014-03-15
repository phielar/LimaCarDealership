package philaman.cput.limacardealers.model;

import java.util.Objects;

/**
 * Created by phila on 3/7/14.
 */
public final class GeneralWorker {

    private String id;
    private int hoursWorked;
    private double rate;
    private Employee emp;

    public GeneralWorker(Builder build) {
        this.id = build.id;
        this.hoursWorked = build.hoursWorked;
        this.rate = build.rate;
        this.emp = build.emp;

    }

    public static class Builder {

        private String id;
        private int hoursWorked;
        private double rate;
        private Employee emp;

        public Builder(String id) {
            this.id = id;
        }

        public Builder hoursWorked(int value) {
            hoursWorked = value;
            return this;
        }

        public Builder emp(Employee value) {
            emp = value;
            return this;
        }

        public Builder rate(double value) {
            rate = value;
            return this;
        }

        public GeneralWorker build() {
            return new GeneralWorker(this);
        }
    }

    public String getId() {
        return id;
    }

    public Employee getEmp() {
        return emp;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public double getRate() {
        return rate;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final GeneralWorker other = (GeneralWorker) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
}
