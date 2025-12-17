package TwoPointers;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        String str = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        System.out.println("After regex---------------->     " + str);
        boolean result = isPalindrome(str);
        System.out.println("Is the string a valid palindrome? " + result);
    }
    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
//            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
//                left++;
//            }
//            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
//                right--;
//            }

//            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
//                return false;
//            }

            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }
        return true;
    }
}
