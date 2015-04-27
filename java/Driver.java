import fluxx.Game;
import fluxx.player.*;


public class Driver {
	public static void main( String[] args ) {
		Game game = new Game();
		
		game.addPlayer( "Bot01", new Bot() );
		game.addPlayer( "Bot02", new Bot() );
		
		game.run();
	}
}
