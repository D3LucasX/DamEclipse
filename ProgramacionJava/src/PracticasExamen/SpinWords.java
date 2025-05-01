package PracticasExamen;

public class SpinWords {

	public static void main(String[] args) {
		String sentence = "Welcome my friend, this is a test";
	}
		  public String spinWords(String sentence) {
		    int caracteres = 0;
		    
		    // creates an array of words of Sentence. For each word, uses the space character as a delimiter to separate the sentence into individual words 
		    String [] words = sentence.split(" ");
		    
		    // Loop that iterates over each word
		    for(int i = 0; i < words.length; i++){
		    	
		    	//loop to count how many characters are in each word
		      for(int j = 0; j < words[i].length(); j++){
		        caracteres++;
		      }
		      
		      if (caracteres >= 5){
		    	  
		    	  // StrinBuilder to create a variable to save the SpinWord
		        StringBuilder intermedio = new StringBuilder();
		        
		        // loop to save char per char the spinWord in the stringBuilder variable.
		        for (int k = words[i].length()-1; k >= 0; k--){
		          intermedio.append(words[i].charAt(k));
		        }
		        
		        // We save the SpinWord in the same position
		        words[i] = intermedio.toString();
		    }
		      caracteres = 0;
		  }
		    // then join the words again to create a String again.
		    String sentenceNew = String.join(" ", words);
		    return sentenceNew;
		}
}
