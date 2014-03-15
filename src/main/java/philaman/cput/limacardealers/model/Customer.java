/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package philaman.cput.limacardealers.model;

/**
 *
 * @author phila
 */
public final class Customer {

    private String Custid;
    private String custEmpNumber;
    private String firstname;
    private String lastname;
    private Address address;
    private String gender;
    private double salary;
    private String phoneNumber;
    private String employer;
    private double balance;

    private Customer() {
    }

    public Customer(Builder build) {
        this.Custid = build.Custid;
        this.custEmpNumber = build.custEmpNumber;
        this.firstname = build.firstname;
        this.lastname = build.lastname;
        this.address = build.address;
        this.gender = build.gender;
        this.salary = build.salary;
        this.phoneNumber = build.phoneNumber;
        this.employer = build.employer;
        this.balance = build.balance;
    }

    public static class Builder {

        private String Custid;
        private String custEmpNumber;
        private String firstname;
        private String lastname;
        private Address address;
        private String gender;
        private double salary;
        private String phoneNumber;
        private String employer;
        private double balance;

        public Builder(String Custid) {
            this.Custid = Custid;
        }

        public Builder custEmpNumber(String value) {
            custEmpNumber=value;
            return this;
        }

        public Builder firstname(String value) {
            firstname=value;
            return this;
        }

        public Builder lastname(String value) {
            lastname=value;
            return this;
        }

        public Builder address(Address value) {
            address=value;
            return this;
        }

        public Builder gender(String value) {
            gender=value;
            return this;
        }

        public Builder salary(double value) {
            salary=value;
            return this;
        }

        public Builder phoneNumber(String value) {
            phoneNumber=value;
            return this;
        }

        public Builder employer(String value) {
            employer=value;
            return this;
        }

        public Builder balance(double value) {
            balance=value;
            return this;
        }
        
        public Customer build()
        {   return new Customer(this);  }
    }

    public String getCustid() {
        return Custid;
    }

    public void setCustid(String Custid) {
        this.Custid = Custid;
    }

    public String getCustEmpNumber() {
        return custEmpNumber;
    }

    public void setCustEmpNumber(String custEmpNumber) {
        this.custEmpNumber = custEmpNumber;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmployer() {
        return employer;
    }

    public void setEmployer(String employer) {
        this.employer = employer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (this.Custid != null ? this.Custid.hashCode() : 0);
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
        final Customer other = (Customer) obj;
        if ((this.Custid == null) ? (other.Custid != null) : !this.Custid.equals(other.Custid)) {
            return false;
        }
        return true;
    }
}
