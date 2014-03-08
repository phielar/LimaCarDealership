/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package philaman.cput.limacardealers.Model;

import java.util.Objects;

/**
 *
 * @author phila
 */
public final class Commission {

    private String id;
    private SalesGrade rate;
    private Inventory car;
    private double commission;

    private Commission() {
    }

    public Commission(Builder Build) {
        this.id = Build.id;
        this.rate = Build.rate;
        this.car = Build.car;
        this.commission = Build.commission;
    }

    public static class Builder {

        private String id;
        private SalesGrade rate;
        private Inventory car;
        private double commission;

        public Builder(String id) {
            this.id = id;
        }
        
        public Builder rate(SalesGrade value) {
            rate=value;
            return this;
        }

        public Builder car(Inventory value) {
            car=value;
            return this;
        }

        public Builder commission(double value) {
            commission=value;
            return this;
        }
        
        public Commission build()
        {   return new Commission(this);}
        
        
    }

    public String getId() {
        return id;
    }

    public SalesGrade getRate() {
        return rate;
    }

    public Inventory getCar() {
        return car;
    }

    public double getCommission() {
        return commission;
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
        final Commission other = (Commission) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
}
