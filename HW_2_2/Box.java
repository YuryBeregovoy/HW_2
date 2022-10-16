package HW_2_2;

public class Box {
    private final int x;
    private final int y;
    private final int z;
    private String type;

    public Box(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public String type() {
        String type = "regular box";

        if ((this.x == this.y)&(this.y == this.z)) {
           type = "cube";
        }
        if (this.z == 0)
            type = "envelope";
        return type;
    }

    public String getType() {return this.type;}

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public int getZ() {
        return z;
    }

    @Override
    public String toString() {
        return String.format(
                "Box {%s %s %s Type: %s }\n",
                x,
                y,
                z,
                type()
        );
    }
}


