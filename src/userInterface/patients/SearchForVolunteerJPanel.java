/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package userInterface.patients;

import Business.EcoSystem;
import Business.common.Validation;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.VolunteerOrganization;
import Business.person.Volunteer;
import Business.userAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userInterface.volunteer.ViewVolunteerProfile;

/**
 *
 * @author anuja
 */
public class SearchForVolunteerJPanel extends javax.swing.JPanel{
    
    private JPanel userProcessContainer;
    private UserAccount userAccount; 
    private EcoSystem ecoSystem;
    private VolunteerOrganization volOrg;
    
  
   
    /**
     * Creates new form SearchForVolunteerJPanel
     */
    public SearchForVolunteerJPanel(JPanel userProcessContainer, UserAccount userAccount, EcoSystem ecoSystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.ecoSystem = ecoSystem;
       
        populateNetworkComboBox();
        setBackground(new Color(255,204,204));
         
       
       
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        int w = getWidth();
        int h = getHeight();
        
        Color c1 = new Color(255,204,204);
        Color c2 = Color.white;
     
        GradientPaint gp = new GradientPaint(w/4, 0, c2, w/4, h, c1);
        setOpaque( false );
        g2d.setPaint(gp);
        g2d.fillRect(0, 0, w, h);
        setOpaque( true );
    }
    
    public void populateNetworkComboBox()
    {
        networkListComboBox.removeAllItems();
        for(Network network: ecoSystem.getNetworkList())
        {
           networkListComboBox.addItem(network);
        }
    }

    
    
    public void populateVolunteerListTable(Network network)
    {
       
        DefaultTableModel model = (DefaultTableModel)volunteerListTable.getModel();
        model.setRowCount(0); 
        try
        {
        volOrg = (VolunteerOrganization)Validation.getVolunteerOrganizationInNw(ecoSystem, network);
        }
        catch(Exception e)
        {
         JOptionPane.showMessageDialog(this, "Volunteer Organization has not been created yet!", "warning",JOptionPane.WARNING_MESSAGE);
          return;   
        }
        if(volOrg.getPersonDirectory().getVolunteerList().isEmpty())
        {
        JOptionPane.showMessageDialog(this, "No Volunteers to display", "warning",JOptionPane.WARNING_MESSAGE);
          return;    
        }

     for(UserAccount volunteerAccnt : volOrg.getUserAccountDirectory().getUserAccountList())
       {
        if(volunteerAccnt.isEnabled())
        {
        Volunteer volunteer = (Volunteer)volunteerAccnt.getPerson();    
        if(volunteerAccnt.getNetwork().getCity().equals(network.getCity()))
        {
           Object[] row = new Object[5];
            row[0] = volunteer.getVolunteerId();
            row[1] = volunteer;
            row[2] = volunteer.getGender();
            row[3] = volunteer.getTown();
            row[4] = volunteerAccnt;
            model.addRow(row);   
        }
        }
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

        networkListComboBox = new javax.swing.JComboBox();
        manageEnt1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        volunteerListTable = new javax.swing.JTable();
        ViewVolunteerProfileBtn = new javax.swing.JButton();
        requestVolunteerHelpbtn = new javax.swing.JButton();
        backJButton1 = new javax.swing.JButton();

        networkListComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkListComboBoxActionPerformed(evt);
            }
        });

        manageEnt1.setFont(new java.awt.Font("Malayalam MN", 3, 24)); // NOI18N
        manageEnt1.setText("Search For Helper");

        jLabel1.setText("Location");

        volunteerListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Helper Id", "Name", "Gender", "Town", "UserName"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(volunteerListTable);
        if (volunteerListTable.getColumnModel().getColumnCount() > 0) {
            volunteerListTable.getColumnModel().getColumn(0).setResizable(false);
            volunteerListTable.getColumnModel().getColumn(1).setResizable(false);
            volunteerListTable.getColumnModel().getColumn(2).setResizable(false);
            volunteerListTable.getColumnModel().getColumn(3).setResizable(false);
            volunteerListTable.getColumnModel().getColumn(4).setResizable(false);
        }

        ViewVolunteerProfileBtn.setText("View helper Profile");
        ViewVolunteerProfileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewVolunteerProfileBtnActionPerformed(evt);
            }
        });

        requestVolunteerHelpbtn.setText("Request helper");
        requestVolunteerHelpbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestVolunteerHelpbtnActionPerformed(evt);
            }
        });

        backJButton1.setText("Previous");
        backJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel1)
                        .addGap(32, 32, 32)
                        .addComponent(networkListComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(requestVolunteerHelpbtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ViewVolunteerProfileBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(backJButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(manageEnt1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(729, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(manageEnt1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(networkListComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(requestVolunteerHelpbtn)
                    .addComponent(ViewVolunteerProfileBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 206, Short.MAX_VALUE)
                .addComponent(backJButton1)
                .addGap(25, 25, 25))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void networkListComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkListComboBoxActionPerformed
       if(networkListComboBox.getSelectedIndex()>=0)
       {
            Network network = (Network)networkListComboBox.getSelectedItem();
       
         populateVolunteerListTable(network); 
        
       }
      
    }//GEN-LAST:event_networkListComboBoxActionPerformed

    private void ViewVolunteerProfileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewVolunteerProfileBtnActionPerformed
        
        int selectedRow = volunteerListTable.getSelectedRow();
        if(selectedRow<0)
        {
         JOptionPane.showMessageDialog(this, "Select volunteer", "warning", JOptionPane.PLAIN_MESSAGE);
         return;   
        }
        
        UserAccount volUserAccount = (UserAccount)volunteerListTable.getValueAt(selectedRow, 4);
        
        
         ViewVolunteerProfile viewVolunteerProfile = new ViewVolunteerProfile(userProcessContainer, volUserAccount);
         CardLayout layout = (CardLayout) userProcessContainer.getLayout();
         userProcessContainer.add("ViewVolunteerProfile", viewVolunteerProfile);
         layout.next(userProcessContainer);
    }//GEN-LAST:event_ViewVolunteerProfileBtnActionPerformed

    private void requestVolunteerHelpbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestVolunteerHelpbtnActionPerformed
      
        int selectedRow = volunteerListTable.getSelectedRow();
        if(selectedRow<0)
        {
         JOptionPane.showMessageDialog(this, "Select volunteer", "warning", JOptionPane.PLAIN_MESSAGE);
         return;   
        }
        
        Volunteer volunteer = (Volunteer)volunteerListTable.getValueAt(selectedRow, 1);
       
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("RequestVolunteerForHelp", new RequestVolunteerForHelp(userProcessContainer, userAccount, volunteer, volOrg, ecoSystem));
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_requestVolunteerHelpbtnActionPerformed

    private void backJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButton1ActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ViewVolunteerProfileBtn;
    private javax.swing.JButton backJButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel manageEnt1;
    private javax.swing.JComboBox networkListComboBox;
    private javax.swing.JButton requestVolunteerHelpbtn;
    private javax.swing.JTable volunteerListTable;
    // End of variables declaration//GEN-END:variables

    
}
