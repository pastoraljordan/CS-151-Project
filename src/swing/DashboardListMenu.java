package swing;

import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.ListModel;
import model.Model_Menu;

public class DashboardListMenu<E extends Object> extends JList<E> {

    private final DefaultListModel model;
    private int selectedIndex = -1;
    
    public DashboardListMenu() {
        model = new DefaultListModel();
        super.setModel(model);
    }

    @Override
    public ListCellRenderer<? super E> getCellRenderer() {
        return new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object o, int index, boolean selected, boolean focus) {
                Model_Menu data;
                if(o instanceof Model_Menu) {
                    data = (Model_Menu) o;
                } else {
                    data = new Model_Menu("1", o + "", Model_Menu.MenuType.MENU);
                }
                DashboardMenuItem item = new DashboardMenuItem(data);
                item.setSelected(index == selectedIndex);
                return item;
            }
        };
    }

    @Override
    public void setModel(ListModel<E> lm) {
        for(int i = 0; i < lm.getSize(); i++) {
            model.addElement(model.getElementAt(i));
        }
    }
    
    
    public void addItem(Model_Menu data) {
        model.addElement(data);
    }
    
    public void setSelectedIndex(int index) {
        this.selectedIndex = index;
    }
    
}
