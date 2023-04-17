package practice.regex;

public class SplitText {

  public static void main(String[] args) {

  }
  public static String splitTextIntoWords(String text) {
    String textAnd = "";

    for (int i = 0; i < text.length(); i++) {
      if (text.length() == -1) {
        break;
      }
      if (Character.isDigit(text.charAt(i))) {
        continue;
      }
      if ((text.charAt(i) != ' ') && (!(Character.isLetter(text.charAt(i)))))  {
        continue;
      }
      if (text.charAt(i) != ' ')  {
        textAnd = textAnd + text.charAt(i);
      }
      if ((text.charAt(i) == ' ') && (Character.isLetter(text.charAt(i + 1)))) {
        textAnd = textAnd  + "\n";
      }
    }
    return textAnd;
  }
}


//Реализуйте метод, который принимает в качестве аргумента строку, содержащую английский текст (не менее 100 слов).
// Метод должен разделить текст на слова и вернуть строку, состоящую из полученных слов, где каждое слово будет на отдельной строке.
// Знаки препинания и числа не являются словами.
