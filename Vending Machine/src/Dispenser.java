
public class Dispenser extends FoodInformation
{

	private static String dispenser1;
	private static String dispenser2;
	private static String dispenser3;
	private static String dispenser4;
	private static String dispenser5;
	private static String dispenser6;
	private static String dispenser7;
	private static String dispenser8;
	private static String dispenser9;
	private static String dispenser10;	
	private static String dispenser11;
	private static String dispenser12;
	private static String dispenser13;
	private static String dispenser14;
	private static String dispenser15;
	private static String dispenser16;
	private static String dispenser17;
	private static String dispenser18;
	private static String dispenser19;
	private static String dispenser20;
	protected static int amountSold1 = 0;
	protected static int amountSold2 = 0;
	protected static int amountSold3 = 0;
	protected static int amountSold4 = 0;
	protected static int amountSold5 = 0;
	protected static int amountSold6 = 0;
	protected static int amountSold7 = 0;
	protected static int amountSold8 = 0;
	protected static int amountSold9 = 0;
	protected static int amountSold10 = 0;
	protected static int amountSold11 = 0;
	protected static int amountSold12 = 0;
	protected static int amountSold13 = 0;
	protected static int amountSold14 = 0;
	protected static int amountSold15 = 0;
	protected static int amountSold16 = 0;
	protected static int amountSold17 = 0;
	protected static int amountSold18 = 0;
	protected static int amountSold19 = 0;
	protected static int amountSold20 = 0;

	protected static void sodaDispenser()
	{
		dispenser1 = "sprite: " + "$1.00" + " - " +sprite();
		dispenser2 = "cocacola: " + "$1.00" + " - " +cocacola();
		dispenser3 = "pepsi: " + "$1.00" + " - " +pepsi();
		dispenser4 = "sunkist: " + "$1.00" + " - " +sunkist();
		dispenser5 = "mountainDew: " + "$1.00" + " - " +mountainDew();
		dispenser6 = "canadaDry: " + "$1.00" + " - " +canadaDry();
		dispenser7 = "drPeper: " + "$1.00" + " - " +drPepper();
		dispenser8 = "water: " + "$1.00" + " - " +water();
		dispenser9 = "vitaminWater: " + "$1.75" + " - " +vitaminWater();
		dispenser10 = "gatorade: " + "$1.75" + " - " +gatorade();

		System.out.println(dispenser1+"\n"+dispenser2+"\n"+dispenser3+"\n"+dispenser4
				+"\n"+dispenser5+"\n"+dispenser6+"\n"+dispenser7+"\n"+dispenser8+"\n"
				+dispenser9+"\n"+dispenser10+"\n");

		int dispenserChoice = (int)(10.0 * Math.random()) + 1;
		boolean done = false;
		while(done != true)
		{
			if(dispenserChoice == 1)
			{
				System.out.println("The customer chose Sprite.\n");
				VendingMachine.insertedMoneyInCent -= 100;
				if(VendingMachine.insertedMoneyInCent >= 00 && amountSold1 < 20)
				{
					System.out.println("The price is: $1.00");
					amountSold1++;
					done = true;
				}

				if(VendingMachine.insertedMoneyInCent < 0)
				{
					VendingMachine.insertedMoneyInCent += 100;
					notEnoughMoneyHandler();
				}
				else if(amountSold1 > 19)
				{
					VendingMachine.insertedMoneyInCent += 100;
					System.out.println("Sold out; money returned.");
					done = true;
				}
			}
			else if(dispenserChoice == 2)
			{
				System.out.println("The customer chose cocacola.\n");
				VendingMachine.insertedMoneyInCent -= 100;
				if(VendingMachine.insertedMoneyInCent >= 0 && amountSold2 < 20)
				{
					System.out.println("The price is: $1.00");
					amountSold2++;
					done = true;
				}

				if(VendingMachine.insertedMoneyInCent < 0)
				{
					VendingMachine.insertedMoneyInCent += 100;
					notEnoughMoneyHandler();
				}
				else if(amountSold2 > 19)
				{
					VendingMachine.insertedMoneyInCent += 100;
					System.out.println("Sold out; money returned.");
					done = true;
				}
			}
			else if(dispenserChoice == 3)
			{
				System.out.println("The customer chose pepsi.\n");
				VendingMachine.insertedMoneyInCent -= 100;
				if(VendingMachine.insertedMoneyInCent >= 0 && amountSold3 < 20)
				{
					System.out.println("The price is: $1.00");
					amountSold3++;
					done = true;
				}

				if(VendingMachine.insertedMoneyInCent < 0)
				{
					VendingMachine.insertedMoneyInCent += 100;
					notEnoughMoneyHandler();
				}
				else if(amountSold3 > 19)
				{
					VendingMachine.insertedMoneyInCent += 100;
					System.out.println("Sold out; money returned.");
					done = true;
				}
			}
			else if(dispenserChoice == 4)
			{
				System.out.println("The customer chose sunkist.\n");
				VendingMachine.insertedMoneyInCent -= 100;
				if(VendingMachine.insertedMoneyInCent >= 0 && amountSold4 < 20)
				{
					System.out.println("The price is: $1.00");
					amountSold4++;
					done = true;
				}
				if(VendingMachine.insertedMoneyInCent < 0)
				{
					VendingMachine.insertedMoneyInCent += 100;
					notEnoughMoneyHandler();
				}
				else if(amountSold4 > 19)
				{
					VendingMachine.insertedMoneyInCent += 100;
					System.out.println("Sold out; money returned.");
					done = true;
				}
			}
			else if(dispenserChoice == 5)
			{
				System.out.println("The customer chose mountainDew.\n");
				VendingMachine.insertedMoneyInCent -= 100;
				if(VendingMachine.insertedMoneyInCent >= 0 && amountSold5 < 20)
				{
					System.out.println("The price is: $1.00");
					amountSold5++;
					done = true;
				}

				if(VendingMachine.insertedMoneyInCent < 0)
				{
					VendingMachine.insertedMoneyInCent += 100;
					notEnoughMoneyHandler();
				}
				else if(amountSold5 > 19)
				{
					VendingMachine.insertedMoneyInCent += 100;
					System.out.println("Sold out; money returned.");
					done = true;
				}
			}
			else if(dispenserChoice == 6)
			{
				System.out.println("The customer chose canadaDry.\n");
				VendingMachine.insertedMoneyInCent -= 100;
				if(VendingMachine.insertedMoneyInCent >= 0 && amountSold6 < 20)
				{
					System.out.println("The price is: $1.00");
					amountSold6++;
					done = true;
				}

				if(VendingMachine.insertedMoneyInCent < 0)
				{
					VendingMachine.insertedMoneyInCent += 100;
					notEnoughMoneyHandler();
				}
				else if(amountSold6 > 19)
				{
					VendingMachine.insertedMoneyInCent += 100;
					System.out.println("Sold out; money returned.");
					done = true;
				}
			}
			else if(dispenserChoice == 7)
			{
				System.out.println("The customer chose drPeper.\n");
				VendingMachine.insertedMoneyInCent -= 100;
				if(VendingMachine.insertedMoneyInCent >= 0 && amountSold7 < 20)
				{
					System.out.println("The price is: $1.00");
					amountSold7++;
					done = true;
				}

				if(VendingMachine.insertedMoneyInCent < 0)
				{
					VendingMachine.insertedMoneyInCent += 100;
					notEnoughMoneyHandler();
				}
				else if(amountSold7 > 19)
				{
					VendingMachine.insertedMoneyInCent += 100;
					System.out.println("Sold out; money returned.");
					done = true;
				}
			}
			else if(dispenserChoice == 8)
			{
				System.out.println("The customer chose water.\n");
				VendingMachine.insertedMoneyInCent -= 100;
				if(VendingMachine.insertedMoneyInCent >= 0 && amountSold8 < 20)
				{
					System.out.println("The price is: $1.00");
					amountSold8++;
					done = true;
				}

				if(VendingMachine.insertedMoneyInCent < 0)
				{
					VendingMachine.insertedMoneyInCent += 100;
					notEnoughMoneyHandler();
				}
				else if(amountSold8 > 19)
				{
					VendingMachine.insertedMoneyInCent += 100;
					System.out.println("Sold out; money returned.");
					done = true;
				}
			}
			else if(dispenserChoice == 9)
			{
				System.out.println("The customer chose vitaminWater.\n");
				VendingMachine.insertedMoneyInCent -= 175;
				if(VendingMachine.insertedMoneyInCent >= 0 && amountSold9 < 20)
				{
					System.out.println("The price is: $1.75");
					amountSold9++;
					done = true;
				}

				if(VendingMachine.insertedMoneyInCent < 0)
				{
					VendingMachine.insertedMoneyInCent += 175;
					notEnoughMoneyHandler();
				}
				else if(amountSold9 > 19)
				{
					VendingMachine.insertedMoneyInCent += 175;
					System.out.println("Sold out; money returned.");
					done = true;
				}
			}
			else if(dispenserChoice == 10)
			{
				System.out.println("The customer chose gatorade.\n");
				VendingMachine.insertedMoneyInCent -= 175;
				if(VendingMachine.insertedMoneyInCent >= 0 && amountSold10 < 20)
				{
					System.out.println("The price is: $1.75");
					amountSold10++;
					done = true;
				}

				if(VendingMachine.insertedMoneyInCent < 0)
				{
					VendingMachine.insertedMoneyInCent += 175;
					notEnoughMoneyHandler();
				}
				else if(amountSold10 > 19)
				{
					VendingMachine.insertedMoneyInCent += 175;
					System.out.println("Sold out; money returned.");
					done = true;
				}
			}
		}

	}

	public static void snackDispenser()
	{
		dispenser11 = "kitKat: " + "$1.25" + " - " +FoodInformation.kitKat();
		dispenser12 = "skittles: " + "$1.25" + " - " +FoodInformation.skittles();
		dispenser13 = "twix: " + "$1.50" + " - " +FoodInformation.twix();
		dispenser14 = "milkyWay: " + "$1.50" + " - " +FoodInformation.milkyWay();
		dispenser15 = "starburst: " + "$1.50" + " - " +FoodInformation.starburst();
		dispenser16 = "snickers: " + "$1.75" + " - " +FoodInformation.snickers();
		dispenser17 = "lifesaver: " + "$1.75" + " - " +FoodInformation.lifesaver();
		dispenser18 = "fruitSnacks: " + "$1.75" + " - " +FoodInformation.fruitSnacks();
		dispenser19 = "mentos: " + "$2.00" + " - " +FoodInformation.mentos();
		dispenser20 = "crackerJack: " + "$2.00" + " - " +FoodInformation.crackerJack();	

		System.out.println(dispenser11+"\n"+dispenser12+"\n"+dispenser13+"\n"+dispenser14
				+"\n"+dispenser15+"\n"+dispenser16+"\n"+dispenser17+"\n"+dispenser18+"\n"
				+dispenser19+"\n"+dispenser20+"\n");

		int dispenserChoice = (int)(10.0 * Math.random()) + 1;
		boolean done = false;
		while(done != true)
		{
			if(dispenserChoice == 1)
			{
				System.out.println("The customer chose kitKat.\n");
				VendingMachine.insertedMoneyInCent -= 125;
				if(VendingMachine.insertedMoneyInCent >= 0 && amountSold11 < 20)
				{
					System.out.println("The price is: $1.25");
					amountSold11++;
					done = true;
				}
				if(VendingMachine.insertedMoneyInCent < 0)
				{
					VendingMachine.insertedMoneyInCent += 125;
					notEnoughMoneyHandler();
				}
				else if(amountSold11 > 19)
				{
					VendingMachine.insertedMoneyInCent += 125;
					System.out.println("Sold out; money returned.");
					done = true;
				}
			}
			else if(dispenserChoice == 2)
			{
				System.out.println("The customer chose skittles.\n");
				VendingMachine.insertedMoneyInCent -= 125;
				if(VendingMachine.insertedMoneyInCent >= 0 && amountSold12 < 20)
				{
					System.out.println("The price is: $1.25");
					amountSold12++;			
					done = true;					
				}

				if(VendingMachine.insertedMoneyInCent < 0)
				{
					VendingMachine.insertedMoneyInCent += 125;
					notEnoughMoneyHandler();
				}
				else if(amountSold12 > 19)
				{
					VendingMachine.insertedMoneyInCent += 125;
					System.out.println("Sold out; money returned.");
					done = true;
				}
			}
			else if(dispenserChoice == 3)
			{
				System.out.println("The customer chose twix.\n");
				VendingMachine.insertedMoneyInCent -= 150;
				if(VendingMachine.insertedMoneyInCent >= 0 && amountSold13 < 20)
				{
					System.out.println("The price is: $1.50");
					amountSold13++;	
					done = true;
				}

				if(VendingMachine.insertedMoneyInCent < 0)
				{
					VendingMachine.insertedMoneyInCent += 150;
					notEnoughMoneyHandler();
				}
				else if(amountSold13 > 19)
				{
					VendingMachine.insertedMoneyInCent += 150;
					System.out.println("Sold out; money returned.");
					done = true;
				}
			}
			else if(dispenserChoice == 4)
			{
				System.out.println("The customer chose milkyWay.\n");
				VendingMachine.insertedMoneyInCent -= 150;
				if(VendingMachine.insertedMoneyInCent >= 0 && amountSold14 < 20)
				{
					System.out.println("The price is: $1.50");
					amountSold14++;	
					done = true;
				}

				if(VendingMachine.insertedMoneyInCent < 0)
				{
					VendingMachine.insertedMoneyInCent += 150;
					notEnoughMoneyHandler();
				}
				else if(amountSold14 > 19)
				{
					VendingMachine.insertedMoneyInCent += 150;
					System.out.println("Sold out; money returned.");
					done = true;
				}
			}
			else if(dispenserChoice == 5)
			{
				System.out.println("The customer chose starburst.\n");
				VendingMachine.insertedMoneyInCent -= 150;
				if(VendingMachine.insertedMoneyInCent >= 0 && amountSold15 < 20)
				{
					System.out.println("The price is: $1.50");
					amountSold15++;		
					done = true;
				}

				if(VendingMachine.insertedMoneyInCent < 0)
				{
					VendingMachine.insertedMoneyInCent += 150;
					notEnoughMoneyHandler();
				}
				else if(amountSold15 > 19)
				{
					VendingMachine.insertedMoneyInCent += 150;
					System.out.println("Sold out; money returned.");
					done = true;
				}
			}
			else if(dispenserChoice == 6)
			{
				System.out.println("The customer chose snickers.\n");
				VendingMachine.insertedMoneyInCent -= 175;
				if(VendingMachine.insertedMoneyInCent >= 0 && amountSold16 < 20)
				{
					System.out.println("The price is: $1.50");
					amountSold16++;		
					done = true;
				}

				if(VendingMachine.insertedMoneyInCent < 0)
				{
					VendingMachine.insertedMoneyInCent += 175;
					notEnoughMoneyHandler();
				}
				else if(amountSold16 > 19)
				{
					VendingMachine.insertedMoneyInCent += 175;
					System.out.println("Sold out; money returned.");
					done = true;
				}
			}
			else if(dispenserChoice == 7)
			{
				System.out.println("The customer chose lifesaver.\n");
				VendingMachine.insertedMoneyInCent -= 175;
				if(VendingMachine.insertedMoneyInCent >= 0 && amountSold17 < 20)
				{
					System.out.println("The price is: $1.75");
					amountSold17++;
					done = true;
				}

				if(VendingMachine.insertedMoneyInCent < 0)
				{
					VendingMachine.insertedMoneyInCent += 175;
					notEnoughMoneyHandler();
				}
				else if(amountSold17 > 19)
				{
					VendingMachine.insertedMoneyInCent += 175;
					System.out.println("Sold out; money returned.");
					done = true;
				}
			}
			else if(dispenserChoice == 8)
			{
				System.out.println("The customer chose fruitSnacks.\n");
				VendingMachine.insertedMoneyInCent -= 175;
				if(VendingMachine.insertedMoneyInCent >= 0 && amountSold18 < 20)
				{
					System.out.println("The price is: $1.75");
					amountSold18++;
					done = true;
				}

				if(VendingMachine.insertedMoneyInCent < 0)
				{
					VendingMachine.insertedMoneyInCent += 175;
					notEnoughMoneyHandler();
				}
				else if(amountSold18 > 19)
				{
					VendingMachine.insertedMoneyInCent += 175;
					System.out.println("Sold out; money returned.");
					done = true;
				}
			}
			else if(dispenserChoice == 9)
			{
				System.out.println("The customer chose mentos.\n");
				VendingMachine.insertedMoneyInCent -= 200;
				if(VendingMachine.insertedMoneyInCent >= 0 && amountSold19 < 20)
				{
					System.out.println("The price is: $2.00");
					amountSold19++;
					done = true;
				}

				if(VendingMachine.insertedMoneyInCent < 0)
				{
					VendingMachine.insertedMoneyInCent += 200;
					notEnoughMoneyHandler();
				}
				else if(amountSold19 > 19)
				{
					VendingMachine.insertedMoneyInCent += 200;
					System.out.println("Sold out; money returned.");
					done = true;
				}
			}
			else if(dispenserChoice == 10)
			{
				System.out.println("The customer chose crackerJack.\n");
				VendingMachine.insertedMoneyInCent -= 200;
				if(VendingMachine.insertedMoneyInCent >= 0 && amountSold20 < 20)
				{
					System.out.println("The price is: $2.00");
					amountSold20++;
					done = true;
				}

				if(VendingMachine.insertedMoneyInCent < 0)
				{
					VendingMachine.insertedMoneyInCent += 200;
					notEnoughMoneyHandler();
				}
				else if(amountSold20 > 19)
				{
					VendingMachine.insertedMoneyInCent += 200;
					System.out.println("Sold out; money returned.");
					done = true;
				}
			}
		}
	}
	private static void notEnoughMoneyHandler()
	{
		System.out.println("Not enough money; Insert more.");
		int moreMoneyInCent = (int)(300.0 * Math.random()) + 50;
		VendingMachine.insertedMoneyInCent += moreMoneyInCent;
		double moreMoney = (int)(moreMoneyInCent/100) + (moreMoneyInCent - (int)(moreMoneyInCent/100)*100)*(0.01);
		double nowHave = VendingMachine.insertedMoney + moreMoney;
		System.out.println("The customer inserted: $" + moreMoney);
		System.out.println("The customer now have: $" + nowHave);
	}
}
