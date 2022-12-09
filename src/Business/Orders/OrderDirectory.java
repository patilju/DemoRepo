/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Orders;

import Business.Customer.Customer;
import java.util.ArrayList;

/**
 *
 * @author Vini
 */
public class OrderDirectory {
     private ArrayList<Orders> orderList;
    
    public OrderDirectory() {
        orderList = new ArrayList();
    }

    public ArrayList<Orders> getOrderList() {
        return orderList;
    }
    
    public Orders createNewOrder(Customer cust)
    {
        Orders orders = new Orders();
        orders.setCustomer(cust);
        orderList.add(orders);
        cust.getPastOrderList().add(orders);
        return orders;
    }    
}

