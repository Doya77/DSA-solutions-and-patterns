public class linkedlistcycle {
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val=val;
        }
    }
    public static ListNode cycleCheck(ListNode head){
        if(head==null)return null;

        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast)
            return slow;
        }
        return null;
    }

    public static void main(String[] args){
        ListNode n1=new ListNode(10);
        ListNode n2=new ListNode(20);
        ListNode n3=new ListNode(30);
        ListNode n4=new ListNode(40);
        ListNode n5=new ListNode(50);
        ListNode n6=new ListNode(60);

        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n6;
        n6.next=null;

        if(cycleCheck(n1)!=null)
        System.out.println("There is a cycle in the linked list!");
        else
        System.out.println("No cycle");
    }
}