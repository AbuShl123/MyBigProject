package CYDEO.mentoring.mentoring1308_solvingTasks;

public class ValidPin {
    /*
    Create a function that will test if a string is a valid PIN or not via a regular expression.

    A valid PIN has:

    Exactly 4 or 6 characters.
    Only numeric characters (0-9).
    No whitespace.
    Examples
    validate("121317") ➞ true

    validate("1234") ➞ true

    validate("45135") ➞ false

    validate("89abc1") ➞ false

    validate("900876") ➞ true

    validate(" 4983") ➞ false
     */

    public boolean validPIN(String pin) {
        if (pin.length() != 4 && pin.length() != 6) return false;
        // pin = "14cl2";
        char[] arr = pin.toCharArray();
        // arr = {'1', '4', 'c', 'l', '2'}
        for (char i : arr) {
            if (!Character.isDigit(i)) return false;
        }
        return true;
    }
}
