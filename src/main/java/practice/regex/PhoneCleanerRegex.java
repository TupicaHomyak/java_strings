package practice.regex;

import java.util.Scanner;

public class PhoneCleanerRegex {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    while (true) {
      String input = scanner.nextLine();
      if (input.equals("0")) {
        scanner.close();
        break;

      } else {
        input = input.replaceAll("[^0-9]", "");
        if ((input.length() == 11) && (input.charAt(0) == '7')) {
          System.out.println(input);
        }
        if (input.length() == 10) {
          System.out.println("7" + input);
        }
        if ((input.length() == 11) && (input.charAt(0) == '8')) {
          input = input.replaceFirst("8", "7");
          System.out.println(input);
        }
        if ((input.length() > 11) || (input.length() < 10)) {
          System.out.println("Неверный формат номера");
        }
        if ((input.length() == 11) && (input.charAt(0) != '8') && (input.charAt(0) != '7')) {
          System.out.println("Неверный формат номера");
        }
      }
    }
  }
}

//+7 909 123-45-67.            79091234567.  В номере 11 цифр, код страны 7, номер верный.                               ЕСТЬ
//+7 (909) 1234567.            79091234567.  В номере 11 цифр, код страны 7, номер верный.                               ЕСТЬ
//8-905-1234567.               79051234567.  В номере 11 цифр, первая цифра 8 (заменяем на код страны 7) — номер верный. ЕСТЬ
//9-453-1234567.                  --         В номере 11 цифр, первый символ после очистки 9, это не 7 и не 8.           ЕСТЬ
//8-905-123.                      --         В номере 7 цифр — номер неверный.                                           ЕСТЬ
//905-1234567.                 79051234567.  В номере 10 цифр. Добавляем в начале код страны 7.                          ЕСТЬ
//8-905-12345672342.             --          В номере более 11 цифр — номер неверный.                                    ЕСТЬ