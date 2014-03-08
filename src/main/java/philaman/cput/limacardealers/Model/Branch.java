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
public final class Branch {

    public static Object Builder(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String branchCode;
    private String branchname;
    private int branchYTDSales;

    private Branch() {
    }

    public Branch(Builder build) {
        this.branchCode = build.branchCode;
        this.branchname = build.branchname;
        this.branchYTDSales = build.branchYTDSales;
    }

    public static class Builder {

        private String branchCode;
        private String branchname;
        private int branchYTDSales;

        public Builder(String branchCode) {
            this.branchCode = branchCode;
        }
        public Builder branchname(String value)
        {        branchname=value;
                   return this;
        }
        public Builder branchYTDSales(int value)
        {   branchYTDSales=value;
            return this;
        }
        
        public Branch build()
        {   return new Branch(this); }
        
    }

    public String getBranchCode() {
        return branchCode;
    }

    public String getBranchname() {
        return branchname;
    }

    public int getBranchYTDSales() {
        return branchYTDSales;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.branchCode);
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
        final Branch other = (Branch) obj;
        if (!Objects.equals(this.branchCode, other.branchCode)) {
            return false;
        }
        return true;
    }
}
