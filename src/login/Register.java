package login;

public class Register extends PanelCustom {

    public Register() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        loginTextField1 = new swing.LoginTextField();
        loginTextField2 = new swing.LoginTextField();
        loginTextField3 = new swing.LoginTextField();
        loginPassword1 = new swing.LoginPassword();
        loginButton1 = new swing.LoginButton();

        setBackground(new java.awt.Color(56, 56, 56));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(242, 242, 242));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SIGN UP");

        loginTextField1.setBackground(new java.awt.Color(0, 0, 0));
        loginTextField1.setForeground(new java.awt.Color(255, 255, 255));
        loginTextField1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        loginTextField1.setHint("NAME");

        loginTextField2.setBackground(new java.awt.Color(0, 0, 0));
        loginTextField2.setForeground(new java.awt.Color(255, 255, 255));
        loginTextField2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        loginTextField2.setHint("EMAIL");

        loginTextField3.setBackground(new java.awt.Color(0, 0, 0));
        loginTextField3.setForeground(new java.awt.Color(255, 255, 255));
        loginTextField3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        loginTextField3.setHint("USER NAME");

        loginPassword1.setBackground(new java.awt.Color(0, 0, 0));
        loginPassword1.setForeground(new java.awt.Color(255, 255, 255));
        loginPassword1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        loginPassword1.setHint("PASSWORD");

        loginButton1.setBackground(new java.awt.Color(0, 150, 255));
        loginButton1.setText("Sign Up");
        loginButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(loginButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(loginPassword1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(loginTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                    .addComponent(loginTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(loginTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(loginTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(loginTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(loginTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(loginPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(loginButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private swing.LoginButton loginButton1;
    private swing.LoginPassword loginPassword1;
    private swing.LoginTextField loginTextField1;
    private swing.LoginTextField loginTextField2;
    private swing.LoginTextField loginTextField3;
    // End of variables declaration//GEN-END:variables
}
