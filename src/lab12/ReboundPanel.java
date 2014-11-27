package lab12;

//*********************************************************************
//ReboundPanel.java Author: Lewis/Loftus
//
//Represents the primary panel for the Rebound program.
//*********************************************************************
import java.awt.*;
import java.awt.event.*;
import javax. swing. *;
public class ReboundPanel extends JPanel
{
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private final int WIDTH = 300, HEIGHT = 300;
    private final int DELAY = 10, IMAGE_SIZE = 100;
    private ImageIcon image;
    private ImageIcon image2;
    private Timer timer;
    private int x, y, moveX, moveY;
    private int x2, y2, moveX2, moveY2;
    //------------------------------------------------------------------
    //Sets up the panel, including the timer for the animation.
    //------------------------------------------------------------------
    public ReboundPanel()
    {
        timer = new Timer(DELAY, new ReboundListener());
        image = new ImageIcon ("happyFace100.gif");
        image2 = new ImageIcon("asianDad100.gif");
        x = 0;
        y = 40;
        x2 = WIDTH - IMAGE_SIZE - 10;
        y2 = 40;
        moveX = moveY = 3;
        moveX2 = 2;
        moveY2 = 1;
        setPreferredSize (new Dimension(WIDTH, HEIGHT));
        setBackground (Color.black);
        timer.start();
    }
    //-----------------------------------------------------------------
    //Draws the image in the current location.
    //-----------------------------------------------------------------
    public void paintComponent (Graphics page)
    {
        super.paintComponent (page);
        image.paintIcon (this, page, x, y);
        image2.paintIcon (this, page, x2, y2);
    }
    //******************************************************************
    //Represents the action listener for the timer.
    //******************************************************************
    private class ReboundListener implements ActionListener
    {
        //--------------------------------------------------------------
        //Updates the position of the image and possibly the direction
        //of movement whenever the timer fires an action event.
        //--------------------------------------------------------------
        public void actionPerformed (ActionEvent event)
        {
        x += moveX;
        y += moveY;
        x2 += moveX2;
        y2 += moveY2;
        if (x <= 0 || x >= WIDTH-IMAGE_SIZE)
        moveX = moveX * -1;
        if (y <= 0 || y >= HEIGHT-IMAGE_SIZE)
        moveY = moveY * -1;
        if (x2 <= 0 || x2 >= WIDTH-IMAGE_SIZE)
        moveX2 = moveX2 * -1;
        if (y2 <= 0 || y2 >= HEIGHT-IMAGE_SIZE)
        moveY2 = moveY2 * -1;
        repaint();
        }
    }
}