import java.util.Scanner;

/**
 * Checks whethr a given word contains only unique characters.
 */
public class App {
        public static void main(String[] args) throws Exception {
                System.out.println("Hello, World!");

                Scanner input = new Scanner(System.in);

                System.out.print("please enter a word >");

                if (input.hasNext()) {
                        String word = input.next();
                        word.trim();
                        isUnique(word);
                }

                input.close();
        }

        /**
         * Checks if the word contains only unique characters
         * @param word
         * @return boolean true if all words are unique
         */
        public static boolean isUnique(String word) {
                int startIndex = 0;
                final int END_INDEX = word.length();
                // compares each letter in word to all letters afterwards.
                for (int i = startIndex; i < END_INDEX - 1; i++) {
                        for (int j = i + 1; j < END_INDEX; j++) {
                                System.out.println(word.charAt(i) + " -> " + word.charAt(j));
                                if (word.charAt(i) == word.charAt(j)) {
                                        System.out.println("match found! word is not unique");
                                        return false;
                                }
                        }
                }
                System.out.println("match NOT found! word is unique");
                return true;
        }
}
