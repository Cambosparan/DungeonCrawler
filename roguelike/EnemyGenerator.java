/**This is the enemy generation class that creates a random enemy
 * @author Ethan Young
 */

import java.util.Random;

public class EnemyGenerator {

	private static Random rng;

	/**This is the Enemy generate method
	 * This method uses an rng to decide which enemy is created
	 * This method takes in two paramters, the row and column
	 * This method returns the enemy
	 * @param row this is the row where the enemy is put
	 * @param col this is the column where the enemy is put
	 * @return the enemy that is created
	 */
	public static Enemy generate(int row, int col) {
		Random rng = new Random();
		Enemy enemy = new Enemy("Enemy", row, col, 0, 0, 0);
		int enemyPicker = rng.nextInt(3);
		if (enemyPicker == 0) {
			enemy = new Enemy("Draugr", row, col, 50, 8, 0);
		}
		else if (enemyPicker == 1) {
			enemy = new Enemy("Restless Draugr", row, col, 150, 9, 0);
		}
		else if (enemyPicker == 2) {
			enemy = new Enemy("Draugr Overlord", row, col, 210, 13, 0);
		}
		return enemy;
	}
}
