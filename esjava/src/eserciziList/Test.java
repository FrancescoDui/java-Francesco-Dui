package eserciziList;
public class Test {
    public static void main(String[] args) {
        Node n = new Node(1,new Node(5));
        System.out.println(n);
        System.out.println(n.get(0));
        System.out.println(n.get(1));
        n.set(9,0);
        System.out.println(n.get(0));
        n.set(9,1);
        System.out.println(n.get(1));
        n.add(10);
        n.add(10);
        n.add(12);
        n.add(12);
        System.out.println(n);
    }
}
