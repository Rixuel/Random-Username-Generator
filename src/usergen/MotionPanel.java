package usergen;

import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

//import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 * MotionPanel
 * @author http://stackoverflow.com/users/1097600/sorter
 */
public class MotionPanel extends JPanel {
    /**
	 * Generated serialVersionUID by Eclipse.
	 */
	private static final long serialVersionUID = -7020154783870313675L;
	private Point initialClick;
    //private Frame parent;

    public MotionPanel(final MyFrame parent){
    //this.parent = parent;

    addMouseListener(new MouseAdapter() {
        public void mousePressed(MouseEvent e) {
            initialClick = e.getPoint();
            getComponentAt(initialClick);
        }
    });

    addMouseMotionListener(new MouseMotionAdapter() {
        @Override
        public void mouseDragged(MouseEvent e) {

            // get location of Window
            int thisX = parent.getLocation().x;
            int thisY = parent.getLocation().y;

            // Determine how much the mouse moved since the initial click
            int xMoved = (thisX + e.getX()) - (thisX + initialClick.x);
            int yMoved = (thisY + e.getY()) - (thisY + initialClick.y);

            // Move window to this position
            int X = thisX + xMoved;
            int Y = thisY + yMoved;
            parent.setLocation(X, Y);
        }
    });
    }
}