import java.util.Random;

public class RandomWalk {

	public static void main(String[] args) {
		
		//first get starting position and max position stated		
		int position = 0;
		int maxPost = -3;
		System.out.println("position = " + position);
		Random random = new Random();
		
		//create loop where randomly counting out next step and reaching max position of 3 or -3		
		while (position != 3 && position != -3)	{
			int step = random.nextInt(2);
			if (step == 0) {
				step--;
			}
			
			//show the position numbers being taken in random order
			position += step;
			System.out.println("position = " + position);
			if (position > maxPost) {
				maxPost = position;
			}
		}
		
		//show the maximum step reached
		System.out.println("max position = " + maxPost);

	}

}