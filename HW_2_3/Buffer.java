package HW_2_3;

public class Buffer {
    public int x1;
    public int x2;
    public int x3;
    public int x4;
    public int x5;

    public Buffer(int x5) {
        this.x5 = x5;
    }

    public int Array[];

    {
        int[] array = {0, 0, 0, 0, this.x5};
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i++];
            System.out.println(array[i]);
        }
    }
//    public String getType() {return this.xNew;}
//
//    public int getX1() {
//        return x1;
//    }
//    public int getX2() {
//        return x2;
//    }
//    public int getX3() {
//        return x3;
//    }
//    public int getX4() {
//        return x4;
//    }
//    public int getX5() {
//        return x5;
//    }

//    @Override
//    public String toString() {
//        return String.format(
//                "Buffer {%s}\n",
//                Array[].Buffer;
//
//        );
//    }
}
