/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.SupplierEmp;

import java.util.ArrayList;

/**
 *
 * @author Vini
 */
public class SupplierEmpDirectory {
  private ArrayList<SupplierEmp> supplierEmpList;

    public SupplierEmpDirectory() {
        supplierEmpList = new ArrayList();
    }

    public ArrayList<SupplierEmp> getSupplierEmpList() {
        return supplierEmpList;
    }
    
    public SupplierEmp createSupplierEmp(String name, String address, String phone){
        if(this.checkIfSupplierEmpIsUnique(name))
        {
        SupplierEmp supplierEmp = new SupplierEmp();
        supplierEmp.setName(name);
        supplierEmp.setAddress(address);
        supplierEmp.setPhone(phone);
        supplierEmpList.add(supplierEmp);
        return supplierEmp;
    }
        return null;
    }

    public boolean checkIfSupplierEmpIsUnique(String username){
        for (SupplierEmp sa : supplierEmpList){
            if (sa.getName().equals(username))
                return false;
        }
        return true;
    }
    
    public void deleteSupplierEmp(SupplierEmp se)
    {
        supplierEmpList.remove(se);
    }

  
}
