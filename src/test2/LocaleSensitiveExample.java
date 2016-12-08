package test2;

import java.text.NumberFormat;
import java.util.Locale;

public class LocaleSensitiveExample
{
    // https://examples.javacodegeeks.com/core-java/util/locale/java-util-locale-example/
    public static void main( String [] args )
    {

        double number = 12324.134;

        NumberFormat u = NumberFormat.getCurrencyInstance( Locale.ITALY );
        NumberFormat i = NumberFormat.getCurrencyInstance( new Locale( "en", "IN" ) );
        NumberFormat c = NumberFormat.getCurrencyInstance( Locale.CHINA );
        NumberFormat f = NumberFormat.getCurrencyInstance( Locale.FRANCE );

        System.out.println( u.format( number ) );
        System.out.println( i.format( number ) );
        System.out.println( c.format( number ) );
        System.out.println( f.format( number ) );

        /*
         * if(this.currency.equals("\u20B9")) { r="₹ "+r; }
         */

    }

}
