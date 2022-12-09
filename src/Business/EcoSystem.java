/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;


import Business.Customer.CustomerDirectory;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.Pharmacy.PharmacyDirectory;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.Supplier.SupplierDirectory;
import Business.SupplierDeliveryMan.SupplierDeliveryManDirectory;
import java.util.ArrayList;

/**
 *
 * @author Vini
 */
public class EcoSystem extends Organization{
    
    private static EcoSystem business;
    private PharmacyDirectory pharmacyDirectory;
    private CustomerDirectory customerDirectory;
    private DeliveryManDirectory deliveryManDirectory;
    private SupplierDirectory supplierDirectory;
    private SupplierDeliveryManDirectory supplierDeliveryManDirectory;

    public EcoSystem(PharmacyDirectory pharmacyDirectory, CustomerDirectory customerDirectory, DeliveryManDirectory deliveryManDirectory, SupplierDirectory supplierDirectory, SupplierDeliveryManDirectory supplierDeliveryManDirectory) {

        this.pharmacyDirectory = pharmacyDirectory;
        this.customerDirectory = customerDirectory;
        this.deliveryManDirectory = deliveryManDirectory;
                this.supplierDirectory = supplierDirectory;
                        this.supplierDeliveryManDirectory = supplierDeliveryManDirectory;

    }

    
    
    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    private EcoSystem(){
        super(null);
       // networkList=new ArrayList<Network>();
        this.pharmacyDirectory = new PharmacyDirectory();
        this.customerDirectory = new CustomerDirectory();
        this.deliveryManDirectory = new DeliveryManDirectory();
         this.supplierDirectory = new SupplierDirectory();

                        this.supplierDeliveryManDirectory = new SupplierDeliveryManDirectory();
    }

    public PharmacyDirectory getPharmacyDirectory() {
        return pharmacyDirectory;
    }

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public DeliveryManDirectory getDeliveryManDirectory() {
        return deliveryManDirectory;
    } 
    public SupplierDirectory getSupplierDirectory() {
        return supplierDirectory;
    }

    public SupplierDeliveryManDirectory getSupplierDeliveryManDirectory() {
        return supplierDeliveryManDirectory;
    }
    public boolean checkIfUserIsUnique(String userName){
       //
       return false;
    }
}
