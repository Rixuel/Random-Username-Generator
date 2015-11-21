package usergen;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;


@SuppressWarnings("serial")
class MyFrame extends JFrame
{	
	MyFrame()
	{
		setTitle("Random Username Generator");
		setSize(669, 330);
		setLayout(null);
		setUndecorated(true);
		setResizable(false);
		
		// Detect User's Screen size
    	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int height = screenSize.height;
        int width = screenSize.width;
        setLocation(width/2-getSize().width/2, height/2-getSize().height/2); // Frame to middle screen.
    	//frame.setLocationRelativeTo(null); // Frame to middle screen.
		
		Container container = getContentPane();
		container.setBackground(new Color(0, 0, 0));
		
		PanelTitle paneltitle = new PanelTitle(this);
		add(paneltitle);
		
		LeftPanel leftpanel = new LeftPanel();
		add(leftpanel);
		getRootPane().setDefaultButton(LeftPanel.exebutton); // Hotkey "Enter" by default
		
		BottomPanel bottompanel = new BottomPanel();
		add(bottompanel);
		
		MyTextArea mytextarea = new MyTextArea();
		add(mytextarea);
		
		setVisible(true);
		setDefaultCloseOperation(MyFrame.EXIT_ON_CLOSE); // IMPORTANT! To end the .exe when closing window
	}
}