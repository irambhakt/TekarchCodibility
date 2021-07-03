package ProgrammingQuestions;

public class Drinks 
{
	private int nDrinksType;
	private int[] drinksQuantity;
	
	public Drinks(int nDrinksType, int[] drinksQuantity)
	{
		this.nDrinksType = nDrinksType;
		this.drinksQuantity = drinksQuantity;
	}

	public int getnDrinksType() 
	{
		return nDrinksType;
	}

	public void setnDrinksType(int nDrinksType) 
	{
		this.nDrinksType = nDrinksType;
	}

	public int[] getDrinksQuantity()
	{
		return drinksQuantity;
	}

	public void setDrinksQuantity(int[] drinksQuantity) 
	{
		this.drinksQuantity = drinksQuantity;
	}
	
	public void reqDrink(int drinkTypeNo)
	{
		if(drinkTypeNo >= 1 && drinkTypeNo <= drinksQuantity.length )
		{
			int x = drinksQuantity[drinkTypeNo - 1];
			if(x >= 1 )
			{
				System.out.println("Drink Served ==> "+drinkTypeNo);
				drinksQuantity[drinkTypeNo - 1]--;
			}
			else
			{
				System.out.println("Drink Not Served ==> "+drinkTypeNo);
			}
		}
		else
		{
			System.out.println("Please Give Valid Drink Type!");
		}
		
	}
	
}
