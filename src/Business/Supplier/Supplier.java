/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Supplier;


import Business.Employee.EmployeeDirectory;
import Business.SupplierDeliveryMan.SupplierDeliveryMan;
import Business.SupplierDeliveryMan.SupplierDeliveryManDirectory;
import Business.SupplierEmp.SupplierEmpDirectory;
import Business.SupplierMedicineItem.SupplierMedicineCatalog;
import Business.SupplierOrders.SupplierOrders;
import Business.SupplierOrders.SupplierOrdersDirectory;

/**
 *
 * @author Vini
 */
public class Supplier {
    private String name;
    private String address;
    private String email;
    private String phone;
    private int id;
    private static int count = 1;
    private SupplierDeliveryManDirectory supplierDeliveryManDirectory;
    private EmployeeDirectory employeeDirectory;
    private SupplierOrdersDirectory supplierOrdersDirectory;
    private SupplierMedicineCatalog supplierMedicineCatalog;

    public Supplier() {
        id = count;
        count++;
        this.supplierDeliveryManDirectory = new SupplierDeliveryManDirectory();
        this.employeeDirectory = new EmployeeDirectory();
        this.supplierOrdersDirectory = new SupplierOrdersDirectory();
        this.supplierMedicineCatalog = new SupplierMedicineCatalog();
    }
    
    public String getAddress() {
        return address;
    }

    public int getId() {
        return id;
    }

    public SupplierDeliveryManDirectory getSupplierDeliveryManDirectory() {
        return supplierDeliveryManDirectory;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    

    @Override
    public String toString() {
        return name;
    }

    public SupplierOrdersDirectory getSupplierOrderDirectory() {
        return supplierOrdersDirectory;
    }

    public SupplierMedicineCatalog getSupplierMedicineCatalog() {
        return supplierMedicineCatalog;
    }
    
    public void deleteOrder(SupplierOrders so)
    {
        this.getSupplierOrderDirectory().getSupplierOrderList().remove(so);
    }
    
    public SupplierDeliveryMan findSupplierDeliveryMan(String name)
    {
        for(SupplierDeliveryMan sdm : this.supplierDeliveryManDirectory.getSupplierDeliveryManList())
        {
            if(sdm.getName().equals(name))
            {
                return sdm;
            }
        }
        return null;
    }    

}
