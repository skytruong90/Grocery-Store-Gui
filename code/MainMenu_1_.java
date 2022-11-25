import javax.swing.*;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu_1_ extends JFrame{
    private JButton customerButton;
    private JPanel panel1;
    private JButton managerButton;
    private JLabel welcomeToStore;

    public void MainMenu_1_() {
        customerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(customerButton, welcomeToStore.getText()+ " Hello");
            }
        });
    }
    public static void main(String[] args){
        MainMenu_1_ h = new MainMenu_1_();
        h.setContentPane(h.panel1);
        h.setTitle("Hello! Welcome to Store!");
        h.setSize(900,600);
        h.setVisible(true);
        h.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
