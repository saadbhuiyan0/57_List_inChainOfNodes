/**
 Test list features.
 */
public class UserOfList {
    public static void main( String[] args ) {
        List_inChainOfNodes list = new List_inChainOfNodes();

        System.out.println( "number of elements: " + list.size() );
        System.out.println( "empty list: " + list
                          + System.lineSeparator());

        /* Populate the list with elements.
           Create the test data in an array, for the programming
           convenience of being able to loop through it.
        */
        String[] elements = new String[]{"y","u","t","S",};
            /* convenient syntax      ^^^^^^^^^^^^^^^^^^^^
               for convenient way to init an array of Strings */
        int elemIndex;
        for( String elem : elements ) {
            list.addAsHead( elem);
            System.out.println( "number of elements: " + list.size() );
        }
        System.out.println( "populated list: " + list
                          + System.lineSeparator());
        
        System.out.println( "set S to s: " + list.set( 0, "s")
                            + System.lineSeparator()
                            + list
                            + System.lineSeparator());

        System.out.println( "add end to index 4: " + list.add( 4, "end")
                            + System.lineSeparator()
                            + "get index 4: " + list.get( 4)
                            + System.lineSeparator()
                            + list
                            + System.lineSeperator());

        System.out.println( "remove index 4: " + list.remove( 4)
                            + System.lineSeparator() 
                            + list);
    }
}
