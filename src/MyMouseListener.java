import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class MyMouseListener implements MouseListener
{
    @Override
    public void mouseClicked(MouseEvent e)
    {
        System.out.println("Clicked" + e);
    }

    @Override
    public void mousePressed(MouseEvent e)
    {
        System.out.println("Pressed" + e);
    }

    @Override
    public void mouseReleased(MouseEvent e)
    {
        System.out.println("Released" + e);
    }

    @Override
    public void mouseEntered(MouseEvent e)
    {
        System.out.println("Entered" + e);
    }

    @Override
    public void mouseExited(MouseEvent e)
    {
        System.out.println("Exited" + e);
    }
}
