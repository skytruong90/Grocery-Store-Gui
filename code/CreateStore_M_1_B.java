import javax.swing.*;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

public class CreateStore_M_1_B extends JFrame{
    private JButton backButton;
    private JButton createStoreButton;
    private JTextField nameField;
    private JTextField idField;
    private JLabel idLabel;
    private JLabel nameLabel;
    private JPanel panel1;

    public CreateStore_M_1_B(){
        createStoreButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String storeName = nameField.getText();
                String digitStore= idField.getText();
                JOptionPane.showMessageDialog(createStoreButton," " + storeName + " " + digitStore + " Added Correctly");
                //StoreController.createStore(id,name);
            }
        });
        this.pack();
    }

    public static void main(String[] args){
        CreateStore_M_1_B a = new CreateStore_M_1_B();
        a.setContentPane(a.panel1);
        a.setTitle("Create a New Store");
        a.setSize(900,600);
        a.setLayout(null);
        a.setVisible(true);
        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
