package usergen;


import java.awt.Color;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

@SuppressWarnings("serial")
class LeftPanel extends JPanel
{
	static JButton exebutton;
	static ButtonGroup groupSyllable;
	static JRadioButton SylNum1;
	static JRadioButton SylNum2;
	static JRadioButton SylNum3;
	
	JButton about;
	JButton ascii;

	LeftPanel()
	{
        setLayout(null);
        setBounds(2, 42, 146, 252);
        setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
        setBackground(new Color(0, 0, 0));
        
        buttons();
        options();
        add(SylNum1);
        add(SylNum2);
        add(SylNum3);
	}
	
	void buttons() 
	{		
		exebutton = new JButton("Execute");
		exebutton.setMnemonic(KeyEvent.VK_ENTER); // Shortcut: Alt + Enter
		exebutton.setFont(new Font("Arial", Font.PLAIN, 11));
		exebutton.setForeground(new Color(255, 255, 255));
		exebutton.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		exebutton.setBackground(new Color(38, 40, 44));
		exebutton.setBounds(4, 18, 138, 47);
		exebutton.setFocusPainted(false);
		
		exebutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
            	exebutton.setBackground(new Color(60, 65, 70));;
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
            	exebutton.setBackground(new Color(38, 40, 44));
            }
        });
		
		exebutton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
            	Features.exeGenerate();
            	//System.gc();
            }
        });
		
        add(exebutton);

        final JButton copySelectAll = new JButton("Copy Select All");
        copySelectAll.setFont(new Font("Arial", Font.PLAIN, 11));
        copySelectAll.setForeground(new Color(255, 255, 255));
        copySelectAll.setBorder(BorderFactory.createLineBorder(new Color(158, 230, 0))); //158, 230, 0
        copySelectAll.setBackground(new Color(38, 40, 44));//58, 130, 0
        copySelectAll.setBounds(4, 184, 138, 20);
        copySelectAll.setFocusPainted(false);
        
        copySelectAll.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
            	copySelectAll.setBackground(new Color(58, 130, 0));;
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
            	copySelectAll.setBackground(new Color(38, 40, 44));
            }
        });
        
        copySelectAll.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
            	MyTextArea.ta.requestFocusInWindow();
            	MyTextArea.ta.selectAll();
            	MyTextArea.ta.copy();
            }
        });
        
        add(copySelectAll);
        
        final JButton emptylist = new JButton("Empty List (Alt + X)");
        emptylist.setMnemonic('x'); // Shortcut: Alt + X
        emptylist.setFont(new Font("Arial", Font.PLAIN, 11));
        emptylist.setForeground(new Color(255, 255, 255));
        emptylist.setBorder(BorderFactory.createLineBorder(new Color(255, 20, 0))); //184, 20, 0
        emptylist.setBackground(new Color(38, 40, 44)); //144, 10, 0
        emptylist.setBounds(4, 209, 138, 20);
        emptylist.setFocusPainted(false);
        
        emptylist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
            	emptylist.setBackground(new Color(144, 10, 0));;
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
            	emptylist.setBackground(new Color(38, 40, 44));
            }
        });
        
        emptylist.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
            	Features.numSetForLimit = 0;
            	LeftPanel.exebutton.setEnabled(true);
            	about.setEnabled(true);
            	ascii.setEnabled(true);
            	MyTextArea.ta.setText(null);
            	//System.gc();
            }
        });
        
        add(emptylist);

        about = new JButton("About");
        about.setFont(new Font("Arial", Font.PLAIN, 11));
        about.setForeground(Color.DARK_GRAY);
        about.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
        about.setBackground(new Color(0, 10, 20));
        about.setBounds(4, 234, 68, 14);
        about.setFocusPainted(false);
        about.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
            	about.setEnabled(false);
            	Features.about();
            }
        });
        add(about);
        
        ascii = new JButton("Show ASCII");
        ascii.setFont(new Font("Arial", Font.PLAIN, 11));
        ascii.setForeground(Color.DARK_GRAY);
        ascii.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
        ascii.setBackground(new Color(0, 10, 20));
        ascii.setBounds(74, 234, 68, 14);
        ascii.setFocusPainted(false);
        ascii.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
            	ascii.setEnabled(false);
            	Features.ascii();
            }
        });
        
        add(ascii);
	}
	
	static void options()
	{
		groupSyllable = new ButtonGroup();

        SylNum1 = new JRadioButton("[1] Short Name");
        SylNum1.setMnemonic('1'); // Shortcut: Alt + 1
        SylNum1.setFont(new Font("Arial", Font.PLAIN, 11));
        SylNum1.setForeground(new Color(155, 155, 155));
        SylNum1.setBackground(new Color(20, 20, 20));
        SylNum1.setBounds(4, 85, 138, 20); //setBounds(45, 64, 31, 20);
        SylNum1.setSelected(true);
        groupSyllable.add(SylNum1);
        
        SylNum2 = new JRadioButton("[2] Medium Name");
        SylNum2.setMnemonic('2'); // Shortcut: Alt + 2
        SylNum2.setFont(new Font("Arial", Font.PLAIN, 11));
        SylNum2.setForeground(new Color(155, 155, 155));
        SylNum2.setBackground(new Color(20, 20, 20));
        SylNum2.setBounds(4, 113, 138, 20);//setBounds(75, 64, 31, 20);
        SylNum2.setSelected(false);
        groupSyllable.add(SylNum2);
        
        SylNum3 = new JRadioButton("[3] Long Name");
        SylNum3.setMnemonic('3'); // Shortcut: Alt + 3
        SylNum3.setFont(new Font("Arial", Font.PLAIN, 11));
        SylNum3.setForeground(new Color(155, 155, 155));
        SylNum3.setBackground(new Color(20, 20, 20));
        SylNum3.setBounds(4, 141, 138, 20);//setBounds(105, 64, 31, 20);
        SylNum3.setSelected(false);
        groupSyllable.add(SylNum3);
	}

}