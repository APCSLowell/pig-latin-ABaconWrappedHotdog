public class Main {
	
	public static void main(final String[] args) {
		PigLatin sim = new PigLatin();
        	//sim.tester();
    public String pigLatin(String sWord)
//precondition: sWord is a valid String of length greater than 0
//postcondition: returns the pig latin equivalent of sWord
  
{
  String firstletter = sWord.substring(0,1);
  String rest = sWord.substring(1);
  if(findFirstVowel(sWord) == -1)
  {
    return sWord + "ay";
  }
  else if(findFirstVowel(sWord) == 0){
    return sWord + "way";
    
  }else if (sWord.substring(0,2).equals("qu")){
    rest = sWord.substring(findFirstVowel(sWord));
    firstletter = sWord.substring(0,findFirstVowel(sWord)+1);
    return rest+firstletter+"ay";
  }
  
  else if(findFirstVowel(sWord) != 0){
    rest = sWord.substring(findFirstVowel(sWord));
    firstletter = sWord.substring(0,findFirstVowel(sWord));
    return rest+firstletter+"ay";
  }
 else {
    
    return "ERROR";
  }
}
	}
	public int findFirstVowel(String sWord)
//precondition: sWord is a valid String of length greater than 0.
//postcondition: returns the position of the first vowel in sWord.  If there are no vowels, returns -1
{
  for(int i = 0; i<sWord.length();i++){
    if(sWord.substring(i,i+1).equals("a")){
      return i;
    }
    if(sWord.substring(i,i+1).equals("e")){
      return i;
    }
    if(sWord.substring(i,i+1).equals("i")){
      return i;
    }
    if(sWord.substring(i,i+1).equals("o")){
      return i;
    }
    if(sWord.substring(i,i+1).equals("u")){
      return i;
    }
    
  }

  return -1;
}

}


