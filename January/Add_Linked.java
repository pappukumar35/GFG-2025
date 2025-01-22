package January;

public class Add_Linked {
     class Node {
          int data;
          Node next;

          Node(int d) {
               data = d;
               next = null;
          }
     }

     static Node addTwoLists(Node num1, Node num2) {
          if (num1 == null)
               return num2;
          if (num2 == null)
               return num1;
          Node newNum1 = reverse(num1);
          Node newNum2 = reverse(num2);
          int carry = 0;
          Node res = new Node(0);
          Node dummy = res;
          while (newNum1 != null && newNum2 != null) {
               int sum = newNum1.data + newNum2.data + carry;
               Node newNode = new Node(sum % 10);
               res.next = newNode;
               carry = sum / 10;
               res = res.next;
               newNum1 = newNum1.next;
               newNum2 = newNum2.next;
          }
          while (newNum1 != null) {
               int sum = newNum1.data + carry;
               Node newNode = new Node(sum % 10);
               res.next = newNode;
               res = res.next;
               carry = sum / 10;
               newNum1 = newNum1.next;
          }
          while (newNum2 != null) {
               int sum = newNum2.data + carry;
               Node newNode = new Node(sum % 10);
               res.next = newNode;
               res = res.next;
               carry = sum / 10;
               newNum2 = newNum2.next;
          }
          if (carry != 0) {
               Node newNode = new Node(carry);
               res.next = newNode;
               res = res.next;
          }
          Node ans = reverse(dummy.next);
          while (ans.data == 0) {
               ans = ans.next;
          }
          return ans;

     }

     static Node reverse(Node head) {
          Node curr = head;
          Node prev = null;
          while (curr != null) {
               Node temp = curr.next;
               curr.next = prev;
               prev = curr;
               curr = temp;
          }
          return prev;
     }

     public static void main(String[] args) {

     }
}