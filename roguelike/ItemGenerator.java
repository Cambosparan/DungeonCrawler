// ItemGenerator.java
// this class contains a static method for creating items randomly

import java.util.Random;

public class ItemGenerator {

	private static Random rng;

	public static Item generate() {
		Random rng = new Random();
		Item item = new Item(ItemType.Other, "Item", 0, 0, 0);
		int itemPicker = rng.nextInt(3);
		if (itemPicker == 0) {
			int weaponPicker = rng.nextInt(5);
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
		}

		if (itemPicker == 1) {
			int armorPicker = rng.nextInt(5);
			if (armorPicker == 0) {
				item = new Item(ItemType.Armor, "Steel Horned Helmet", 17, 5, 125);
			}
			else if (armorPicker == 1) {
				item = new Item(ItemType.Armor, "Steel Armor", 31, 35, 275);
			}
			else if (armorPicker == 2) {
				item = new Item(ItemType.Armor, "Steel Cuffed Boots", 12, 8, 55);
			}
			else if (armorPicker == 3) {
				item = new Item(ItemType.Armor, "Steel Nordic Gauntlets", 12, 4, 55);
			}
			else if (armorPicker == 4) {
				item = new Item(ItemType.Armor, "Steel Shield", 24, 12, 150);
			}
		}

		if (itemPicker == 2) {
			int otherPicker = rng.nextInt(5);
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
		}
		return item;
	}
}