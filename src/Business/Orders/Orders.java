/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Orders;

import Business.Customer.Customer;
import Business.DeliveryMan.DeliveryMan;
import Business.MedicineItems.MedicineItem;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author Vini
 */
public class Orders {
  private Customer customer;
    private int orderId;
    private LocalDateTime orderDate;
    private static int count = 1;
    private ArrayList<MedicineItem> medicineItemList;
    private DeliveryMan deliveryMan;
    private int totalAmount;
    private String message;
    private boolean status;
    
    public Orders() {
        orderId = count;
        count++;
        this.orderDate = LocalDateTime.now();
        this.medicineItemList = new ArrayList<MedicineItem>();
        this.message = "";
        this.status = false;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public ArrayList<MedicineItem> getMedicineItemList() {
        return medicineItemList;
    }

    public DeliveryMan getDeliveryMan() {
        return deliveryMan;
    }

    public void setDeliveryMan(DeliveryMan deliveryMan) {
        this.deliveryMan = deliveryMan;
    }

    public int getOrderId() {
        return orderId;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public int getTotalAmount() {
        return totalAmount;
    }
    
    public void deleteMedicineItem(MedicineItem mi)
    {
        medicineItemList.remove(mi);
    }
    
    public int calculateTotalAmount()
    {
        int sum = 0;
        for(MedicineItem mi : this.getMedicineItemList())
        {
            sum = sum + mi.getPrice();
        }
        this.totalAmount = sum;
        return sum;
    }
    
    public void addItem(MedicineItem mi)
    {
        medicineItemList.add(mi);
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    @Override
    public String toString() {
        return Integer.toString(orderId);
    }   
  
}
