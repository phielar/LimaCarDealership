/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package philaman.cput.limacardealers.Model;

import java.util.List;
import java.util.Objects;

/**
 *
 * @author phila
 */
public class Region {

    private String locationCode;
    private String locationDescription;
    private Address address;
    private List<Branch> branch;

    private Region() {
    }

    public Region(Builder build) {
        this.locationCode = build.locationCode;
        this.locationDescription = build.locationDescription;
        this.address = build.address;
        this.branch = build.branch;
    }

    public static class Builder {

        private String locationCode;
        private String locationDescription;
        private Address address;
        private List<Branch> branch;

        public Builder(String locationCode) {
            this.locationCode = locationCode;
        }
        
        public Builder locationDescription(String value) {
            locationDescription=value;
            return this;
        }
        public Builder address(Address value)
        {
            address=value;
            return this;
            
        }
        public Builder branch(List<Branch> value) {
            branch=value;
            return this;
        }
        
        public Region build()
        {   return new Region(this);}
    }

    public String getLocationCode() {
        return locationCode;
    }

    public String getLocationDescription() {
        return locationDescription;
    }

    public Address getAddress() {
        return address;
    }

    public List<Branch> getBranch() {
        return branch;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.locationCode);
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
        final Region other = (Region) obj;
        if (!Objects.equals(this.locationCode, other.locationCode)) {
            return false;
        }
        return true;
    }
}
