import java.util.Scanner;
import java.util.io.*;

public class VendingMachine
	{
	
	private static name;
	private static price;
	private static quantity;
	
	public static void main(String[] args) throws fileNotFoundException
		{		
		turnOn();
		listen();
		}
	
	public void turnOn()
		{
		initProduct();
		System.out.println("You can use pennies, nickles, dimes, and quarters in this machine.");
		System.out.println(" ");
		
		}
	
	public void listen()
		{
		Scanner keypad = new Scanner(System.in);
		int numberOfLinesOfData = file.nextInt();
		
		for(int i = 0; i < numberOfLinesOfData; i ++)
			{
			
			}
		
		}
	
	public void initProduct()
		{
		Scanner file = new Scanner (new File ("snacks.txt"));
		int numberOfLinesOfData = file.nextInt();
				
				for(int i = 0; i < numberOfLinesOfData; i ++)
					{
					name =  file.next();
					price = file.nextInt();
					quantity = file.nextInt();
					InventoryManager.addProduct();
					}
		}

	}
