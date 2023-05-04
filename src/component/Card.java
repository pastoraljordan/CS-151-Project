package component;

import java.awt.Dimension;
import model.Model_Card;
import swing.PanelShadow;

public class Card extends PanelShadow {

    public Card() {
        initComponents();
        init();
        setMaximumSize(new Dimension(248, 106));
    }
    
    public void setData(Model_Card data) {
        lbName.setText(data.getName());
        lbDate.setText(data.getDate());
        lbTime.setText(data.getTime());
    }
    
    private void init() {
        setRadius(25);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbName = new javax.swing.JLabel();
        lbDate = new javax.swing.JLabel();
        lbTime = new javax.swing.JLabel();

        lbName.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lbName.setForeground(new java.awt.Color(140, 110, 207));
        lbName.setText("Reminder Name");

        lbDate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbDate.setForeground(new java.awt.Color(140, 110, 207));
        lbDate.setText("Reminder Date");

        lbTime.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbTime.setForeground(new java.awt.Color(140, 110, 207));
        lbTime.setText("Reminder Time");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbName)
                    .addComponent(lbDate)
                    .addComponent(lbTime))
                .addGap(81, 81, 81))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbName)
                .addGap(0, 0, 0)
                .addComponent(lbDate)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbTime)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbDate;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbTime;
    // End of variables declaration//GEN-END:variables
}
