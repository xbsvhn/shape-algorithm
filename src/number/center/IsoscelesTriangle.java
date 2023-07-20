package number.center;

/**
 * @author namvh
 */
public class IsoscelesTriangle {
    public static void main(String[] args) {
        /*
                HEIGHT = 4
                                line = space + character
                      *          1      3       1
                    * * *        2      2       3
                  * * * * *      3      1       5
                * * * * * * *    4      0       7

        */

        final int HEIGHT = 4;
        String result = "";
        String space = "";
        String character = "";
        int line = 1;

        while (line <= HEIGHT) {
            space = "";
            character = "";

            for (int s = 1; s <= HEIGHT - line; s++) space += "  ";
            for (int c = 1; c <=2 * line - 1; c++) character += "* ";
            result += space + character + "\n";
            line++;
        }
        System.out.println(result);
    }
}
