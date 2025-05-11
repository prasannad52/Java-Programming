import java.util.LinkedList;

class CollectionFramwork {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.addFirst(2);
        list.addLast(3);
        list.addFirst(6);
        list.removeLast();
        list.removeFirst();
        System.out.println(list);
    }
}