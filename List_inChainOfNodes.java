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

    public Object set( int index, Object val) {
        Object replacedVal = get( index);
        getNode( index).setCargoReference( val);
        return replacedVal;
    }

    public Object get( int index) {
        return getNode( index).getCargoReference();
    }

    public Node getNode( int index) {
        Node targetNode = headReference;
        for ( int i = index ; i > 0 ; i--) {
            targetNode = targetNode.getReferenceToNextNode();
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

    public Object remove( int index) {
        Object replacedVal = null;
        if (index == 0) {
            replacedVal = headReference.getCargoReference();
            headReference = headReference.getReferenceToNextNode();
        }
        else {
            Node previousNode = getNode( index - 1);
            replacedVal = get( index);
            previousNode.setReferenceToNextNode( previousNode.getReferenceToNextNode().getReferenceToNextNode());
        }
        return replacedVal;
    }


}