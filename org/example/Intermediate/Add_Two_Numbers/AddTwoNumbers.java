package org.example.Intermediate.Add_Two_Numbers;


public class AddTwoNumbers {
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int[] memorize = new int[100];
        int count = 0;
        boolean plusOne = false;
        while (l1 != null || l2 != null || plusOne){
            int val1 = listNode(l1);
            int val2 = listNode(l2);
            int sumval = val1 + val2;
            if (plusOne){
                sumval++;
                plusOne = false;
            }
            if(sumval >= 10){
                sumval-= 10;
                plusOne = true;
            }
            memorize[count] = sumval;
            count++;
            l1 = l1 != null ? l1.next : l1;
            l2 = l2 != null ? l2.next : l2;
            
        }
        ListNode ans = new ListNode(memorize[count - 1]);
        for( int i = plusOne ? count - 3 :  count - 2; i >= 0; i-- ){
            ans = new ListNode(memorize[i],ans);
        }
        return ans;
    }
    
    public int listNode(ListNode node){
        if (node == null) return 0;
        return node.val;
    }
}
