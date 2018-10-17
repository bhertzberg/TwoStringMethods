public class TwoStringMethods {
    public static void main(String[] args) {
        System.out.println(abcTest(".abc123"));
        System.out.println(alternateStrings("banananana", "Noodle"));
    }

    public static boolean abcTest(String text){
        String letter1 = "";
        String letter2 = "";
        String letter3 = "";
        for (int i = 0; i < text.length()-2; i++) {
            letter1 = text.substring(i, i +1);
            letter2 = text.substring(i+1, i +2);
            letter3 = text.substring(i+2, i +3);
            if(letter1.equals("a") && letter2.equals("b") && letter3.equals("c")){
                if(i == 0 ){
                    return true;
                }else if (text.substring(i-1, i ).equals(".")){
                    return false;
                }else{
                    return true;
                }
            }
        }
        return false;
    }

    public static String alternateStrings(String str1, String str2){
        int maxLength = Math.max(str1.length(), str2.length());
        String str1Letter = "";
        String str2Letter = "";
        String finalPhrase = "";
        for (int i = 0; i < maxLength; i++) {
            if(i < str1.length()){
                str1Letter = str1.substring(i, i +1);
                finalPhrase+= str1Letter;
            }
            if(i < str2.length()){
                str2Letter = str2.substring(i, i +1);
                finalPhrase+= str2Letter;
            }
        }
        return finalPhrase;
    }
}
