package philaman.cput.limacardealers.Model;

import java.util.*;

/**
 * Created by phila on 3/7/14.
 */
public final class SalesPersonSalHistory {

    private String id;
    private SalesPerson salesMan;
    private int personalSaleRecord;
    private String personalSaleRecordDate;
    private String startDate;

    private SalesPersonSalHistory() {
    }

    public SalesPersonSalHistory(Builder build) {
        this.id = build.id;
        this.salesMan = build.salesMan;
        this.startDate = build.startDate;
        this.personalSaleRecord = build.personalSaleRecord;
        this.personalSaleRecordDate = build.personalSaleRecordDate;
    }

    public static class Builder {

        private String id;
        private SalesPerson salesMan;
        private int personalSaleRecord;
        private String personalSaleRecordDate;
        private String startDate;

        public Builder(String id) {
            this.id = id;
        }

        public Builder personalSaleRecordDate(String value)
        {   personalSaleRecordDate=value;
            return this;
        }
        public Builder personalSaleRecord(int value)
        {   personalSaleRecord=value;
            return this;
        }
        public Builder salesMan(SalesPerson value) {
            salesMan = value;
            return this;
        }

        public Builder startDate(String value) {
            startDate = value;
            return this;
        }

        public SalesPersonSalHistory Builder() {
            return new SalesPersonSalHistory(this);
        }
    }

    public String getId() {
        return id;
    }

    public int getPersonalSaleRecord() {
        return personalSaleRecord;
    }

    /**
     *This method returns the date of the salesPerson's Best Record Sales made.
     * @return
     */
    public String getPersonalSaleRecordDate() {
        return personalSaleRecordDate;
    }

    public SalesPerson getSalesMan() {
        return salesMan;
    }

    public String getStartDate() {
        return startDate;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 43 * hash + Objects.hashCode(this.id);
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
        final SalesPersonSalHistory other = (SalesPersonSalHistory) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
}
