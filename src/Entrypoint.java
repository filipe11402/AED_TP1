public class Entrypoint{
    public static void main(String[] args){
        String actual = "123456789";
        String expected = "987654321";

        customStringOrderer(actual, expected);
    }

    public static String customStringOrderer(String actual, String desired){
        int totalPlays = 0;

        char[] sortedArray = actual.toCharArray();

        for(int i = 0;i < desired.length();i++){
            char temp;
            if(sortedArray[i] != desired.charAt(i)){
                totalPlays++;
                temp = sortedArray[i];
                sortedArray[i] = desired.charAt(i);

                sortedArray[desired.indexOf(temp)] = temp;

                System.out.println(new String(sortedArray));
            }
        }

        System.out.println("Original String: " + actual + "\n" + "Output: " + desired + "\n");
        System.out.println("Total needed movements: " + totalPlays);

        return new String(sortedArray);
    }
}