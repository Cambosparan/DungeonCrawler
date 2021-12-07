/**This class allows for items to be picked up
 */

import ansi_terminal.*;

public class Box extends Entity {

    private Item item;

    /**This method places the items on the map
     * This method takes in three paramters
     * @param row this is the row value where the item is placed
     * @param col this is the column value where the item is placed
     * @param item this is the item type of the placed item
     */
    public Box(int row, int col, Item item) {
        super(row, col, 'i', Color.MAGENTA);
        this.item = item;
    }

    /**This method allows for the player to get the item from the ground
     * This method returns the given item
     * @return the item on that is on the ground
     */
    public Item getItem() {
        return item;
    }
}


