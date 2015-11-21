package usergen;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

@SuppressWarnings("serial")
class BottomPanel extends JPanel
{
	static String[] modeSelected = {};
	
	BottomPanel()
	{
		setLayout(null);
        setBounds(2, 296, 665, 32);
        setBorder(BorderFactory.createLineBorder(new Color(73, 85, 92))); //173, 185, 192
        setBackground(new Color(33, 38, 43)); //233, 238, 243
        
        add(modeSelect());
        add(fontSelect());
        add(chaos());
        add(saveToTxt());
	}	
	
	private JComboBox<String> modeSelect()
	{
    	String[] choices = { 
			"Fantasy",
			"German",
			"Greek", 
			"Japanese",
			"Korean",
			"Roman",
			"Russian",
			"Vietnamese",
			"Vulgar"
		};
    	
        final JComboBox<String> cb = new JComboBox<String>(choices);
        cb.setFont(new Font("Lucida Console", Font.PLAIN, 12));
        cb.setForeground(new Color(0, 190, 255));
        cb.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        cb.setBackground(new Color(38, 40, 44));
        cb.setBounds(3, 3, 120, 26);
        cb.setVisible(true);
        modeSelected = Syllables.fantasy;
        
        cb.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
		        if(cb.getSelectedItem() == "Fantasy")
		        {
		        	modeSelected = Syllables.fantasy;
		        }
		        else if (cb.getSelectedItem() == "German")
		        {
		        	modeSelected = Syllables.german;
		        }
		        else if (cb.getSelectedItem() == "Greek")
		        {
		        	modeSelected = Syllables.greek;
		        }
		        else if (cb.getSelectedItem() == "Japanese")
		        {
		        	modeSelected = Syllables.japanese;
		        }
		        else if (cb.getSelectedItem() == "Korean")
		        {
		        	modeSelected = Syllables.korean;
		        }
		        else if (cb.getSelectedItem() == "Roman")
		        {
		        	modeSelected = Syllables.roman;
		        }
		        else if (cb.getSelectedItem() == "Russian")
		        {
		        	modeSelected = Syllables.russian;
		        }
		        else if (cb.getSelectedItem() == "Vietnamese")
		        {
		        	modeSelected = Syllables.vietnamese;
		        }
		        else if (cb.getSelectedItem() == "Vulgar")
		        {
		        	modeSelected = Syllables.vulgar;
		        }
		        else
		        {
		        	modeSelected = Syllables.fantasy;
		        }
            }
        });
        
        return cb;
	}
	
	private static JComboBox<String> fontSelect()
	{
    	String[] choices = { 
			"Consolas",
			"Courrier New",
			"Lucida Console", 
			"Tahoma",
			"Times New Roman",
			"Verdana"
		};
    	
        final JComboBox<String> cb = new JComboBox<String>(choices);
        cb.setFont(new Font("Lucida Console", Font.PLAIN, 12));
        cb.setForeground(new Color(0, 190, 255));
        cb.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        cb.setBackground(new Color(38, 40, 44));
        cb.setBounds(133, 3, 140, 26);
        cb.setVisible(true);
        MyTextArea.ta.setFont(new Font("Consolas", Font.PLAIN, 14));
        
        cb.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
		        if(cb.getSelectedItem() == "Consolas")
		        {
		        	MyTextArea.ta.setFont(new Font("Consolas", Font.PLAIN, 14));
		        }
		        else if (cb.getSelectedItem() == "Courrier New")
		        {
		        	MyTextArea.ta.setFont(new Font("Courier New", Font.PLAIN, 15));
		        }
		        else if (cb.getSelectedItem() == "Lucida Console")
		        {
		        	MyTextArea.ta.setFont(new Font("Lucida Console", Font.PLAIN, 15));
		        }
		        else if (cb.getSelectedItem() == "Tahoma")
		        {
		        	MyTextArea.ta.setFont(new Font("Tahoma", Font.PLAIN, 14));
		        }
		        else if (cb.getSelectedItem() == "Times New Roman")
		        {
		        	MyTextArea.ta.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		        }
		        else if (cb.getSelectedItem() == "Verdana")
		        {
		        	MyTextArea.ta.setFont(new Font("Verdana", Font.PLAIN, 13));
		        }
		        else
		        {
		        	MyTextArea.ta.setFont(new Font("Consolas", Font.PLAIN, 14));
		        }
            }
        });
        
        return cb;
	}
	
	private static JButton chaos()
   	{
    	final JButton chaosbtn = new JButton("Chaos!!!");
    	chaosbtn.setFont(new Font("Verdana", Font.PLAIN, 11));
    	chaosbtn.setForeground(new Color(255, 255, 255));
    	chaosbtn.setBorder(BorderFactory.createLineBorder(new Color(180, 50, 205)));
    	chaosbtn.setBackground(new Color(38, 40, 44));
    	chaosbtn.setBounds(477, 3, 80, 26);
    	chaosbtn.setFocusPainted(false);
    	
    	chaosbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
            	chaosbtn.setBackground(new Color(70, 50, 105));;
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
            	chaosbtn.setBackground(new Color(38, 40, 44));
            }
        });
        
    	chaosbtn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
            	String input = MyTextArea.ta.getText().toString();
            	ArrayList<Character> characters = new ArrayList<Character>();
                for(char c:input.toCharArray())
                {
                    characters.add(c);
                }
                StringBuilder output = new StringBuilder(input.length());
                while(characters.size()!=0)
                {
                    int randPicker = (int)(Math.random()*characters.size());
                    output.append(characters.remove(randPicker));
                }
                
                MyTextArea.ta.setText(output.toString());
            }
        });
        return chaosbtn;
    }
	
	private static JButton saveToTxt()
   	{
    	final JButton savebtn = new JButton("Save to .txt File");
    	savebtn.setFont(new Font("Verdana", Font.PLAIN, 11));
    	savebtn.setForeground(new Color(255, 255, 255));
    	savebtn.setBorder(BorderFactory.createLineBorder(Color.GRAY));
    	savebtn.setBackground(new Color(38, 40, 44));
    	savebtn.setBounds(562, 3, 100, 26);
    	savebtn.setFocusPainted(false);
    	
    	savebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
            	savebtn.setBackground(new Color(60, 65, 70));;
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
            	savebtn.setBackground(new Color(38, 40, 44));
            }
        });
        
    	savebtn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                //action listener here
            	String fileStr = "Generated Usernames.txt";
            	
            	try 
            	{
            		JOptionPane.showMessageDialog(null, 
            			"\"" + fileStr + "\"" + 
            			" will be saved in the same directory as the program."
            			);
            		
            		// Write to a txt file.
            		String content = MyTextArea.ta.getText();
                    content = content.replaceAll("(?!\\r)\\n", "\r\n"); // For windows notepad.

                    PrintWriter out = new PrintWriter(fileStr);
                    out.println(content);
                    out.close();
            	}
            	catch (FileNotFoundException e1) 
            	{
            		e1.printStackTrace();
            		System.exit(1);
            	}

            }
        });
        return savebtn;
    }
	
}