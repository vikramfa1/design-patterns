package lld;

import java.util.HashMap;
import java.util.Map;

class Node {
    public char alphabet;
    public boolean isDuplicate;
    public Node prev;
    public Node next;
    public Node(char alphabet) {
        this.alphabet = alphabet;

    }
}

public class RokuInterview {
    public Map<Character, Node> map = new HashMap<>();
    public Node head = new Node('A');
    public Node tail = head;

    private char getFirstNonRepeatingCharacter() {
        if(head.next==null) {
            return 'G';
        } else {
            char a = head.next.alphabet;
            return a;
        }
    }

    private void accept(char ch) {

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
        RokuInterview interview = new RokuInterview();
        interview.accept('a');
        interview.accept('b');
        System.out.println("result: " +String.valueOf(interview.getFirstNonRepeatingCharacter()));
        System.out.println("result: " +String.valueOf(interview.getFirstNonRepeatingCharacter()));
        interview.accept('a');
        System.out.println("result: " +String.valueOf(interview.getFirstNonRepeatingCharacter()));
    }
}