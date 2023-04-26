package login;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Register extends PanelCustom {

    public Register() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        loginTextField1 = new swing.LoginTextField();
        loginTextField2 = new swing.LoginTextField();
        loginTextField3 = new swing.LoginTextField();
        loginPassword1 = new swing.LoginPassword();
        loginButton1 = new swing.LoginButton();

        setBackground(new java.awt.Color(52, 52, 52));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(242, 242, 242));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SIGN UP");

        loginTextField1.setForeground(new java.awt.Color(242, 242, 242));
        loginTextField1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        loginTextField1.setHint("NAME");

        loginTextField2.setForeground(new java.awt.Color(242, 242, 242));
        loginTextField2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        loginTextField2.setHint("EMAIL");

        loginTextField3.setForeground(new java.awt.Color(242, 242, 242));
        loginTextField3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        loginTextField3.setHint("USER NAME");

        loginPassword1.setForeground(new java.awt.Color(242, 242, 242));
        loginPassword1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        loginPassword1.setHint("PASSWORD");

        loginButton1.setBackground(new java.awt.Color(86, 142, 255));
        loginButton1.setForeground(new java.awt.Color(255, 255, 255));
        loginButton1.setText("Sign Up");
        loginButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        loginButton1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
					if(validPassword(loginPassword1.getPassword())) {
						
					}
				
			}
        	
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(loginTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(loginTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                    .addComponent(loginTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                    .addComponent(loginPassword1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(loginButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addComponent(loginTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(loginTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(loginTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(loginPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(loginButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
    }// </editor-fold>  
    
    private boolean validPassword(char[] ch) {
    	boolean upper = false;
    	boolean lower = false;
    	boolean special = false;
    	boolean number = false;
    	boolean length = (ch.length >= 8);
    	String specialChars = "/*!@#$%^&*()\"{}_[]|\\?/<>,.";
    	for(int i = 0; i < ch.length; i++) {
    		if(Character.isUpperCase(ch[i]))
    			upper = true;
    		if(Character.isLowerCase(ch[i]))
    			lower = true;
    		if(Character.isDigit(ch[i]))
    			number = true;
    		if(specialChars.indexOf(ch[i]) > -1)
    			special = true;
    	}
    	return (upper && lower && special && number && length);
    }


    // Variables declaration - do not modify                     
    private javax.swing.JLabel jLabel1;
    private swing.LoginButton loginButton1;
    private swing.LoginPassword loginPassword1;
    private swing.LoginTextField loginTextField1;
    private swing.LoginTextField loginTextField2;
    private swing.LoginTextField loginTextField3;
    // End of variables declaration                   
}
