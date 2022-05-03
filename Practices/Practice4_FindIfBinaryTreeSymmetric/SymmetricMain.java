package Practices.Practice4_FindIfBinaryTreeSymmetric;

public class SymmetricMain {
    Practice4_FindIfBinaryTreeSymmetric findIfBinaryTreeSymmetric = new Practice4_FindIfBinaryTreeSymmetric();

    public void insertNode(){
        findIfBinaryTreeSymmetric.addNode(70);
        findIfBinaryTreeSymmetric.addNode(35);
        findIfBinaryTreeSymmetric.addNode(35);
        findIfBinaryTreeSymmetric.addNode(40);
        findIfBinaryTreeSymmetric.addNode(20);
        findIfBinaryTreeSymmetric.addNode(20);
        findIfBinaryTreeSymmetric.addNode(40);
        System.out.println("The Biggest integer of this structure is: "+ findIfBinaryTreeSymmetric);

        findIfBinaryTreeSymmetric.isSymmetric(findIfBinaryTreeSymmetric.root);
    }
}
