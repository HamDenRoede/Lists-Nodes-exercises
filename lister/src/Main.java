
public class Main
{
    public static void main(String[] args)
    {
        Node node = new Node("mie");
        Node node1 = new Node("viktor");

        node1.next = node;

        System.out.println("det var: " + node1.next.navn);

    }
}
