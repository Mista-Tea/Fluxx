package fluxx.card;

import java.util.ArrayList;
/**
 * Created by Thomas on 4/24/2015.
 *
 * Card list retrieved from http://www.looneylabs.com/lists/fluxx-card-list
 */
public class StandardV5CardFactory extends CardFactory {

	public static ArrayList<Card> createCards() {
		ArrayList<Card> cards = new ArrayList<>();

		/*------------------------------------ KEEPER CARDS --------------------------------------*//*
		cards.add( new Keeper( "The Party" ) );
		cards.add( new Keeper( "Cookies" ) );
		cards.add( new Keeper( "Milk" ) );
		cards.add( new Keeper( "The Eye" ) );
		cards.add( new Keeper( "The Brain" ) );
		cards.add( new Keeper( "The Moon" ) );
		cards.add( new Keeper( "Chocolate" ) );
		cards.add( new Keeper( "Dreams" ) );
		cards.add( new Keeper( "Time" ) );
		cards.add( new Keeper( "Sleep" ) );
		cards.add( new Keeper( "Music" ) );
		cards.add( new Keeper( "The Toaster" ) );
		cards.add( new Keeper( "Money" ) );
		cards.add( new Keeper( "The Rocket" ) );
		cards.add( new Keeper( "Television" ) );
		cards.add( new Keeper( "Bread" ) );
		cards.add( new Keeper( "Love" ) );
		cards.add( new Keeper( "Peace" ) );
		*//*------------------------------------ ACTION CARDS --------------------------------------*//*
		cards.add( new Action( "Exchange Keepers" );

		cards.add( new Action( "Draw 2 and Use 'Em" ) );
		cards.add( new Action( "Today's Special!" ) );
		cards.add( new Action( "Let's Do That Again!" ) );
		//cards.add( new ActionCard( "Random Tax" ) );
		cards.add( new Action( "Use What You Take" ) );
		cards.add( new Action( "Trash A New Rule" ) );
		cards.add( new Action( "Let's Simplify" ) );
		cards.add( new Action( "Draw 3, Play 2 of Them" ) );
		cards.add( new Action( "Jackpot!" ) );
		cards.add( new Action( "Trade Hands" ) );
		cards.add( new Action( "Discard and Draw" ) );
		cards.add( new Action( "Rules Reset" ) );
		cards.add( new Action( "Trash a Keeper" ) );
		cards.add( new Action( "Everybody Gets 1" ) );
		cards.add( new Action( "Steal a Keeper" ) );
		//cards.add( new ActionCard( "Empty the Trash" ) );
		//cards.add( new ActionCard( "Share the Wealth" ) );
		cards.add( new Action( "Take Another Turn" ) );
		cards.add( new Action( "No Limits" ) );
		cards.add( new Action( "Rotate Hands" ) );
		//cards.add( new ActionCard( "Zap a Card!" ) );
		//cards.add( new ActionCard( "Rock-Paper-Scissors Shadow" ) );
		*//*------------------------------------- RULE CARDS ---------------------------------------*//*
		cards.add( new Rule( "Basic Rules" ) );
		cards.add( new Rule( "Draw 2" ) );
		cards.add( new Rule( "Draw 3" ) );
		cards.add( new Rule( "Draw 4" ) );
		cards.add( new Rule( "Draw 5" ) );
		cards.add( new Rule( "Hand Limit 0" ) );
		cards.add( new Rule( "Hand Limit 1" ) );
		cards.add( new Rule( "Hand Limit 2" ) );
		cards.add( new Rule( "Play 2" ) );
		cards.add( new Rule( "Play 3" ) );
		cards.add( new Rule( "Play 4" ) );
		cards.add( new Rule( "Play All" ) );
		//cards.add( new RuleCard( "Play All But 1" ) );
		cards.add( new Rule( "Keeper Limit 2" ) );
		cards.add( new Rule( "Keeper Limit 3" ) );
		cards.add( new Rule( "Keeper Limit 4" ) );
		cards.add( new Rule( "No-Hand Bonus" ) );
		cards.add( new Rule( "Double Agenda" ) );
		cards.add( new Rule( "Poor Bonus" ) );
		cards.add( new Rule( "Rich Bonus" ) );
		cards.add( new Rule( "Party Bonus" ) );
		//cards.add( new RuleCard( "Mystery Play" ) );
		//cards.add( new RuleCard( "Recycling" ) );
		cards.add( new Rule( "Inflation" ) );
		cards.add( new Rule( "First Play Random" ) );
		//cards.add( new RuleCard( "Swap Plays for Draws" ) );
		//cards.add( new RuleCard( "Goal Mill" ) );
		cards.add( new Rule( "Get On With It!" ) );
		*//*------------------------------------- GOAL CARDS ---------------------------------------*//*
		//cards.add( new GoalCard( "Lullaby" ) );
		//cards.add( new GoalCard( "Can't Buy Me Love" ) );
		cards.add( new Goal( "Rocket Science" ) );
		//cards.add( new GoalCard( "Party Time!" ) );
		cards.add( new Goal( "Time is Money" ) );
		cards.add( new Goal( "Milk & Cookies" ) );
		cards.add( new Goal( "Rocket to the Moon" ) );
		cards.add( new Goal( "Baked Goods" ) );
		cards.add( new Goal( "Winning the Lottery" ) );
		cards.add( new Goal( "The Brain (No TV)" ) );
		cards.add( new Goal( "10 Cards in Hand" ) );
		cards.add( new Goal( "Chocolate Cookies" ) );
		cards.add( new Goal( "Toast" ) );
		//cards.add( new GoalCard( "Turn It Up!" ) );
		cards.add( new Goal( "Party Snacks" ) );
		cards.add( new Goal( "Night & Day" ) );
		cards.add( new Goal( "Hippyism" ) );
		cards.add( new Goal( "Dreamland" ) );
		cards.add( new Goal( "The Appliances" ) );
		cards.add( new Goal( "The Mind's Eye" ) );
		cards.add( new Goal( "Hearts & Minds" ) );
		//cards.add( new GoalCard( "Bread & Chocolate" ) );
		cards.add( new Goal( "5 Keepers" ) );
		cards.add( new Goal( "Squishy Chocolate" ) );
		//cards.add( new GoalCard( "World Peace" ) );
		cards.add( new Goal( "Chocolate Milk" ) );
		cards.add( new Goal( "Bed Time" ) );
		//cards.add( new GoalCard( "The Eye of the Beholder" ) );
		//cards.add( new GoalCard( "Day Dreams" ) );
		//cards.add( new GoalCard( "Great Theme Song" ) );*/

		return cards;
	}

}
