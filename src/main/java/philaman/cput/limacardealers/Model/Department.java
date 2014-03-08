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
public class Department {

    private String depId;
    private String department;
    
    private Department() {
    }

    public Department(Builder build) {
        this.depId = build.depId;
        this.department = build.department;
    }

    public static class Builder {

        private String depId;
        private String department;

        public Builder(String depId) {
            this.depId = depId;
        }

        public Builder department(String value) {
            department = value;
            return this;
        }

        public Department build() {
            return new Department(this);
        }
    }

    public String getDepId() {
        return depId;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.depId);
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
        final Department other = (Department) obj;
        if (!Objects.equals(this.depId, other.depId)) {
            return false;
        }
        return true;
    }
}
