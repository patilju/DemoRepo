/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.SupplierDeliveryMan;

import Business.DeliveryMan.DeliveryMan;
import java.util.ArrayList;

/**
 *
 * @author Vini
 */
public class SupplierDeliveryManDirectory {
    private ArrayList<SupplierDeliveryMan> supplierDeliveryManList;

    public SupplierDeliveryManDirectory() {
        supplierDeliveryManList = new ArrayList();
    }

    public ArrayList<SupplierDeliveryMan> getSupplierDeliveryManList() {
        return supplierDeliveryManList;
    }
    
    public SupplierDeliveryMan createSupplierDeliveryMan(String name, String phone, String address){
        SupplierDeliveryMan supplierDeliveryMan = new SupplierDeliveryMan();
        supplierDeliveryMan.setName(name);
        supplierDeliveryMan.setPhone(phone);
        supplierDeliveryMan.setAddress(address);
        supplierDeliveryManList.add(supplierDeliveryMan);
        return supplierDeliveryMan;
    }    
 
}
