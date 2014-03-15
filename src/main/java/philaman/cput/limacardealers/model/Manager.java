package philaman.cput.limacardealers.model;

import java.util.Objects;

/**
 * Created by phila on 3/7/14.
 */
public final class Manager {

    private String id;
    private Employee emp;
    private Department dep;
    private Job work;

    private Manager() {
    }

    public Manager(Builder Build) {
        this.id = Build.id;
        this.emp = Build.emp;
        this.dep = Build.dep;
        this.work = Build.work;
    }

    public static class Builder {

        private String id;
        private Employee emp;
        private Department dep;
        private Job work;

        public Builder(String id) {
            this.id = id;
        }
        
        public Builder emp(Employee value) {
            emp=value;
            return this;
        }

        public Builder work(Job value) {
             work=value;
            return this;
        }

        public Manager build() {
            return new Manager(this);
        }
    }

    public String getId() {
        return id;
    }

    public Employee getEmp() {
        return emp;
    }

    public Department getDep() {
        return dep;
    }

    public Job getWork() {
        return work;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.id);
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
        final Manager other = (Manager) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
}
