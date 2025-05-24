import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginApplication extends JFrame implements ActionListener {

    JPanel panel;
    JLabel label, ageLabel, genderLabel;
    JTextField nameField, ageField;
    JButton submitButton;
    JRadioButton maleButton, femaleButton;
    ButtonGroup genderGroup;

    boolean isSubmitting = false;

    public LoginApplication() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(420, 420);
        this.setTitle("Login Page");

        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.LIGHT_GRAY);
        panel.setBounds(50, 50, 300, 300);

        label = new JLabel("What is your name?");
        label.setBounds(50, 10, 200, 25);

        nameField = new JTextField();
        nameField.setBounds(50, 35, 200, 25);

        ageLabel = new JLabel("What is your age?");
        ageLabel.setBounds(50, 70, 200, 25);

        ageField = new JTextField();
        ageField.setBounds(50, 95, 200, 25);

        genderLabel = new JLabel("Gender:");
        genderLabel.setBounds(50, 130, 100, 25);

        maleButton = new JRadioButton("Male");
        femaleButton = new JRadioButton("Female");
        maleButton.setBounds(50, 155, 70, 25);
        femaleButton.setBounds(130, 155, 100, 25);

        genderGroup = new ButtonGroup();
        genderGroup.add(maleButton);
        genderGroup.add(femaleButton);

        submitButton = new JButton("Submit");
        submitButton.setBounds(100, 200, 100, 25);
        submitButton.addActionListener(this);

        panel.add(label);
        panel.add(nameField);
        panel.add(ageLabel);
        panel.add(ageField);
        panel.add(genderLabel);
        panel.add(maleButton);
        panel.add(femaleButton);
        panel.add(submitButton);

        this.setLayout(null);
        this.add(panel);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String name=nameField.getText();
        String age=ageField.getText();
        String gender=genderLabel.getText();
      if(e.getSource()==submitButton) {
          new myframe();
          submitButton.setEnabled(false);
          submitButton.setFocusable(false);
          JOptionPane.showMessageDialog(this, "Hello " + name + "!\nAge: " + age + "\nGender: " + gender);

      }

    }

    public static void main(String[] args) {
        new LoginApplication();
    }
}
