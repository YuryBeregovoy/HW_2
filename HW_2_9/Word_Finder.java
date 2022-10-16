package HW_2_9;

public class Word_Finder {
    public static void main(String[] args){
        String str = "house i&%$t price arangutanga hexocapropectin aaaa 2022 count";
        String word = "price";                       // некое слово
        if (str.matches(".*\\b" + word + "\\b.*")){
        int value = str.indexOf(word);
        System.out.println("Искомое слово найдено в строке. Индекс первого символа: " + value);
        }
else
        System.out.println("Искомое слово в строке не найдено");
        }
}
