package HW_2_6;

public class BigWord {
    public static void main(String[] args){
        int maxLength = 0;
        int numWord = 0;
        String str = "house it   hexocapropectin 2022 price count";
        String[] strArray = str.split(" +");
        for (int i = 0; i < strArray.length; i++) {
            if (strArray[i].length() > maxLength) {
                maxLength = strArray[i].length();
                numWord = i;
            }
        }
            System.out.println("Самое длинное слово в строке - \"" + strArray[numWord] + "\"");
    }
}
//если самых длинных слов несколько - возвращает только первое

