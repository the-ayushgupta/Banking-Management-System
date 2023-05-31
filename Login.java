import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener {

    JButton signin, clear, signup;
    JTextField cardTextField;
    JPasswordField pinTextField;

    Login() {
        
        setTitle("Automated teller machine");

        setLayout(null);

        /*ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70, 10, 100, 100);
        add(label);*/

        JLabel text = new JLabel("WELCOME TO ATM");
        text.setFont(new Font("OSWARD",Font.BOLD,38));
        text.setBounds(200,40,400,40);
        add(text);
        
        JLabel cardno = new JLabel("CARD NO:");
        cardno.setFont(new Font("OSWARD",Font.BOLD,18));
        cardno.setBounds(100,150,250,40);
        add(cardno);

        cardTextField = new JTextField();
        cardTextField.setBounds(300,160,250,18);
        cardTextField.setFont(new Font("Arial",Font.BOLD, 14));
        add(cardTextField);

        JLabel pin = new JLabel("PIN:");
        pin.setFont(new Font("OSWARD",Font.BOLD,18));
        pin.setBounds(100,200,250,40);
        add(pin);

        pinTextField = new JPasswordField();
        pinTextField.setBounds(300,210,250,18);
        pinTextField.setFont(new Font("Arial",Font.BOLD, 14));
        add(pinTextField);

        signin = new JButton("SIGN IN");
        signin.setBounds(300,270,100,25);
        signin.setBackground(Color.BLACK);
        signin.setForeground(Color.WHITE);
        signin.addActionListener(this);
        add(signin);

        clear = new JButton("CLEAR");
        clear.setBounds(450,270,100,25);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);

        signup = new JButton("SIGN UP");
        signup.setBounds(300,320,250,25);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this);
        add(signup);


        getContentPane().setBackground(Color.WHITE);

        setSize(700,450);
        setVisible(true);
        setLocation(400,200);

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == signin) {
            
        }
        else if (ae.getSource() == clear) {
            cardTextField.setText("");
            pinTextField.setText("");
        }
        else if (ae.getSource() == signup) {

        }

    }

    public static void main(String[] args) {
        new Login();
    }
}
