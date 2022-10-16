package HW_2_10;

import java.util.Arrays;
import java.util.Random;

class Main {

    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        Box[] boxes = createArrayBoxes(5);
        System.out.println(Arrays.toString(boxes));
    }

    private static Box[] createArrayBoxes(int count) {
        Box[] boxes = new Box[count];
        for (int i = 0; i < count; i++) {
            boxes[i] = new Box(
                    RANDOM.nextInt(1,5)  //проверка выпонения конструктора при вводе одной переменной
             //       RANDOM.nextInt(1,5)
             //       RANDOM.nextInt(5)
            );
        }
        return boxes;
    }
}

