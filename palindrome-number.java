class Solution {

    public boolean isPalindrome(int x) {

        if (x < 0)
            return false;
        else if (x >= 0 && x <= 9)
            return true;
        else {
            String integer = String.valueOf(x);
            int i = 0, j = integer.length() - 1;

            while (i < j) {
                
                if (integer.charAt(i) != integer.charAt(j))
                    return false;

                i++;
                j--;
            }
            return true;
        }
    }
}
