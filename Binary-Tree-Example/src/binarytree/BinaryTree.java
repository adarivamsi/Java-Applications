/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarytree;

/**
 *
 * @author adari
 */
public class BinaryTree {
    /**
     * @param args the command line arguments
     */
    
    private int value;
    private BinaryTree leftChild;
    private BinaryTree rightChild;
    
    public BinaryTree(int value, BinaryTree leftChild, BinaryTree rightChild){
        this.value = value;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }
    
    public BinaryTree(int value){
        this(value,null,null);
    }
    
    public void preorderPrint(){
        if(this == null) return;
        System.out.print(this.value+" ");
        if(this.leftChild != null)
            this.leftChild.preorderPrint();
        if(this.rightChild != null)
            this.rightChild.preorderPrint();
    }

    public void inorderPrint(){
        if (this == null) return;
        if(this.leftChild != null)
            this.leftChild.inorderPrint();
        System.out.println(this.value);
        if(this.rightChild != null)
            this.rightChild.inorderPrint();
    }
    
    public void postorderPrint(){
        if (this == null) return;
        if(this.leftChild != null)
            this.leftChild.postorderPrint();
        if(this.rightChild != null)
            this.rightChild.postorderPrint();
        System.out.println(this.value);
    }
    
    public BinaryTree copyTree(){
        if(this == null) return null;
        BinaryTree left = null;
        BinaryTree right = null;
        if(this.leftChild != null)
            left = this.leftChild.copyTree();
        if(this.rightChild != null)
            right = this.rightChild.copyTree();
        return new BinaryTree(this.value,left,right);
    }
    
    public int getHeight(int height){
        int lh = height;
        int rh = height;
        if(leftChild != null)
            lh = leftChild.getHeight(height);
        if(rightChild != null)
            rh = rightChild.getHeight(height);
        return 1 + Math.max(lh,rh);
    }

    public static void main(String[] args) {
        // TODO code application logic here
        BinaryTree tree = new BinaryTree(1,
                new BinaryTree(2,
            new BinaryTree(4,
        new BinaryTree(5),new BinaryTree(6)),
            new BinaryTree(7)),
                new BinaryTree(3,null,
            new BinaryTree(8,new BinaryTree(9), new BinaryTree(10))
                ));
        System.out.println("Tree: ");
        tree.preorderPrint();
//        tree.inorderPrint();
//        tree.postorderPrint();
        BinaryTree tree2 = tree.copyTree();
        System.out.println("\nTree2: ");
        tree2.preorderPrint();
        System.out.println("\nHeight: "+tree.getHeight(-1));
    }
    
}
