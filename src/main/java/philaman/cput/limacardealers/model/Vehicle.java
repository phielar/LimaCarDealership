/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package philaman.cput.limacardealers.model;

import java.util.List;

/**
 *
 * @author phila
 */
public final class Vehicle {

    private String v_id;
    private String name;
    private String model;
    private VehicleBrand brand;
    private VehicleType carType;
    private List<VehicleColour> carColor;
    private double price;
    String year;

    private Vehicle() {
    }

    public Vehicle(Builder builder) {
        this.v_id = builder.v_id;
        this.name = builder.name;
        this.model = builder.model;
        this.carType=builder.carType;
        this.brand = builder.brand;
        this.carColor = builder.carColor;
        this.year = builder.year;        
    }

    public static class Builder {

        private String v_id;
        private String name;
        private String model;
        private VehicleBrand brand;
        private VehicleType carType;
        private List<VehicleColour> carColor;
        private String year;

        public Builder(String v_id) {
            this.v_id = v_id;
        }
        public Builder name(String value) {
            name=value;
            return this;
        }

        public Builder model(String value) {
            model=value;
            return this;
        }

        public Builder brand(VehicleBrand value) {
            brand=value;
            return this;
        }
        public Builder carType(VehicleType value)
        {   carType=value;
            return this;           
        }
        public Builder carColor(List<VehicleColour> value)
        {
            carColor=value;
            return this;
        }
        public Builder year(String value) {
            year=value;
            return this;
        }
        
        public Vehicle Builder()
        {
            return new Vehicle(this);
        }
        
    }

    public String getV_id() {
        return v_id;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public VehicleBrand getBrand() {
        return brand;
    }

    public List<VehicleColour> getCarColor() {
        return carColor;
    }

    public VehicleType getCarType() {
        return carType;
    }

    public String getYear() {
        return year;
    }
}
