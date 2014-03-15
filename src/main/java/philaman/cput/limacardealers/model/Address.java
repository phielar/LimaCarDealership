/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package philaman.cput.limacardealers.model;

/**
 *
 * @author phila
 */
public final class Address {

    private String id;
    private String houseNumber;
    private String street;
    private String suburb;
    private String city;
    private String province;
    private String postalCode;

    private Address() {
    }
    
    public Address(Builder bulder) {
        this.id = bulder.id;
        this.houseNumber = bulder.houseNumber;
        this.street = bulder.street;
        this.suburb = bulder.suburb;
        this.city = bulder.city;
        this.province = bulder.province;
        this.postalCode = bulder.postalCode;
    }
    
    public static class Builder {

        private String id;
        private String houseNumber;
        private String street;
        private String suburb;
        private String city;
        private String province;
        private String postalCode;

        public Builder(String houseNumber) {
            this.houseNumber = houseNumber;
        }

        public Builder id(String value) {
            id=value;
            return this;
        }

        public Builder street(String value) {
            street=value;
            return this;
        }

        public Builder suburb(String value) {
            suburb=value;
            return this;
        }

        public Builder city(String value) {
            city=value;
            return this;
        }

        public Builder province(String value) {
            province=value;
            return this;
        }

        public Builder postalCode(String value) {
            postalCode=value;
            return this;
        }
        
        public Address builder()
        {
            return new Address(this);
        }
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (this.id != null ? this.id.hashCode() : 0);
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
        final Address other = (Address) obj;
        if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id)) {
            return false;
        }
        return true;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public String getStreet() {
        return street;
    }

    public String getSuburb() {
        return suburb;
    }

    public String getCity() {
        return city;
    }

    public String getProvince() {
        return province;
    }

    public String getPostalCode() {
        return postalCode;
    }
}
