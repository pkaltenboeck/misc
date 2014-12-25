/**
 * Prints a tree with trunk on stdout
 *
 * @author pkwien93
 * @version 2008-10-14
 */
public class Tree {
	public static void main(String[] args) {
		int trunkheight = 2;
		int height = 7;

		tree(height);
		trunk(trunkheight, height);
	}

	/**
	 * prints a tree on stdout
	 * @param height number of rows
	 */
	public static void tree(int height) {
		//loop to print the rows of the tree
		for (int row = 0; row < height; row++) {
			for (int col = 0; col < (height * 2 - 1); col++) {
				if (col >= (height - row - 1) && col <= (height + row - 1))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	/**
	 * prints the trunk of an tree on stdout
	 * @param trunkheight number of rows for the trunk
	 * @param height number of rows for the tree (neccessary to center the trunk)
	 */
	public static void trunk(int trunkheight, int height) {
		//loop to print the rows of the trunk
		for (int trunk = 0; trunk < trunkheight; trunk++) {
			//loop for the spaces to center the trunk
			for (int i = 0; i < height - 2; i++) {
				System.out.print(" ");
			}
			//printing the trunk
			System.out.println("***");
		}
	}
}