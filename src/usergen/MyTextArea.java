package usergen;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class MyTextArea extends JScrollPane
{	
	static JTextArea ta = new JTextArea();
	
    public MyTextArea()
	{
    	ta.setEditable(false);
    	ta.setLineWrap(true); // Text return to line, so no horizontal scrollbar
    	ta.setForeground(Color.WHITE);
    	ta.setBackground(Color.BLACK);
    	setBounds(150, 42, 517, 252);
    	setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
    	setViewportView(ta);
	}
}