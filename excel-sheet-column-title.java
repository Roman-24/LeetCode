class Solution {

    /*
    Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.

    For example:
    A -> 1
    B -> 2
    C -> 3
    ...
    Z -> 26
    AA -> 27
    AB -> 28 
    ...
     */
    public String convertToTitle(int columnNumber) {

        final int divisor = 26;

        StringBuilder stringBuilder = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--;
            stringBuilder.append((char) ('A' + columnNumber % divisor));
            columnNumber /= divisor;
        }

        return stringBuilder.reverse().toString();
    }
}
