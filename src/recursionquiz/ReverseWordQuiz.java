/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package recursionquiz;

/**
 *
 * @author keyew7019
 */
public class ReverseWordQuiz {
    
    String reverseString(String word){
        
        int length = word.length();
        if (word.length() <= 1) {
            return word;
        }else
            
            if (word.length() > 1) {
                
               return word.substring(length-1) + reverseString(word.substring(0, length - 1));
                
            }
        return word;
        
    }
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ReverseWordQuiz test = new ReverseWordQuiz();
        
        System.out.println(test.reverseString("cat"));
        
    }
}
