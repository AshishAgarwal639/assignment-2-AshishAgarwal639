/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.main;
// executable class

import problem1.mybst.MyBinarySearchTree;

import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree tree = new MyBinarySearchTree();
        Scanner scanner = new Scanner(System.in);
        int i = 7;
        while (i > 0) {
            tree.add(scanner.nextInt());
            i--;
        }
        /*tree looks like
                4
               / \
              2   6
             / \  / \
            1   3 5  7
         */
        // For only left children 4,2,1,5 should be printed.
    }
}
