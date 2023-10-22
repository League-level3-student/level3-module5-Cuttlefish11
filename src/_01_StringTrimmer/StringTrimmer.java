package _01_StringTrimmer;

public class StringTrimmer {

    /*
     * This method removes the specified number of characters from the right
     * side of the specified string and returns the trimmed string. 
     */
    static public String trimString(String str, int removesLeft) {
        // 1. If there are no removes left
            if(removesLeft==0) {
            // 2. Return the string
            	 return str;
            }
        // 3. Else you need to remove the last letter from the string,
        //    reduce removesLeft by 1, and then call trimString() 
            else {
            	char[] str2 =str.toCharArray();
            	str2[str2.length]
            	str2.toString();
            	 return trimString());
            	 //does not work--ARRAYS ARE IMMUTABLE
            }
       
    }
}
