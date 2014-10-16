public class Cashier
	{
		private int addMoney;
		private int currentValue;
		private int purchase;
		private int returnChange;
		private int showCash;
		private int toPennies;
	
public Cashier(int aM, int cV, int p, int rC, int sC, int tP)
	{
		addMoney = aM;
		currentValue = cV;
		purchase = p;
		returnChange = rC;
		showCash= sC;
		toPennies = tP;
	}
public void addMoney()
	{
		int value = 0;
		System.out.println(currentValue);
	}
public void currentValue()
	{
		int[][]value = new int[0][2];
		System.out.println("value * 100");
	}
public static void toPennies()
	{
		int[]value = new int[2];
	}
	
}
