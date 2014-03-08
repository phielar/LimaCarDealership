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
public class Employee {

    private String empNumber;
    private String empFirstname;
    private String empLastname;
    private String empInitials;
    private Address empAddress;
    private String empPhoneNumber;
    private Job empJob;
    private Department empDepartment;

    private Employee() {
    }

    public Employee(Builder build) {
        this.empNumber = build.empNumber;
        this.empFirstname = build.empFirstname;
        this.empLastname = build.empLastname;
        this.empInitials = build.empInitials;
        this.empAddress = build.empAddress;
        this.empPhoneNumber = build.empPhoneNumber;
        this.empJob = build.empJob;
        this.empDepartment = build.empDepartment;
    }

    public static class Builder {

        private String empNumber;
        private String empFirstname;
        private String empLastname;
        private String empInitials;
        private Address empAddress;
        private String empPhoneNumber;
        private Job empJob;
        private Department empDepartment;

        public Builder(String empNumber) {
            this.empNumber = empNumber;
        }
        
        public Builder empFirstname(String value) {
            empFirstname=value;
            return this;
        }

        public Builder empLastname(String value) {
            empLastname=value;
            return this;
        }

        public Builder empInitials(String value) {
            empInitials=value;
            return this;
        }

        public Builder empJob(Job value) {
            empJob=value;
            return this;
        }

        public Builder empDepartment(Department value) {
            empDepartment=value;
            return this;
        }
        
        public Employee build()
        {   return new Employee(this);  }
        
    }

    public String getEmpNumber() {
        return empNumber;
    }

    public String getEmpFirstname() {
        return empFirstname;
    }

    public String getEmpLastname() {
        return empLastname;
    }

    public String getEmpInitials() {
        return empInitials;
    }

    public Address getEmpAddress() {
        return empAddress;
    }

    public String getEmpPhoneNumber() {
        return empPhoneNumber;
    }

    public Job getEmpJob() {
        return empJob;
    }

    public Department getEmpDepartment() {
        return empDepartment;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.empNumber);
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
        final Employee other = (Employee) obj;
        if (!Objects.equals(this.empNumber, other.empNumber)) {
            return false;
        }
        return true;
    }
   
}
