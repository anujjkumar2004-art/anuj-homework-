package wordcounter;
public class WordCounter 
{
    public static void main(String[] args) 
    {

        String sentence = "Java is easy";

        int charCount = sentence.replace(" ", "").length();

        String[] words = sentence.trim().split("\\s+");
        int wordCount = words.length;

        String lower = sentence.toLowerCase();

        int vowelCount = lower.length()
                - lower.replace("a", "").length()
                - lower.replace("e", "").length()
                - lower.replace("i", "").length()
                - lower.replace("o", "").length()
                - lower.replace("u", "").length();

        System.out.println("Sentence: " + sentence);
        System.out.println("Total characters (without spaces): " + charCount);
        System.out.println("Total words: " + wordCount);
        System.out.println("Total vowels: " + vowelCount);
    }
}