/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.Customer.Customer;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.MedicineItems.MedicineItem;

import Business.Organization;
import Business.Pharmacy.Pharmacy;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author Vini
 */
public class SystemAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminWorkAreaJPanel
     */
    JPanel userProcessContainerSAWAP;
    EcoSystem ecosystemSAWAP;
    public SystemAdminWorkAreaJPanel(JPanel userProcessContainer,EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainerSAWAP = userProcessContainer;
        this.ecosystemSAWAP = ecosystem;
        //populateTree();
    }
    
    /*public void populateTree(){
        DefaultTreeModel modelSAWAP=(DefaultTreeModel)jTreeSAWAP.getModel();
       // Add the code for draw your system structure shown by JTree
        //MutableTreeNode root = (MutableTreeNode) model.getRoot();
        DefaultMutableTreeNode root = (DefaultMutableTreeNode)modelSAWAP.getRoot();
        root.removeAllChildren();
        DefaultMutableTreeNode es = new DefaultMutableTreeNode("Ecosystem");
        root.add(es);
        DefaultMutableTreeNode cd = new DefaultMutableTreeNode("Customer Directory");
        es.add(cd);
        for(Customer c : ecosystemSAWAP.getCustomerDirectory().getCustomerList())
        {
            DefaultMutableTreeNode cu = (DefaultMutableTreeNode)es.getRoot();
            cd.add(new DefaultMutableTreeNode(c.getName()));
        }
        DefaultMutableTreeNode rd = new DefaultMutableTreeNode("Restaurant Directory");
        es.add(rd);
        
        for(Pharmacy p : ecosystemSAWAP.getPharmacyDirectory().getPharmacyList())
        {
            //DefaultMutableTreeNode cu = (DefaultMutableTreeNode)rd.getRoot();
            DefaultMutableTreeNode sd = new DefaultMutableTreeNode(p.getName());
            rd.add(sd);
            DefaultMutableTreeNode ed = new DefaultMutableTreeNode("Employee Directory");
            sd.add(ed);
            DefaultMutableTreeNode manager = new DefaultMutableTreeNode("Manager Directory");
            ed.add(manager);
            DefaultMutableTreeNode deliver = new DefaultMutableTreeNode("Delivery Man Directory");
            ed.add(deliver);
            for(Employee e : p.getEmployeeDirectory().getEmployeeList())
            {
                for(UserAccount u : ecosystemSAWAP.getUserAccountDirectory().getUserAccountList())
                {
                    if(u.getEmployee().equals(e))
                    {
                        if(u.getRole().toString() == "Business.Role.AdminRole")
                        {
                            DefaultMutableTreeNode ar = new DefaultMutableTreeNode(e.getName());
                            manager.add(ar);
                        }
                        else if(u.getRole().toString() == "Business.Role.DeliverManRole")
                        {
                            DefaultMutableTreeNode dm = new DefaultMutableTreeNode(e.getName());
                            deliver.add(dm);
                        }
                    }
                }
            }
            
            //DefaultMutableTreeNode fl = (DefaultMutableTreeNode)rd.getRoot();
            DefaultMutableTreeNode f = new DefaultMutableTreeNode("MedicineCatalog");
            sd.add(f);
            for(MedicineItem mi : p.getMedicineCatalog().getMedicineItemList())
            {
                DefaultMutableTreeNode z = (DefaultMutableTreeNode)ed.getRoot();
                f.add(new DefaultMutableTreeNode(mi.getName()));
            }
        }
        
        modelSAWAP.reload(root);
    }*/
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnManageCustomersSAWAP = new javax.swing.JButton();
        btnManagePharmacySAWAP = new javax.swing.JButton();
        BtnManageSupplier = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setAutoscrolls(true);
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 911, Short.MAX_VALUE)
        );

        jSplitPane.setLeftComponent(jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Admin Panel");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(243, 11, 150, 31);

        btnManageCustomersSAWAP.setBackground(new java.awt.Color(255, 255, 255));
        btnManageCustomersSAWAP.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnManageCustomersSAWAP.setText("Manage Customers");
        btnManageCustomersSAWAP.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnManageCustomersSAWAP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageCustomersSAWAPActionPerformed(evt);
            }
        });
        jPanel2.add(btnManageCustomersSAWAP);
        btnManageCustomersSAWAP.setBounds(10, 95, 130, 35);

        btnManagePharmacySAWAP.setBackground(new java.awt.Color(255, 255, 255));
        btnManagePharmacySAWAP.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnManagePharmacySAWAP.setText("Manage Pharmacy");
        btnManagePharmacySAWAP.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnManagePharmacySAWAP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManagePharmacySAWAPActionPerformed(evt);
            }
        });
        jPanel2.add(btnManagePharmacySAWAP);
        btnManagePharmacySAWAP.setBounds(10, 179, 130, 35);

        BtnManageSupplier.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        BtnManageSupplier.setText("Manage Supplier");
        BtnManageSupplier.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnManageSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnManageSupplierActionPerformed(evt);
            }
        });
        jPanel2.add(BtnManageSupplier);
        BtnManageSupplier.setBounds(10, 278, 130, 37);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Manage_WORK_AREA_FINAL.jpg"))); // NOI18N
        jPanel2.add(jLabel3);
        jLabel3.setBounds(0, 0, 1500, 910);

        jSplitPane.setRightComponent(jPanel2);

        add(jSplitPane, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageCustomersSAWAPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageCustomersSAWAPActionPerformed
        SystemAdminManageCustomers uc = new SystemAdminManageCustomers(userProcessContainerSAWAP, ecosystemSAWAP);
        userProcessContainerSAWAP.add("UserCustomer", uc);
        CardLayout layout = (CardLayout)this.userProcessContainerSAWAP.getLayout();
        layout.next(userProcessContainerSAWAP);
    }//GEN-LAST:event_btnManageCustomersSAWAPActionPerformed

    private void btnManagePharmacySAWAPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManagePharmacySAWAPActionPerformed
        SystemAdminManagePharmacy um = new SystemAdminManagePharmacy(userProcessContainerSAWAP, ecosystemSAWAP);
        userProcessContainerSAWAP.add("UserManager", um);
        CardLayout layout = (CardLayout)this.userProcessContainerSAWAP.getLayout();
        layout.next(userProcessContainerSAWAP);
    }//GEN-LAST:event_btnManagePharmacySAWAPActionPerformed

    private void BtnManageSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnManageSupplierActionPerformed
        // TODO add your handling code here:
        SystemAdminManageSupplier ms = new SystemAdminManageSupplier(userProcessContainerSAWAP, ecosystemSAWAP);
        userProcessContainerSAWAP.add("UserSupplier", ms);
        CardLayout layout = (CardLayout)this.userProcessContainerSAWAP.getLayout();
        layout.next(userProcessContainerSAWAP);
    }//GEN-LAST:event_BtnManageSupplierActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnManageSupplier;
    private javax.swing.JButton btnManageCustomersSAWAP;
    private javax.swing.JButton btnManagePharmacySAWAP;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane;
    // End of variables declaration//GEN-END:variables
}