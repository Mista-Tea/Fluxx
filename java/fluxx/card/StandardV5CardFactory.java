package fluxx.card;

import java.util.ArrayList;

import fluxx.card.standard.v5.goal.*;
import fluxx.card.standard.v5.action.*;
import fluxx.card.standard.v5.rule.*;
/**
 * Created by Thomas on 4/24/2015.
 *
 * Card list retrieved from http://www.looneylabs.com/lists/fluxx-card-list
 */
public class StandardV5CardFactory extends CardFactory {

	public static ArrayList<Card> createCards( ArrayList<Card> cards ) {
		
		/*------------------------------------ KEEPER CARDS --------------------------------------*/
		cards.add( new Keeper( "The Party", 	"Party party party!" ) );
		cards.add( new Keeper( "Cookies", 		"Mmm, delicious cookies" ) );
		cards.add( new Keeper( "Milk", 			"I've got the Milk, now where are the cookies?" ) );
		cards.add( new Keeper( "The Eye", 		"An unsightly thing, to be sure" ) );
		cards.add( new Keeper( "The Brain", 	"If only I had a brain..." ) );
		cards.add( new Keeper( "TheMoon", 		"Shh! Was that a wolf howling?" ) );
		cards.add( new Keeper( "Chocolate", 	"Valentine's day already?" ) );
		cards.add( new Keeper( "Dreams", 		"Everyone's got one, but very few make them real" ) );
		cards.add( new Keeper( "Time", 			"I haven't got enough time on this project!" ) );
		cards.add( new Keeper( "Sleep", 		"I am losing precious sleep by working on this project!" ) );
		cards.add( new Keeper( "Music", 		"Listening to music makes this easier" ) );
		cards.add( new Keeper( "The Toaster", 	"The brave little toaster" ) );
		cards.add( new Keeper( "Money", 		"If you had this, you wouldn't be playing Fluxx" ) );
		cards.add( new Keeper( "The Rocket", 	"Let's go to spaaaaaaaaace!" ) );
		cards.add( new Keeper( "Television",	"The opposite of 'brain'" ) );
		cards.add( new Keeper( "Bread", 		"Bread. Not toasted; just bread." ) );
		cards.add( new Keeper( "Love", 			"I LOVE PROJECTS" ) );
		cards.add( new Keeper( "Peace", 		"I NEED SOME PEACE AND QUIET, PLEASE" ) );
		/*------------------------------------ ACTION CARDS --------------------------------------*/
		cards.add( new Action( "Exchange Keepers", 		"Exchange keepers with another player", 						new ExchangeKeepers() ) );
		cards.add( new Action( "Draw 2 And Use 'Em", 	"Draw 2 cards, and then use them!", 							new Draw2AndUseEm() ) );
		cards.add( new Action( "Use What You Take", 	"Take a card from another player's hand and use it", 			new UseWhatYouTake() ) );
		cards.add( new Action( "Trash A New Rule", 		"Discard a new rule card in play", 								new TrashANewRule() ) );
		cards.add( new Action( "Let's Simplify", 		"Discard up to half of the current rule cards in play", 		new LetsSimplify() ) );
		cards.add( new Action( "Draw 3 Play 2 of Them", "Draw 3 cards, play 2 of them, and discard the last", 			new Draw3Play2() ) );
		cards.add( new Action( "Jackpot", 				"Draw 3 extra cards", 											new Jackpot() ) );
		cards.add( new Action( "Trade Hands", 			"Trade your hand for someone else's hand", 						new TradeHands() ) );
		cards.add( new Action( "Discard And Draw", 		"Discard your hand and draw as many cards as you discarded", 	new DiscardAndDraw() ) );
		cards.add( new Action( "Rules Reset", 			"Reset to the basic rules (keep goal)", 						new RulesReset() ) );
		cards.add( new Action( "Trash A Keeper", 		"Pick a keeper in play and discard it", 						new TrashAKeeper() ) );
		cards.add( new Action( "Steal A Keeper", 		"Steal any keep in play", 										new StealAKeeper() ) );
		cards.add( new Action( "No Limits", 			"Discard all hand and keeper limit rules in play", 				new NoLimits() ) );
		cards.add( new Action( "Rotate Hands", 			"Each player passes their hand in counter-turn direction", 		new RotateHands() ) );
		/*------------------------------------- RULE CARDS ---------------------------------------*/
		cards.add( new Rule( "Draw 2", 			"Draw 2", 			new DrawN( 2 ),				Rule.RULE_TYPE.DRAW ) );
		cards.add( new Rule( "Draw 3", 			"Draw 3", 			new DrawN( 3 ),				Rule.RULE_TYPE.DRAW ) );
		cards.add( new Rule( "Draw 4", 			"Draw 4", 			new DrawN( 4 ),				Rule.RULE_TYPE.DRAW ) );
		cards.add( new Rule( "Draw 5", 			"Draw 5", 			new DrawN( 5 ),				Rule.RULE_TYPE.DRAW ) );
		cards.add( new Rule( "Hand Limit 0", 	"Hand Limit 0", 	new HandLimitN( 0 ),		Rule.RULE_TYPE.LIMIT_HAND ) );
		cards.add( new Rule( "Hand Limit 1", 	"Hand Limit 1", 	new HandLimitN( 1 ),		Rule.RULE_TYPE.LIMIT_HAND ) );
		cards.add( new Rule( "Hand Limit 2", 	"Hand Limit 2", 	new HandLimitN( 2 ),		Rule.RULE_TYPE.LIMIT_HAND ) );
		cards.add( new Rule( "Play 2", 			"Play 2", 			new PlayN( 2 ),				Rule.RULE_TYPE.PLAY ) );
		cards.add( new Rule( "Play 3", 			"Play 3", 			new PlayN( 3 ),				Rule.RULE_TYPE.PLAY ) );
		cards.add( new Rule( "Play 4", 			"Play 4", 			new PlayN( 4 ),				Rule.RULE_TYPE.PLAY ) );
		//cards.add( new Rule( "Play All", 		"Play All", 		new PlayAll(),				Rule.RULE_TYPE.PLAY ) );
		cards.add( new Rule( "Keeper Limit 2", 	"Keeper Limit 2", 	new KeeperLimitN( 2 ),		Rule.RULE_TYPE.LIMIT_KEEPER ) );
		cards.add( new Rule( "Keeper Limit 3", 	"Keeper Limit 3", 	new KeeperLimitN( 3 ),		Rule.RULE_TYPE.LIMIT_KEEPER ) );
		cards.add( new Rule( "Keeper Limit 4", 	"Keeper Limit 4", 	new KeeperLimitN( 4 ),		Rule.RULE_TYPE.LIMIT_KEEPER ) );
		//cards.add( new Rule( "No Hand Bonus", 	"No Hand Bonus", 	new NoHandBonus( 1 ),		Rule.RULE_TYPE.DRAW ) );
		//cards.add( new Rule( "Poor Bonus", 		"Poor Bonus", 		new PoorBonus( 1 ),			Rule.RULE_TYPE.DRAW ) );
		//cards.add( new Rule( "Rich Bonus", 		"Rich Bonus", 		new RichBonus( 1 ),			Rule.RULE_TYPE.DRAW ) );
		/*------------------------------------- GOAL CARDS ---------------------------------------*/
		cards.add( new Goal( "Rocket Science", 		"The Rocket and The Brain", 					new RocketScience() ) );
		cards.add( new Goal( "Time Is Money", 		"Time and Money", 								new TimeIsMoney() ) );
		cards.add( new Goal( "Milk & Cookies", 		"Milk and Cookies", 							new MilkAndCookies() ) );
		cards.add( new Goal( "Rocket to the Moon", 	"The Rocket and the Moon", 						new RocketToTheMoon() ) );
		cards.add( new Goal( "Baked Goods", 		"Bread and cookies", 							new BakedGoods() ) );
		cards.add( new Goal( "Winning the Lottery", "Dreams and Money", 							new WinningTheLottery() ) );
		cards.add( new Goal( "The Brain (No TV)", 	"Brain (as long as no one has TV)", 			new TheBrainNoTV() ) );
		cards.add( new Goal( "10 Cards In Hand", 	"10 Cards In Hand", 							new TenCardsInHand() ) );
		cards.add( new Goal( "Chocolate Cookies", 	"Chocolate and Cookies", 						new ChocolateCookies() ) );
		cards.add( new Goal( "Toast", 				"The Toaster and Bread", 						new Toast() ) );
		cards.add( new Goal( "Party Snacks", 		"The Party and Bread, Cookies, or Chocolate", 	new PartySnacks() ) );
		cards.add( new Goal( "Day & Night", 		"The Sun and the Moon", 						new NightAndDay() ) );
		cards.add( new Goal( "Hippyism", 			"Peace and Love", 								new Hippyism() ) );
		cards.add( new Goal( "Dreamland", 			"Sleep and Dreams", 							new Dreamland() ) );
		cards.add( new Goal( "The Appliances", 		"The Toaster and Television", 					new TheAppliances() ) );
		cards.add( new Goal( "The Mind's Eye", 		"The Brain and the Eye", 						new TheMindsEye() ) );
		cards.add( new Goal( "Hearts & Minds", 		"Love and the Brain", 							new HeartsAndMinds() ) );
		cards.add( new Goal( "Five Keepers",		"Five Keepers", 								new FiveKeepers() ) );
		cards.add( new Goal( "Squishy Chocolate", 	"The Sun and Chocolate", 						new SquishyChocolate() ) );
		cards.add( new Goal( "Chocolate Milk", 		"Chocolate and Milk", 							new ChocolateMilk() ) );
		cards.add( new Goal( "Bed Time", 			"Sleep and Time", 								new BedTime() ) );

		return cards;
	}
	
}
