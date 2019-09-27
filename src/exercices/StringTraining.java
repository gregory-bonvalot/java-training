public class StringTraining {

    /**
     @param firstname, ie : "Brandon"
     @return a string that concatenates "Hello " and firstname, ie : "Hello Brandon"
     */
    public static String helloFirstname(String firstname) {
    	
    	//firstname = "Brandon";
        return "Hello " + firstname;
    }

    /**
     * @param first  word, ie : "test"
     * @param second word, ie : "value"
     * @return a string with both word, ie : "testvalue"
     */
    public static String concatArgs(String first, String second) {
    	//first = "sample";
    	//second = "test";
        return first + second;
    }

    /**
     * @param origin  string, eg: "test"
     * @param compare string, eg: "sample"
     * @return if origin string is equal to compare string
     */
    public static boolean equals(String origin, String compare) {
    	/*origin = "test";
    	compare = "sample";*/
        return origin.equals(compare);
    }

    /**
     * @param value character, eg: 't'
     * @return conversion of the character into String, eg: "t"
     */
    public static String charToString(char value) {
    	//value = 't';
    	//String t=Character.toString(value);
        return Character.toString(value);
    }

    /**
     * @param value integer, eg: 3
     * @return convertion of the integer into String, eg: "3"
     */
    public static String intToString(int value) {
    	//value = 3;
    	//String trois = Integer.toString(value);
        return Integer.toString(value);
    }

    /**
     * @param string, eg: "test"
     * @return string length, eg: 4
     */
    public static int length(String string) {
    	//string = "test";
        return string.length();  
    }

    /**
     * @param string, ie "test"
     * @return string in upper case, eg: "TEST"
     */
    public static String upper(String string) {
    	//string = "test";
        return string.toUpperCase();
    }

    /**
     * @param string, eg: "TEST"
     * @return string in lower case, eg: "test"
     */
    public static String lower(String string) {
    	//string = "TEST";
        return string.toLowerCase();
    }

    /**
     * @param string, eg: "test"
     * @return first character of the string, eg: 't'
     */
    public static char firstChar(String string) {
    	//string = "test";
       // return string.length(0);
        return string.charAt(0);
    }

    /**
     * @param string, eg: "value"
     * @return last character of the string, eg: 'e'
     */
    public static char lastChar(String string) {
    	//string = "value";
    	int longueur = string.length() ;
        return string.charAt(longueur - 1);
    }

    /**
     * @param string, eg: "test"
     * @param begin   position (inclusive) of the substring, eg: 1
     * @param end     postion (exclusive) of the substring, eg: 3
     * @return the substring from begin position to end position, eg: "es"
     */
    public static String subString(String string, int begin, int end) {
        // https://howtodoinjava.com/java/string/java-string-substring-example/
    	/*string = "test";
    	begin = 1;
    	end = 3;*/
        return string.substring(begin, end);
    }

    /**
     * @param string, eg: "test"
     * @return the string with the first character in upper case, eg: "Test"
     */
    public static String capitalize(String string) {
    	//string = "test";
    	/*string.toUpperCase(0);*/
    	String cap = string.substring(0, 1).toUpperCase() + string.substring(1);
        return cap;
    }

    /**
     * @param string, eg: "test"
     * @param search  character, eg: 't'
     * @return the number of character occurrences in string, eg: 2
     */
    public static int occurrences(String string, char search) {
    	/*string = "test";
    	search = 't';*/
    	int nombreLettre = 0;
    	//string.charAt(0)
    	for (int i= 0; i<string.length(); i++) {
    		if (string.charAt(i) == search) {
    			nombreLettre++ ;
    		}
    	}
    	//int count = StringUtils.countMatches("elephant", "e");
        return nombreLettre;
    }

    /**
     * @param string,  eg: "test"
     * @param search,  eg: 't'
     * @param replace, eg: 'w'
     * @return the string where searched characters are replaced, eg: "wesw"
     */
    public static String replaceChar(String string, char search, char replace) {
    	/*string = "test";
    	search = 't';
    	replace = 'w';*/
    	String remplace = string.replace(search, replace);
        return remplace;
    }

    /**
     * @param string,  eg: "test"
     * @param search,  eg: "e"
     * @param replace, eg: "oa"
     * @return the string where searched substring are replaced, eg: "toast"
     */   //sxhtle
    public static String replaceString(String string, String search, String replace) {
    	/*string = "test";
    	search = "e";
    	replace = "oa";*/
    	String remplace = string.replace(search, replace);
        return remplace;
    }

    /**
     * @param string,    eg: "test|value"
     * @param delimiter, eg: "|"
     * @return string array that contains values splited on the delimiter, eg: {"test", "value"}
     */
    public static String[] split(String string, String delimiter) {
        // https://howtodoinjava.com/java/string/java-string-split-example/
    	/*string = "test|value";
    	delimiter = "|";*/
    	String[] stringArray = string.split(delimiter);
        return stringArray;
    }

    /**
     * @param strings    array, eg: {"test", "value"}
     * @param delimiter, eg: ";"
     * @return string of array values joined with the delimiter, ex: "test;value"
     */
    public static String join(String[] strings, String delimiter) {
        // https://howtodoinjava.com/java8/java-8-join-string-array-example/
    	/*strings[0] = "test";
    	strings[1] = "value";
    	delimiter = ";";*/
    	String joinedString = String.join(delimiter, strings);
    	
        return joinedString;
    }
}
