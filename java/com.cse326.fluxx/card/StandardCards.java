package com.cse326.fluxx.card;

import java.util.ArrayList;
/**
 * Created by Thomas on 4/24/2015.
 *
 * Card list retrieved from http://www.looneylabs.com/lists/fluxx-card-list
 */
public class StandardCards {

	public static ArrayList<FluxxCard> createCards() {
		ArrayList<FluxxCard> cards = new ArrayList<>();

		cards.add( new KeeperCard( "The Party" ) );
		cards.add( new KeeperCard( "Cookies" ) );
		cards.add( new KeeperCard( "Milk" ) );
		cards.add( new KeeperCard( "The Eye" ) );
		cards.add( new KeeperCard( "The Brain" ) );
		cards.add( new KeeperCard( "The Moon" ) );
		cards.add( new KeeperCard( "Chocolate" ) );
		cards.add( new KeeperCard( "Dreams" ) );
		cards.add( new KeeperCard( "Time" ) );
		cards.add( new KeeperCard( "Sleep" ) );
		cards.add( new KeeperCard( "Music" ) );
		cards.add( new KeeperCard( "The Toaster" ) );
		cards.add( new KeeperCard( "Money" ) );
		cards.add( new KeeperCard( "The Rocket" ) );
		cards.add( new KeeperCard( "Television" ) );
		cards.add( new KeeperCard( "Bread" ) );
		cards.add( new KeeperCard( "Love" ) );
		cards.add( new KeeperCard( "Peace" ) );

		cards.add( new ActionCard( "Exchange Keepers" ) );
		cards.add( new ActionCard( "Draw 2 and Use 'Em" ) );
		cards.add( new ActionCard( "Today's Special!" ) );
		cards.add( new ActionCard( "Let's Do That Again!" ) );
		cards.add( new ActionCard( "Random Tax" ) );
		cards.add( new ActionCard( "Use What You Take" ) );
		cards.add( new ActionCard( "Trash A New Rule" ) );
		cards.add( new ActionCard( "Let's Simplify" ) );
		cards.add( new ActionCard( "Draw 3, Play 2 of Them" ) );
		cards.add( new ActionCard( "Jackpot!" ) );
		cards.add( new ActionCard( "Trade Hands" ) );
		cards.add( new ActionCard( "Discard and Draw" ) );
		cards.add( new ActionCard( "Rules Reset" ) );
		cards.add( new ActionCard( "Trash a Keeper" ) );
		cards.add( new ActionCard( "Everybody Gets 1" ) );
		cards.add( new ActionCard( "Steal a Keeper" ) );
		cards.add( new ActionCard( "Empty the Trash" ) );
		cards.add( new ActionCard( "Share the Wealth" ) );
		cards.add( new ActionCard( "Take Another Turn" ) );
		cards.add( new ActionCard( "No Limits" ) );
		cards.add( new ActionCard( "Rotate Hands" ) );
		cards.add( new ActionCard( "Zap a Card!" ) );
		cards.add( new ActionCard( "Rock-Paper-Scissors Shadow" ) );

		cards.add( new RuleCard( "Basic Rules" ) );
		cards.add( new RuleCard( "Draw 2" ) );
		cards.add( new RuleCard( "Draw 3" ) );
		cards.add( new RuleCard( "Draw 4" ) );
		cards.add( new RuleCard( "Draw 5" ) );
		cards.add( new RuleCard( "Hand Limit 0" ) );
		cards.add( new RuleCard( "Hand Limit 1" ) );
		cards.add( new RuleCard( "Hand Limit 2" ) );
		cards.add( new RuleCard( "Play 2" ) );
		cards.add( new RuleCard( "Play 3" ) );
		cards.add( new RuleCard( "Play 4" ) );
		cards.add( new RuleCard( "Play All" ) );
		cards.add( new RuleCard( "Play All But 1" ) );
		cards.add( new RuleCard( "Keeper Limit 2" ) );
		cards.add( new RuleCard( "Keeper Limit 3" ) );
		cards.add( new RuleCard( "Keeper Limit 4" ) );
		cards.add( new RuleCard( "No-Hand Bonus" ) );
		cards.add( new RuleCard( "Double Agenda" ) );
		cards.add( new RuleCard( "Poor Bonus" ) );
		cards.add( new RuleCard( "Rich Bonus" ) );
		cards.add( new RuleCard( "Party Bonus" ) );
		cards.add( new RuleCard( "Mystery Play" ) );
		cards.add( new RuleCard( "Recycling" ) );
		cards.add( new RuleCard( "Inflation" ) );
		cards.add( new RuleCard( "First Play Random" ) );
		cards.add( new RuleCard( "Swap Plays for Draws" ) );
		cards.add( new RuleCard( "Goal Mill" ) );
		cards.add( new RuleCard( "Get On With It!" ) );

		cards.add( new GoalCard( "Lullaby" ) );
		cards.add( new GoalCard( "Can't Buy Me Love" ) );
		cards.add( new GoalCard( "Rocket Science" ) );
		cards.add( new GoalCard( "Party Time!" ) );
		cards.add( new GoalCard( "Time is Money" ) );
		cards.add( new GoalCard( "Milk & Cookies" ) );
		cards.add( new GoalCard( "Rocket to the Moon" ) );
		cards.add( new GoalCard( "Baked Goods" ) );
		cards.add( new GoalCard( "Winning the Lottery" ) );
		cards.add( new GoalCard( "The Brain (No TV)" ) );
		cards.add( new GoalCard( "10 Cards in Hand" ) );
		cards.add( new GoalCard( "Chocolate Cookies" ) );
		cards.add( new GoalCard( "Toast" ) );
		cards.add( new GoalCard( "Turn It Up!" ) );
		cards.add( new GoalCard( "Party Snacks" ) );
		cards.add( new GoalCard( "Night & Day" ) );
		cards.add( new GoalCard( "Hippyism" ) );
		cards.add( new GoalCard( "Dreamland" ) );
		cards.add( new GoalCard( "The Appliances" ) );
		cards.add( new GoalCard( "The Mind's Eye" ) );
		cards.add( new GoalCard( "Hearts & Minds" ) );
		cards.add( new GoalCard( "Bread & Chocolate" ) );
		cards.add( new GoalCard( "5 Keepers" ) );
		cards.add( new GoalCard( "Squishy Chocolate" ) );
		cards.add( new GoalCard( "World Peace" ) );
		cards.add( new GoalCard( "Chocolate Milk" ) );
		cards.add( new GoalCard( "Bed Time" ) );
		cards.add( new GoalCard( "The Eye of the Beholder" ) );
		cards.add( new GoalCard( "Day Dreams" ) );
		cards.add( new GoalCard( "Great Theme Song" ) );

		return cards;
	}

}
