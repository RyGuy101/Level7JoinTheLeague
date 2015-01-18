package org.jointheleague.pancakes;

public class PancakeDesigner
{
	public static void main(String[] args)
	{
		Pancake plainPancake = new PlainPancake();
		PancakeWithEggs eggs = new PancakeWithEggs(plainPancake);
		PancakeWithBacon bacon = new PancakeWithBacon(eggs);

		// MOAR BACON!!!

		PancakeWithBacon moarBacon = new PancakeWithBacon(bacon);
		PancakeWithBacon moarMoarBacon = new PancakeWithBacon(moarBacon);
		PancakeWithBacon moarMoarMoarBacon = new PancakeWithBacon(moarMoarBacon);
		PancakeWithBacon moarMoarMoarMoarBacon = new PancakeWithBacon(moarMoarMoarBacon);
		PancakeWithBacon moarMoarMoarMoarMoarBacon = new PancakeWithBacon(moarMoarMoarMoarBacon);
		System.out.println("The moarMoarMoarMoarMoarBacon Pancake costs $" + moarMoarMoarMoarMoarBacon.getPrice() + "0");

		// He has demonstrated clearly...

		Pancake blueBerry = new BlueberryPancake();
		PancakeWithEggs eggs2 = new PancakeWithEggs(blueBerry);
		PancakeWithBacon bacon2 = new PancakeWithBacon(eggs2);
		PancakeWithBacon moarBacon2 = new PancakeWithBacon(bacon2);
		PancakeWithBacon moarMoarBacon2 = new PancakeWithBacon(moarBacon2);
		PancakeWithBacon moarMoarMoarBacon2 = new PancakeWithBacon(moarMoarBacon2);
		PancakeWithBacon moarMoarMoarMoarBacon2 = new PancakeWithBacon(moarMoarMoarBacon2);
		PancakeWithBacon moarMoarMoarMoarMoarBacon2 = new PancakeWithBacon(moarMoarMoarMoarBacon2);
		System.out.println("The moarMoarMoarMoarMoarBacon Blueberry Pancake costs $" + moarMoarMoarMoarMoarBacon2.getPrice() + "0");
	}
}
