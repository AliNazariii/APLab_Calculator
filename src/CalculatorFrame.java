import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CalculatorFrame extends JFrame
{
    private JTextArea textArea;
    private JScrollPane scrollPane;
    private JTabbedPane tabs;

    private JPanel panelA;
    private JButton clearA;
    private JButton backA;
    private JButton percentA;
    private JButton divisionA;
    private JButton multiplicationA;
    private JButton subtractA;
    private JButton addA;
    private JButton equalA;
    private JButton oneA;
    private JButton twoA;
    private JButton threeA;
    private JButton fourA;
    private JButton fiveA;
    private JButton sixA;
    private JButton sevenA;
    private JButton eightA;
    private JButton nineA;
    private JButton zeroA;
    private JButton zeroDA;
    private JButton dotA;

    private JPanel panelB;
    private JButton clearB;
    private JButton backB;
    private JButton percentB;
    private JButton divisionB;
    private JButton multiplicationB;
    private JButton subtractB;
    private JButton addB;
    private JButton equalB;
    private JButton oneB;
    private JButton twoB;
    private JButton threeB;
    private JButton fourB;
    private JButton fiveB;
    private JButton sixB;
    private JButton sevenB;
    private JButton eightB;
    private JButton nineB;
    private JButton zeroB;
    private JButton zeroDB;
    private JButton dotB;
    private JButton shift;
    private JButton sqrt;
    private JButton sin;
    private JButton cos;
    private JButton pow;

    public CalculatorFrame()
    {
        super("Calculator");
        setSize(350, 500);
        setLocationRelativeTo(null); //put the frame in the center of the screen
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //what will happen if we click on the close icon
        setLayout(new GridLayout(2, 1));

        textArea = new JTextArea();
        textArea.requestFocus();
        textArea.addKeyListener(new KeyHandler());
        scrollPane = new JScrollPane(textArea,
                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

        tabs = new JTabbedPane();

        panelA = new JPanel(new GridLayout(5, 4, 5, 5));
        setSimplePanel();
        tabs.add("Standard Mode", panelA);

        panelB = new JPanel(new GridLayout(5, 5, 5, 5));
        setScientificPanel();
        tabs.addTab("Scientific Mode", panelB);

        add(scrollPane);
        add(tabs);

        showFrame();
    }

    public void setSimplePanel()
    {
        clearA = new JButton("C");
        clearA.setForeground(Color.RED);
        clearA.setBackground(Color.WHITE);
        clearA.addMouseListener(new MouseHandler());
        panelA.add(clearA);

        backA = new JButton("<=");
        backA.setForeground(Color.BLUE);
        backA.setBackground(Color.WHITE);
        backA.addMouseListener(new MouseHandler());
        panelA.add(backA);

        percentA = new JButton("%");
        percentA.setForeground(Color.BLUE);
        percentA.setBackground(Color.WHITE);
        percentA.addMouseListener(new MouseHandler());
        panelA.add(percentA);

        divisionA = new JButton("/");
        divisionA.setForeground(Color.BLUE);
        divisionA.setBackground(Color.WHITE);
        divisionA.addMouseListener(new MouseHandler());
        panelA.add(divisionA);

        sevenA = new JButton("7");
        sevenA.setBackground(Color.WHITE);
        sevenA.addMouseListener(new MouseHandler());
        panelA.add(sevenA);

        eightA = new JButton("8");
        eightA.setBackground(Color.WHITE);
        eightA.addMouseListener(new MouseHandler());
        panelA.add(eightA);

        nineA = new JButton("9");
        nineA.setBackground(Color.WHITE);
        nineA.addMouseListener(new MouseHandler());
        panelA.add(nineA);

        multiplicationA = new JButton("*");
        multiplicationA.setForeground(Color.BLUE);
        multiplicationA.setBackground(Color.WHITE);
        multiplicationA.addMouseListener(new MouseHandler());
        panelA.add(multiplicationA);

        fourA = new JButton("4");
        fourA.setBackground(Color.WHITE);
        fourA.addMouseListener(new MouseHandler());
        panelA.add(fourA);

        fiveA = new JButton("5");
        fiveA.setBackground(Color.WHITE);
        fiveA.addMouseListener(new MouseHandler());
        panelA.add(fiveA);

        sixA = new JButton("6");
        sixA.setBackground(Color.WHITE);
        sixA.addMouseListener(new MouseHandler());
        panelA.add(sixA);

        subtractA = new JButton("-");
        subtractA.setForeground(Color.BLUE);
        subtractA.setBackground(Color.WHITE);
        subtractA.addMouseListener(new MouseHandler());
        panelA.add(subtractA);

        oneA = new JButton("1");
        oneA.setBackground(Color.WHITE);
        oneA.addMouseListener(new MouseHandler());
        panelA.add(oneA);

        twoA = new JButton("2");
        twoA.setBackground(Color.WHITE);
        twoA.addMouseListener(new MouseHandler());
        panelA.add(twoA);

        threeA = new JButton("3");
        threeA.setBackground(Color.WHITE);
        threeA.addMouseListener(new MouseHandler());
        panelA.add(threeA);

        addA = new JButton("+");
        addA.setForeground(Color.BLUE);
        addA.setBackground(Color.WHITE);
        addA.addMouseListener(new MouseHandler());
        panelA.add(addA);

        zeroA = new JButton("0");
        zeroA.setBackground(Color.WHITE);
        zeroA.addMouseListener(new MouseHandler());
        panelA.add(zeroA);

        zeroDA = new JButton("00");
        zeroDA.setBackground(Color.WHITE);
        zeroA.addMouseListener(new MouseHandler());
        panelA.add(zeroDA);

        dotA = new JButton(".");
        dotA.setBackground(Color.WHITE);
        dotA.addMouseListener(new MouseHandler());
        panelA.add(dotA);

        equalA = new JButton("=");
        equalA.setForeground(Color.WHITE);
        equalA.setBackground(Color.BLUE);
        equalA.addMouseListener(new MouseHandler());
        panelA.add(equalA);
    }


    public void setScientificPanel()
    {
        shift = new JButton("SHIFT");
        shift.addMouseListener(new MouseHandler());
        panelB.add(shift);

        clearB = new JButton("C");
        clearB.setForeground(Color.RED);
        clearB.setBackground(Color.WHITE);
        clearB.addMouseListener(new MouseHandler());
        panelB.add(clearB);

        backB = new JButton("<=");
        backB.setForeground(Color.BLUE);
        backB.setBackground(Color.WHITE);
        backB.addMouseListener(new MouseHandler());
        panelB.add(backB);

        percentB = new JButton("%");
        percentB.setForeground(Color.BLUE);
        percentB.setBackground(Color.WHITE);
        percentB.addMouseListener(new MouseHandler());
        panelB.add(percentB);

        divisionB = new JButton("/");
        divisionB.setForeground(Color.BLUE);
        divisionB.setBackground(Color.WHITE);
        divisionB.addMouseListener(new MouseHandler());
        panelB.add(divisionB);

        sqrt = new JButton("sqrt");
        sqrt.addMouseListener(new MouseHandler());
        panelB.add(sqrt);

        sevenB = new JButton("7");
        sevenB.setBackground(Color.WHITE);
        sevenB.addMouseListener(new MouseHandler());
        panelB.add(sevenB);

        eightB = new JButton("8");
        eightB.setBackground(Color.WHITE);
        eightB.addMouseListener(new MouseHandler());
        panelB.add(eightB);

        nineB = new JButton("9");
        nineB.setBackground(Color.WHITE);
        nineB.addMouseListener(new MouseHandler());
        panelB.add(nineB);

        multiplicationB = new JButton("*");
        multiplicationB.setForeground(Color.BLUE);
        multiplicationB.setBackground(Color.WHITE);
        multiplicationB.addMouseListener(new MouseHandler());
        panelB.add(multiplicationB);

        sin = new JButton("sin");
        sin.addMouseListener(new MouseHandler());
        panelB.add(sin);

        fourB = new JButton("4");
        fourB.setBackground(Color.WHITE);
        fourB.addMouseListener(new MouseHandler());
        panelB.add(fourB);

        fiveB = new JButton("5");
        fiveB.setBackground(Color.WHITE);
        fiveB.addMouseListener(new MouseHandler());
        panelB.add(fiveB);

        sixB = new JButton("6");
        sixB.setBackground(Color.WHITE);
        sixB.addMouseListener(new MouseHandler());
        panelB.add(sixB);

        subtractB = new JButton("-");
        subtractB.setForeground(Color.BLUE);
        subtractB.setBackground(Color.WHITE);
        subtractB.addMouseListener(new MouseHandler());
        panelB.add(subtractB);

        cos = new JButton("cos");
        cos.addMouseListener(new MouseHandler());
        panelB.add(cos);

        oneB = new JButton("1");
        oneB.setBackground(Color.WHITE);
        oneB.addMouseListener(new MouseHandler());
        panelB.add(oneB);

        twoB = new JButton("2");
        twoB.setBackground(Color.WHITE);
        twoB.addMouseListener(new MouseHandler());
        panelB.add(twoB);

        threeB = new JButton("3");
        threeB.setBackground(Color.WHITE);
        threeB.addMouseListener(new MouseHandler());
        panelB.add(threeB);

        addB = new JButton("+");
        addB.setForeground(Color.BLUE);
        addB.setBackground(Color.WHITE);
        addB.addMouseListener(new MouseHandler());
        panelB.add(addB);

        pow = new JButton("POW");
        pow.addMouseListener(new MouseHandler());
        panelB.add(pow);

        zeroB = new JButton("0");
        zeroB.setBackground(Color.WHITE);
        zeroB.addMouseListener(new MouseHandler());
        panelB.add(zeroB);

        zeroDB = new JButton("00");
        zeroDB.setBackground(Color.WHITE);
        zeroDB.addMouseListener(new MouseHandler());
        panelB.add(zeroDB);

        dotB = new JButton(".");
        dotB.setBackground(Color.WHITE);
        dotB.addMouseListener(new MouseHandler());
        panelB.add(dotB);

        equalB = new JButton("=");
        equalB.setForeground(Color.WHITE);
        equalB.setBackground(Color.BLUE);
        equalB.addMouseListener(new MouseHandler());
        panelB.add(equalB);
    }

    public void showFrame()
    {
        revalidate();
        repaint();
        setVisible(true);
    }

    public class MouseHandler extends MouseAdapter
    {
        public void mouseClicked(MouseEvent e)
        {
            if (e.getSource().equals(clearA) || e.getSource().equals(clearB))
            {
                textArea.setText("");
            }
            else if (e.getSource().equals(backA) || e.getSource().equals(backB))
            {
                textArea.setText(textArea.getText().substring(0, textArea.getText().length() - 1));
            }
            else if (e.getSource().equals(percentA) || e.getSource().equals(percentB))
            {
                textArea.setText(textArea.getText() + "%");
            }
            else if (e.getSource().equals(divisionA) || e.getSource().equals(divisionB))
            {
                textArea.setText(textArea.getText() + "/");
            }
            else if (e.getSource().equals(multiplicationA) || e.getSource().equals(multiplicationB))
            {
                textArea.setText(textArea.getText() + "*");
            }
            else if (e.getSource().equals(subtractA) || e.getSource().equals(subtractB))
            {
                textArea.setText(textArea.getText() + "-");
            }
            else if (e.getSource().equals(addA) || e.getSource().equals(addB))
            {
                textArea.setText(textArea.getText() + "+");
            }
            else if (e.getSource().equals(equalA) || e.getSource().equals(equalB))
            {
                textArea.setText(textArea.getText() + "=");
            }
            else if (e.getSource().equals(oneA) || e.getSource().equals(oneB))
            {
                textArea.setText(textArea.getText() + "1");
            }
            else if (e.getSource().equals(twoA) || e.getSource().equals(twoB))
            {
                textArea.setText(textArea.getText() + "2");
            }
            else if (e.getSource().equals(threeA) || e.getSource().equals(threeB))
            {
                textArea.setText(textArea.getText() + "3");
            }
            else if (e.getSource().equals(fourA) || e.getSource().equals(fourB))
            {
                textArea.setText(textArea.getText() + "4");
            }
            else if (e.getSource().equals(fiveA) || e.getSource().equals(fiveB))
            {
                textArea.setText(textArea.getText() + "5");
            }
            else if (e.getSource().equals(sixA) || e.getSource().equals(sixB))
            {
                textArea.setText(textArea.getText() + "6");
            }
            else if (e.getSource().equals(sevenA) || e.getSource().equals(sevenB))
            {
                textArea.setText(textArea.getText() + "7");
            }
            else if (e.getSource().equals(eightA) || e.getSource().equals(eightB))
            {
                textArea.setText(textArea.getText() + "8");
            }
            else if (e.getSource().equals(nineA) || e.getSource().equals(nineB))
            {
                textArea.setText(textArea.getText() + "9");
            }
            else if (e.getSource().equals(zeroA) || e.getSource().equals(zeroB))
            {
                textArea.setText(textArea.getText() + "0");
            }
            else if (e.getSource().equals(zeroDA) || e.getSource().equals(zeroDB))
            {
                textArea.setText(textArea.getText() + "00");
            }
            else if (e.getSource().equals(dotA) || e.getSource().equals(dotB))
            {
                textArea.setText(textArea.getText() + ".");
            }
            else if (e.getSource().equals(shift))
            {
                if (sqrt.getText().equals("sqrt"))
                {
                    sqrt.setText("log");
                    sin.setText("tan");
                    cos.setText("cot");
                    pow.setText("PI");
                    showFrame();
                }
                else
                {
                    sqrt.setText("sqrt");
                    sin.setText("sin");
                    cos.setText("cos");
                    pow.setText("POW");
                    showFrame();
                }
            }
            else if (e.getSource().equals(sqrt))
            {
                if (sqrt.getText().equals("sqrt"))
                {
                    textArea.setText(textArea.getText() + "sqrt");
                }
                else
                {
                    textArea.setText(textArea.getText() + "log");
                }
            }
            else if (e.getSource().equals(sin))
            {
                if (sin.getText().equals("sin"))
                {
                    textArea.setText(textArea.getText() + "sin");
                }
                else
                {
                    textArea.setText(textArea.getText() + "tan");
                }
            }
            else if (e.getSource().equals(cos))
            {
                if (cos.getText().equals("cos"))
                {
                    textArea.setText(textArea.getText() + "cos");
                }
                else
                {
                    textArea.setText(textArea.getText() + "cot");
                }
            }
            else if (e.getSource().equals(pow))
            {
                if (pow.getText().equals("POW"))
                {
                    textArea.setText(textArea.getText() + "^");
                }
                else
                {
                    textArea.setText(textArea.getText() + "PI");
                }
            }
            else
            {
                System.out.println("Hey");
            }
            textArea.requestFocus();
        }
    }

    public class KeyHandler extends KeyAdapter
    {
        public void keyTyped(KeyEvent e)
        {

        }
        public void keyPressed(KeyEvent e)
        {
            if (e.getKeyCode() == KeyEvent.VK_SHIFT)
            {
                if (sqrt.getText().equals("sqrt"))
                {
                    sqrt.setText("log");
                    sin.setText("tan");
                    cos.setText("cot");
                    pow.setText("PI");
                    showFrame();
                }
                else
                {
                    sqrt.setText("sqrt");
                    sin.setText("sin");
                    cos.setText("cos");
                    pow.setText("POW");
                    showFrame();
                }
            }
            else if (e.getKeyCode() == (KeyEvent.VK_C & KeyEvent.VK_ALT))
            {
                textArea.setText("");
            }
        }
        public void keyReleased(KeyEvent e)
        {

        }
    }
}

