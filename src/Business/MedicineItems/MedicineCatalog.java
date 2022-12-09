/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.MedicineItems;

import java.util.ArrayList;

/**
 *
 * @author Vini
 */
public class MedicineCatalog {
    private ArrayList<MedicineItem> medicineCatalogList;
    
    public MedicineCatalog() {
        medicineCatalogList = new ArrayList();
    }

    public ArrayList<MedicineItem> getMedicineItemList() {
        return medicineCatalogList;
    }
    
    public boolean checkIfMedicineItemIsUnique(String name){
        for (MedicineItem mi : medicineCatalogList){
            if (mi.getName() == name)
                return false;
        }
        return true;
    }
    
    public MedicineItem createNewFoodItem(String name, int price)
    {
        MedicineItem mi = new MedicineItem(name, price);
        medicineCatalogList.add(mi);
        return mi;
    }
    
    public void deleteMedicineItem(MedicineItem mi)
    {
        medicineCatalogList.remove(mi);
    }   
}
