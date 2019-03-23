/**
  Test the Node
 */

public class UserOfNode {
    public static Node chain;

    public static void main(String[] commandLine) {
        System.out.println( System.lineSeparator()
                          + "Test Node");

        // minimal Node, with no next node
        System.out.println( "minimal Node, with no next node");
        Node noNext=  new Node( new String( "mango")); // avoid interning
        System.out.println( noNext
                          + System.lineSeparator());

        // node with a reference, testing accessors
        System.out.println( "node with a reference, testing accessors");
        Node nextSet = new Node(  1.618); // autobox to Double
        nextSet.setReferenceToNextNode( noNext);
        System.out.println( nextSet
                          + System.lineSeparator());

        // 2-arg constructor obviates setReferenceToNextNode
        System.out.println(
            "2-arg constructor obviates setReferenceToNextNode");
        Node twoArgCon = new Node( new String( "kiwi"), nextSet);
        System.out.println( twoArgCon
                          + System.lineSeparator());
    }
}
