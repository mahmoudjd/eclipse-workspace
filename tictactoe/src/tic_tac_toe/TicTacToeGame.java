package tic_tac_toe;

public class TicTacToeGame {
	private static final int BOARD_SIZE = 3;
	private String[][] game;
	private String currentPlayer;

	public TicTacToeGame() {
		game = new String[BOARD_SIZE][BOARD_SIZE];
		currentPlayer = "X"; // Set initial player to "X"
	}

	public String[][] getGame() {
		return game;
	}

	public void makeMove(int row, int col) {
		if (game[row][col] != null) {
			// Cell already occupied, do nothing
			return;
		}

		game[row][col] = currentPlayer;

		// Switch the current player
		currentPlayer = currentPlayer.equals("X") ? "O" : "X";
	}

	public boolean checkWinner(String currentPlayer) {
		// Check rows and columns
		for (int i = 0; i < BOARD_SIZE; i++) {
			if (currentPlayer.equals(game[i][0]) && currentPlayer.equals(game[i][1])
					&& currentPlayer.equals(game[i][2])) {
				return true; // Row i is a win
			}
			if (currentPlayer.equals(game[0][i]) && currentPlayer.equals(game[1][i])
					&& currentPlayer.equals(game[2][i])) {
				return true; // Column i is a win
			}
		}

		// Check diagonals
		if (currentPlayer.equals(game[0][0]) && currentPlayer.equals(game[1][1]) && currentPlayer.equals(game[2][2])) {
			return true; // Diagonal from top-left to bottom-right is a win
		}
		if (currentPlayer.equals(game[0][2]) && currentPlayer.equals(game[1][1]) && currentPlayer.equals(game[2][0])) {
			return true; // Diagonal from top-right to bottom-left is a win
		}

		return false;
	}

	public boolean isBoardFull() {
		for (String[] row : game) {
			for (String cell : row) {
				if (cell == null) {
					return false; // Found an empty cell, board is not full
				}
			}
		}
		return true; // All cells are filled, board is full
	}

	public void resetGame() {
		currentPlayer = "X";
		for (int row = 0; row < BOARD_SIZE; row++) {
			for (int col = 0; col < BOARD_SIZE; col++) {
				game[row][col] = null;
			}
		}
	}
}
