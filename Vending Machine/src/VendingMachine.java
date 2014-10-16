import java.util.Scanner;
import java.util.io.*;

public class VendingMachine
	{
	
	private static String name;
	private static int price;
	private static int quantity;
	
	
	
	public static void main(String[] args) throws fileNotFoundException
		{		
		turnOn();
		listen();
		}
	
	public void turnOn()
		{
		initProduct();
		System.out.println("You can use pennies, nickles, dimes, and quarters in this machine.");
		System.out.println("A1	Cheetos	.75/n A2	Goldfish	 .75/n A3	Pretzels	.50/n A4	Jolly Ranchers	.60/n A5	Oatmeal Cookie	1.00/n B1	Snickers	.50/n B2	Stride Gum	.65/n B3	Beef Jerky	1.40/n B4 Chex Mix	.70/n B4	Popcorn	.35 ");
		
		}
	
	public void listen()
		{
		Scanner keypad = new Scanner(System.in);
		String choice = keypad.nextLine();		
		}
	
	public void initProduct()
		{
		Scanner file = new Scanner (new File ("snacks.txt"));
		int numberOfLinesOfData = file.nextInt();
				
				
		ArrayList <Product> products = new ArrayList();
		for(int i = 0; i < numberOfLinesOfData; i ++)
					{
					
					name =  file.next();
					price = file.nextInt();
					quantity = file.nextInt();
					InventoryManager.addProduct();
					}
		}

	}
