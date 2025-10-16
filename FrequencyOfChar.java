package String;
// FrequencyOfChar , RepeatedCharater , nonRepeatedcharacter are same logic
public class FrequencyOfChar {
    public static void main(String[] args) {
        String str = "java program";
        
        // Convert the string to a character array
        char[] ch = str.toCharArray();
        
        // Iterate over each character in the string
       for (int i = 0; i < ch.length; i++)
       {
            // Skip spaces and already processed characters
            if (ch[i] == ' ' || ch[i] == '0') {
                continue;
            }       
            // Initialize frequency counter
            int count = 1;   
            // Count occurrences of the current character
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    count++;
                    // Mark the character as processed
                    ch[j] = '0'; // Avoid counting it again
                }
          }
            
            // Print the frequency of the current character
            System.out.println(ch[i] + " has a frequency of " + count);
        }
    }
}
