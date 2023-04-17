package practice.string;

public class SequentialWordsNumbers {
    public static String sequentialWordsNumbers(String text){

        String textAnd = "";
        int sum = 1;

        for (int i = 0; i < text.length(); i++) {
            if (text.length() == -1) {
                break;
            }
            if ((i == 0) && (text.charAt(i) != ' ')) {
                textAnd = textAnd + "(" + sum + ")" + " ";
            }
            if (text.charAt(i) != ' ') {
                textAnd = textAnd + text.charAt(i);
            }
            if  (text.charAt(i) == ' ') {
                sum++;
                textAnd = textAnd + text.charAt(i)+ "(" + sum + ")" + " ";
            }
        }
        return textAnd;
    }
}
