package String;
public class CapitalizeEachWord {
    public static void main(String[] args) {
        String sentence = "hello world, this is a test sentence";
        // Split the sentence into words
        String[] words = sentence.split(" ");
        // StringBuilder to build the resulting sentence
        StringBuilder capitalizedSentence = new StringBuilder();
        // Process each word
        for (String word : words) {
            if (word.length() > 0) {
                // Capitalize the first letter of the word
                String capitalizedWord = word.substring(0, 1).toUpperCase() + word.substring(1);
                // Append the capitalized word to the StringBuilder
                capitalizedSentence.append(capitalizedWord).append(" ");
            }
        }
        // Convert StringBuilder to String and trim any trailing space
        String result = capitalizedSentence.toString().trim();
        // Print the result
        System.out.println("Original Sentence: " + sentence);
        System.out.println("Capitalized Sentence: " + result);
    }
}
