/**
  Represent a list, implemented in a chain of nodes
 */

public class List_inChainOfNodes{
    private Node headReference;

    /**
      Construct an empty list
      The default constructor is fine:
      take zero arguments
      do nothing
     */

    /**
      @return the number of elements in this list
     */
    public int size() {
        // recursive approach seems more perspicuous
        if( headReference == null) return 0;
        else return size( headReference);
    }

    // recursively-called helper
    private int size( Node startingAt) {
        Node next = startingAt.getReferenceToNextNode();
        if( next == null) return 1;
        else return 1+ size( next);
    }


     /**
       @return a string representation of this list,
       format:
           # elements [element0,element1,element2,]
      */
    public String toString() {
        String stringRep = size() + " elements [";

        for( Node node = headReference
           ; node != null
           ; node = node.getReferenceToNextNode() )
            stringRep += node.getCargoReference() + ",";
        return stringRep + "]";
    }

    /**
      Append @value to the head of this list.

      @return true, in keeping with conventions yet to be discussed
     */
    public boolean addAsHead( Object val) {
        headReference = new Node( val, headReference);
        return true;
    }

    public boolean set( int index, Object val) {
        getNode( index).setCargoReference( val);
        return true;
    }

    public Object get( int index) {
        return getNode( index).getCargoReference();
    }

    public Node getNode( int index) {
        Node targetNode = headReference;
        int iterate = index;
        while ( iterate > 0) {
            targetNode = targetNode.getReferenceToNextNode();
            iterate--;
        }
        return targetNode;
    }

    public boolean add( int index, Object val) {
        if ( index == 0) {
            return addAsHead( val);
        }
        Node newNode = new Node( val);
        Node previousNode = getNode( index);
        newNode.setReferenceToNextNode( previousNode.getReferenceToNextNode());
        previousNode.setReferenceToNextNode( newNode);
        return true;
    }

    public boolean remove( int index) {
        if (index == 0) {
            headReference = headReference.getReferenceToNextNode();
        }
        else {
            Node previousNode = getNode( index);
            previousNode.setReferenceToNextNode( previousNode.getReferenceToNextNode().getReferenceToNextNode());
        }
        return true;
    }


}