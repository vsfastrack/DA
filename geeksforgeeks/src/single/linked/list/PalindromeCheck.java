package single.linked.list;

import single.linked.list.utils.ListUtils;

public class PalindromeCheck {
    public static void main(String[] args){
        SingleLinkedList<Node> sll = ListUtils.readList();
        System.out.println(sll.isPalindrome());
    }
}
