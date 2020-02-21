/*
 * Program to calculate maximum character sub sequence in a string
 */

package interview.questions;

public class MaxCharSubsequence {

	public static void main(String[] args) {
		
		//int charCount = maxCharSubsequence("    ");
	    //int charCount = maxCharSubsequence("hoopla");
		int charCount = maxCharSubsequence("abbCCCddBBB");
	    //int charCount = maxCharSubsequence("abbCCCddBBBxxxxXX");
		
		System.out.println("Count: "+charCount);
	}
	
	public static int maxCharSubsequence(String str) {
		int count = 0;
	    int repeatCount = 1;
	    int strLength = str.trim().length();

	    if(strLength > 0){
	      for(int i=0; i<strLength; i++){
	        if((i < strLength-1) && (str.charAt(i) == str.charAt(i+1))){
	        	// System.out.println(str.charAt(i) +" <-> "+str.charAt(i+1));
	        	repeatCount++;
	        }else{
	          if(repeatCount > count){
	            count = repeatCount;
	            repeatCount = 1;
	          }else {
	        	  repeatCount = 1;
	          }
	        }
	      }
	    }
	    return count;
	}

}
