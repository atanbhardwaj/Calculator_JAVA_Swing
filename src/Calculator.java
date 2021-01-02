import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Calculator extends JFrame {
    JTextField text1,text2;
    JLabel label1,label2,Answer;
    JButton subtract_button,multiply_button,add_button,modulo_button,divide_button;

    public Calculator()
    {}
    public Calculator(String s)
    {super(s);}

    public void setComponents()
    {
        text1 = new JTextField();
        text2 = new JTextField();
        label1 = new JLabel("INPUT: ");
        label2 = new JLabel("INPUT: ");
        Answer = new JLabel();
        subtract_button = new JButton("-");
        multiply_button = new JButton("X");
        add_button = new JButton("+");
        modulo_button = new JButton("%");
        divide_button = new JButton("/");
        setLayout(null);
        label1.setFont(new Font("LUCIDA CONSOLE",Font.BOLD,25));
        label1.setForeground(Color.BLACK);
        label2.setFont(new Font("LUCIDA CONSOLE",Font.BOLD,25));
        label2.setForeground(Color.BLACK);
        label1.setBounds(50,40,150,50);
        label2.setBounds(50,40,200,200);
        text1.setBounds(200,40,200,50);
        text1.setFont(new Font("Serif",Font.BOLD,25));
        text1.setForeground(Color.WHITE);
        text1.setBackground(Color.DARK_GRAY);
        text2.setBounds(200,115,200,50);
        text2.setFont(new Font("Serif",Font.BOLD,25));
        text2.setBackground(Color.DARK_GRAY);
        text2.setForeground(Color.WHITE);
        Answer.setBounds(50,565,300,35);
        Answer.setFont(new Font("LUCIDA CONSOLE",Font.BOLD,25));
        Answer.setForeground(Color.BLUE);
        add_button.addActionListener(new AddHandler());
        subtract_button.addActionListener(new SubtractHandler());
        multiply_button.addActionListener(new MultiplyHandler());
        modulo_button.addActionListener(new ModuloHandler());
        divide_button.addActionListener(new DivideHandler());
        add(label1);
        add(label2);
        add(text1);
        add(text2);
        add(Answer);
        add_button.setFont(new Font("Serif",Font.BOLD,50));
        add_button.setForeground(Color.WHITE);
        add_button.setBackground(Color.BLACK);
        add_button.setBounds(50,230,75,75);
        subtract_button.setFont(new Font("Serif",Font.BOLD,65));
        subtract_button.setForeground(Color.WHITE);
        subtract_button.setBackground(Color.BLACK);
        subtract_button.setBounds(200,230,75,75);
        multiply_button.setFont(new Font("Serif",Font.BOLD,30));
        multiply_button.setForeground(Color.WHITE);
        multiply_button.setBackground(Color.BLACK);
        multiply_button.setBounds(350,230,75,75);
        divide_button.setFont(new Font("Serif",Font.BOLD,50));
        divide_button.setForeground(Color.WHITE);
        divide_button.setBackground(Color.BLACK);
        divide_button.setBounds(120,370,75,75);
        modulo_button.setFont(new Font("Serif",Font.BOLD,30));
        modulo_button.setForeground(Color.WHITE);
        modulo_button.setBackground(Color.BLACK);
        modulo_button.setBounds(270,370,75,75);
        add(add_button);
        add(multiply_button);
        add(divide_button);
        add(modulo_button);
        add(subtract_button);

    }

    class AddHandler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            int a = Integer.parseInt(text1.getText());
            int b = Integer.parseInt(text2.getText());
            int sum = a+b;
            Answer.setText("Result: "+sum);
        }
    }

    class SubtractHandler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            int a = Integer.parseInt(text1.getText());
            int b = Integer.parseInt(text2.getText());
            int result = a - b;
            Answer.setText("Result: "+result);
        }
    }

    class MultiplyHandler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            int a = Integer.parseInt(text1.getText());
            int b = Integer.parseInt(text2.getText());
            int result = a*b;
            Answer.setText("Result: "+result);
        }
    }

    class ModuloHandler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            int a = Integer.parseInt(text1.getText());
            int b = Integer.parseInt(text2.getText());
            try
            {
                Answer.setText("Result: "+(a%b));
            }catch(ArithmeticException r)
            {
                Answer.setText("UNDEFINED");
            }

        }
    }

    class DivideHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            int a = Integer.parseInt(text1.getText());
            int b = Integer.parseInt(text2.getText());
            try
            {
                Answer.setText("Result: "+(a/b));

            }catch(ArithmeticException k)
            {
                Answer.setText("Cannot Divide by 0");
            }
        }
    }

    public static void main(String[] args)
    {
        Calculator frame;
        frame = new Calculator("Calculator");
        frame.setComponents();
        frame.getContentPane().setBackground(Color.gray);
        frame.setSize(500,700);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
    }
}
