package treeStructure;

public class tree {
    private static node root;
    public tree(){
        root=null;
    }

    public static void insert(int id, double dd){
        node nnode = new node(); //new node object creation
        node current = root;
        node parent; //parent node
        while(true){
            parent = current;
            if(id<current.iDate){
                current = current.leftChild;
                if(current == null){
                    parent.leftChild= new node();
                    return;
                }
            }
            else{//go right
                current = current.rightChild;
                if(current == null){
                    parent.rightChild = new node();
                    return;
                }
            }
        }


    }
}
