/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package philaman.cput.limacardealers.model;

import java.util.List;
import java.util.Objects;

/**
 *
 * @author phila
 */
public class SalesPerson {

    private String empNumber;
    private Address address;
    private Employee emp;
    private SalesGrade grade;
    private List<Commission> comm;
    private double basicSal;
    private double salary;

    private SalesPerson() {
    }

    public SalesPerson(Builder build) {
        this.empNumber = build.empNumber;
        this.address = build.address;
        this.emp = build.emp;
        this.grade = build.grade;
        this.comm = build.comm;
        this.basicSal = build.basicSal;
        this.salary = build.salary;
    }

    public static class Builder {

        private String empNumber;
        private Address address;
        private Employee emp;
        private SalesGrade grade;
        private List<Commission> comm;
        private double basicSal;
        private double salary;

        public Builder(String empNumber) {
            this.empNumber = empNumber;
        }

        public Builder emp(Employee value) {
            emp=value;
            return this;
        }

        public Builder grade(SalesGrade value) {
            grade=value;
            return this;
        }

        public Builder comm(List<Commission> value) {
            comm=value;
            return this;
        }

        public Builder basicSal(double value) {
            basicSal=value;
            return this;
        }

        public Builder salary(double value) {
            salary=value;
            return this;
        }
        
        public SalesPerson build()
        {   return new SalesPerson(this);}
    }

    public String getEmpNumber() {
        return empNumber;
    }

    public Address getAddress() {
        return address;
    }

    public Employee getEmp() {
        return emp;
    }

    public SalesGrade getGrade() {
        return grade;
    }

    public List<Commission> getComm() {
        return comm;
    }

    public double getBasicSal() {
        return basicSal;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.empNumber);
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
        final SalesPerson other = (SalesPerson) obj;
        if (!Objects.equals(this.empNumber, other.empNumber)) {
            return false;
        }
        return true;
    }
}