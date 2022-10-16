package HW_2_7;

public class A_A_Finder {
    public static void main(String[] args){
        String str = "house it arangutanga hexocapropectin aaaa 2022 price count";
        System.out.println("Слова в строке, начинающиеся и заканчивающиеся на \"a\":");
        String[] strArray = str.split(" +");
        for (int i = 0; i < strArray.length; i++) {
            if (strArray[i].startsWith("a"))
                if (strArray[i].endsWith("a"))
                    System.out.println(strArray[i]);
        }
    }
}
