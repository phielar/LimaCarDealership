/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package philaman.cput.limacardealers.Model;

/**
 *
 * @author phila
 */
public class VehicleBrand {

    private String id;
    private String name;
    private String country;

    private VehicleBrand() {
    }

    public VehicleBrand(Builder build) {
        this.id = build.id;
        this.name = build.name;
        this.country = build.country;
    }

    public static class Builder {

        private String id;
        private String name;
        private String country;

        public Builder(String id) {
            this.id = id;
        }
        public Builder id(String value)
        {   id=value;
            return this;
        }
        public Builder name(String value)
        {   name=value;
            return this;
        }
        public Builder country(String value)
        {   country=value;
            return this;
        }
        public VehicleBrand builder()
        {   return new VehicleBrand(this); }
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + (this.id != null ? this.id.hashCode() : 0);
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
        final VehicleBrand other = (VehicleBrand) obj;
        if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id)) {
            return false;
        }
        return true;
    }
}
