package com.example.morseconverter;

import java.util.HashMap;

public class MorseConverter {

    private static final HashMap<Character, String> morseMap = new HashMap<>();
    private static final HashMap<String, Character> textMap = new HashMap<>();

    static {
        morseMap.put('A', ".-");
        morseMap.put('B', "-...");
        morseMap.put('C', "-.-.");
        morseMap.put('D', "-..");
        morseMap.put('E', ".");
        morseMap.put('F', "..-.");
        morseMap.put('G', "--.");
        morseMap.put('H', "....");
        morseMap.put('I', "..");
        morseMap.put('J', ".---");
        morseMap.put('K', "-.-");
        morseMap.put('L', ".-..");
        morseMap.put('M', "--");
        morseMap.put('N', "-.");
        morseMap.put('O', "---");
        morseMap.put('P', ".--.");
        morseMap.put('Q', "--.-");
        morseMap.put('R', ".-.");
        morseMap.put('S', "...");
        morseMap.put('T', "-");
        morseMap.put('U', "..-");
        morseMap.put('V', "...-");
        morseMap.put('W', ".--");
        morseMap.put('X', "-..-");
        morseMap.put('Y', "-.--");
        morseMap.put('Z', "--..");
        morseMap.put('1', ".----");
        morseMap.put('2', "..---");
        morseMap.put('3', "...--");
        morseMap.put('4', "....-");
        morseMap.put('5', ".....");
        morseMap.put('6', "-....");
        morseMap.put('7', "--...");
        morseMap.put('8', "---..");
        morseMap.put('9', "----.");
        morseMap.put('0', "-----");

        // Fill reverse map
        for (char c : morseMap.keySet()) {
            textMap.put(morseMap.get(c), c);
        }
    }

    public static String encode(String input) {
        StringBuilder result = new StringBuilder();
        for (char c : input.toUpperCase().toCharArray()) {
            if (morseMap.containsKey(c)) {
                result.append(morseMap.get(c)).append(" ");
            } else {
                result.append("? ");
            }
        }
        return result.toString().trim();
    }

    public static String decode(String morseCode) {
        StringBuilder result = new StringBuilder();
        String[] codes = morseCode.split(" ");
        for (String code : codes) {
            if (textMap.containsKey(code)) {
                result.append(textMap.get(code));
            } else {
                result.append("?");
            }
        }
        return result.toString();
    }
}
