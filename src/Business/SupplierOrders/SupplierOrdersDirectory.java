/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.SupplierOrders;

import Business.Customer.Customer;
import Business.Orders.Orders;
import Business.Pharmacy.Pharmacy;
import java.util.ArrayList;

/**
 *
 * @author Vini
 */
public class SupplierOrdersDirectory {
    private ArrayList<SupplierOrders> supplierOrderList;
    
    public SupplierOrdersDirectory() {
        supplierOrderList = new ArrayList();
    }

    public ArrayList<SupplierOrders> getSupplierOrderList() {
        return supplierOrderList;
    }
    
    public SupplierOrders createNewSupplierOrder(Pharmacy pharma)
    {
        SupplierOrders supplierOrders = new SupplierOrders();
        supplierOrders.setPharmacy(pharma);
        supplierOrderList.add(supplierOrders);
        pharma.getPastSupplierOrderList().add(supplierOrders);
        return supplierOrders;
    }    
}



