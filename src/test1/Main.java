package test1;

class Main
{

    public static void main( String [] args )
    {
        MyBook n = new MyBook();
        n.setTitle( "A tale of two cities" );

        System.out.println( "The title is: " + n.getTitle() );
    }

}
