package HW_2_8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CardNumber {
   public static void main(String[] args) {
      String str = "Card number 5555-4444-4444-1111 AlfaBank";
      Pattern p = Pattern.compile("(\\d{4}-\\d{4}-\\d{4}-\\d{4})");
      Matcher m = p.matcher(str);
      if (m.find()) {
         System.out.println("Номер карты " + m.group(1));
      }
      else System.out.println("Номер карты не найден");
   }
}
