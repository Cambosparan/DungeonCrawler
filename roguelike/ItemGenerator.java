/** This is the item generation class that creates a random item that can be picked up
 * @author Ethan Young
 */

import java.util.Random;

public class ItemGenerator {

	private static Random rng;

	/** This is the Item generate method 
	 * It uses an rng to decide which item is created
	 * The method takes in no parameters and returns the item created
	 * @return the item that was chosen
	 */
	public static Item generate() {
		Random rng = new Random();
		Item item = new Item(ItemType.Other, "Item", 0, 0, 0);
		int itemPicker = rng.nextInt(4);
		if (itemPicker == 0) {
			int weaponPicker = rng.nextInt(10);
			if (weaponPicker == 0) {
				item = new Item(ItemType.Weapon, "Steel Sword", 8, 10, 45);
			}
			else if (weaponPicker == 1) {
				item = new Item(ItemType.Weapon, "Hunting Bow", 7, 7, 50);
			}
			else if (weaponPicker == 2) {
				item = new Item(ItemType.Weapon, "Steel Dagger", 5, 3, 18);
			}
			else if (weaponPicker == 3) {
				item = new Item(ItemType.Weapon, "Steel Greatsword", 17, 17, 90);
			}
			else if (weaponPicker == 4) {
				item = new Item(ItemType.Weapon, "Dragonbone Warhammer", 28, 33, 4275);
			}
			else if (weaponPicker == 5) {
				item = new Item(ItemType.Weapon, "Dwarven Sword", 10, 12, 135);
			}
			else if (weaponPicker == 6) {
				item = new Item(ItemType.Weapon, "Nightingale Bow", 19, 18, 2500);
			}
			else if (weaponPicker == 7) {
				item = new Item(ItemType.Weapon, "Pickaxe", 5, 10, 5);
			}
			else if (weaponPicker == 8) {
				item = new Item(ItemType.Weapon, "Woodcutter's Axe", 5, 10, 5);
			}
			else if (weaponPicker == 9) {
				item = new Item(ItemType.Weapon, "Glass Battleaxe", 22, 25, 900);
			}
		}

		if (itemPicker == 1) {
			int armorPicker = rng.nextInt(5);
			if (armorPicker == 0) {
				item = new Item(ItemType.Armor, "Steel Armor", 31, 35, 275);
			}
			else if (armorPicker == 1) {
				item = new Item(ItemType.Armor, "Iron Armor", 25, 30, 125);
			}
			else if (armorPicker == 2) {
				item = new Item(ItemType.Armor, "Dwarven Armor", 34, 45, 400);
			}
			else if (armorPicker == 3) {
				item = new Item(ItemType.Armor, "Elven Armor", 29, 4, 225);
			}
			else if (armorPicker == 4) {
				item = new Item(ItemType.Armor, "Daedric Armor", 49, 50, 3200);
			}
		}

		if (itemPicker == 2) {
			int otherPicker = rng.nextInt(7);
			if (otherPicker == 0) {
				item = new Item(ItemType.Other, "Lockpick", 0, 0, 2);
			}
			else if (otherPicker == 1) {
				item = new Item(ItemType.Other, "Wooden Plate", 0, 1, 1);
			}
			else if (otherPicker == 2) {
				item = new Item(ItemType.Other, "Dragon Bone", 0, 15, 500);
			}
			else if (otherPicker == 3) {
				item = new Item(ItemType.Other, "Golden Dragon Claw", 0, 1, 100);
			}
			else if (otherPicker == 4) {
				item = new Item(ItemType.Other, "Steel Ingot", 0, 1, 20);
			}
			else if (otherPicker == 5) {
				item = new Item(ItemType.Other, "Flawless Diamond", 0, 1, 1000);
			}
			else if (otherPicker == 6) {
				item = new Item(ItemType.Other, "Torch", 0, 1, 2);
			}
		}

		if (itemPicker == 3) {
			item = new Item(ItemType.Potion, "Minor potion of healing", 0, 25, 17);
		}
		return item;
	}
}
