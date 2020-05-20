package com.companyx.interview;

/**
 * @author akadir
 * Date: 15.05.2020
 * Time: 17:32
 */
public class Interview {

    public static void main(String[] args) {
        String text = "ankara";

        CharacterCount c = getCharacterCount(text, "a");

        System.out.println(c.getS() + " - " + c.getCount());
    }

    public static CharacterCount getCharacterCount(String text, String charToCheck) {
        if (text == null || text.trim().isEmpty()) {
            return new CharacterCount(charToCheck);
        }

        CharacterCount charCount = new CharacterCount(charToCheck);

        for (int i = 0; i < text.length(); i++) {
            if (text.substring(i, i + 1).equalsIgnoreCase(charToCheck)) {
                charCount.incrementCount();
            }
        }


        return charCount;
    }
}
