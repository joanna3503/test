import java.awt.*;
import javax.swing.*;

public class JFrameCoding {
    public static void main (String args[]){
        JFrame frame=new JFrame("Library System");
        JPanel panel=new JPanel();
        panel.setLayout(new FlowLayout());
        JLabel label=new JLabel("Welcome to Library System!\nWhat do you want to do?");
        frame.setSize(300,400);
        JButton button1=new JButton();
        JButton button2=new JButton();

        button1.setText("creat account");
        button2.setText("login account");
        panel.add(label);
        panel.add(button1);
        panel.add(button2);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}