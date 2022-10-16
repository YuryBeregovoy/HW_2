package HW_2_2;

import java.util.Arrays;
import java.util.Random;

class Main {

    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        Box[] boxes = createArrayBoxes(15);
        System.out.println(Arrays.toString(boxes));
    }

    private static Box[] createArrayBoxes(int count) {
        Box[] boxes = new Box[count];
        for (int i = 0; i < count; i++) {
            boxes[i] = new Box(
                    RANDOM.nextInt(1,4),
                    RANDOM.nextInt(1,4),
                    RANDOM.nextInt(4)
            );
        }
        return boxes;
    }
}

