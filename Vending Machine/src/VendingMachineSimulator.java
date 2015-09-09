import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.*;
import java.text.*;
public class VendingMachineSimulator extends VendingMachine
{
	private static int timer = 0;
	private static int closingTime = 60*12;
	@SuppressWarnings("unused")
	private static boolean timeout = false;

	public static void main(String[] args) throws IOException
	{
		
		
		while((timer <= closingTime)&&(totalUnitSold < 400))
		{
			int arrivalTime= (int)(9.0 * Math.random()) + 1;
			timer += arrivalTime;
			if(timer < closingTime)
			{
				System.out.println("The time is "+timer/60 +":"+(timer-timer/60*60));
				VendingMachine.main();
			}
			else
			{
				timeout = true;
			}
		}
		if(timeout = true)
		{
			System.out.println("The Time has run out.");
			System.out.println("The machine is turning off.\n");
			System.out.println("Sales total: $" +salesTotal() +"\n");
			System.out.println("Sub total:\n\n" + "Soda vending machine:\n" 
			+ subTotalForSoda() + "\nSnack vending machine:\n" +subTotalForSnack());
		}
		else
		{
			System.out.println("All units have been sold");
		}
		Date date = new Date() ;
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH-mm") ;
		File file = new File(dateFormat.format(date) + ".txt") ;
		PrintWriter out = new PrintWriter(new FileWriter(file));
		out.write("Writing to file");
		out.println(salesTotal());
		out.println(subTotalForSoda());
		out.println(subTotalForSnack());



		out.close();
		
	}
}

