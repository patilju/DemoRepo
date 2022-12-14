/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.PharmacyAdminRole;


import Business.Pharmacy.Pharmacy;
import Business.Supplier.Supplier;
import Business.SupplierMedicineItem.SupplierMedicineItem;
import Business.SupplierOrders.SupplierOrders;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Vini
 */
public class PharmacyOrderAction extends javax.swing.JPanel {

    /**
     * Creates new form PharmacyOrderAction
     */
    JPanel userProcessContainer;
    Supplier supplier;
    Pharmacy pharma;
    SupplierOrders supplierOrders;
    int totalAmount = 0;
    
    ArrayList<SupplierMedicineItem> cart = new ArrayList<SupplierMedicineItem>();
    
    public PharmacyOrderAction(JPanel userProcessContainer, Pharmacy pharmacy, Supplier supplier) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.pharma = pharmacy;
        this.supplier = supplier;
        lblSupplier.setText("Supplier: " +this.supplier.getName());
        populateMedicine(); 
        populateOrder();
        if(tblOrder.getRowCount() <= 0)
        {
            btnOrder.setEnabled(false);
        }
    }

   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtAmount = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();
        btnOrder = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrder = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMedicine = new javax.swing.JTable();
        btnAddItem = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblSupplier = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        txtAmount.setEditable(false);
        txtAmount.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtAmount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(txtAmount);
        txtAmount.setBounds(1209, 490, 220, 50);

        btnDelete.setBackground(new java.awt.Color(255, 255, 255));
        btnDelete.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnDelete.setText("Delete Item");
        btnDelete.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete);
        btnDelete.setBounds(419, 496, 230, 50);

        btnOrder.setBackground(new java.awt.Color(255, 255, 255));
        btnOrder.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnOrder.setText("Confirm Order");
        btnOrder.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderActionPerformed(evt);
            }
        });
        add(btnOrder);
        btnOrder.setBounds(700, 490, 230, 50);

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnBack.setText("< Back");
        btnBack.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack);
        btnBack.setBounds(120, 500, 230, 50);

        tblOrder.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        tblOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order No", "Medicine Name", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblOrder);

        add(jScrollPane1);
        jScrollPane1.setBounds(10, 300, 1460, 140);

        tblMedicine.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        tblMedicine.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Medicine No", "Medicine Name", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblMedicine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMedicineMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblMedicine);

        add(jScrollPane2);
        jScrollPane2.setBounds(10, 43, 1460, 120);

        btnAddItem.setBackground(new java.awt.Color(255, 255, 255));
        btnAddItem.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnAddItem.setText("Add Item to Order");
        btnAddItem.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAddItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddItemActionPerformed(evt);
            }
        });
        add(btnAddItem);
        btnAddItem.setBounds(1230, 200, 240, 60);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("               Total Amount:");
        add(jLabel1);
        jLabel1.setBounds(1000, 490, 190, 50);

        lblSupplier.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblSupplier.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSupplier.setText("<value>");
        add(lblSupplier);
        lblSupplier.setBounds(70, 10, 481, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Online-pharmacy-ORDER_IMAGES.jpg"))); // NOI18N
        add(jLabel2);
        jLabel2.setBounds(0, 0, 1500, 860);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow1 = tblOrder.getSelectedRow();
        if (selectedRow1 >= 0)
        {
            SupplierMedicineItem smi1 = (SupplierMedicineItem) tblOrder.getValueAt(selectedRow1, 1);
            //order.deleteFoodItem(fi);
            cart.remove(smi1);
            JOptionPane.showMessageDialog(null, "Medicine Item " + smi1.getName()+ " deleted from cart successfully!");
            totalAmount = totalAmount - smi1.getPrice();
            populateOrder();
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Please select a row!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderActionPerformed
        // TODO add your handling code here:
        supplierOrders = supplier.getSupplierOrderDirectory().createNewSupplierOrder(pharma);
        for(SupplierMedicineItem mo : cart)
        {
            supplierOrders.addItem(mo);
        }
        supplierOrders.calculateTotalAmount();
        JOptionPane.showMessageDialog(null, "Thank you for your order! Order of " + supplierOrders.getSupplierMedicineItemList().size() + " medicine item(s) for amount $" + supplierOrders.getTotalAmount() + " is placed successfully!");
    }//GEN-LAST:event_btnOrderActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void tblMedicineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMedicineMouseClicked
        // TODO add your handling code here:
        int selectedRow = tblMedicine.getSelectedRow();
        if (selectedRow >= 0)
        {
            btnAddItem.setEnabled(true);
        }
    }//GEN-LAST:event_tblMedicineMouseClicked

    private void btnAddItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddItemActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblMedicine.getSelectedRow();
        if (selectedRow >= 0)
        {
            SupplierMedicineItem smi2 = (SupplierMedicineItem) tblMedicine.getValueAt(selectedRow, 1);

            cart.add(smi2);
            JOptionPane.showMessageDialog(null, "Medicine Item " + smi2.getName()+ " added to cart successfully!");
            totalAmount = totalAmount + smi2.getPrice();
            populateOrder();
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Please select a row!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
    }//GEN-LAST:event_btnAddItemActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddItem;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnOrder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblSupplier;
    private javax.swing.JTable tblMedicine;
    private javax.swing.JTable tblOrder;
    private javax.swing.JTextField txtAmount;
    // End of variables declaration//GEN-END:variables

private void populateMedicine() {
        DefaultTableModel dtm = (DefaultTableModel)tblMedicine.getModel();
        dtm.setRowCount(0);
        if(supplier.getSupplierMedicineCatalog().getSupplierMedicineItemList()!= null)
        {
            for(SupplierMedicineItem smi3 : supplier.getSupplierMedicineCatalog().getSupplierMedicineItemList())
            {
                Object[] row = new Object[dtm.getColumnCount()];
                row[0] = smi3.getId();
                row[1] = smi3;
                row[2] = smi3.getPrice();
                dtm.addRow(row);
            }
        }
        if(dtm.getRowCount() == 0)
            {
                btnAddItem.setEnabled(false);
                btnDelete.setEnabled(false);
            }
    }

    private void populateOrder() {
        DefaultTableModel dtm = (DefaultTableModel)tblOrder.getModel();
        dtm.setRowCount(0);
        if(cart != null)
        {
            btnDelete.setEnabled(true);
            btnOrder.setEnabled(true);
            int count = 1;
            for(SupplierMedicineItem mi3 : cart)
            {
                Object[] row = new Object[dtm.getColumnCount()];
                row[0] = count;
                row[1] = mi3;
                row[2] =  mi3.getPrice();
                dtm.addRow(row);
                count++;
            }
            txtAmount.setText(Integer.toString(totalAmount));
        }
        if(tblOrder.getRowCount() <= 0)
        {
            btnOrder.setEnabled(false);
            btnDelete.setEnabled(false);
        }
    }
}

