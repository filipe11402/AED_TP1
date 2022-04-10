import java.util.HashMap;

import javafx.util.Pair;

public class Entrypoint{
    public static void main(String[] args){
        String actual = "123456789";
        String expected = "987654321";

        System.out.println(customStringOrderer(actual, expected));
    }

    public static Pair<String, Integer> customStringOrderer(String actual, String desired){
        HashMap<Character, Integer> dict = new HashMap<>();
        int totalPlays = 0;


        char[] sortedArray = new char[desired.length()];

        for(int i = 0;i < desired.toCharArray().length;i++){
            totalPlays++;
            dict.put(desired.charAt(i), i);
        }

        for(char item: actual.toCharArray()){
            sortedArray[dict.get(item)] = item;
        }

        StringBuilder sb = new StringBuilder(desired.length());
        for(char item: sortedArray){ sb.append(item); }

        return new Pair<String,Integer>(sb.toString(), totalPlays);
    }
}