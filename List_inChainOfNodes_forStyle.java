/**
  Represent a list, implemented in a chain of nodes
 */

public class List_inChainOfNodes_forStyle {
    private Node headReference;

    /**
      Construct an empty list
     */
    public List_inChainOfNodes_forStyle() { 
    }  

    /**
      @return the number of elements in this list
     */
    public int size() {
        int size = 0;
        for ( Node currentNode = headReference; currentNode != null; currentNode = currentNode.getReferenceToNextNode()) {
            size++;
        }
        return size;
    }

    
     /**
       @return a string representation of this list,
       format:
           # elements [element0,element1,element2,] 
      */
    public String toString() {
        String list = size() + " [";
        for ( Node currentNode = headReference; currentNode != null; currentNode = currentNode.getReferenceToNextNode()) {
            list += currentNode.getCargoReference() + ",";
        }
        return list + "]";
    }
    
    
    /**
      Append @value to the head of this list.

      @return true, in keeping with conventions yet to be discussed
     */
     public boolean addAsHead( Object val) {
        Node newHead = new Node( val, headReference);
        headReference = newHead;
        return true;
     }
}