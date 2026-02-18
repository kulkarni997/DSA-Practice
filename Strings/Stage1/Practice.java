package Strings.Stage1;

public class Practice {
    //Reverse a String
    public static void ReverseString(String s){
        String b = "";

        for(int i=s.length()-1; i>=0; i--){
            char ch = s.charAt(i);
            String ch1 = Character.toString(ch);
            b=b.concat(ch1);
        }
        System.out.println("The reversed String is " +b);
    }
    //Stringbuilder reversing string
    public static void ReverseStringBuilder(String s){
        StringBuilder sb = new StringBuilder();

        for(int i= s.length()-1; i>=0; i--){
            sb.append(s.charAt(i));
        }
        System.out.println("The reversed string is " +sb);
    }

    public static boolean Palindrome(String s){
        for(int i=0; i<s.length()/2; i++){
            int n = s.length();

            if(s.charAt(i) != s.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }

    //counting vowels in a string
    public static int CountVowels(String s){
        int count=0;
        s=s.toLowerCase();

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'a' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'e' || s.charAt(i) == 'u'){
                count++;
            }
        }
        return count;
    }

     //counting consonants in a string
    public static int CountConsonants(String s){
        int count=0;
        s=s.toLowerCase();

        for(int i=0; i<s.length(); i++){
            if((s.charAt(i) >='a' && s.charAt(i)<='z') && 
            (s.charAt(i) != 'a' && s.charAt(i) != 'i' && s.charAt(i) != 'o' && s.charAt(i) != 'e' && s.charAt(i) != 'u')){
                count++;
            }
        }
        return count;
    }

    public static int countDigits(String s){
        int count=0;

        for(int i=0; i<s.length(); i++){
            if(Character.isDigit(s.charAt(i))){
                count++;
            }
        }
        return count;
    }



    public static void main(String[] args) {
        String s;
        ReverseString("Srushti");
        ReverseString("Hellowww");
        System.out.println(Palindrome("hello"));
        System.out.println(CountVowels("wowie"));
        System.out.println(CountConsonants("Srushti"));
        System.out.println(countDigits("srushti28"));
    }
}
