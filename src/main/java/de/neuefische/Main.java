package de.neuefische;

public class Main {
    public static void main(String[] args) {
    }
/*Aufgabe: Schreibe eine Funktion, die einen Buchstaben-String (abcXYZ) als Eingabeparameter entgegennimmt
  und als Ausgabestring die einzelnen Buchstaben um 3 Stellen nach rechts verschoben zurückgibt (defABC).*/

    public static String verschobenerString(String eingabe) {
        StringBuilder ausgabe = new StringBuilder();
        for (int i = 0; i < eingabe.length(); i++) {
            char buchstabe = eingabe.charAt(i);
            if (Character.isLetter(buchstabe)) {
                char verschobenerBuchstabe = (char) (buchstabe + 3);
                if ((Character.isLowerCase(buchstabe) && verschobenerBuchstabe > 'z')
                        || (Character.isUpperCase(buchstabe) && verschobenerBuchstabe > 'Z')) {
                    verschobenerBuchstabe -= 26;
                }
                ausgabe.append(verschobenerBuchstabe);
            } else {
                ausgabe.append(buchstabe);
            }
        }
        return ausgabe.toString();
    }
}