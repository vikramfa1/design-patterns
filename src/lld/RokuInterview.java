package lld;

import java.util.HashMap;
import java.util.Map;

public class RokuInterview {
}

class Node {
    public char alphabet;
    public boolean isDuplicate;
    public Node prev;
    public Node next;
    public Node(char alphabet) {
        this.alphabet = alphabet;

    }
}

class Main {
    static Map<Character, Node> map = new HashMap<>();
    static Node head = new Node('A');
    static Node tail = head;

    private static char getFirstNonRepeatingCharacter() {
        if(head.next==null) {
            return 'G';
        } else {
            char a = head.next.alphabet;
            return a;
        }
    }

    private static void accept(char ch) {

        if(map.containsKey(ch)) {
            Node removeNode = map.get(ch);
            if(removeNode.isDuplicate) {
                return;
            } else {
                removeNode.isDuplicate = true;
                removeNode.prev.next = removeNode.next;
                if(removeNode.next!=null) {
                    removeNode.next.prev = removeNode.prev;
                }
            }
        } else {
            Node tempNode = new Node(ch);
            tail.next = tempNode;
            tempNode.prev = tail;
            tail = tempNode;
            map.put(ch, tempNode);

        }
    }
    public static void main(String[] args) {
        accept('a');
        accept('b');
        System.out.println("result: " +String.valueOf(getFirstNonRepeatingCharacter()));
        System.out.println("result: " +String.valueOf(getFirstNonRepeatingCharacter()));
        accept('a');
        System.out.println("result: " +String.valueOf(getFirstNonRepeatingCharacter()));
    }
}