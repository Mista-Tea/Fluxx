package fluxx.card;

/**
 * Created by Thomas on 4/24/2015.
 */
public interface Card {

	/**
	 *
	 */
	void play() throws NullCardActionException;

	/**
	 *
	 */
	void discard() throws NullCardActionException;


}
