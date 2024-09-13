package Practices;

public class Practice19_Pattern01 {
    /**
     * 1
     *  1 2
     *  1 2 3
     *  1 2 3 4
     */
    public void getPattern(int givenNumber){
        for (int row = 1; row <= givenNumber; row++) {

            //in the nested loop, I have column<=row. So when row is 1, it will print 1 columng, if row =2, column will be printed 2 and so on.
            for (int column= 1; column <= row; column++) {
                System.out.print(" "+column);
            }
            System.out.println();
        }
    }

}
