import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class CalculatorFrame
{
    public CalculatorFrame()
    {
        JFrame calculator = new JFrame("Calculator");
        frameInfo(calculator, 500, 600);

        JPanel panel = new JPanel(new GridLayout(2, 1));
        panel.setBorder(new EmptyBorder(5, 5, 5, 5));

        JTextArea textArea = new JTextArea("Enter your input...");
        JScrollPane scrollPane = new JScrollPane(textArea,
                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

        JTabbedPane tabs = new JTabbedPane();

        tabs.add("Standard Mode", createDefault());
        tabs.addTab("Scientific Mode", createScientific());

        panel.add(scrollPane, BorderLayout.NORTH);
        panel.add(tabs, BorderLayout.SOUTH);

        textArea.addKeyListener(new KeyListener()
        {
            @Override
            public void keyTyped(KeyEvent e)
            {
                System.out.println("Typed" + e);
                //textArea.setFocusable(true);
                //textArea.setText(textArea.getText() + keyEvent.getKeyChar());
            }

            @Override
            public void keyPressed(KeyEvent e)
            {
                System.out.println("Pressed" + e);
            }

            @Override
            public void keyReleased(KeyEvent e)
            {
                System.out.println("Released" + e);
            }
        });
        tabs.setFocusable(false);
        panel.setFocusable(false);
        calculator.setFocusable(false);

        calculator.setContentPane(panel);
        calculator.setVisible(true);
    }

    public JPanel createScientific()
    {
        JPanel defaults = createDefault();

        JPanel science = new JPanel(new GridLayout(2, 6, 5, 5));
        createScientificButtons(science);

        JPanel finals = new JPanel(new GridLayout(2, 1, 5, 5));

        finals.add(defaults);
        finals.add(science);

        return finals;
    }

    public JPanel createDefault()
    {
        JPanel numbers = new JPanel(new GridLayout(2, 5, 5, 5));
        createNumbers(numbers);

        JPanel mains = new JPanel(new GridLayout(1, 8, 5, 5));
        createMainButtons(mains);

        JPanel defaults = new JPanel(new GridLayout(2, 1, 5, 5));
        defaults.add(numbers);
        defaults.add(mains);

        return defaults;
    }

    public void frameInfo(JFrame input, int width, int height)
    {
        input.setSize(width, height);
        input.setLocationRelativeTo(null); //put the frame in the center of the screen
        input.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //what will happen if we click on the close icon
        input.setLayout(null);
    }

    public void createNumbers(JPanel numbers)
    {
        KeyBoardButton zero = new KeyBoardButton("0");
        numbers.add(zero);
        KeyBoardButton one = new KeyBoardButton("1");
        numbers.add(one);
        KeyBoardButton two = new KeyBoardButton("2");
        numbers.add(two);
        KeyBoardButton three = new KeyBoardButton("3");
        numbers.add(three);
        KeyBoardButton four = new KeyBoardButton("4");
        numbers.add(four);
        KeyBoardButton five = new KeyBoardButton("5");
        numbers.add(five);
        KeyBoardButton six = new KeyBoardButton("6");
        numbers.add(six);
        KeyBoardButton seven = new KeyBoardButton("7");
        numbers.add(seven);
        KeyBoardButton eight = new KeyBoardButton("8");
        numbers.add(eight);
        KeyBoardButton nine = new KeyBoardButton("9");
        numbers.add(nine);
    }

    public void createMainButtons(JPanel mains)
    {
        KeyBoardButton add = new KeyBoardButton("+");
        mains.add(add);

        KeyBoardButton subtract = new KeyBoardButton("-");
        mains.add(subtract);

        KeyBoardButton multiplication = new KeyBoardButton("*");
        mains.add(multiplication);

        KeyBoardButton clear = new KeyBoardButton("C");
        mains.add(clear);

        KeyBoardButton division = new KeyBoardButton("/");
        mains.add(division);

        KeyBoardButton dot = new KeyBoardButton(".");
        mains.add(dot);

        KeyBoardButton percent = new KeyBoardButton("%");
        mains.add(percent);

        KeyBoardButton equal = new KeyBoardButton("=");
        mains.add(equal);
    }

    public void createScientificButtons(JPanel science)
    {
        KeyBoardButton pow = new KeyBoardButton("POW");
        science.add(pow);

        KeyBoardButton sin = new KeyBoardButton("SIN");
        science.add(sin);

        KeyBoardButton cos = new KeyBoardButton("COS");
        science.add(cos);

        KeyBoardButton exp = new KeyBoardButton("exp");
        science.add(exp);

        KeyBoardButton integral = new KeyBoardButton("int");
        science.add(integral);

        KeyBoardButton pi = new KeyBoardButton("PI");
        science.add(pi);

        KeyBoardButton shift = new KeyBoardButton("SHIFT");
        science.add(shift);

        KeyBoardButton tan = new KeyBoardButton("TAN");
        science.add(tan);

        KeyBoardButton cot = new KeyBoardButton("COT");
        science.add(cot);

        KeyBoardButton log = new KeyBoardButton("LOG");
        science.add(log);

        KeyBoardButton drr = new KeyBoardButton("DRR");
        science.add(drr);

        KeyBoardButton e = new KeyBoardButton("e");
        science.add(e);
    }
}
