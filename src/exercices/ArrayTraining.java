public class ArrayTraining {

    /**
     * @param n size of the array, eg: 3
     * @return an empty int array of size n, eg: {0, 0, 0}
     */
    public int[] emptyIntArray(int n) {
    	int[] intArray = new int[n];
        return intArray;
    }

    /**
     * @param n size of the array, eg: 2
     * @return an empty String array of size n, eg: {null, null}
     */
    public String[] emptyStringArray(int n) {
    	String[] stringArray = new String[n];
        return stringArray;
    }

    /**
     * @param a first value, eg: 3
     * @param b second value, eg: 2
     * @param c third value, eg: 1
     * @return an int array with a, b and c values, eg: {3, 2, 1}
     */
    public int[] intArray(int a, int b, int c) {
    	int[] intArray = new int[] {a, b, c};
        return intArray;
    }

    /**
     * @param a first value, eg: "test"
     * @param b second value, eg: "sample"
     * @param c third value, eg: "value"
     * @return an int array with a, b and c values,
     * eg: {"test", sample", "value"}
     */
    public String[] stringArray(String a, String b, String c) {
    	String[] stringArray = new String[] {a, b, c};
    	return stringArray;
    }

    /**
     * @param array, eg: {1, 2, 3}
     * @return length of the array, eg: 1
     */
    public int length(int[] array) {
    	int lengthArray =  array.length;
        return lengthArray;
    }

    /**
     * @param array, eg: {3, 2, 1}
     * @return first value of the array, eg: 3
     */
    public int firstValue(int[] array) {
    	int firstArray =  array[0];
        return firstArray;
    }

    /**
     * @param array, eg: {3, 2, 1}
     * @return last value of the array, eg: 1
     */
    public int lastValue(int[] array) {
    	int lengthArray =  array.length-1;
    	int lastArray =  array[lengthArray];
        return lastArray;
    }

    /**
     * @param array,    eg: {3, 2, 1}
     * @param position, eg: 1
     * @return value of the array at position, eg: 2
     */
    public int valueAtPosition(int[] array, int position) {
    	int positionArray =  array[position];
        return positionArray;
    }

    /**
     * @param array,    eg: {3, 8, 5}
     * @param value,    eg: 4
     * @param position, eg: 1
     * @return the array with the value replaced at position, eg: {3, 4, 5}
     */
    public int[] replace(int[] array, int value, int position) {
    	array[position] = value;
        return array;
    }

    /**
     * @param array, eg: {1, 2, 3}
     * @return sum of values of the array, eg: 6
     */
    public int sum(int[] array) {
    	int countNb = 0;
    	for (int i = 0; i<array.length; i++) {
    		int nb = array[i];
    		countNb = countNb+nb;
    	}
        return countNb;
    }

    /**
     * @param array,  eg: {1, 2, 3}
     * @param search, eg: 2
     * @return if array contains searched value, eg: true
     */
    public boolean contains(int[] array, int search) {
    	boolean cestTrue = false;
    	for (int i = 0; i<array.length; i++) {
    		if (search == array[i]) {
    			cestTrue = true;
        	}
    	}
        return cestTrue;
    }

    /**
     * @param array, eg: {"sample", "value"}
     * @return array where all words are capitalized, eg: {"Sample", "Value"}
     */
    public String[] capitalize(String[] array) {
    	for (int i = 0; i<array.length; i++) {
    		array[i] = array[i].substring(0, 1).toUpperCase() + array[i].substring(1);
    	}
        return array;
    }

    /**
     * @param first,  eg: {1, 2, 3}
     * @param second, eg: {3, 2, 1}
     * @return if values in first and second arrays, in the same position,
     * are equals, eg: false
     */
    public boolean equals(int[] first, int[] second) {
    	if (first.length == second.length) {
    		boolean present = false;
    		for (int i = 0; i<first.length; i++) {
    			int essaiUn = first[i];
    			int essaiDeux = second[i];
    			if(essaiUn == essaiDeux) {
    	        	present = true;
    	        	break;
    	        }
    		}
    		if (present){
    	    	return true;
    	    }else {
    	    	return false;
    	    }
    	}else {
	    	return false;
	    }
    }

    /**
     * @param array, eg: {1, 2, 3}
     * @return array with reversed values, eg: {3, 2, 1}
     */
    public int[] reverse(int[] array) {
    	for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp; 
        } 
    	return array;
    }

    /**
     * @param first,  eg: {1, 2, 3}
     * @param second, eg: {4, 5}
     * @return concatenates first and second values in one array,
     * eg: {1, 2, 3, 4, 5}
     */
    /*
     int[] first = {3, 6, 5};
     int[] second = {2, 7};
     int[] expected = {3, 6, 5, 2, 7};
            */
    public int[] concat(int[] first, int[] second) {
    	int tailleUn = first.length;//3
    	int tailleDeux = second.length;//2
    	int taille = tailleUn + tailleDeux; //5
    	int[] expected = new int[taille]; // new int[5] = {0,1,2,3,4}
    	
    	for(int i = 0; i<taille; i++) {
    		if(i<tailleUn) {
    			expected[i] = first[i];
    		}else {
    			expected[i] = second[i-tailleUn];
    		}
    	}
    	return expected;
    }
}
    	/*
    	 *  Object[] originalArray = new Object[5];   
			Object[] largerArray = Arrays.copyOf(originalArray, 10);
    	 */
    	/*// Test routine for resizeArray().
			public static void main (String[] args) {
			   int[] a = {1, 2, 3};
			   a = (int[])resizeArray(a, 5);
			   a[3] = 4;
			   a[4] = 5;
			   for (int i=0; i<a.length; i++)
			      System.out.println(a[i]); }
			*/
    	
    	
    	
    	
    	
    	
    	/*for(int i = 0; i<expected.length; i++) {
    		if(i<tailleUn) {
    			expected[i] = first[i];
    		}else {
    			expected[i] = second[i];
    		}
    	}*/
       
