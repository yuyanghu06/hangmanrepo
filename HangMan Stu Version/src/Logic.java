/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author domingodavid
 */
public class Logic {
    
    /**
     * Return an updated score if won is true.
     * updateScore(1,true)-> 2
     * updateScore(2,false)->2
     * @param score
     * @param won
     * @return the updated score
     */
    public static int updateScore(int score, boolean won){
        if (won == true) {
        	return score + 1; 
        }
    	return score;
    }
    
    /**
     * Given an existing string that keeps track of guessed letters/words
     * add the current guess to the list. If the letter already exists then don't add it.
     * addStrike("rslt","n")->"rsltn"
     * addStrike("abc","n")->"abcn"
     * @param list current list of strikes or incorrect guesses
     * @param guess current incorrect guess
     * @return the new list containing the newly made incorrect guess
     */
    public static String addStrike(String list, String guess){
//    	create variable for number of letters, use substring function to check if a letter in list equals guess. If true, don't add guess to list
    	int charnum = 1;
    	int strikes = 0;
    	while(charnum <= list.length()) {
    		if(list.substring(charnum - 1, charnum).equals(guess)) {
    			charnum++;
    			strikes+=1;
    		}
    		charnum++; 
 
    	}
    	if(strikes > 0) {
    		return list; 
    	}else{
    		return list+=guess; 
    	}
    }
    
    /**
     * Checks if the user word guess matches the word to be guessed.
     * GuessWord("test", "best")->False GuessWord("test", "TEST")->True
     * GuessWord("test", "t est")->False
     *
     * @param word
     * @param guess
     * @return
     */
    public static boolean guessWord(String word, String guess) {
    	String guessedword = guess.toLowerCase();
        if(word.equals(guessedword)) {
        	return true; 
        }else {
    		return false; 	
        }
    }
    
    /**
     * A method used to figure out if a player's guess is successful or not.
     * A guess is successful if the letter has not already been guessed and is 
     * in the word to be guessed. A guess of a letter that has already been
     * guessed will count against the player.
     * guessLetter("apcs","A_CS","A")->false
     * guessLetter("apcs","A_CS","P")->true
     * @param word the word to be guessed
     * @param curr the current displayed text to the user
     * @param guess the letter being guessed
     * @return true or false
     */
    public static boolean guessLetter(String word, String curr, String guess){
        
        return false;
    }

    /**
     * The word shown to a player for Hang-Man must be coded such that only the
     * correctly guessed letters are visible to the player. The rest of the
     * letters must be underscores __.
     *
     * This method has three parameters as described below. Given the word, the
     * current displayed text and the letter that was guessed return a new
     * version of the display word.
     *
     * @param word to be guessed
     * @param curr text shown to the player
     * @param guess letter or word guessed by the player
     * @return new version of displayed text
     */
    public static String encrypt(String word, String curr, String guess) {
        String result = "";
       
        return result;
    }
    
    /**
     * Return a version of the given string without spacing
     * You may assume that each character is followed immediately by a 
     * white space
     * withoutSpace("a b ")->"ab". 
     * withoutSpace("t _ r _ ")-> "t_r_"
     * @param str the string to be transformed
     * @return version of the string without spaces as shown above
     */
    public static String withoutSpaces(String str){
        String result = "";
       
        return result;
    }
    
    /**
     * Return a version of the string with spaces in between the letters
     * withSpaces("hi")->"h i "
     * withSpaces("apcs")-> "a p c s "
     * @param str the word to be transformed
     * @return the word with spaces as shown above
     */
    public static String withSpaces(String str){
        String result = "";
       
        return result;
    }

  
    /**
     * Return an empty string
     * @return an empty string
     */
    public static String clearText() {
        return "";
    }

    /**
     * Return a version of the string where each letter is replaced with
     * underscores (_)
     * reset("reset")->"_____";
     * reset("David")->"_____";
     * @param word the word to be transformed
     * @return a version of the word all with underscores
     */
    public static String reset(String word) {
        String result = "";
       
        return result;
    }
}
