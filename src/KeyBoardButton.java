import javax.swing.*;

public class KeyBoardButton extends JButton
{
    public KeyBoardButton(String input)
    {
        setText(input);
        addMouseListener(new MyMouseListener());    
    }

}
