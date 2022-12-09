/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import Business.Customer.Customer;
import Business.Pharmacy.Pharmacy;


/**
 *
 * @author juile
 */
public class CustomerAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount userAccount;
    Pharmacy pharmacy;
    EcoSystem system;
    Customer customer;
    
    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    public CustomerAreaJPanel(JPanel userProcessContainer, UserAccount useraccount, EcoSystem system) {
        initComponents();        
        this.userProcessContainer = userProcessContainer;  
        this.userAccount = useraccount;
        this.system = system;
        
        for(Customer c : system.getCustomerDirectory().getCustomerList() )
        {
            
                if(c.getCustomerName() == null ? useraccount.getEmployee().getName() == null : c.getCustomerName().equals(useraccount.getEmployee().getName()))
                {
                    this.customer = c;
                }
           
        }
        
        CustomerNametext.setText(this.customer.getCustomerName());
        CustomerAddressText.setText(this.customer.getAddress());
        CustomerContactText.setText(this.customer.getPhone());
        
        valueLabel.setText(this.customer.getCustomerName());
        PharmacyComboBox.addItem("");
        for(Pharmacy p : system.getPharmacyDirectory().getPharmacyList())
        {
            PharmacyComboBox.addItem(p.getName());
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

        CustomerAddressLabel = new javax.swing.JLabel();
        CustomerAddressText = new javax.swing.JTextField();
        CustomerNameLabel = new javax.swing.JLabel();
        CustomerWorkAreaLabel = new javax.swing.JLabel();
        PharmacyComboBox = new javax.swing.JComboBox<>();
        WelcomeLabel = new javax.swing.JLabel();
        UpdateDetailLabels = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        ReviewOrdersButton = new javax.swing.JButton();
        PharmacyLabel = new javax.swing.JLabel();
        CustomerContactNoLabel = new javax.swing.JLabel();
        CustomerNametext = new javax.swing.JTextField();
        CustomerContactText = new javax.swing.JTextField();
        SubmitOrdersButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        CustomerAddressLabel.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        CustomerAddressLabel.setText("Address:");
        add(CustomerAddressLabel);
        CustomerAddressLabel.setBounds(111, 273, 110, 20);

        CustomerAddressText.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        CustomerAddressText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(CustomerAddressText);
        CustomerAddressText.setBounds(261, 273, 150, 17);

        CustomerNameLabel.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        CustomerNameLabel.setText("Name:");
        add(CustomerNameLabel);
        CustomerNameLabel.setBounds(111, 193, 120, 15);

        CustomerWorkAreaLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        CustomerWorkAreaLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CustomerWorkAreaLabel.setText("Customer Work Area");
        add(CustomerWorkAreaLabel);
        CustomerWorkAreaLabel.setBounds(41, 0, 580, 29);

        PharmacyComboBox.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        PharmacyComboBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PharmacyComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PharmacyComboBoxActionPerformed(evt);
            }
        });
        add(PharmacyComboBox);
        PharmacyComboBox.setBounds(241, 94, 170, 21);

        WelcomeLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        WelcomeLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        WelcomeLabel.setText("Welcome! ");
        add(WelcomeLabel);
        WelcomeLabel.setBounds(160, 55, 108, 21);

        UpdateDetailLabels.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        UpdateDetailLabels.setText("Update Details");
        add(UpdateDetailLabels);
        UpdateDetailLabels.setBounds(211, 149, 89, 17);

        valueLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        valueLabel.setText("<value>");
        add(valueLabel);
        valueLabel.setBounds(286, 55, 118, 21);

        ReviewOrdersButton.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        ReviewOrdersButton.setText("Review Orders");
        ReviewOrdersButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ReviewOrdersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReviewOrdersButtonActionPerformed(evt);
            }
        });
        add(ReviewOrdersButton);
        ReviewOrdersButton.setBounds(120, 330, 118, 30);

        PharmacyLabel.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        PharmacyLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PharmacyLabel.setText("Choose a Pharmacy:");
        add(PharmacyLabel);
        PharmacyLabel.setBounds(124, 96, 107, 21);

        CustomerContactNoLabel.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        CustomerContactNoLabel.setText("Phone:");
        add(CustomerContactNoLabel);
        CustomerContactNoLabel.setBounds(110, 225, 110, 30);
        CustomerContactNoLabel.getAccessibleContext().setAccessibleName("Contact No:");

        CustomerNametext.setEditable(false);
        CustomerNametext.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        CustomerNametext.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(CustomerNametext);
        CustomerNametext.setBounds(261, 183, 150, 17);

        CustomerContactText.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        CustomerContactText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(CustomerContactText);
        CustomerContactText.setBounds(261, 231, 150, 17);

        SubmitOrdersButton.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        SubmitOrdersButton.setText("Submit");
        SubmitOrdersButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SubmitOrdersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitOrdersButtonActionPerformed(evt);
            }
        });
        add(SubmitOrdersButton);
        SubmitOrdersButton.setBounds(250, 330, 118, 30);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/MicrosoftTeams-image (1).png"))); // NOI18N
        add(jLabel7);
        jLabel7.setBounds(0, 10, 1440, 790);
    }// </editor-fold>//GEN-END:initComponents

    private void PharmacyComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PharmacyComboBoxActionPerformed
        // TODO add your handling code here:
        if(PharmacyComboBox.getSelectedItem() != "")
        {
            String phar = PharmacyComboBox.getSelectedItem().toString();
            pharmacy = system.getPharmacyDirectory().findPharmacy(phar);
            CustomerOrderAction cpo = new CustomerOrderAction(userProcessContainer, customer, pharmacy);
            userProcessContainer.add("CustomerOrder", cpo);
            CardLayout layout = (CardLayout)this.userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_PharmacyComboBoxActionPerformed

    private void ReviewOrdersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReviewOrdersButtonActionPerformed
        // TODO add your handling code here:
        CustomerSummaryJPanell lcj = new CustomerSummaryJPanell(userProcessContainer, userAccount, system);
        userProcessContainer.add("CustomerOrder", lcj);
        CardLayout layout = (CardLayout)this.userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_ReviewOrdersButtonActionPerformed

    private void SubmitOrdersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitOrdersButtonActionPerformed
        // TODO add your handling code here:
        if((CustomerAddressText.getText() == "") || (CustomerContactText.getText() == "") )
        {
            JOptionPane.showMessageDialog(null,"Please fill all values!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        else
        {
            customer.setAddress(CustomerAddressText.getText());
            customer.setPhone(CustomerContactText.getText());
          
                    
        }
        valueLabel.setText(pharmacy.getName());
    }//GEN-LAST:event_SubmitOrdersButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CustomerAddressLabel;
    private javax.swing.JTextField CustomerAddressText;
    private javax.swing.JLabel CustomerContactNoLabel;
    private javax.swing.JTextField CustomerContactText;
    private javax.swing.JLabel CustomerNameLabel;
    private javax.swing.JTextField CustomerNametext;
    private javax.swing.JLabel CustomerWorkAreaLabel;
    private javax.swing.JComboBox<String> PharmacyComboBox;
    private javax.swing.JLabel PharmacyLabel;
    private javax.swing.JButton ReviewOrdersButton;
    private javax.swing.JButton SubmitOrdersButton;
    private javax.swing.JLabel UpdateDetailLabels;
    private javax.swing.JLabel WelcomeLabel;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}