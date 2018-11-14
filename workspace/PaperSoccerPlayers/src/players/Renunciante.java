package players;

import java.util.Random;

public class Renunciante implements Player {

	public int[] move(int[][] history, int player) {
		Random gen = new Random();
		int x, y;
		x = 1+gen.nextInt(9);
		y = 1+gen.nextInt(13);
		return new int[]{x, y};
	}
}
