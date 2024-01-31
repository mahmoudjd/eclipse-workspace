package kapital5;

public class TreeExample
{

    public static void main(String[] args)
    {
        Node root = new Node();
        for (int i = 0; i < 3; i++)
        {
            Node gen1 = new Node();
            root.addChildren(gen1);
            for (int j = 0; j < 4; j++)
            {
                Node gen2 = new Node();
                gen1.addChildren(gen2);
                for (int k = 0; k < 2; k++)
                {
                    Node gen3 = new Node();
                    gen2.addChildren(gen3);
                }
            }
        }
        root.print();
        root.setRandomNumber();
        root.print();

        System.out.println("\n Minimum  " + root.getMin());

        System.out.println("\n Count: " + root.countNodes());

        System.out.println("\n ContNumber: " + root.countNumber(root.getMin()));

        System.out.println("\n exists Number:" + root.existsNumber(root.getMin()));
    }
}
