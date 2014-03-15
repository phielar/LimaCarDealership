/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package philaman.cput.limacardealers.model;

/**
 *
 * @author phila
 */
public final class VehicleColour {

    private String id;
    private String vehicleVIN;
    private String colSection ;
    private String color ;

    private VehicleColour() {
    }

    public VehicleColour(Builder build) {
        this.id = build.id;
        this.vehicleVIN = build.vehicleVIN;
        this.colSection = build.colSection;
        this.color  = build.color;
    }

    public static class Builder {

        private String id;
        private String vehicleVIN;
        private String  colSection ;
        private String  color ;

        public Builder(String id) {
            this.id = id;
        }

        public Builder vehicleVIN(String value) {
            vehicleVIN = value;
            return this;
        }

        public Builder colSection(String value) {
            colSection = value;
            return this;
        }

        public Builder color(String value) {
            color = value;
            return this;
        }

        public VehicleColour builder() {
            return new VehicleColour(this);
        }
    }

    public String getId() {
        return id;
    }

    public String getVehicleVIN() {
        return vehicleVIN;
    }

    public String getColSection() {
        return colSection;
    }

    public String getColor() {
        return color;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + (this.id != null ? this.id.hashCode() : 0);
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
        final VehicleColour other = (VehicleColour) obj;
        if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id)) {
            return false;
        }
        return true;
    }
}
