/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Supplier;


import Business.Employee.Employee;
import Business.SupplierEmp.SupplierEmp;
import java.util.ArrayList;

/**
 *
 * @author Vini
 */
public class SupplierDirectory {
  private ArrayList<Supplier> supplierList;

    public SupplierDirectory() {
        supplierList = new ArrayList();
    }
    
    public Supplier createSupplier(String name, String address){
        Supplier supplier = new Supplier();
        if(this.checkIfSupplierIsUnique(name))
        {
            supplier.setName(name);
            supplier.setAddress(address);
            supplierList.add(supplier);
            return supplier;
        }
        return null;
    }

    public ArrayList<Supplier> getSupplierList() {
        return supplierList;
    }
    
    public boolean checkIfSupplierIsUnique(String supplier){
        for (Supplier s : supplierList){
            if (s.getName().equals(supplier))
                return false;
        }
        return true;
    }
    
    public Supplier findEmployee(Employee employee)
    {
        for(Supplier s : supplierList)
        {
            
        }
        return null;
    }
    
    public void deleteSupplier(Supplier s)
    {
        supplierList.remove(s);        
    }
    
    public Supplier findSupplier(String name)
    {
        for(Supplier s : supplierList)
        {
            if(s.getName().equals(name))
            {
                return s;
            }
        }
        return null;
    }

    
    
}


