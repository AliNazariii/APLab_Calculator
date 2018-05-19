import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

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
        JButton zero = new JButton("0");
        numbers.add(zero);
        JButton one = new JButton("1");
        numbers.add(one);
        JButton two = new JButton("2");
        numbers.add(two);
        JButton three = new JButton("3");
        numbers.add(three);
        JButton four = new JButton("4");
        numbers.add(four);
        JButton five = new JButton("5");
        numbers.add(five);
        JButton six = new JButton("6");
        numbers.add(six);
        JButton seven = new JButton("7");
        numbers.add(seven);
        JButton eight = new JButton("8");
        numbers.add(eight);
        JButton nine = new JButton("9");
        numbers.add(nine);
    }

    public void createMainButtons(JPanel mains)
    {
        JButton add = new JButton("+");
        mains.add(add);

        JButton subtract = new JButton("-");
        mains.add(subtract);

        JButton multiplication = new JButton("*");
        mains.add(multiplication);

        JButton clear = new JButton("C");
        mains.add(clear);

        JButton division = new JButton("/");
        mains.add(division);

        JButton dot = new JButton(".");
        mains.add(dot);

        JButton percent = new JButton("%");
        mains.add(percent);

        JButton equal = new JButton("=");
        mains.add(equal);
    }

    public void createScientificButtons(JPanel science)
    {
        JButton pow = new JButton("POW");
        science.add(pow);

        JButton sin = new JButton("SIN");
        science.add(sin);

        JButton cos = new JButton("COS");
        science.add(cos);

        JButton exp = new JButton("exp");
        science.add(exp);

        JButton integral = new JButton("int");
        science.add(integral);

        JButton pi = new JButton("PI");
        science.add(pi);

        JButton shift = new JButton("SHIFT");
        science.add(shift);

        JButton tan = new JButton("TAN");
        science.add(tan);

        JButton cot = new JButton("COT");
        science.add(cot);

        JButton log = new JButton("LOG");
        science.add(log);

        JButton drr = new JButton("DRR");
        science.add(drr);

        JButton e = new JButton("e");
        science.add(e);
    }
}
