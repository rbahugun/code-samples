package task;

import task.Task_3.ListNode;

public class Task_3 {

    // Please do not change this interface
	
    interface ListNode {
        int getItem();
        ListNode getNext();
        void setNext(ListNode next);
    }
    
    public static ListNode reverse(ListNode node) {
        /*
          Please implement this method to
          reverse a given linked list.
        */
    	ListNode curr = node;
    	ListNode prev = null;
        
    	while(curr != null)
    	{
    		ListNode next = curr.getNext();
    		curr.setNext(prev);
    		prev= curr;
    		curr = next;
    	}
		return prev;
    }

    // For TESTING
    public static void main(String[] args) {
    	Node fourth = new Node(4,null);
    	Node third = new Node(3,fourth);
    	Node second = new Node(2,third);
    	Node head = new Node(1,second);
    	Node temp = head;
        while (temp != null) {
            System.out.println("Node List:" + temp.toString());
            temp = temp.next;
        }
        
        Node test = head;
        Node changed = (Node) Task_3.reverse((Task_3.ListNode) test);
        while ( null != changed) {
            System.out.println("Changed:"+ changed.toString());
            changed = changed.next;
        }
        
		
	}

}

class Node implements Task_3.ListNode
{

    int data;
    Node next;

    public int getItem() {
		return data;
	}

	public ListNode getNext() {
		return next;
	}

	public void setNext(ListNode next) {
		this.next = (Node) next;
	}
	
    public Node(int data, Node next) {
		super();
		this.data = data;
		this.next = next;
	}

    public String toString(){
        return data + "";
    }

}

