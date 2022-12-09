/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.Orders.Orders;
import java.util.ArrayList;

/**
 *
 * @author Vini
 */
public class Customer {
    private String CustomerName;
    private int id;
    private String address;
    private String phone;
   

    private static int count = 1;
    private ArrayList<Orders> PastOrderList;

    public Customer() {
        id = count;
        count++;
        this.PastOrderList = new ArrayList<Orders>();
    }

    public int getId() {
        return id;
    }

    public void setCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
    }

    
    public String getCustomerName() {
        return CustomerName;
    }

    @Override
    public String toString() {
        return CustomerName;
    }

    public String getAddress() {
        return address;
    }

    public ArrayList<Orders> getPastOrderList() {
        return PastOrderList;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    

    
    
    
    public void AddOrder()
    {
        
    }    
}


