package folder_linked_list;


/**
 * LinkedList
 */

public class LinkedList{
    //Node gồm value và xích nối tới Node tiếp theo
    public static class Node{
        private int value;
        private Node next; //null
        //constuctor
        Node(int val){
            this.value=val;
        }

    }
    //In node
    public static void printLinkedList(Node headNode){
        if(headNode == null){
            System.out.println("List is empty");
        }else{
            Node temp = headNode;
            while(temp != null){ // lặp đến node null cuối cùng
                System.out.print(temp.value);
                temp = temp.next; // n1.next = n2;(khởi tạo n1 ,n2)
                if(temp != null){
                    System.out.print("->");
                }else{ //phía sau nó không còn Node nào
                    System.out.println("->Null"); 
                }
            }
        }
    }
    public static Node addToHead(Node headNode,int value){
        Node newNode = new Node(value);
        if(newNode != null){
            newNode.next = headNode; //nối xích
        }
        return  newNode;
    }

    public static Node addToIndex(Node headNode,int value,int index){
        if(index == 0){
           return addToHead(headNode, value);
        }else{
            // Tìm vị trí
            Node newNode = new Node(value);
            Node prevNode = headNode;
            int count = 0;
            while (prevNode.next != null) { 
                count ++;
                if(count == index){
                    newNode.next=prevNode.next; // nối với Node tiếp theo của prevNode (tức là curNode)
                    prevNode.next = newNode;    //prevNode nối đến Node
                    break;
                }
            }
        }
        return headNode;   
    }

    public static Node addToLast(Node headNode,int value){
        Node newNode = new Node(value);
        if(newNode != null && headNode == null) { // List Node null
            return newNode;
        }else{
            // B1. Tìm lastNode (lastNode.next == null)
            Node lastNode = headNode; //last node = node đầu tiên n-1
            while (lastNode.next != null) { // chạy đến node gần cuối (nút cuối là null)
                lastNode = lastNode.next;            
            }
            //B2 : gán lastNode.next = newNode; (Node null trước đó sẽ được thay bằng newNode)
            lastNode.next=newNode;
        }
        return  headNode; //trả về Node hiện tại ( đã có ListNode - Danh sách liên kết của nó)
    }

    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        

        n1.next = n2;
        n2.next = n3;

        printLinkedList(n1);

        n1 = addToLast(n1, 4); // n3.next = null -> thay 4 vào thành n3.next =4
        n1 = addToHead(n1, 0);

        //   printLinkedList(n1);
     
        printLinkedList(n1);
        


        
    }
    
}