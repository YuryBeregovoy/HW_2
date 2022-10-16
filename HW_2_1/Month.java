package HW_2_1;

public enum Month {
    JANUARY(1),
    FEBRUARY(2),
    MARCH(3),
    APRIL(4),
    MAY(5),
    JUNE(6),
    JULY(7),
    AUGUST (8),
    SEPTEMBER (9),
    OCTOBER (10),
    NOVEMBER (11),
    DECEMBER (12);

    private final int monthNumber;

    Month(int monthNumber) {
        this.monthNumber = monthNumber;
    }

    public static int getNumberByName(String name) {
         for (Month month : values()) {
            if (month.name().equalsIgnoreCase(name)) {
                return month.monthNumber;
            }
        }
        return -1;
    }

    public static String getNameByNumber(int number) {
        for (Month month : values()) {
            if (month.monthNumber == number) {
                return month.name();
            }
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println("Месяц №: " + getNumberByName("maY"));
        System.out.println("Название месяца: " + getNameByNumber(11));
    }

}