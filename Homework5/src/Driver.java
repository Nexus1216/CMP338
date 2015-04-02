
public class Driver {

	public static void main(String[] args) {
		Queens game = new Queens();
		game.displayBoard();
		//game.clearBoard();
		for(int i = 1; i < game.BOARD_SIZE; i++){
			game.placeQueens(i);
		}
		game.displayBoard();
	}
	
	
}
