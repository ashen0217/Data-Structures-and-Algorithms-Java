package treeStructure;

public class node {
    public int iDate;
    public double dDate;
    public node leftChild;
    public node rightChild;

    public void display(){
        System.out.println("{");
        System.out.println(iDate);
        System.out.println(",");
        System.out.println(dDate);
        System.out.println("}");
    }


}
