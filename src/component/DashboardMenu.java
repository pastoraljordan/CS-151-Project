package component;

import event.EventMenu;
import event.EventMenuCallBack;
import event.EventMenuSelected;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import model.Model_Menu;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTarget;
import org.jdesktop.animation.timing.TimingTargetAdapter;
import shadow.ShadowBorder;
import swing.PanelShadow;

public class DashboardMenu extends PanelShadow {

    private int selectedIndex = -1;
    private double menuTarget;
    private double menuLastTarget;
    private double currentLocation;
    private BufferedImage selectedImage;
    private Animator animator;
    private EventMenuCallBack callBack;
    private EventMenu event;
    
    public DashboardMenu() {
        initComponents();
        init();
    }
    
    private void init() {
        setRadius(20);
        initData();
        dashboardListMenu.addEventSelectedMenu(new EventMenuSelected() {
            @Override
            public void menuSelected(int index, EventMenuCallBack callBack) {
                if(!animator.isRunning()) {
                    if(index != selectedIndex) {
                        DashboardMenu.this.callBack = callBack;
                        selectedIndex = index;
                        menuTarget = selectedIndex * 50 + dashboardListMenu.getY();
                        animator.start();
                    }
                }
            }
        });
        TimingTarget target = new TimingTargetAdapter() {
            @Override
            public void timingEvent(float fraction) {
                currentLocation = (menuTarget - menuLastTarget) * fraction;
                currentLocation += menuLastTarget;
                repaint();
            }

            @Override
            public void end() {
                menuLastTarget = menuTarget;
                callBack.call(selectedIndex);
                if(event != null) {
                    event.menuIndexChange(selectedIndex);
                }
            }
        };
        animator = new Animator(300, target);
        animator.setResolution(1);
        animator.setAcceleration(0.5f);
        animator.setDeceleration(0.5f);
    }
    
    private void initData() {
        dashboardListMenu.addItem(new Model_Menu("Dashboard", "Dashboard", Model_Menu.MenuType.MENU));
        dashboardListMenu.addItem(new Model_Menu("AllReminders", "All Reminders", Model_Menu.MenuType.MENU));
        dashboardListMenu.addItem(new Model_Menu("CreateReminder", "Create New Reminder", Model_Menu.MenuType.MENU));
        dashboardListMenu.addItem(new Model_Menu("Settings", "Settings", Model_Menu.MenuType.MENU));
        dashboardListMenu.addItem(new Model_Menu("", "", Model_Menu.MenuType.EMPTY));
        dashboardListMenu.addItem(new Model_Menu("", "", Model_Menu.MenuType.EMPTY));
        dashboardListMenu.addItem(new Model_Menu("", "", Model_Menu.MenuType.EMPTY));
        dashboardListMenu.addItem(new Model_Menu("", "", Model_Menu.MenuType.EMPTY));
        dashboardListMenu.addItem(new Model_Menu("", "", Model_Menu.MenuType.EMPTY));
        dashboardListMenu.addItem(new Model_Menu("", "", Model_Menu.MenuType.EMPTY));
        dashboardListMenu.addItem(new Model_Menu("SignOut", "Sign Out", Model_Menu.MenuType.MENU));
    }
    
    private void createImage() {
        int width = getWidth() - 30;
        selectedImage = ShadowBorder.getInstance().createShadowOut(width, 50, 8, 8, new Color(242, 246, 253));
    }

    @Override
    public void setBounds(int i, int i1, int i2, int i3) {
        super.setBounds(i, i1, i2, i3);
        createImage();
    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        super.paintComponent(grphcs);
        if(selectedIndex >= 0) {
            grphcs.drawImage(selectedImage, 15, (int) currentLocation, null);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dashboardProfile1 = new component.DashboardProfile();
        dashboardListMenu = new swing.DashboardListMenu<>();

        dashboardListMenu.setOpaque(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dashboardProfile1, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
            .addComponent(dashboardListMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(dashboardProfile1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dashboardListMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void addEvent(EventMenu event) {
        this.event = event;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.DashboardListMenu<String> dashboardListMenu;
    private component.DashboardProfile dashboardProfile1;
    // End of variables declaration//GEN-END:variables
}
