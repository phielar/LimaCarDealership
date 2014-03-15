package philaman.cput.limacardealers.model;

import java.util.Objects;

/**
 * Created by phila on 3/7/14.
 */
public final class VehicleService {

    private String id;
    private Vehicle car;
    private Mechenic mac;
    private String serviceDate;
    private String serviceReport;

    private VehicleService() {
    }

    public VehicleService(Builder build) {
        this.car = build.car;
        this.mac = build.mac;
        this.serviceDate = build.serviceDate;
        this.serviceReport = build.serviceReport;
    }

    public static class Builder {

        private String id;
        private Vehicle car;
        private Mechenic mac;
        private String serviceDate;
        private String serviceReport;

        public Builder(String id) {
            this.id = id;
        }

        public Builder vehicle(Vehicle value) {
            this.car = value;
            return this;
        }

        public Builder mac(Mechenic value) {
            mac = value;
            return this;
        }

        public Builder serviceDate(String value) {
            serviceDate = value;
            return this;
        }

        public Builder serviceReport(String value) {
            serviceReport = value;
            return this;
        }

        public VehicleService build() {
            return new VehicleService(this);
        }
    }

    public Vehicle getCar() {
        return car;
    }

    public Mechenic getMac() {
        return mac;
    }

    public String getServiceDate() {
        return serviceDate;
    }

    public String getServiceReport() {
        return serviceReport;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.id);
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
        final VehicleService other = (VehicleService) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
}
