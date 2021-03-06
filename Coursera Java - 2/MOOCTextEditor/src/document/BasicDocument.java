package document;

import java.util.ArrayList;
import java.util.List;

/** 
 * A naive implementation of the Document abstract class. 
 * @author UC San Diego Intermediate Programming MOOC team
 */
public class BasicDocument extends Document 
{
	/** Create a new BasicDocument object
	 * 
	 * @param text The full text of the Document.
	 * 
	 */
	
	
	public BasicDocument(String text)
	{
		super(text);
	}
	
	
	/**
	 * Get the number of words in the document.
	 * "Words" are defined as contiguous strings of alphabetic characters
	 * i.e. any upper or lower case characters a-z or A-Z
	 * 
	 * @return The number of words in the document.
	 */
	@Override
	public int getNumWords()
	{   int counter = 0;
		for (String s: this.getTokens("([a-zA-Z]+)")){
			//System.out.print(counter + ' ' + s);
			counter +=1;
		}
		//TODO: Implement this method.  See the Module 1 support videos 
	    // if you need help.
		if (this.getText().isEmpty()){
			return 0;
		}
		else {
		//return this.getText().split("[(( )|(.)|(,)|(!)|(0-9))]+").length;
		//return this.getText().split("([a-zA-Z]+)").length;
		return (Integer)this.getTokens("([a-zA-Z]+)").size();
		}
		
	}
	
	/**
	 * Get the number of sentences in the document.
	 * Sentences are defined as contiguous strings of characters ending in an 
	 * end of sentence punctuation (. ! or ?) or the last contiguous set of 
	 * characters in the document, even if they don't end with a punctuation mark.
	 * 
	 * @return The number of sentences in the document.
	 */
	@Override
	public int getNumSentences()
	//String[] strings = str.split("(?<=[.?!])\\s+(?=[a-zA-Z])"); \\sentences
	{
		int result = this.getText().split("([a-zA-z]+)").length;
	    //TODO: Implement this method.  See the Module 1 support videos 
        // if you need help.
        //return this.getText().split("(?<=[.?!])\\s+(?=[a-zA-Z])").length;
		if (this.getText().isEmpty()){
			return 0;
		}
		else {
			//return this.getText().split("[(|\\.|\\?|\\!)\b]+").length;
			return this.getText().split("(([\\.]+)|([\\!]+)|([\\?]+))+").length;
			
		}
	}
	
	/**
	 * Get the number of sentences in the document.
	 * Words are defined as above.  Syllables are defined as:
	 * a contiguous sequence of vowels, except for an "e" at the 
	 * end of a word if the word has another set of contiguous vowels, 
	 * makes up one syllable.   y is considered a vowel.
	 * @return The number of syllables in the document.
	 */
	@Override
	public int getNumSyllables()
	{	//aeiouy
		//if end of a word
	    //TODO: Implement this method.  See the Module 1 support videos 
        // if you need help.
		List<String> sFiltered = new ArrayList<String>();
		String rexp = "([aoueiyAOUEIY]{2,}|[eE]\\B|[auioyAUIOY]|\\b[^aueioyAUEIOY\\s]*[e]\\b)";
		if (this.getText().isEmpty()) 
			{ 
				return 0; 
			}
		else if (this.getText().length() <=2){
			return 1;
		}
		else {
		
			//return this.getText().split("[\b^aiouyeAIOUYE]+\\w").length;
			//return this.getText().split("[aeiouy]+[^e]+\\w").length;
			
			//return this.getText().split("([aeiouyAEIOUY])+|([eE$]+)").length;
			
			sFiltered = this.getTokens(rexp);
			return sFiltered.size();
			
		}
	}
	
	
	/* The main method for testing this class. 
	 * You are encouraged to add your own tests.  */
	public static void main(String[] args)
	/*
	 * String[] strArr = str.trim().split("( )+|(\\.)+|(\\!)+|([0-9])+|(\\:)+|(\\;)+|(\\...)+");\\words in a sentence
	 * String[] strings = str.split("(?<=[.?!])\\s+(?=[a-zA-Z])"); \\sentences
	 */
	{
		
		
		
		testCase(new BasicDocument("This is a test.  How many???  "
		        + "Senteeeeeeeeeences are here... there should be 5!  Right?"),
				16, 13, 5);
		
		testCase(new BasicDocument(""), 0, 0, 0);
		testCase(new BasicDocument("sentence, with, lots, of, commas.!  "
		        + "(And some poaren)).  The output is: 7.5."), 15, 11, 4);
		testCase(new BasicDocument("many???  Senteeeeeeeeeences are"), 6, 3, 2);
		/*
		testCase(new BasicDocument("voluptua"), 3, 1, 1);

		testCase(new BasicDocument("segue"), 2, 1, 1);

		testCase(new BasicDocument("double"), 1, 1, 1);

		testCase(new BasicDocument("battle"), 1, 1, 1);

		testCase(new BasicDocument("here"), 1, 1, 1);

		testCase(new BasicDocument("more"), 1, 1, 1);

		testCase(new BasicDocument("sentence"), 2, 1, 1);

		testCase(new BasicDocument("sentences"), 3, 1, 1);

		testCase(new BasicDocument("redouble"), 2, 1, 1);

		testCase(new BasicDocument("Prologue"), 3, 1, 1);

		testCase(new BasicDocument("sentence."), 2, 1, 1);

		testCase(new BasicDocument("Any"), 2, 1, 1);

		testCase(new BasicDocument("Anym"), 2, 1, 1);

		testCase(new BasicDocument("eos"), 1, 1, 1);

		testCase(new BasicDocument("mei"), 1, 1, 1);

		testCase(new BasicDocument("Mea"), 1, 1, 1);

		testCase(new BasicDocument("quo"), 1, 1, 1);

		testCase(new BasicDocument("threeeeeeeeeeeeeeeeeeeeeeeeee"), 1, 1, 1);

		testCase(new BasicDocument("be"), 1, 1, 1);

		testCase(new BasicDocument("I"), 1, 1, 1);

		testCase(new BasicDocument("oooooooooooooooooooooother"), 2, 1, 1);

		testCase(new BasicDocument("This"), 1, 1, 1);

		testCase(new BasicDocument("is"), 1, 1, 1);

		testCase(new BasicDocument("test"), 1, 1, 1);

		testCase(new BasicDocument("number"), 2, 1, 1);

		testCase(new BasicDocument("threeeeeeeeeeeeeeeeeeeeeeeeee"), 1, 1, 1);

		testCase(new BasicDocument("I"), 1, 1, 1);

		testCase(new BasicDocument("can"), 1, 1, 1);

		testCase(new BasicDocument("do"), 1, 1, 1);

		testCase(new BasicDocument("that"), 1, 1, 1);

		testCase(new BasicDocument("with"), 1, 1, 1);

		testCase(new BasicDocument("oooooooooooooooooooooother"), 2, 1, 1);

		testCase(new BasicDocument("letters"), 2, 1, 1);

		testCase(new BasicDocument("tooooooooooo"), 1, 1, 1);

		testCase(new BasicDocument("probably"), 3, 1, 1);

		testCase(new BasicDocument("the"), 1, 1, 1);
		*/
	}
	
}
