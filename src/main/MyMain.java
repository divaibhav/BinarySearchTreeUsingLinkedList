/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 26-Feb-20
 *  Time: 10:39 AM
 */
package main;

import binarysearchtree.MyBinarySearchTree;

public class MyMain {
    public static void main(String[] args) {
        /*
        MyBinarySearchTree bst = new MyBinarySearchTree();
        bst.insert(50);
        bst.insert(20);
        bst.insert(100);
        bst.insert(10);
        bst.insert(70);

        System.out.println(bst.search(20));
        System.out.print("Pre odere: " );
        bst.traversePreOrder(bst.getRoot());
        System.out.println();
        System.out.print("in order :");
        bst.traverseInOrder(bst.getRoot());
        System.out.println();
        System.out.print("Post order :");
        bst.traversePostOrder(bst.getRoot());
        System.out.println();
        System.out.println("deleted ==> " + bst.delete(50).getData());
        System.out.print("in order :");
        bst.traverseInOrder(bst.getRoot());
        System.out.println();
        System.out.println(bst.getRoot().getData());


         */


       /*
        MyBinarySearchTree bst1 = new MyBinarySearchTree();

        bst1.insert(100);
        bst1.insert(75);
        bst1.insert(150);
        bst1.insert(50);
        bst1.insert(90);
        bst1.insert(125);
        bst1.insert(200);
        bst1.insert(25);
        bst1.insert(65);
        bst1.insert(85);
        bst1.insert(95);
        bst1.insert(110);
        bst1.insert(135);
        bst1.insert(175);
        bst1.insert(250);
        System.out.println("Root ==>" + bst1.getRoot().getData());
        bst1.traversePreOrder(bst1.getRoot());
        System.out.println();
        bst1.traverseLevelOrder(bst1.getRoot());
        System.out.println();
        bst1.traversePreOrderWithoutRecursion(bst1.getRoot());

        */
        /*
        System.out.println("deleted ==>" + bst1.delete(100).getData());
        bst1.traversePreOrder(bst1.getRoot());
        System.out.println();
        System.out.println("Root ==>" + bst1.getRoot().getData());
        System.out.println();
        System.out.println("deleted ==>" + bst1.delete(150).getData());
        bst1.traversePreOrder(bst1.getRoot());
        System.out.println();
        System.out.println("Root ==>" + bst1.getRoot().getData());
        System.out.println("deleted ==>" + bst1.delete(1).getData());

         */


        /*
        MyBinarySearchTree bst2 = new MyBinarySearchTree();
        bst2.insert(100);
        bst2.insert(150);
        bst2.insert(110);
        bst2.traversePreOrder(bst2.getRoot());
        System.out.println();
        System.out.println("Deleted ==>" + bst2.delete(150).getData());
        bst2.traversePreOrder(bst2.getRoot());
        System.out.println();

         */
        MyBinarySearchTree bst = new MyBinarySearchTree();
        bst.insert(50);
        bst.insert(25);
        bst.insert(75);
        bst.insert(10);
        bst.insert(35);
        bst.insert(40);
        System.out.println(bst.height(bst.getRoot()));
        System.out.println(bst.heightNonRecursive(bst.getRoot()));

        bst.traverseInOrder(bst.getRoot());
        System.out.println();
        bst.delete(50);
        System.out.println();
        //System.out.println(bst.getRoot().getData());
        bst.traverseInOrder(bst.getRoot());
        System.out.println();


    }
}
