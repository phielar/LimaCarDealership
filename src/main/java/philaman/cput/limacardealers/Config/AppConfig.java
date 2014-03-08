/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package philaman.cput.limacardealers.Config;


import org.springframework.context.annotation.Bean;
import philaman.cput.limacardealers.Model.Address;
import philaman.cput.limacardealers.Model.Branch;
import philaman.cput.limacardealers.Model.Commission;
import philaman.cput.limacardealers.Model.Customer;
import philaman.cput.limacardealers.Model.Department;
import philaman.cput.limacardealers.Model.Employee;
import philaman.cput.limacardealers.Model.GeneralWorker;
import philaman.cput.limacardealers.Model.Inventory;
import philaman.cput.limacardealers.Model.Job;
import philaman.cput.limacardealers.Model.SalesGrade;
import philaman.cput.limacardealers.Model.SalesPersonSalHistory;
import philaman.cput.limacardealers.Model.VehicleBrand;
import philaman.cput.limacardealers.Model.VehicleColour;
import philaman.cput.limacardealers.Model.VehicleType;
import philaman.cput.limacardealers.Model.Region;

/**
 *
 * @author phila
 */
public class AppConfig {

    @Bean(name = "location")
    public Region getLocation() {
        return new Region.Builder("").build();
    }
    @Bean(name = "gworker")
    public GeneralWorker getGeneralWorker() {
        return new GeneralWorker.Builder("").build();
    }
    @Bean(name = "job")
    public Job getJob() {
        return new Job.Builder("").build();
    }
    
    @Bean(name = "employee")
    public Employee getEmployee() {
        return new Employee.Builder("").build();
    }

    @Bean(name = "branch")
    public Branch getBranch() {
        return new Branch.Builder("").build();
    }

    @Bean(name = "salhistory")
    public SalesPersonSalHistory getSalaryHistory() {
        return new SalesPersonSalHistory.Builder("").Builder();
    }

    @Bean(name = "vehicleBrand")
    public VehicleBrand getBrand() {
        return new VehicleBrand.Builder("").builder();
    }

    @Bean(name = "vehicleColour")
    public VehicleColour getColor() {
        return new VehicleColour.Builder("").builder();
    }

    @Bean(name = "address")
    public Address getAddress() {
        return new Address.Builder("").builder();
    }

    @Bean(name = "departmet")
    public Department getDepartment() {
        return new Department.Builder("").build();
    }

    @Bean(name = "commission")
    public Commission getCommission() {
        return new Commission.Builder("").build();
    }

    @Bean(name = "inventory")
    public Inventory getInvetory() {
        return new Inventory.Builder("").builder();
    }

     @Bean(name = "customer")
     public Customer getCustomer() {
     return new Customer.Builder("").build();
     }
    @Bean(name = "vehicleType")
    public VehicleType getVehicleType() {
        return new VehicleType.Builder("").build();
    }

    @Bean(name = "salesGrade")
    public SalesGrade getSalesGrade() {
        return new SalesGrade.Builder("").Builder();
    }
}
