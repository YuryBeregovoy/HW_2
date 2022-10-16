package HW_2_5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class c_count {
    public static void main(String[] args) {
        int countLetter = 0;
        int countWord = 0;
        String str = "dsfgdc fgsfcccsdc cfccfc dfscccc";
        String[] array = str.split(" +");
        for (int i = 0; i < array.length; i++) {
            Pattern p = Pattern.compile("c");
            Matcher m = p.matcher(array[i]);
            while (m.find()){
                countLetter++;
            }
            if (countLetter >= 3) {
                countWord++;
            }
        }
        System.out.println("В строке \"" + str + "\" встречается " + countWord + " слова с тремя и более буквами \"c\"");
    }
}
