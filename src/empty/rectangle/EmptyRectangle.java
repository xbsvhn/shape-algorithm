package empty.rectangle;

/**
 * @author namvh
 */
public class EmptyRectangle {
    public static void main(String[] args) {
        /*

         * * * * *  11 12 13 14 15
         *       *  21 22 23 24 25
         *       *
         *       *
         * * * * *

         */
        final int LENGTH = 5;
        int number = 1;

        while (number <= LENGTH) {
            for (int i = 1; i <= LENGTH; i++) {
                if (i >= 2 && i <= LENGTH - 1 && number >= 2 && number <= LENGTH - 1) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
            number++;
        }
    }
}
