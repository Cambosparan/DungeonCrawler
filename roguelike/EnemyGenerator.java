// EnemyGenerator.java
// this class contains a static method for creating enemies randomly

import java.util.Random;

public class EnemyGenerator {

	private static Random rng;

	public static Enemy generate(int row, int col) {
		Random rng = new Random();
		Enemy enemy = new Enemy("Enemy", row, col, 0, 0, 0);
		int enemyPicker = rng.nextInt(3);
		if (enemyPicker == 0) {
			enemy = new Enemy("Draugr", row, col, 50, 8, 20);
		}
		else if (enemyPicker == 1) {
			enemy = new Enemy("Restless Draugr", row, col, 150, 9, 0);
		}
		else if (enemyPicker == 2) {
			enemy = new Enemy("Draugr Overlord", row, col, 210, 13, 20);
		}
	}
}
