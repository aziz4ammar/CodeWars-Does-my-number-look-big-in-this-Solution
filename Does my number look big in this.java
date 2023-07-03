public class NumberUtils {

    public static boolean isNarcissistic(int number) {
        String strNumber = String.valueOf(number);
        int length = strNumber.length();
        int sum = 0;

        for (int i = 0; i < length; i++) {
            int digit = Character.getNumericValue(strNumber.charAt(i));
            sum += Math.pow(digit, length);
        }

        return sum == number;
    }

}