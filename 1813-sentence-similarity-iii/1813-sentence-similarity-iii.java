class Solution {
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
        String[] words1 = sentence1.split(" ");
        String[] words2 = sentence2.split(" ");
        
        int n1 = words1.length;
        int n2 = words2.length;

        // Ensure words1 is the shorter one
        if (n1 > n2) {
            return areSentencesSimilar(sentence2, sentence1);
        }
        
        // Check matching from the start
        int i = 0;
        while (i < n1 && words1[i].equals(words2[i])) {
            i++;
        }

        // Check matching from the end
        int j = 0;
        while (j < n1 && words1[n1 - 1 - j].equals(words2[n2 - 1 - j])) {
            j++;
        }

        // If the total number of matched words from both ends is at least the length of words1,
        // then we can insert the required words in between.
        return i + j >= n1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test cases
        System.out.println(solution.areSentencesSimilar("My name is Haley", "My Haley")); // true
        System.out.println(solution.areSentencesSimilar("of", "A lot of words")); // false
        System.out.println(solution.areSentencesSimilar("Eating right now", "Eating")); // true
        System.out.println(solution.areSentencesSimilar("Hello Jane", "Hello my name is Jane")); // true
        System.out.println(solution.areSentencesSimilar("Frog cool", "Frogs are cool")); // false
    }
}
