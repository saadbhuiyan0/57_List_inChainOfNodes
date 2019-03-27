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
        System.out.println( "set y to d: " + list.set( 3, "d")
                            + System.lineSeparator()
                            + list
                            + System.lineSeparator());

        System.out.println( "add ! to index 0: " + list.add( 0, "!")
                            + System.lineSeparator()
                            + "add y to index 4: " + list.add( 4, "y")
                            + System.lineSeparator()
                            + "get index 0: " + list.get( 0)
                            + System.lineSeparator()
                            + "get index 1: " + list.get( 1)
                            + System.lineSeparator()
                            + "get index 2: " + list.get( 2)
                            + System.lineSeparator()
                            + "get index 3: " + list.get( 3)
                            + System.lineSeparator()
                            + "get index 4: " + list.get( 4)
                            + System.lineSeparator()
                            + "get index 5: " + list.get( 5)
                            + System.lineSeparator()
                            + list
                            + System.lineSeparator());

        System.out.println( "remove index 0: " + list.remove( 0)
                            + System.lineSeparator()
                            + "remove index 3: " + list.remove( 3)
                            + System.lineSeparator() 
                            + list);
    }
}
