import java.util.Scanner;

class Node{  //Blueprint of the node object

    int data; //this is data that will present inside the object

    Node nextNodeAddress; // this can contain the address of any object

    //constructor
    Node(int data){
        this.data=data;
        nextNodeAddress =null;
    }
}
class LinkedList{

    Node head;
    //this will always store the address of the first node of the linked list
    Node tail;

    //this will store the address of the last node of the linked list


    public void addNode(int data){
        Node newNode=new Node(data);
        //System.out.println("Printing the address of the new Node"+newNode);

        //first node
        if(head==null && tail==null){
            head=newNode;
            tail=newNode;
//            System.out.println("This is the first node");
//            System.out.println("Add of newNode"+newNode+ "headNode :"+head+" tailNode"+tail);
            return;
        }
        //others nodes
        tail.nextNodeAddress=newNode;
        tail=newNode;
       // System.out.println("Add of newNode"+newNode+ "headNode :"+head+" tailNode"+tail);
    }

    //printing the linked list
    public void printList(){
        Node currentAdd=head;

        while(currentAdd != null){
            System.out.printf(currentAdd.data+" ");
            currentAdd=currentAdd.nextNodeAddress;
        }

    }
}

public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();

        //Now I need to data value of each node
        LinkedList linkedList=new LinkedList();

        for (int i = 0; i < n; i++) {
            int no=scanner.nextInt();
            linkedList.addNode(no);
        }
        linkedList.printList();

    }
}

//solve this question adding the node at any specific position in the linked list
//https://course.acciojob.com/idle?question=360a3653-9861-453b-ae65-564bdb579674
