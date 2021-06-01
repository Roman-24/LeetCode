class Solution {

    public int reverse(int x) {

        String integerString = String.valueOf(x);

        StringBuilder sb = new StringBuilder();
        sb.append(integerString);

        if (x < 0) {

            String[] splitString = integerString.split("-");
            StringBuilder sbTemp = new StringBuilder();

            sbTemp = (sbTemp.append(splitString[1])).reverse();

            sb = new StringBuilder();
            sb.append("-");
            sb.append(sbTemp);
            integerString = sb.toString();

        } else {
            integerString = sb.reverse().toString();
        }


        try {
            return Integer.parseInt(integerString);
        } catch (Exception e) {
            return 0;
        }

    }
}
