/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package userInterface.volunteer;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.VolunteerOrganization;
import Business.person.Volunteer;
import Business.userAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author anuja
 */
public class VolunteerWorkAreaJPanel extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;  
    private VolunteerOrganization organization;
    private EcoSystem ecoSystem;
    /**
     * Creates new form VolunteerWorkAreaJPanel
     */
    public VolunteerWorkAreaJPanel(JPanel userProcessContainer, Enterprise enterprise , UserAccount userAccount, Organization organization, EcoSystem ecoSystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        this.organization = (VolunteerOrganization)organization;
        this.ecoSystem = ecoSystem;
        
      
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        int w = getWidth();
        int h = getHeight();
        
        Color c1 = new Color(204,255,255);
        Color c2 = Color.white;
     
        GradientPaint gp = new GradientPaint(w/4, 0, c2, w/4, h, c1);
        setOpaque( false );
        g2d.setPaint(gp);
        g2d.fillRect(0, 0, w, h);
        setOpaque( true );
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        manageEnt = new javax.swing.JLabel();
        viewPersonalHelpRequestBtn = new javax.swing.JButton();
        manageVolunteerProfileBtn = new javax.swing.JButton();
        viewFeedbackBtn = new javax.swing.JButton();
        viewAnonymousReqBtn = new javax.swing.JButton();
        viewVolProfileBtn = new javax.swing.JButton();

        manageEnt.setFont(new java.awt.Font("Malayalam MN", 3, 24)); // NOI18N
        manageEnt.setText("         Helper Work Area");

        viewPersonalHelpRequestBtn.setText("View Personal Service  Request Panel");
        viewPersonalHelpRequestBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPersonalHelpRequestBtnActionPerformed(evt);
            }
        });

        manageVolunteerProfileBtn.setText("Update Profile Panel");
        manageVolunteerProfileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageVolunteerProfileBtnActionPerformed(evt);
            }
        });

        viewFeedbackBtn.setText("View Feedback Panel");
        viewFeedbackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewFeedbackBtnActionPerformed(evt);
            }
        });

        viewAnonymousReqBtn.setText("View anonymous Service Request Panel");
        viewAnonymousReqBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAnonymousReqBtnActionPerformed(evt);
            }
        });

        viewVolProfileBtn.setText("View Profile Panel");
        viewVolProfileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewVolProfileBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(285, Short.MAX_VALUE)
                .addComponent(manageEnt, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(547, 547, 547))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(viewVolProfileBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(manageVolunteerProfileBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(viewPersonalHelpRequestBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(viewAnonymousReqBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(361, 361, 361)
                        .addComponent(viewFeedbackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(manageEnt)
                .addGap(97, 97, 97)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(manageVolunteerProfileBtn)
                    .addComponent(viewPersonalHelpRequestBtn))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewAnonymousReqBtn)
                    .addComponent(viewVolProfileBtn))
                .addGap(35, 35, 35)
                .addComponent(viewFeedbackBtn)
                .addContainerGap(179, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void manageVolunteerProfileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageVolunteerProfileBtnActionPerformed
         UpdateVolunteerProfile updateVolunteerProfile = new UpdateVolunteerProfile(userProcessContainer, userAccount, enterprise.getUserAccountDirectory());
         CardLayout layout = (CardLayout) userProcessContainer.getLayout();
         userProcessContainer.add("UpdateVolunteerProfile", updateVolunteerProfile);
         layout.next(userProcessContainer);
    }//GEN-LAST:event_manageVolunteerProfileBtnActionPerformed

    private void viewPersonalHelpRequestBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPersonalHelpRequestBtnActionPerformed
        if(userAccount.getWorkQueue().getWorkRequestList().isEmpty())
        {
        JOptionPane.showMessageDialog(null, "No Help Requests to display as of now! ","warning", JOptionPane.WARNING_MESSAGE);
        return;     
        }
        ViewPersonalHelpRequestsJPanel viewHelpRequestsJPanel = new ViewPersonalHelpRequestsJPanel(userProcessContainer, userAccount, enterprise.getOrganizationDirectory());
         CardLayout layout = (CardLayout) userProcessContainer.getLayout();
         userProcessContainer.add("ViewHelpRequestsJPanel", viewHelpRequestsJPanel);
         layout.next(userProcessContainer);
    }//GEN-LAST:event_viewPersonalHelpRequestBtnActionPerformed

    private void viewAnonymousReqBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAnonymousReqBtnActionPerformed
        if(organization.getWorkQueue().getWorkRequestList().isEmpty())
        {
        JOptionPane.showMessageDialog(null, "No Help Requests to display as of now! ","warning", JOptionPane.WARNING_MESSAGE);
        return;     
        } 
         ViewAnonymousRequestJPanel viewAnonymousRequestJPanel = new ViewAnonymousRequestJPanel(userProcessContainer, userAccount,  organization, enterprise.getOrganizationDirectory());
         CardLayout layout = (CardLayout) userProcessContainer.getLayout();
         userProcessContainer.add("ViewAnonymousRequestJPanel", viewAnonymousRequestJPanel);
         layout.next(userProcessContainer);
    }//GEN-LAST:event_viewAnonymousReqBtnActionPerformed

    private void viewFeedbackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewFeedbackBtnActionPerformed
        Volunteer volunteer = (Volunteer)userAccount.getPerson();
        if(volunteer.getFeedbackList().isEmpty())
        {
        JOptionPane.showMessageDialog(null, "No Testimonials to display as of now! ","warning", JOptionPane.WARNING_MESSAGE);
        return;     
        }
         ViewFeedback viewTestimonialJPanel = new ViewFeedback(userProcessContainer, userAccount);
         CardLayout layout = (CardLayout) userProcessContainer.getLayout();
         userProcessContainer.add("ViewTestimonialJPanel", viewTestimonialJPanel);
         layout.next(userProcessContainer);
    }//GEN-LAST:event_viewFeedbackBtnActionPerformed

    private void viewVolProfileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewVolProfileBtnActionPerformed
        ViewVolunteerProfile viewVolunteerProfile = new ViewVolunteerProfile(userProcessContainer, userAccount);
         CardLayout layout = (CardLayout) userProcessContainer.getLayout();
         userProcessContainer.add("ViewVolunteerProfile", viewVolunteerProfile);
         layout.next(userProcessContainer);
    }//GEN-LAST:event_viewVolProfileBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel manageEnt;
    private javax.swing.JButton manageVolunteerProfileBtn;
    private javax.swing.JButton viewAnonymousReqBtn;
    private javax.swing.JButton viewFeedbackBtn;
    private javax.swing.JButton viewPersonalHelpRequestBtn;
    private javax.swing.JButton viewVolProfileBtn;
    // End of variables declaration//GEN-END:variables
}
