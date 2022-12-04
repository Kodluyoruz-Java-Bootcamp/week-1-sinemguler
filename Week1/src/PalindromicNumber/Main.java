package PalindromicNumber;

public class Main {
    public static void main(String[] args) {
        int palindromicNumber, nonPalindromicNumber;
        String straight, reverse;
        for (palindromicNumber = 10; palindromicNumber < 100; palindromicNumber++) {
            straight = Integer.toString(palindromicNumber);
            reverse = "";
            for (nonPalindromicNumber = straight.length() - 1; nonPalindromicNumber >= 0; nonPalindromicNumber--) {
                reverse += straight.charAt(nonPalindromicNumber);
            }
            if (straight.equals(reverse))
                System.out.println(palindromicNumber  +  " Bir palindromik sayıdır");

        }
    }
}
