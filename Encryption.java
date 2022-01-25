import java.io.*;
import java.util.ArrayList;

public class Encryption {
  ArrayList<Character> symbols = new ArrayList<Character>();
  ArrayList<Character> alphabets = new ArrayList<Character>();

  public Encryption() {
    symbols.add('!');
    symbols.add('@');
    symbols.add('#');
    symbols.add('$');
    symbols.add('^');
    symbols.add('&');
    symbols.add('*');
    symbols.add('(');
    symbols.add(')');
    symbols.add('_');
    symbols.add('-');
    symbols.add('+');
    symbols.add('=');
    symbols.add('?');
    symbols.add(',');
    symbols.add('{');
    symbols.add('}');
    symbols.add('[');
    symbols.add(']');
    symbols.add('/');
    symbols.add('|');
    symbols.add(';');
    symbols.add(':');
    symbols.add('.');
    symbols.add('<');
    symbols.add('>');

    for (char letter = 'a'; letter <= 'z'; letter++) {
      alphabets.add(letter);
    }
  }

  public char return_alphabet(int pos) {
    return alphabets.get(pos);
  }

  public int return_alphabet_index(char c) {
    return alphabets.indexOf(c);
  }

  public char return_symbol(int pos) {
    return symbols.get(pos);
  }

  public int return_symbol_index(char c) {
    return symbols.indexOf(c);
  }

  public String encrypt_message(String str) {
    char[] encr = str.toCharArray();

    for (int i = 0; i < encr.length; i++) {
      int index = return_alphabet_index(Character.toLowerCase(encr[i]));
      encr[i] = return_symbol(index);
    }

    return String.valueOf(encr);
  }

  public String decrypt_message(String str) {
    char[] decr = str.toCharArray();

    for (int i = 0; i < decr.length; i++) {
      int index = return_symbol_index(decr[i]);
      decr[i] = return_alphabet(index);
    }

    return String.valueOf(decr);
  }
}
