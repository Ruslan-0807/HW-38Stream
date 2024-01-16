import java.util.Arrays;

public class LongestWords {
    public static void main(String[] args) {
        String [] words = {"red","white", "blue", "yellow", " black"};
        String longestWord = Arrays.stream(words)
                .max((s1,s2) -> Integer.compare(s1.length(),s2.length()))
                .orElseThrow();
        System.out.println(longestWord);
                    }
                }
