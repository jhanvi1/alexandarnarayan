/**
 * 
 */
package main;
import java.util.regex.*;

import javax.xml.stream.events.Characters;

import java.util.*;
import java.util.stream.*;




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
		// TODO Auto-generated method stub
		//find 
		//
		String str = new String("This   string has  three and two spaces 1 2 33. ;:...");
		
		System.out.println(str);
		String[] strArr = str.trim().split("( )+|(\\.)+|(\\!)+|([0-9])+|(\\:)+|(\\;)+|(\\...)+");
		
		for (String s: strArr){
			char[] c = s.toCharArray();
			for (char l: c){
				//System.out.println(l);
			}
		}
		System.out.println(strArr.length);
		
		
		
		 
	}
	

}




























