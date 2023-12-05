public class HelloWorld {
	public static void main( String[] arsg ) {
		System.out.println( "Hello World!" );
		System.out.println( "First " + new Second().getString(" this is from First" ) );
	}
}
