package DataStructures;

import java.util.LinkedList;

public class LinkedListSamples {

    Node head;

    static class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
        public static LinkedListSamples insert(LinkedListSamples list, int data){
            Node new_node = new Node(data);
            if(list.head == null){
                list.head = new_node;
            }else{
                Node last = list.head;
                while (last.next != null){
                    last= last.next;
                }
                last.next = new_node;
            }
            return list;
        }
        public static void printList(LinkedListSamples list){
            Node currNode = list.head;
            System.out.println("LinkedList: ");

            while(currNode != null){
                System.out.println(currNode.data + " ");

                currNode = currNode.next;
            }

        }

        public static void main(String[] args) {
            LinkedListSamples list = new LinkedListSamples();

            list = insert(list,1);
            list = insert(list,2);
            list = insert(list,3);
            list= insert(list,4);
            list= insert(list,5);

            printList(list);

        }
    }

}

/*

git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/moxie99/studies.git
git push -u origin main
 */