package login;

import backend.DBConnection;
import backend.User;
import java.awt.Color;
import swing.TextFieldLimit;

public class Register extends PanelCustom {

    public Register() {
        initComponents();
        name.setDocument(new TextFieldLimit(16));
        number.setDocument(new TextFieldLimit(10));
        username.setDocument(new TextFieldLimit(16));
        password.setDocument(new TextFieldLimit(16));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        name = new swing.TextField();
        loginButton1 = new swing.Button();
        number = new swing.TextField();
        username = new swing.TextField();
        password = new swing.Password();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(56, 56, 56));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(242, 242, 242));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SIGN UP");

        name.setForeground(new java.awt.Color(242, 242, 242));
        name.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        name.setHint("NAME");

        loginButton1.setBackground(new java.awt.Color(86, 142, 255));
        loginButton1.setForeground(new java.awt.Color(255, 255, 255));
        loginButton1.setText("Sign Up");
        loginButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        loginButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButton1ActionPerformed(evt);
            }
        });

        number.setForeground(new java.awt.Color(242, 242, 242));
        number.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        number.setHint("PHONE NUMBER (NO DASHES)");

        username.setForeground(new java.awt.Color(242, 242, 242));
        username.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        username.setHint("USERNAME");

        password.setForeground(new java.awt.Color(242, 242, 242));
        password.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        password.setHint("PASSWORD");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(242, 242, 242));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(password, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(loginButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                    .addComponent(number, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(username, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(44, 44, 44)
                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void loginButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButton1ActionPerformed
        switch(checkRegistration()) {
            case 0:
                break;
            case 1:
                jLabel2.setForeground(new Color(244, 113, 116));
                jLabel2.setText("Please use only numbers in phone #!");
                break;
            case 2:
                jLabel2.setForeground(new Color(244, 113, 116));
                jLabel2.setText("Please fill in all the fields!");
                break;
            case 3:
                jLabel2.setForeground(new Color(244, 113, 116));
                jLabel2.setText("Please type all phone # digits!");
                break;
            case 4:
                jLabel2.setForeground(new Color(244, 113, 116));
                jLabel2.setText("This account already exists!");
                break;
            case 5:
                User user = new User(name.getText(), number.getText(), username.getText(), String.valueOf(password.getPassword()));
                DBConnection.addUser(user);
                jLabel2.setForeground(new Color(172, 209, 175));
                jLabel2.setText("Account Creation Successful!");
                break;
        }
    }//GEN-LAST:event_loginButton1ActionPerformed

    private int checkRegistration() {
        for(int i = 0; i < number.getText().length(); i++) {
            if(!Character.isDigit(number.getText().charAt(i))) {
                return 1;
            }
        }
        if(name.getText().equals("") || number.getText().equals("") || username.getText().equals("") || password.getPassword().length == 0) {
            return 2;
        }
        if(number.getText().length() < 10) {
            return 3;
        }
        if(DBConnection.validAccount(username.getText()) || DBConnection.validAccountNumber(number.getText())) {
            return 4;
        }
        if(!name.getText().isEmpty() && !number.getText().isEmpty() && !username.getText().isEmpty() && password.getPassword().length != 0) {
            return 5;
        }
        return 0;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private swing.Button loginButton1;
    private swing.TextField name;
    private swing.TextField number;
    private swing.Password password;
    private swing.TextField username;
    // End of variables declaration//GEN-END:variables
}
