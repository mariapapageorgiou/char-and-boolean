package com.mariageorgepapas;

public class Main {

    public static void main(String[] args) {

        char myChar = 'D';
        char myUnicodeChar = '\u0044';
        System.out.println(myChar);
        System.out.println(myUnicodeChar);

        char myCopyrightChar = '\u00A9';
        System.out.println(myCopyrightChar);

        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;

        boolean isCustomerOverTwentyOne = true; // we use the word is and then a question to make it very intuitive
                                                // as to what that variable is actually tracking, in this case the
                                                // over 21 age.
    }
}
