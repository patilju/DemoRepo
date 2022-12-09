/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SupplierAdminRole;


import Business.Supplier.Supplier;
import Business.SupplierDeliveryMan.SupplierDeliveryMan;
import Business.SupplierOrders.SupplierOrders;
import java.awt.CardLayout;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Vini
 */
public class AdminManageSupplierOrders extends javax.swing.JPanel {

    /**
     * Creates new form AdminManageSupplierOrders
     */
    JPanel userProcessContainer;
    Supplier supplier;
    public AdminManageSupplierOrders(JPanel userProcessContainer, Supplier supplier) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.supplier = supplier;
        btnAssignDeliveryMan.setEnabled(false);
        comboSupplierDeliveryMen.setEnabled(false);
       
        valueLabel.setText(supplier.getName());
        populateTable();
        comboSupplierDeliveryMen.addItem("");
        System.out.println(supplier.getSupplierDeliveryManDirectory().getSupplierDeliveryManList().size());
        for(SupplierDeliveryMan sdm : supplier.getSupplierDeliveryManDirectory().getSupplierDeliveryManList())
        {
            System.out.println(sdm.getName());
            comboSupplierDeliveryMen.addItem(sdm.getName());
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

        jLabel2 = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        comboSupplierDeliveryMen = new javax.swing.JComboBox<>();
        btnAssignDeliveryMan = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrders = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/MicrosoftTeams-image (17) supplie_Order.png"))); // NOI18N

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        valueLabel.setBackground(new java.awt.Color(204, 204, 255));
        valueLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        valueLabel.setText("<value>");
        add(valueLabel);
        valueLabel.setBounds(740, 10, 320, 40);

        enterpriseLabel.setBackground(new java.awt.Color(204, 204, 255));
        enterpriseLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        enterpriseLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        enterpriseLabel.setText("Supplier");
        add(enterpriseLabel);
        enterpriseLabel.setBounds(360, 0, 310, 50);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("                Current Orders");
        add(jLabel1);
        jLabel1.setBounds(272, 36, 240, 50);

        btnDelete.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete);
        btnDelete.setBounds(1099, 273, 220, 60);

        btnBack.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnBack.setText("< Back");
        btnBack.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack);
        btnBack.setBounds(10, 260, 110, 60);

        comboSupplierDeliveryMen.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        add(comboSupplierDeliveryMen);
        comboSupplierDeliveryMen.setBounds(560, 280, 159, 43);

        btnAssignDeliveryMan.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnAssignDeliveryMan.setText("Assign Delivery Man");
        btnAssignDeliveryMan.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAssignDeliveryMan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignDeliveryManActionPerformed(evt);
            }
        });
        add(btnAssignDeliveryMan);
        btnAssignDeliveryMan.setBounds(1098, 423, 220, 60);

        tblOrders.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        tblOrders.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order No.", "Customer Name", "Order Date", "Delivery Man"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblOrders.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblOrdersMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblOrders);

        add(jScrollPane1);
        jScrollPane1.setBounds(10, 84, 1480, 130);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/MicrosoftTeams-image (17) supplie_Order.png"))); // NOI18N
        add(jLabel3);
        jLabel3.setBounds(0, 70, 1500, 720);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblOrders.getSelectedRow();
        if (selectedRow >= 0)
        {
            SupplierOrders supplierOrders = (SupplierOrders) tblOrders.getValueAt(selectedRow, 0);
            supplier.deleteOrder(supplierOrders);
            JOptionPane.showMessageDialog(null, "Order deleted successfully!");
            populateTable();
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Please select a row!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAssignDeliveryManActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignDeliveryManActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblOrders.getSelectedRow();
        if (selectedRow >= 0)
        {
            SupplierOrders supplierOrders = (SupplierOrders) tblOrders.getValueAt(selectedRow, 0);
            if(comboSupplierDeliveryMen.getSelectedItem() != "")
            {
                String dmName = comboSupplierDeliveryMen.getSelectedItem().toString();
                SupplierDeliveryMan sdm = supplier.findSupplierDeliveryMan(dmName);
                supplierOrders.setSupplierDeliveryMan(sdm);
                JOptionPane.showMessageDialog(null, "Delivery man assigned successfully!");
                populateTable();
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Please select a delivery man!", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Please select a row!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
    }//GEN-LAST:event_btnAssignDeliveryManActionPerformed

    private void tblOrdersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblOrdersMouseClicked
        // TODO add your handling code here:
        int selectedRow = tblOrders.getSelectedRow();
        if (selectedRow >= 0)
        {
            comboSupplierDeliveryMen.setEnabled(true);
            btnDelete.setEnabled(true);
            btnAssignDeliveryMan.setEnabled(true);
        }
    }//GEN-LAST:event_tblOrdersMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssignDeliveryMan;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JComboBox<String> comboSupplierDeliveryMen;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblOrders;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables


private void populateTable() {
       DefaultTableModel dtm = (DefaultTableModel)tblOrders.getModel();
        dtm.setRowCount(0);
        if(supplier.getSupplierOrderDirectory().getSupplierOrderList() != null)
        {
            for(SupplierOrders supplierOrders : supplier.getSupplierOrderDirectory().getSupplierOrderList())
            {
                if(!supplierOrders.isStatus() && supplierOrders.getPharmacy()!= null)
                {
                    Object[] row = new Object[dtm.getColumnCount()];
                    row[0] = supplierOrders;
                    row[1] = supplierOrders.getPharmacy().getName();
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                    row[2] = supplierOrders.getOrderDate().format(formatter);
                    if(supplierOrders.getSupplierDeliveryMan() == null)
                    {
                        row[3] = "";
                    }
                    else
                    {
                        row[3] = supplierOrders.getSupplierDeliveryMan().getName();
                    }
                    dtm.addRow(row);
                }
            }
        }
        if(dtm.getRowCount() == 0)
            {
                comboSupplierDeliveryMen.setEnabled(false);
                btnAssignDeliveryMan.setEnabled(false);
            }
    }
}

