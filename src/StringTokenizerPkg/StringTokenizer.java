package StringTokenizerPkg;

/**
 * These two methods split your String into different lines at the char parameter 
 * 
 * @author julia
 */
public class StringTokenizer {
    
        public static void main(String[] args) {
            //the string being manipulated
            String line = "In my opinion, Computer Science is the best!";
            StringTokenizer t = new StringTokenizer();
            
            //calling the methods
            t.tokenizeSplit(line, 'i');
            System.out.println("Space");
            t.tokenize(line, ' ');
        }
       
       //method using a string and a string array
       public static String[] tokenizeSplit(String text, char delimiter){
           String delimiterString = Character.toString(delimiter);
           String[] split = text.split(delimiterString);
           for(String splits : split){
               System.out.println(splits);
           }
           return split;
       }
       
       //method using a StringBuilder
       public static StringBuilder tokenize(String text, char delimiter){
        
        String delimiterString = Character.toString(delimiter);
        String[] myString = text.split("");
        StringBuilder thirdString = new StringBuilder();
      
        for (int i = 0; i <myString.length; i++){
           if (myString[i].equals(delimiterString)){
               thirdString.append("\n");
           }
           else {
               thirdString.append(myString[i]);
           }
        }
        System.out.println(thirdString);
        return thirdString;
    }    
}
    

