/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.SupplierMedicineItem;

import java.util.ArrayList;

/**
 *
 * @author Vini
 */
public class SupplierMedicineCatalog {
     private ArrayList<SupplierMedicineItem> suppliermedicineCatalogList;
    
    public SupplierMedicineCatalog() {
        suppliermedicineCatalogList = new ArrayList();
    }

    public ArrayList<SupplierMedicineItem> getSupplierMedicineItemList() {
        return suppliermedicineCatalogList;
    }
    
    public boolean checkIfSupplierMedicineItemIsUnique(String name){
        for (SupplierMedicineItem smi : suppliermedicineCatalogList){
            if (smi.getName() == name)
                return false;
        }
        return true;
    }
    
    public SupplierMedicineItem createSupplierMedicineItem(String name, int price)
    {
        SupplierMedicineItem smi = new SupplierMedicineItem(name, price);
        suppliermedicineCatalogList.add(smi);
        return smi;
    }
    
    public void deleteSupplierMedicineItem(SupplierMedicineItem smi)
    {
        suppliermedicineCatalogList.remove(smi);
    }   

}
