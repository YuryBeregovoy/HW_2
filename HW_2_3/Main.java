package HW_2_3;

import java.util.Arrays;
import java.util.Random;

public class Main {
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        Buffer[] buffers = createArrayBuffers(10);
        System.out.println(Arrays.toString(buffers));
    }

    Buffer buffers = new Buffer(4);
    public static Buffer[] createArrayBuffers(int count){
        Buffer[] buffers = new Buffer[count];
            for (int i = 0; i < count; i++) {
                buffers[i] = new Buffer(
                        RANDOM.nextInt(6)
                        );
            }
            return buffers;
        }
}
