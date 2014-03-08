/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package philaman.cput.limacardealers.Model;

/**
 *
 * @author phila
 */
public final class VehicleType {

    private String id;
    private String type;

    private VehicleType() {
    }

    public VehicleType(Builder build) {
        this.id = build.id;
        this.type = build.type;
    }

    public static class Builder {

        private String id;
        private String type;

        public Builder(String value) {
            this.id = value;
        }

        public Builder getType(String value) {
            type = value;
            return this;
        }

        public VehicleType build() {
            return new VehicleType(this);
        }
    }

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + (this.id != null ? this.id.hashCode() : 0);
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
        final VehicleType other = (VehicleType) obj;
        if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id)) {
            return false;
        }
        return true;
    }
}
