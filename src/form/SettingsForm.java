package form;

import backend.CurrentUser;
import backend.DBConnection;
import backend.User;
import java.awt.Color;
import swing.TextFieldLimit;

public class SettingsForm extends javax.swing.JPanel {

    CurrentUser current = CurrentUser.currentUser;
    User user = current.getCurrentUser();

    public SettingsForm() {
        initComponents();
        name.setDocument(new TextFieldLimit(16));
        username.setDocument(new TextFieldLimit(16));
        oldPass.setDocument(new TextFieldLimit(16));
        newPass.setDocument(new TextFieldLimit(16));
        retypeNewPass.setDocument(new TextFieldLimit(16));
        name.setText(user.getName());
        username.setText(user.getUsername());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        name = new swing.TextField();
        button3 = new swing.Button();
        button4 = new swing.Button();
        username = new swing.TextField();
        button5 = new swing.Button();
        oldPass = new swing.TextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        newPass = new swing.TextField();
        retypeNewPass = new swing.TextField();
        button6 = new swing.Button();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(242, 246, 253));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(140, 110, 207));
        jLabel1.setText("User Settings");
        jLabel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

        name.setHint("New Name");

        button3.setBackground(new java.awt.Color(51, 51, 51));
        button3.setForeground(new java.awt.Color(255, 255, 255));
        button3.setText("Change Name");
        button3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });

        button4.setBackground(new java.awt.Color(51, 51, 51));
        button4.setForeground(new java.awt.Color(255, 255, 255));
        button4.setText("Change Username");
        button4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });

        username.setHint("New Username");

        button5.setBackground(new java.awt.Color(51, 51, 51));
        button5.setForeground(new java.awt.Color(255, 255, 255));
        button5.setText("Change Password");
        button5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button5ActionPerformed(evt);
            }
        });

        oldPass.setHint("Enter old password");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(140, 110, 207));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(140, 110, 207));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(140, 110, 207));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

        newPass.setHint("New password");

        retypeNewPass.setHint("Retype new password");

        button6.setBackground(new java.awt.Color(51, 51, 51));
        button6.setForeground(new java.awt.Color(255, 255, 255));
        button6.setText("DELETE ALL REMINDERS");
        button6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button6ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(244, 113, 116));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Be careful, will delete all reminders immediately after pressing button");
        jLabel5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oldPass, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newPass, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(retypeNewPass, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(button6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(oldPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(retypeNewPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        switch (checkNewName()) {
            case 0:
                jLabel2.setForeground(new Color(172, 209, 175));
                jLabel2.setText("Name changed successfully!");
                DBConnection.changeName(user.getUsername(), name.getText());
                user.setName(name.getText());
                break;
            case 1:
                jLabel2.setForeground(new Color(244, 113, 116));
                jLabel2.setText("Please use a different name to change!");
                break;
            case 2:
                jLabel2.setForeground(new Color(244, 113, 116));
                jLabel2.setText("Please enter a name to change name!");
                break;
        }
    }//GEN-LAST:event_button3ActionPerformed

    private int checkNewName() {
        if (name.getText().equals(user.getName())) {
            jLabel2.setForeground(new Color(244, 113, 116));
            jLabel2.setText("Please use a different name to change!");
            return 1;
        }
        if (name.getText().equals("")) {
            jLabel2.setForeground(new Color(244, 113, 116));
            jLabel2.setText("Please enter a name to change name!");
            return 2;
        }
        if (!name.getText().isEmpty()) {
            return 0;
        }
        return 0;
    }

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
        switch (checkUsername()) {
            case 0:
                jLabel3.setForeground(new Color(172, 209, 175));
                jLabel3.setText("Username changed successfully!");
                DBConnection.changeUsername(user.getUsername(), username.getText());
                user.setUsername(username.getText());
                break;
            case 1:
                jLabel3.setForeground(new Color(244, 113, 116));
                jLabel3.setText("Please use a different username to change!");
                break;
            case 2:
                jLabel3.setForeground(new Color(244, 113, 116));
                jLabel3.setText("Please enter a username to change username!");
                break;
            case 3:
                jLabel3.setForeground(new Color(244, 113, 116));
                jLabel3.setText("This username already exists!");
                break;
        }
    }//GEN-LAST:event_button4ActionPerformed

    private int checkUsername() {
        if (username.getText().equals(user.getUsername())) {
            return 1;
        }
        if (username.getText().equals("")) {
            return 2;
        }
        if (DBConnection.validAccount(username.getText())) {
            return 3;
        }
        if (!username.getText().isEmpty()) {
            return 0;
        }
        return 0;
    }

    private void button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button5ActionPerformed
        switch (checkPassword()) {
            case 0:
                jLabel4.setForeground(new Color(172, 209, 175));
                jLabel4.setText("Password changed successfully!");
                DBConnection.changePassword(user.getUsername(), newPass.getText());
                user.setPassword(newPass.getText());
                break;
            case 1:
                jLabel4.setForeground(new Color(244, 113, 116));
                jLabel4.setText("Please enter text in the empty fields to change password!");
                break;
            case 2:
                jLabel4.setForeground(new Color(244, 113, 116));
                jLabel4.setText("Old password doesn't match current password!");
                break;
            case 3:
                jLabel4.setForeground(new Color(244, 113, 116));
                jLabel4.setText("New password cannot be the same as current password!");
                break;
            case 4:
                jLabel4.setForeground(new Color(244, 113, 116));
                jLabel4.setText("New password cannot match the old password!");
                break;
            case 5:
                jLabel4.setForeground(new Color(244, 113, 116));
                jLabel4.setText("Retyped password must match new password!");
                break;
        }
    }//GEN-LAST:event_button5ActionPerformed

    private void button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button6ActionPerformed
        DBConnection.clearReminders();
        jLabel5.setText("All reminders deleted");
    }//GEN-LAST:event_button6ActionPerformed

    private int checkPassword() {
        if(oldPass.getText().isEmpty() || newPass.getText().isEmpty() || retypeNewPass.getText().isEmpty()) {
            return 1;
        }
        if(!oldPass.getText().equals(user.getPassword())) {
            return 2;
        }
        if(newPass.getText().equals(user.getPassword())) {
            return 3;
        }
        if(oldPass.getText().equals(newPass.getText())) {
            return 4;
        }
        if(!newPass.getText().equals(retypeNewPass.getText())) {
            return 5;
        }
        if(!oldPass.getText().isEmpty() && !newPass.getText().isEmpty() && !retypeNewPass.getText().isEmpty()) {
            return 0;
        }
        return 0;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.Button button3;
    private swing.Button button4;
    private swing.Button button5;
    private swing.Button button6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private swing.TextField name;
    private swing.TextField newPass;
    private swing.TextField oldPass;
    private swing.TextField retypeNewPass;
    private swing.TextField username;
    // End of variables declaration//GEN-END:variables
}
