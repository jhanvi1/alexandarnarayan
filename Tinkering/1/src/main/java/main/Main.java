/**
 * 
 */
package main;

/**
 * @author gigatexal
 *
 */
public class Main {

	/**
	 * 
	 */
	public Main() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*String str = "This is a test of the string.   this is another sentence. this. does. work. you. know.      This is the last sentence";		
				
				
		String[] strings = str.split("(?<=[.?!])\\s+(?=[a-zA-Z])");
		
		for (String s: strings){ System.out.println(s); }
		
		*/
		
		String s = "sleepy";
		String[] s1 = s.split("([aeiouyAEIOUY])+|([eE$]+)");
		System.out.println(s1.length);
		
	}
}