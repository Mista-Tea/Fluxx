package fluxx.card;

/**
 * Created by Thomas on 4/24/2015.
 */
public class CardFactory {

	/* ------------------------------------ Instance Variables ---------------------------------- */



	/* ---------------------------------------- Constructors ------------------------------------ */

	/**
	 *
	 * @param type
	 * @return
	 * @throws ClassNotFoundException
	 * @throws IllegalAccessException
	 * @throws InstantiationException
	 */
	public static Card createCard( String type ) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
		return (Card) Class.forName( type ).newInstance();
	}

	/* ------------------------------------------- Methods -------------------------------------- */



	/* ------------------------------------- Getters & Setters ---------------------------------- */

}
