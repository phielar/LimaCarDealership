package philaman.cput.limacardealers.model;

import java.util.List;
import java.util.Objects;

/**
 * Created by phila on 3/7/14.
 */
public final class Mechenic {

    private String id;
    private Employee emp;
    private String speciality;
    private List<VehicleType> vType;

    private Mechenic() {
    }

    public Mechenic(Builder build) {
        this.id = build.id;
        this.emp = build.emp;
        this.speciality = build.speciality;
        this.vType = build.vType;
    }

    public static class Builder {

        private String id;
        private Employee emp;
        private String speciality;
        private List<VehicleType> vType;

        public Builder(String id) {
            this.id = id;
        }
        public Builder speciality(String value) {
            speciality=value;
            return this;            
        }

        public Builder vType(List<VehicleType> value) {
            vType=value;
            return this;
        }
        
        public Mechenic build()
        {   return new Mechenic(this);}
    }

    public String getId() {
        return id;
    }

    public Employee getEmp() {
        return emp;
    }

    public String getSpeciality() {
        return speciality;
    }

    public List<VehicleType> getType() {
        return vType;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.id);
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
        final Mechenic other = (Mechenic) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
   
}
