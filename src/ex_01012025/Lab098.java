package ex_01012025;

public class Lab098 {
    public static void main(String[] args) {
        // JDK > 13

        int itemCode = 001;

        switch (itemCode) {
            //use of  arrow symbol will skip break keyword
            case 001 -> System.out.println("It's a laptop!");
            case 002 -> System.out.println("It's a desktop!");
            case 003, 004 -> System.out.println("It's a mobile phone!");
            default -> System.out.println("Heloo!");
        }

    }
}
