package usergen;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

@SuppressWarnings("serial")
class PanelTitle extends MotionPanel
{
	static String softwareName = "Random Username Generator";
    static String softwareVersion = "(Version 5.1)";
    static String update = "Last update: November 20th, 2015";

	PanelTitle(MyFrame jf)
	{
		super(jf);
		setLayout(null);//(new GridBagLayout());//new FlowLayout());
        setBounds(2, 2, 665, 38);
        setBorder(BorderFactory.createLineBorder(new Color(80, 85, 90)));
        setBackground(new Color(80, 85, 90));
        
        fontColors();
        labelInfo();
        topLeftButtons(jf);
	}
	
	private void fontColors()
	{
		JButton fontWhite = new JButton();
        fontWhite.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        fontWhite.setBackground(Color.WHITE);
        fontWhite.setBounds(345, 12, 14, 14);
        fontWhite.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
            	MyTextArea.ta.setForeground(Color.WHITE);
            }
        });
        add(fontWhite);
        
        JButton fontGreen = new JButton();
        fontGreen.setBorder(BorderFactory.createLineBorder(new Color(158, 230, 0)));
        fontGreen.setBackground(new Color(158, 230, 0));
        fontGreen.setBounds(370, 12, 14, 14);
        fontGreen.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
            	MyTextArea.ta.setForeground(new Color(158, 230, 0));
            }
        });
        add(fontGreen);
        
        JButton fontRed = new JButton();
        fontRed.setBorder(BorderFactory.createLineBorder(new Color(255, 105, 125)));
        fontRed.setBackground(new Color(255, 105, 125));
        fontRed.setBounds(395, 12, 14, 14);
        fontRed.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
            	MyTextArea.ta.setForeground(new Color(255, 105, 125));
            }
        });
        add(fontRed);
        
        JButton fontBlue = new JButton();
        fontBlue.setBorder(BorderFactory.createLineBorder(new Color(0, 190, 255)));
        fontBlue.setBackground(new Color(0, 190, 255));
        fontBlue.setBounds(420, 12, 14, 14);
        fontBlue.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
            	MyTextArea.ta.setForeground(new Color(0, 190, 255));
            }
        });
        add(fontBlue);
        
        JButton fontYellow = new JButton();
        fontYellow.setBorder(BorderFactory.createLineBorder(new Color(245, 255, 0)));
        fontYellow.setBackground(new Color(245, 255, 0));
        fontYellow.setBounds(445, 12, 14, 14);
        fontYellow.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
            	MyTextArea.ta.setForeground(new Color(245, 255, 0));
            }
        });
        add(fontYellow);
        
        JButton fontPurple = new JButton();
        fontPurple.setBorder(BorderFactory.createLineBorder(new Color(200, 150, 255)));
        fontPurple.setBackground(new Color(200, 150, 255));
        fontPurple.setBounds(470, 12, 14, 14);
        fontPurple.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
            	MyTextArea.ta.setForeground(new Color(200, 150, 255));
            }
        });
        add(fontPurple);
	}
	
	private void labelInfo()
	{
		JLabel title = new JLabel(softwareName);
        title.setFont(new Font("Verdana", Font.PLAIN, 20));
        title.setForeground(new Color(0, 190, 255));
        title.setBounds(3, 2, 320, 20);
        add(title);
        
        JLabel versionTitle = new JLabel(softwareVersion);
        versionTitle.setFont(new Font("Arial", Font.PLAIN, 11));
        versionTitle.setForeground(new Color(8, 10, 14));
        versionTitle.setBounds(5, 19, 70, 20);
        add(versionTitle);
           
        JLabel updateTitle = new JLabel(update);
        updateTitle.setFont(new Font("Arial", Font.PLAIN, 11));
        updateTitle.setForeground(new Color(8, 10, 14));
        updateTitle.setBounds(94, 19, 200, 20);
        add(updateTitle);
	}
	
	private void topLeftButtons(final JFrame jf)
	{
		final JButton minimize = new JButton("_");
		minimize.setFont(new Font("Lucida Console", Font.PLAIN, 12));
		minimize.setBorder(BorderFactory.createLineBorder(new Color(0, 50, 100)));
		minimize.setBackground(new Color(40, 40, 40));
		minimize.setForeground(new Color(255, 255, 255));
		minimize.setBounds(572, 2, 45, 20);
		minimize.setFocusPainted(false);
		
		minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
            	minimize.setBackground(new Color(100, 100, 100));;
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
            	minimize.setBackground(new Color(40, 40, 40));
            }
        });
        
		minimize.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                // Minimize program frame.
            	jf.setState(MyFrame.ICONIFIED);
            }
        });
		
        add(minimize);
        
        final JButton close = new JButton("X");
        close.setFont(new Font("Lucida Console", Font.PLAIN, 12));
        close.setBorder(BorderFactory.createLineBorder(new Color(100, 0, 0)));
        close.setBackground(new Color(40, 40, 40));
        close.setForeground(new Color(255, 255, 255));
        close.setBounds(618, 2, 45, 20);
        close.setFocusPainted(false);
        
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
            	close.setBackground(new Color(255, 55, 55));;
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
            	close.setBackground(new Color(40, 40, 40));
            }
        });

        close.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                // Close program frame.
            	System.exit(0);
            }
        });
        
        add(close);
	}
}