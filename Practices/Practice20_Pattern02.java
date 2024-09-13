package Practices;

public class Practice20_Pattern02 {

    /**
     *  4 3 2 1
     *  3 2 1
     *  2 1
     *  1
     * @param givenRow
     */
    public void getPattern02(int givenRow){
        for (int row = givenRow; row >= 1; row--) {
            for (int column = row; column >= 1; column--) {
                System.out.print(" "+column);
            }
            System.out.println();
        }
    }
}
