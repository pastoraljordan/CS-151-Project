package login;

public class Register extends PanelCustom {

    public Register() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        loginTextField1 = new swing.TextField();
        loginButton1 = new swing.Button();
        loginTextField2 = new swing.TextField();
        loginTextField3 = new swing.TextField();
        loginPassword1 = new swing.Password();

        setBackground(new java.awt.Color(56, 56, 56));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(242, 242, 242));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SIGN UP");

        loginTextField1.setForeground(new java.awt.Color(242, 242, 242));
        loginTextField1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        loginTextField1.setHint("NAME");

        loginButton1.setBackground(new java.awt.Color(86, 142, 255));
        loginButton1.setForeground(new java.awt.Color(255, 255, 255));
        loginButton1.setText("Sign Up");
        loginButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        loginTextField2.setForeground(new java.awt.Color(242, 242, 242));
        loginTextField2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        loginTextField2.setHint("PHONE NUMBER (NO DASHES)");

        loginTextField3.setForeground(new java.awt.Color(242, 242, 242));
        loginTextField3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        loginTextField3.setHint("USERNAME");

        loginPassword1.setForeground(new java.awt.Color(242, 242, 242));
        loginPassword1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        loginPassword1.setHint("PASSWORD");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(loginPassword1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(loginTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(loginButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                    .addComponent(loginTextField2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(loginTextField3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(44, 44, 44)
                .addComponent(loginTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(loginTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(loginTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(loginPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(loginButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private swing.Button loginButton1;
    private swing.Password loginPassword1;
    private swing.TextField loginTextField1;
    private swing.TextField loginTextField2;
    private swing.TextField loginTextField3;
    // End of variables declaration//GEN-END:variables
}
