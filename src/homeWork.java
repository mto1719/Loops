
public class homeWork 
	{
		public static void main(String[] args)
		
			{
				numRolls dice1 = new numRolls();
				numRolls dice2 = new numRolls();
				int ROLL1 = dice1.roll();
				int ROLL2 = dice2.roll();
				System.out.println(ROLL1);
				System.out.println(ROLL2);
				int count = 1;
				while (ROLL1 != ROLL2)
					{
					ROLL1 = dice1.roll();
					ROLL2 = dice2.roll();
					System.out.println(ROLL1);
					System.out.println(ROLL2);
					count++;
					}
				System.out.print(count);
			}
	}
