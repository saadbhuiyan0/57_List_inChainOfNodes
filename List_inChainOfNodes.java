/**
  Represent a list, implemented in a chain of nodes
 */

public class List_inChainOfNodes{
    private Node headReference;

    /**
      Construct an empty list
     */
    public List_inChainOfNodes() { 
    } 

    /**
      @return the number of elements in this list
     */
    public int size() {
        int count = 0;
        Node currentNode = headReference;
        while ( currentNode.getReferenceToNextNode() != null) {
          count += 1;
          currentNode = currentNode.getReferenceToNextNode();
        }
        return count;
    }

    
     /**
       @return a string representation of this list,
       format:
           # elements [element0,element1,element2,] 
      */
    // public String toString() {
    //     String list = size + " [";
    //     return list + "]";
    // }
    
    
    /**
      Append @value to the head of this list.

      @return true, in keeping with conventions yet to be discussed
     */
    //  public boolean addAsHead( Object val) {
    //     headReference = val;
    //     return true;
    //  }
}