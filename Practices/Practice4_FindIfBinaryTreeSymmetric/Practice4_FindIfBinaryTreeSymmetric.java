package Practices.Practice4_FindIfBinaryTreeSymmetric;

public class Practice4_FindIfBinaryTreeSymmetric {
    SymmetricNode root;
    public void addNode(int data){
        if(root ==null){
            root = new SymmetricNode(data);
        }else{
            SymmetricNode focusNode = root;
            SymmetricNode parent;

            while (true){
                parent = focusNode;

                if(data> parent.data){
                    focusNode = parent.rightChild;
                    if(focusNode == null){
                        parent.rightChild = new SymmetricNode(data);
                        return;
                    }
                }

                if(data< parent.data){
                    focusNode = parent.leftChild;

                    if (focusNode == null){
                        parent.leftChild = new SymmetricNode(data);
                        return;
                    }
                }
            }
        }
    }

    public boolean isSymmetric( SymmetricNode node){
        if(node == null){
            return true;
        }
        if(node.leftChild==node.rightChild){
            return isSymmetric(node);
        }
        return false;
    }
}
