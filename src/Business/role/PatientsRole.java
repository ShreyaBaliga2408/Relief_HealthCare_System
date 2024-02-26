/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.userAccount.UserAccount;
import javax.swing.JPanel;
import userInterface.patients.PatientsWorkAreaJPanel;

/**
 *
 * @author anuja
 */
public class PatientsRole extends Role {
    
     @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, 
            Organization organization, Enterprise enterprise, EcoSystem business) {
        return new PatientsWorkAreaJPanel(userProcessContainer, enterprise, account, business);
    }
    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
