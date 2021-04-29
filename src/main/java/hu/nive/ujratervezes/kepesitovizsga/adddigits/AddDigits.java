package hu.nive.ujratervezes.kepesitovizsga.adddigits;

public class AddDigits {

    public int addDigits(String input) {
        if (input == null || input.length() == 0) {
            return -1;
        }
        char[] letters = input.toCharArray();
        int sum = 0;
        for (char item: letters) {
            if (Character.isDigit(item)) {
                sum += Integer.parseInt(String.valueOf(item));
            }
        }
        return sum;
    }
}
