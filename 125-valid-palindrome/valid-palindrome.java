class Solution {
    public boolean isPalindrome(String s) {
        // Normalize the string: remove non-alphanumeric characters and convert to lowercase
        String str = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();

        // Initialize pointers
        int start = 0;
        int end = str.length() - 1;

        // Check palindrome
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false; // Mismatch found
            }
            start++;
            end--;
        }

        return true; // No mismatches found
    }
}
