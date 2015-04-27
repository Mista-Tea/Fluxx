package fluxx.card;

import fluxx.Game;

public interface Effect {

	public abstract void play( Game game );
	public abstract void action( Game game );
	
}
