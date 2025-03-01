package Linkedlist;

class ListNode {
    int val;
    ListNode next;

    public ListNode() {
    }

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class InterviewQ {
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    // find length of the cycle
    public int lengthCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                //calc the length
                ListNode temp = slow;
                int length = 0;
                do {
                    temp = temp.next;
                    length++;
                } while (temp != fast);

                return length;
            }
        }
        return 0;
    }

    // public Node get(int index){
    //     Node node = head;
    //     for (int i = 0; i < index; i++) {
    //         node = node.next;
    //     }
    //     return node;

    // }

    public void bubblesort(){
        bubblesort(size-1 , 0);
    }
    private void bubblesort(int row , int col){
        if (row ==0) {
            return;
        }
        if (col < row) {
            ListNode  first = get(col) ;
            ListNode  second = get(col + 1);

        }
    }
    public boolean isPalindrome(ListNode head) {
        ListNode mid = middleNode(head);
        ListNode headSecond = reverseList(mid);
        ListNode rereverseHead = headSecond;

        while (head != null && headSecond != null) {
            if (head.val != headSecond.val) {
                break;
            }
            head = head.next;
            headSecond = headSecond.next;
        }
        reverseList(rereverseHead);

        return head == null || headSecond == null;

    }
    public ListNode middleNode(ListNode head) {
        ListNode s = head;
        ListNode f = head;

        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
        }
        return s;
    }
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode prev = null;
        ListNode present = head;
        ListNode next = present.next;

        while (present != null) {
            present.next = prev;
            prev = present;
            present = next;
            if (next != null) {
                next = next.next;
            }
        }
        return prev;
    }

    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }
        ListNode mid = middleNode(head);
        ListNode hf =head;
        ListNode hs = reverseList(mid);

        while (hf != null && hs != null) {
            ListNode temp = hf.next;
            hf.next = hs;
            hf = temp;

            temp = hs.next;
            hs.next = hf;
            hs = temp;
        }
        if (hf != null) {
            hf.next = null;
        }

    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (left == right) {
            return head;
        }

        // skip the first left-1 nodes
        ListNode current = head;
        ListNode prev = null;
        for (int i = 0; current != null && i < left - 1; i++) {
            prev = current;
            current = current.next;
        }

        ListNode last = prev;
        ListNode newEnd = current;

        // reverse between left and right
        ListNode next = current.next;
        for (int i = 0; current != null && i < right - left + 1; i++) {
            current.next = prev;
            prev = current;
            current = next;
            if (next != null) {
                next = next.next;
            }
        }

        if (last != null) {
            last.next = prev;
        } else {
            head = prev;
        }

        newEnd.next = current;
        return head;
    }
//it also reversing less than k item ---> modify it
    public ListNode reverseKGroup(ListNode head, int k) {
        if (k <= 1 ||  head == null ) {
            return head;
        }

        ListNode current = head;
        ListNode prev = null;

        while (true) {
            
    
            ListNode last = prev;
            ListNode newEnd = current;
    
            // reverse between left and right
            ListNode next = current.next;
            for (int i = 0; current != null && i < k; i++) {
                current.next = prev;
                prev = current;
                current = next;
                if (next != null) {
                    next = next.next;
                }
            }
    
            if (last != null) {
                last.next = prev;
            } else {
                head = prev;
            }
    
            newEnd.next = current;

            if (current == null) {
                break;
            }
            prev = newEnd;

            // if u want to skip the k alternative node
            for (int i = 0; current != null && i < k; i++) {
                prev = current;
                current = current.next;
                
            }
            
        }
        return head;
        
    }

    // public ListNode reverseBetween(ListNode head, int left, int right) {
        
    // }
}
