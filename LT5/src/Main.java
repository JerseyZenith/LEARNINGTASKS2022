import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends Multiplication{
    public static void main(String[] args) {

        JFrame frame = new JFrame("Calsetera");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panelTitle = new JPanel(new FlowLayout());
        JPanel panelOne = new JPanel(new GridLayout(2,2,1,1));
        JPanel panelTwo = new JPanel(new FlowLayout());
        JButton button = new JButton("Proceed");


        panelTitle.setBounds(40,10,300,40);
        panelOne.setBounds(30,60,300,80);
        panelTwo.setBounds(30,200,300,40);

        panelTitle.setBackground(Color.lightGray);
        panelOne.setBackground(Color.lightGray);
        panelTwo.setBackground(Color.lightGray);

        JLabel labelOne, labelTwo, labelTitle;

        JTextField tFieldOne, tFieldTwo;
        tFieldOne = new JTextField(15);
        tFieldOne.setPreferredSize(new Dimension(90,20));
        tFieldTwo = new JTextField(15);
        tFieldTwo.setPreferredSize(new Dimension(90,20));

        labelTitle = new JLabel("Multiplication Calculator", JLabel.CENTER);
        labelOne = new JLabel("First Value");
        labelTwo = new JLabel("Second Value");


        labelTitle.setBounds(10,10,70,20);
        labelOne.setBounds(10,10,70,20);
        tFieldOne.setBounds(5, 5, 90, 100);
        labelTwo.setBounds(10,10,70,20);
        tFieldTwo.setBounds(5, 5, 90, 100);

        panelTitle.add(labelTitle);

        panelOne.add(labelOne);
        panelOne.add(tFieldOne);
        panelOne.add(labelTwo);
        panelOne.add(tFieldTwo);

        button.setBounds(50,10,90,20);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int result = computeValue(tFieldOne.getText(),tFieldTwo.getText());
                displayMessage(String.valueOf(result));
            }
        });

        panelTwo.add(button);

        frame.add(panelTitle);
        frame.add(panelOne);
        frame.add(panelTwo);

        frame.setSize(400,300);
        frame.setResizable(false);
        frame.setLayout(null);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
class Multiplication {

    public static int computeValue(String value1, String value2){
        int val1 = Integer.parseInt(value1);
        int val2 = Integer.parseInt(value2);
        int sum = val1 * val2;
        return sum;
    }
    public static void displayMessage(String message){
        JOptionPane.showMessageDialog( null, message, "Total" , JOptionPane.INFORMATION_MESSAGE );
    }
}
