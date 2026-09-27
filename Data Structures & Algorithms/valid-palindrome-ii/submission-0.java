class Solution {
    public boolean validPalindrome(String s) {
       int left = 0;
    int right = s.length() - 1;
    int tried = 0;
    while (left < right) {
      if (s.charAt(left) != s.charAt(right)) {
        System.out.println("not matching");
        System.out.println(left);
        System.out.println(right);
        if (s.charAt(left) == s.charAt(right - 1) && tried == 0 && left < right) {
          System.out.println("right");
          right--;
          tried++;
          continue;
        }
        if (s.charAt(left + 1) == s.charAt(right) && tried == 0 && left < right) {
          System.out.println("left");
          tried++;
          left++;
          continue;
        }
        return false;
      }
      left++;
      right--;
    }
    return true; 
    }
}