import java.util.Arrays;
import java.util.HashMap;   
  
/*
 * Java Program to find unique alphabets in an array | HashMap
 * 
 */
class AlphabetsHM {   
    
    public static void main(String args[]) {   
    	// TODO Auto-generated method stub
    	
    	//Declare array of alphabets
        char al[] = {'c', 'a', 'c', 't', 'r', 'a', 'z'};
        
        //Display array
        System.out .println ("Alphabets: " + Arrays.toString(al));
        
        //creating a HashMap 
        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();   
       
        for (int i = 0; i < al.length; i++) {   
            hm.put(al[i], i);   
        }   
        
        System.out.println("Unique Alphabets: " + hm.keySet());   
    
    }   
}//End of Class