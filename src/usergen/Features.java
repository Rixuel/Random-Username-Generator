package usergen;

import java.util.Random;

class Features
{	
	private static byte SylNumChoice = 0;
	static int numSetForLimit = 0;
	private static int limit = 500;
	
	private static String aboutText = 	"Generate random usernames for fun.\n" + 
										"Generator Max Limit: " + limit;
	private static String author = "Lord Rixuel";
	private static String created = "Created: December 22th, 2012";
	private static String line = "- - - - - - - - - - - - - - - - - - - - ";
	
	static void exeGenerate()
	{
    	final StringBuilder stringb = new StringBuilder(getRandomSyllables());
    	numSetForLimit += 1;
        
        SylNumChoice = syllableNumSelected(SylNumChoice);
        generateNameToScreen(stringb, SylNumChoice);
        
        if (numSetForLimit >= limit) 
        {
        	LeftPanel.exebutton.setEnabled(false);
        }
    }
	
	private static void generateNameToScreen(StringBuilder stringb, int SylNumChoice) 
	{
    	if (numSetForLimit==1) {
    		MyTextArea.ta.setText(MyTextArea.ta.getText() + "Random Usernames Generated...\n");
    	}
    	
    	// UpperCase first letter
    	MyTextArea.ta.setText(MyTextArea.ta.getText() + " - " + numSetForLimit + ": "
                + stringb.replace(0, 1, stringb.toString().substring(0, 1).toUpperCase()));
        
    	// Better than using the loop for
    	if(SylNumChoice == 1)
    	{
    		MyTextArea.ta.setText(MyTextArea.ta.getText() 
    				+ getRandomSyllables() + "\n");
    	}
    	if (SylNumChoice == 2)
    	{
    		MyTextArea.ta.setText(MyTextArea.ta.getText() 
    				+ getRandomSyllables()
    				+ getRandomSyllables() + "\n");
    	}
    	if (SylNumChoice == 3)
    	{
    		MyTextArea.ta.setText(MyTextArea.ta.getText() 
    				+ getRandomSyllables()
		    		+ getRandomSyllables()
		    		+ getRandomSyllables() + "\n");
    	}
        
    }
	
	private static byte syllableNumSelected(byte SylNumChoice) 
	{
        if (LeftPanel.SylNum1.isSelected()) 
        {
            SylNumChoice = 1;
        } 
        else if (LeftPanel.SylNum2.isSelected()) 
        {
            SylNumChoice = 2;
        } 
        else if (LeftPanel.SylNum3.isSelected()) 
        {
            SylNumChoice = 3;
        } 
        return SylNumChoice;
    }
	private static String getRandomSyllables() 
	{
        return BottomPanel.modeSelected[randRange(BottomPanel.modeSelected.length)];
    }
    private static int randRange(int max) 
    {
        Random randomGenerator = new Random();
        return (randomGenerator.nextInt(max));
    }

	
	// Misc ------------------------------------
	
	static void about()
	{
		MyTextArea.ta.setText
			(MyTextArea.ta.getText()
            + line + '\n'
            + PanelTitle.softwareName + " " + PanelTitle.softwareVersion + '\n'
            + "Author: " + author + '\n'
            + created + '\n'
            + PanelTitle.update + '\n'
            + line + '\n'
            + aboutText + '\n'
            + line + '\n');
    }
	
	static void ascii()
	{
		MyTextArea.ta.setText
			(MyTextArea.ta.getText() + line + '\n'
            + "[ASCII TABLE]" + '\n'
            + line + '\n');
        
        for (int i = 32, j = 0; i <= 406; i++, j++)
        {
            String putzero = "";
            if (i < 100)
            {
                putzero = "0";
            }
            
            if (j >= 5)
            {
            	MyTextArea.ta.setText(MyTextArea.ta.getText() + "\n");
                j = 0;
            }
            MyTextArea.ta.setText(MyTextArea.ta.getText() + putzero + i + " [" + Character.toString ((char) i) + "]" + "\t");
        }
        MyTextArea.ta.setText(MyTextArea.ta.getText() + "\n" + line + "\n");
    }
}