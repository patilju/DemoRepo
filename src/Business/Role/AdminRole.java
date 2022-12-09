/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.PharmacyAdminRole.AdminWorkAreaJPanel;

/**
 *
 * @author Vini
 */
public class AdminRole extends Role{
    private RoleType roleType;
    public AdminRole() {
        super();
        RoleType roleType = RoleType.PharmacyAdmin;
    }

    public RoleType getRoleType() {
        return roleType;
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
        return new AdminWorkAreaJPanel(userProcessContainer, account, business);
    }

    
    
}
