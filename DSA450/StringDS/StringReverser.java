package StringDS;

public class StringReverser {
        public static String reverse(String str, int index) {
            if (index >= str.length()) {
                // Base case: if the index is greater than or equal to the length of the string, return an empty string
                return "";
            } else {
                // Recursive case: if the index is less than the length of the string,
                // call the reverse() method again, passing in the string and the next index
                return reverse(str, index + 1) + str.charAt(index);
            }
        }

        public static String reverse(String str) {
            // Call the reverse() method, passing in the string and an initial index of 0
            return reverse(str, 0);
        }

        public static void main(String args[]){
            String reversed = StringReverser.reverse("hello");  // "olleh"
        }
}
