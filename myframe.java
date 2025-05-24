import javax.swing.*;

public class myframe  extends JFrame {
    JPanel panel;
    myframe(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setTitle("Submitted");

        panel=new JPanel();
        panel.setBounds(200,200,250,250);

        JLabel label=new JLabel();
        label.setText("Your Response Submitted !");
        label.add(panel);


        this.add(label);
        this.setVisible(true);
    }
}
