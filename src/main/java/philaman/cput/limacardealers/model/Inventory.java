package philaman.cput.limacardealers.model;

import java.util.List;

/**
 * Created by Phila on 3/7/14.
 */
public final class Inventory {

    private String id;
    private List<Vehicle> car;
    private int stockOnHand;
    private double price;

    private Inventory() {
    }

    public Inventory(Builder Build) {
        this.id = Build.id;
        this.car = Build.car;
        this.stockOnHand = Build.stockOnHand;
        this.price = Build.price;
    }

    public static class Builder {

        private String id;
        private List<Vehicle> car;
        private int stockOnHand;
        private double price;

        public Builder(String id) {
            this.id = id;
        }

        public Builder id(String value) {
            id=value;
            return this;
        }

        public Builder car(List<Vehicle> value) {
            car=value;
            return this;
        }

        public Builder stockOnHand(int value) {
            stockOnHand=value;
            return this;
        }

        public Builder price(double value) {
            price=value;
            return this;
        }
        
        public Inventory builder()
        {   return new Inventory(this);}
        
    }

    public String getId() {
        return id;
    }

    public List<Vehicle> getCar() {
        return car;
    }

    public int getStockOnHand() {
        return stockOnHand;
    }

    public double getPrice() {
        return price;
    }
}
