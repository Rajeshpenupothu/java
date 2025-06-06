import java.util.Arrays;
public class Anagram{
    public static boolean areanagram(String str1,String str2){
        str1=str1.replaceAll("\\s","").toLowerCase();
        str2=str2.replaceAll("\\s","").toLowerCase();
        if(str1.length()!=str2.length()){
        return false;
        }

        char[] chars1=str1.toCharArray();
        char[] chars2=str2.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        return Arrays.equals(chars1,chars2);
    }
    public static void main(String args[]){
        String word1="listen";
        String word2="Silent";
        if(areanagram(word1,word2)){
            System.out.println(word1 + " and " + word2 + " are anagrams.");
        }
        else{
            System.out.println(word1 + " and " + word2 + " are not anagrams.");
    }
}}