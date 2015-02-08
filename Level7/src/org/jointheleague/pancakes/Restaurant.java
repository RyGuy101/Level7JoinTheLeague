package org.jointheleague.pancakes;

import java.util.ArrayList;

public class Restaurant
{
	static Pantry pantry = new Pantry(20, 12, 20);

	public static void main(String[] args)
	{
		ArrayList<Pancake> stack = new ArrayList<Pancake>();
		stack.add(new PlainPancake());
		stack.add(new BlueberryPancake());
		Order order = new OrderWithBacon(new OrderWithBacon(new OrderWithBacon(new OrderWithBacon(new OrderWithBacon(new OrderWithBacon(new BasicOrder(stack)))))));
		String availability = !order.isAvailable(pantry) ? "not " : "";
		System.out.println("This order is " + availability + "available.");
		System.out.println("The price is " + order.getPrice() + "0.");
		String vegetarianality = !order.isVegetarian() ? "not " : "";
		System.out.println("It is " + vegetarianality + "vegetarian.");
		System.out.println("The ingredients needed are " + order.getIngredients() + ".");
		System.out.println("The pantry currently has " + pantry.getIngredients() + ".");
	} 
}
