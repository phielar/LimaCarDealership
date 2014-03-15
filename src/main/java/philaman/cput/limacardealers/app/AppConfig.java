/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package philaman.cput.limacardealers.app;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import philaman.cput.limacardealers.service.crud.AddressCrudService;
import philaman.cput.limacardealers.service.crud.BranchCrudService;
import philaman.cput.limacardealers.service.crud.CommissionCrudService;
import philaman.cput.limacardealers.service.crud.CustomerCrudService;
import philaman.cput.limacardealers.service.crud.DepartmentCrudService;
import philaman.cput.limacardealers.service.crud.EmployeeCrudService;
import philaman.cput.limacardealers.service.crud.GeneralWorkerCrudService;
import philaman.cput.limacardealers.service.crud.Impl.AddressCrudServiceImpl;
import philaman.cput.limacardealers.service.crud.Impl.BranchCrudServiceImpl;
import philaman.cput.limacardealers.service.crud.Impl.CommissionCrudServiceImpl;
import philaman.cput.limacardealers.service.crud.Impl.CustomerCrudServiceImpl;
import philaman.cput.limacardealers.service.crud.Impl.DepartmentCrudServiceImpl;
import philaman.cput.limacardealers.service.crud.Impl.EmployeeCrudServiceImpl;
import philaman.cput.limacardealers.service.crud.Impl.GeneralWorkerCrudServiceImpl;
import philaman.cput.limacardealers.service.crud.Impl.InventoryCrudServiceImpl;
import philaman.cput.limacardealers.service.crud.Impl.JobCrudServiceImpl;
import philaman.cput.limacardealers.service.crud.Impl.ManagerCrudServiceImpl;
import philaman.cput.limacardealers.service.crud.Impl.MechenicCrudServiceImpl;
import philaman.cput.limacardealers.service.crud.Impl.RegionCrudServiceImpl;
import philaman.cput.limacardealers.service.crud.Impl.SalesGradeCrudServiceImpl;
import philaman.cput.limacardealers.service.crud.Impl.SalesPersonCrudServiceImpl;
import philaman.cput.limacardealers.service.crud.Impl.SalesPersonSalHistoryCrudServiceImpl;
import philaman.cput.limacardealers.service.crud.Impl.VehicleBrandCrudServiceImpl;
import philaman.cput.limacardealers.service.crud.Impl.VehicleColourCrudServiceImpl;
import philaman.cput.limacardealers.service.crud.Impl.VehicleCrudServiceImpl;
import philaman.cput.limacardealers.service.crud.Impl.VehicleServiceCrudServiceImpl;
import philaman.cput.limacardealers.service.crud.Impl.VehicleTypeCrudServiceImpl;
import philaman.cput.limacardealers.service.crud.InventoryCrudService;
import philaman.cput.limacardealers.service.crud.JobCrudService;
import philaman.cput.limacardealers.service.crud.ManagerCrudService;
import philaman.cput.limacardealers.service.crud.MechenicCrudService;
import philaman.cput.limacardealers.service.crud.RegionCrudService;
import philaman.cput.limacardealers.service.crud.SalesGradeCrudService;
import philaman.cput.limacardealers.service.crud.SalesPersonCrudService;
import philaman.cput.limacardealers.service.crud.SalesPersonSalHistoryCrudService;
import philaman.cput.limacardealers.service.crud.VehicleBrandCrudService;
import philaman.cput.limacardealers.service.crud.VehicleColourCrudService;
import philaman.cput.limacardealers.service.crud.VehicleCrudService;
import philaman.cput.limacardealers.service.crud.VehicleServiceCrudService;
import philaman.cput.limacardealers.service.crud.VehicleTypeCrudService;

/**
 *
 * @author phila
 */
@Configurable
public class AppConfig {

    @Bean(name = "addressCrudService")
    public AddressCrudService getAddressCrudeService() {
        return new AddressCrudServiceImpl();
    }

    @Bean(name = "branchCrudService")
    public BranchCrudService getBranchCrudeService() {
        return new BranchCrudServiceImpl();
    }

    @Bean(name = "commisionCrudService")
    public CommissionCrudService getCommissionCrudeService() {
        return new CommissionCrudServiceImpl();
    }

    @Bean(name = "customerCrudService")
    public CustomerCrudService getCustomerCrudeService() {
        return new CustomerCrudServiceImpl();
    }

    @Bean(name = "departmentCrudService")
    public DepartmentCrudService getDepartmentCrudeService() {
        return new DepartmentCrudServiceImpl();
    }

    @Bean(name = "employeeCrudService")
    public EmployeeCrudService getEmployeeCrudeService() {
        return new EmployeeCrudServiceImpl();
    }

    @Bean(name = "generalworkerCrudService")
    public GeneralWorkerCrudService getGeneralWorkerCrudeService() {
        return new GeneralWorkerCrudServiceImpl();
    }

    @Bean(name = "inventoryCrudService")
    public InventoryCrudService getInventoryCrudeService() {
        return new InventoryCrudServiceImpl();
    }

    @Bean(name = "jobCrudService")
    public JobCrudService getJobCrudeService() {
        return new JobCrudServiceImpl();
    }

    @Bean(name = "managerCrudService")
    public ManagerCrudService getManagerCrudeService() {
        return new ManagerCrudServiceImpl();
    }

    @Bean(name = "mechenicCrudService")
    public MechenicCrudService getMechenicCrudeService() {
        return new MechenicCrudServiceImpl();
    }

    @Bean(name = "regionCrudService")
    public RegionCrudService getRegionCrudeService() {
        return new RegionCrudServiceImpl();
    }

    @Bean(name = "salesGradeCrudService")
    public SalesGradeCrudService getSalesGradeCrudeService() {
        return new SalesGradeCrudServiceImpl();
    }

    @Bean(name = "salesPersonCrudService")
    public SalesPersonCrudService getSalesPersonCrudeService() {
        return new SalesPersonCrudServiceImpl();
    }

    @Bean(name = "salesPersonHisoryCrudService")
    public SalesPersonSalHistoryCrudService getSalesPersonSalHistoryCrudeService() {
        return new SalesPersonSalHistoryCrudServiceImpl();
    }

    @Bean(name = "vehicleBrandCrudService")
    public VehicleBrandCrudService getVehicleBrandCrudeService() {
        return new VehicleBrandCrudServiceImpl();
    }

    @Bean(name = "vehicleColourCrudService")
    public VehicleColourCrudService getVehicleColourCrudeService() {
        return new VehicleColourCrudServiceImpl();
    }

    @Bean(name = "vehicleCrudService")
    public VehicleCrudService getVehicleCrudeService() {
        return new VehicleCrudServiceImpl();
    }

    @Bean(name = "vehicleServiceCrudService")
    public VehicleServiceCrudService getVehicleServiceCrudeService() {
        return new VehicleServiceCrudServiceImpl();
    }

    @Bean(name = "vehicleTypeCrudService")
    public VehicleTypeCrudService getVehicleTypeCrudeService() {
        return new VehicleTypeCrudServiceImpl();
    }
}
