
public class VendingMachine extends Dispenser
{
	protected static int totalUnitSold;
	protected static double insertedMoney;
	protected static int insertedMoneyInCent;
	public static void main()
	{
		int vendingMachineChoice= (int)(2.0 * Math.random()) + 1;

		insertedMoneyInCent = (int)(300.0 * Math.random()) + 50;
		insertedMoney = (int)(insertedMoneyInCent/100) + (insertedMoneyInCent - (int)(insertedMoneyInCent/100)*100)*(0.01);
		System.out.println("Inserted Money: $" +insertedMoney);

		if(vendingMachineChoice == 1) 
		{
			System.out.println("The customer chose the soda vending machine.\n");
			Dispenser.sodaDispenser();
			

		}
		else
		{
			System.out.println("The customer chose the snack vending machine.\n");
			Dispenser.snackDispenser();
		}
		insertedMoney = (int)(insertedMoneyInCent/100) + (insertedMoneyInCent- (int)(insertedMoneyInCent/100)*100)*(0.01);
		System.out.println("The change is: $"+insertedMoney + "\n" + "\n" + "\n" + "\n");
		totalUnitSold = amountSold1 + amountSold2 + amountSold3 + amountSold4 + amountSold5 + amountSold6
				 + amountSold7 + amountSold8 + amountSold9 + amountSold10 + amountSold11 + amountSold12 
				 + amountSold13 + amountSold14 + amountSold15 + amountSold16 + amountSold17 + amountSold18
				 + amountSold19 +  amountSold20;
	}

	/*
	 * this method will calculate the sales total (as a whole).
	 */
	protected static double salesTotal()
	{
		int salesTotalInCent = amountSold1 * 100 + amountSold2 * 100 + amountSold3 * 100 + amountSold4 * 100
				+ amountSold5 * 100 + amountSold6 * 100 + amountSold7 * 100 + amountSold8 * 100 
				+ amountSold9 * 175 + amountSold10 * 175 + amountSold11 * 125 + amountSold12 * 125 
				+ amountSold13 * 150 + amountSold14 * 150	+ amountSold15 * 150 + amountSold16 * 175 
				+ amountSold17 * 175 + amountSold18 * 175	+ amountSold19 * 200 + amountSold20 * 200;
		double salesTotal = (int)(salesTotalInCent/100) + (salesTotalInCent - ((int)(salesTotalInCent/100)*100)) * 0.01;

		return salesTotal; 

	}

	/*
	 * this method will calculate the sub total (for each item).
	 */
	protected static String subTotalForSoda()
	{
		//drinks
		double spriteSubTotal = ((int)(amountSold1* 100)/100) 
				+ ((amountSold1* 100) - ((int)(amountSold1* 100)/100)*100) * 0.01;
		double cocacolaSubTotal = (int)((amountSold2* 100)/100) 
				+ ((amountSold2* 100) - (int)((amountSold2* 100)/100)*100) * 0.01;
		double pepsiSubTotal = (int)((amountSold3* 100)/100) 
				+ ((amountSold3* 100) - (int)((amountSold3* 100)/100)*100) * 0.01;
		double sunkistSubTotal = (int)((amountSold4* 100)/100) 
				+ ((amountSold4* 100) - (int)((amountSold4* 100)/100)*100) * 0.01;
		double mountainDewSubTotal = (int)((amountSold5* 100)/100) 
				+ ((amountSold5* 100) - (int)((amountSold5* 100)/100)*100) * 0.01;
		double canadaDrySubTotal = (int)((amountSold6* 100)/100) 
				+ ((amountSold6* 100) - (int)((amountSold6* 100)/100)*100) * 0.01;
		double drPeperSubTotal = (int)((amountSold7* 100)/100) 
				+ ((amountSold7* 100) - (int)((amountSold7* 100)/100)*100) * 0.01;
		double waterSubTotal = (int)((amountSold8* 100)/100) 
				+ ((amountSold8* 100) - (int)((amountSold8* 100)/100)*100) * 0.01;
		double vitaminWaterSubTotal = (int)((amountSold9 * 175)/100) 
				+ ((amountSold9 * 175) - (int)((amountSold9 * 175)/100)*100) * 0.01;
		double gatoradeSubTotal = (int)((amountSold10 * 175)/100) 
				+ ((amountSold10 * 175) - (int)((amountSold10 * 175)/100)*100) * 0.01;


		/*
		 * this will make a report of the sub total.
		 */
		//drinks
		String sprite = "sprite: "+ amountSold1 + " sold = $" +spriteSubTotal+ "\n";
		String cocacola = "cocacola: "+ amountSold2 + " sold = $" +cocacolaSubTotal+ "\n";
		String pepsi = "pepsi: "+ amountSold3 + " sold = $" +pepsiSubTotal+ "\n";
		String sunkist = "sunkist: "+ amountSold4 + " sold = $" +sunkistSubTotal+ "\n";
		String mountainDew = "mountainDew: "+ amountSold5 + " sold = $" +mountainDewSubTotal+ "\n";
		String canadaDry = "canadaDry: "+ amountSold6 + " sold = $" +canadaDrySubTotal+ "\n";
		String drPeper = "drPeper: "+ amountSold7 + " sold = $" +drPeperSubTotal+ "\n";
		String water = "water: "+ amountSold8 + " sold = $" +waterSubTotal+ "\n";
		String vitaminWater = "vitaminWater: "+ amountSold9 + " sold = $" +vitaminWaterSubTotal+ "\n";
		String gatorade = "gatorade: "+ amountSold10 + " sold = $" +gatoradeSubTotal+ "\n";


		//everything is put together here.
		String subTotal1 = sprite + cocacola +pepsi + sunkist + mountainDew 
				+ canadaDry + drPeper + water + vitaminWater + gatorade;

		return subTotal1;
	}
	protected static String subTotalForSnack()
	{
		//snacks
		double kitKatSubTotal = (int)((amountSold11 * 125)/100) 
				+ ((amountSold11 * 125) - (int)((amountSold11 * 125)/100)*100) * 0.01;
		double skittlesSubTotal = (int)((amountSold12 * 125)/100) 
				+ ((amountSold12 * 125) - (int)((amountSold12 * 125)/100)*100) * 0.01;
		double twixSubTotal = (int)((amountSold13 * 150)/100) 
				+ ((amountSold13 * 150) - (int)((amountSold13 * 150)/100)*100) * 0.01;
		double milkyWaySubTotal = (int)((amountSold14 * 150)/100) 
				+ ((amountSold14 * 150) - (int)((amountSold14 * 150)/100)*100) * 0.01;
		double starburstSubTotal = (int)((amountSold15 * 150)/100) 
				+ ((amountSold15 * 150) - (int)((amountSold15 * 150)/100)*100) * 0.01;
		double snickersSubTotal = (int)((amountSold16 * 175)/100) 
				+ ((amountSold16 * 175) - (int)((amountSold16 * 175)/100)*100) * 0.01;
		double lifesaverSubTotal = (int)((amountSold17 * 175)/100) 
				+ ((amountSold17 * 175) - (int)((amountSold17 * 175)/100)*100) * 0.01;
		double fruitSnacksSubTotal = (int)((amountSold18 * 175)/100) 
				+ ((amountSold18 * 175) - (int)((amountSold18 * 175)/100)*100) * 0.01;
		double mentosSubTotal = (int)((amountSold19 * 200)/100) 
				+ ((amountSold19 * 200) - (int)((amountSold19 * 200)/100)*100) * 0.01;
		double crackerJackSubTotal = (int)((amountSold20 * 200)/100) 
				+ ((amountSold20 * 200) - (int)((amountSold20 * 200)/100)*100) * 0.01;

		//snacks
		String kitKat = "kitKat: "+ amountSold11 + " sold = $" +kitKatSubTotal+ "\n";
		String skittles = "skittles: "+ amountSold12 + " sold = $" +skittlesSubTotal+ "\n";
		String twix = "twix: "+ amountSold13 + " sold = $" +twixSubTotal+ "\n";
		String milkyWay = "milkyWay: "+ amountSold14 + " sold = $" +milkyWaySubTotal+ "\n";
		String starburst = "starburst: "+ amountSold15 + " sold = $" +starburstSubTotal+ "\n";
		String snickers = "snickers: "+ amountSold16 + " sold = $" +snickersSubTotal+ "\n";
		String lifesaver = "lifesaver: "+ amountSold17 + " sold = $" +lifesaverSubTotal+ "\n";
		String fruitSnacks = "fruitSnacks: "+ amountSold18 + " sold = $" +fruitSnacksSubTotal+ "\n";
		String mentos = "mentos: "+ amountSold19 + " sold = $" +mentosSubTotal+ "\n";
		String crackerJack = "crackerJack: "+ amountSold20 + " sold = $" +crackerJackSubTotal+ "\n";

		String subTotal2 = kitKat + skittles + twix + milkyWay + starburst + snickers 
				+ lifesaver + fruitSnacks + mentos + crackerJack;
		
		return subTotal2;
	}
}

