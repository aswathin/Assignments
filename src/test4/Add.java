package test4;

public class Add
{

    public void add( int ... n1 )
    {
        // TODO Auto-generated method stub

        int r = 0;
        // System.out.println( "gggg" + n1 );
        for( int t : n1 )
        {
            System.out.print( t + "+" );
            r = r + t;
        }
        System.out.print( "=" + r + "\n" );

    }

}
