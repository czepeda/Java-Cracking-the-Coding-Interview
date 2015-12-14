/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2.pkg1.linked.list.remove.duplicates;

import java.util.Hashtable;
import java.util.LinkedList;


/**
 *
 * @author czepeda
 */
public class Task {

    public static void deleteDups(LinkedListNode head) {
        LinkedListNode current = head;
        //System.out.println(current);
        while (current != null) {
            LinkedListNode next = current.next;
            while (next != null) {
                if (current.data == next.data) {
                    current.next = next.next;
                    current = current.next;
                    next = current.next;
                } else {
                    next = next.next;
                }
            }

            current = current.next;
        }
    }

    public static void main(String args[]) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(3);
        list.addLast(3);
        list.addLast(4);
        list.addLast(4);
        System.out.println(list);
        LinkedListNode head = new LinkedListNode(list.getFirst());
        Task.deleteDups(head);
        //System.out.println(head);
    }

}
