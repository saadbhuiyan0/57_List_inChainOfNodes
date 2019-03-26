/**
  Represent a node that holds...
  o  cargo of interest to the user
  o  reference to the next node in the list
 */

public class Node {
    private Object cargoReference;
    private Node   referenceToNextNode;


    /**
      Construct an instance
     */
    public Node( Object cargoReference) {
        this.cargoReference = cargoReference;
    }
    public Node( Object cargoReference, Node referenceToNextNode) {
        this( cargoReference);
        this.referenceToNextNode = referenceToNextNode;
    }

    /**
      @return a string representation of this instance
     */
    public String toString() {
        String result =
            getCargoReference()  // polymorphically use appropriately toString!
          + " id " // include a usually-unique identifier for this node
          + super.toString()
          ;

        // Show rest of chain of nodes
        if( referenceToNextNode == null)
             result += " [no next]";
        else result += " --> " + referenceToNextNode;
        return result;
    }

    // classic accessor and mutator
    public Node getReferenceToNextNode() {
        return referenceToNextNode; 
    }

    public void setReferenceToNextNode( Node referenceToNextNode) {
        this.referenceToNextNode = referenceToNextNode;
    }
    
    public Object getCargoReference() {
        return cargoReference;
    }

    public void setCargoReference( Object cargo) {
        cargoReference = cargo;
    }
}