package org.jpacman.framework.model;

/**
 * Interface for inspecting the content of the board.
 * 
 * @author Arie van Deursen, TU Delft, Jan 15, 2012
 */
public interface IBoardInspector {

	/**
	 * Returns the width of the board.
	 * @return The width of the board, in number of cells.
	 */
	int getWidth();

	/**
	 * The height of the board, in number of cells.
	 * @return The height of the board, in number of cells.
	 */
	int getHeight();

	/**
	 * The predefined set of sprite types.
	 */
	enum SpriteType {
		PLAYER, GHOST, FOOD, EMPTY, WALL, OTHER
	};

	/**
	 * @param x
	 *            between 0 and this.getWidth - 1
	 * @param y
	 *            between 0 and this.getHeight - 1
	 * @return The sprite at location (x,y).
	 */
	Sprite spriteAt(int x, int y);

	/**
	 * @param x
	 *            between 0 and this.getWidth - 1
	 * @param y
	 *            between 0 and this.getHeight - 1
	 * @return The kind of sprite at location (x,y).
	 */
	SpriteType spriteTypeAt(int x, int y);

	// public Direction directionAt(int x, int y);

}
