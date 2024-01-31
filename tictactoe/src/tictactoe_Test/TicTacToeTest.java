package tictactoe_Test;

import tic_tac_toe.TicTacToeGame;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class TicTacToeTest {

	/**
	 * @author mahmoud makeValidMovesPlayerX(): Testet, ob Spieler X gültige Züge
	 *         machen kann und ob das Spielfeld entsprechend aktualisiert wird.
	 */
	@Nested
	@DisplayName("Make Move for Player X")
	class MakeMovePlayerXTests {

		@Test
		@DisplayName("Make valid moves for Player X")
		void makeValidMovesPlayerX() {
			TicTacToeGame ticTacToe = new TicTacToeGame();

			ticTacToe.makeMove(0, 0);
			assertEquals("X", ticTacToe.getGame()[0][0]); // Überprüfe, ob der Zug von Spieler X gültig war

			ticTacToe.makeMove(1, 0);
			ticTacToe.makeMove(1, 1);
			assertEquals("X", ticTacToe.getGame()[1][1]); // Überprüfe, ob die Züge von Spieler X gültig waren
		}

		@Test
		@DisplayName("Make moves on occupied cells for Player X")
		void makeMovesOnOccupiedCellsPlayerX() {
			TicTacToeGame ticTacToe = new TicTacToeGame();

			ticTacToe.makeMove(0, 0);
			ticTacToe.makeMove(0, 0); // Versuche, einen Zug auf einer besetzten Zelle zu machen
			assertNull(ticTacToe.getGame()[0][1]); // Stelle sicher, dass sich der Zustand des Spielfelds nicht geändert
													// hat
		}
	}

	/**
	 * 
	 * @author mahmoud 
	 * makeMovesOnOccupiedCellsPlayerX(): Testet, ob Spieler X keinen Zug 
	 * auf eine besetzte Zelle machen kann und ob sich der Zustand des 
	 * Spielfelds nicht ändert.
	 */
	@Nested
	@DisplayName("Make Move for Player O")
	class MakeMovePlayerOTests {

		/**
		 * makeValidMovesPlayerO(): Testet, ob Spieler O gültige Züge machen kann 
		 * und ob das Spielfeld entsprechend aktualisiert wird.
		 */
		@Test
		@DisplayName("Make valid moves for Player O")
		void makeValidMovesPlayerO() {
			TicTacToeGame ticTacToe = new TicTacToeGame();

			ticTacToe.makeMove(0, 0); // Zug von Spieler X
			ticTacToe.makeMove(1, 1); // Zug von Spieler O
			assertEquals("O", ticTacToe.getGame()[1][1]); // Überprüfe, ob der Zug von Spieler O gültig war
		}

		/**
		 * makeMovesOnOccupiedCellsPlayerO(): Testet, ob Spieler O keinen Zug 
		 * auf eine besetzte Zelle machen kann und ob sich der Zustand des 
		 * Spielfelds nicht ändert.
		 */
		@Test
		@DisplayName("Make moves on occupied cells for Player O")
		void makeMovesOnOccupiedCellsPlayerO() {
			TicTacToeGame ticTacToe = new TicTacToeGame();

			ticTacToe.makeMove(0, 0);
			ticTacToe.makeMove(0, 1); // Zug von Spieler X
			ticTacToe.makeMove(1, 0); // Versuche, einen Zug auf einer besetzten Zelle zu machen
			assertEquals("X", ticTacToe.getGame()[1][0]); // Stelle sicher, dass sich der Zustand des Spielfelds nicht
															// geändert hat
		}
	}

	@Nested
	@DisplayName("Check Winner")
	class CheckWinnerTests {

		/**
		 * checkRowsForWinner(): Überprüft, ob der Gewinner in einer Reihe
		 * korrekt erkannt wird.
		 */
		@Test
		@DisplayName("Check rows for a winner")
		void checkRowsForWinner() {
			TicTacToeGame ticTacToe = new TicTacToeGame();

			ticTacToe.makeMove(0, 0);
			ticTacToe.makeMove(1, 0);
			ticTacToe.makeMove(0, 1);
			ticTacToe.makeMove(1, 1);
			ticTacToe.makeMove(0, 2);
			assertTrue(ticTacToe.checkWinner("X")); // Überprüfe, ob Spieler X gewonnen hat

			ticTacToe.resetGame();
			ticTacToe.makeMove(0, 0);
			ticTacToe.makeMove(1, 0);
			ticTacToe.makeMove(1, 1);
			ticTacToe.makeMove(2, 0);
			ticTacToe.makeMove(2, 2);
			assertFalse(ticTacToe.checkWinner("O")); // Überprüfe, ob Spieler O nicht gewonnen hat
		}

		/**
		 * checkDiagonalsForWinner():Überprüft, ob der Gewinner in einer Diagonale 
		 * korrekt erkannt wird.
		 */
		@Test
		@DisplayName("Check columns for a winner")
		void checkColumnsForWinner() {
			TicTacToeGame ticTacToe = new TicTacToeGame();

			ticTacToe.makeMove(0, 0);
			ticTacToe.makeMove(0, 1);
			ticTacToe.makeMove(1, 0);
			ticTacToe.makeMove(1, 1);
			ticTacToe.makeMove(2, 0);
			assertTrue(ticTacToe.checkWinner("X")); // Überprüfe, ob Spieler X gewonnen hat

			ticTacToe.resetGame();
			ticTacToe.makeMove(0, 0);
			ticTacToe.makeMove(1, 0);
			ticTacToe.makeMove(1, 1);
			ticTacToe.makeMove(2, 0);
			ticTacToe.makeMove(1, 2);
			ticTacToe.makeMove(0, 0);
			assertFalse(ticTacToe.checkWinner("O")); // Überprüfe, ob Spieler O nicht gewonnen hat
		}

		/**
		 * checkColumnsForWinner(): Überprüft, ob der Gewinner
		 * in einer Spalte korrekt erkannt wird.
		 */
		@Test
		@DisplayName("Check diagonals for a winner")
		void checkDiagonalsForWinner() {
			TicTacToeGame ticTacToe = new TicTacToeGame();

			ticTacToe.makeMove(0, 0);
			ticTacToe.makeMove(1, 0);
			ticTacToe.makeMove(1, 1);
			ticTacToe.makeMove(2, 0);
			ticTacToe.makeMove(2, 2);
			assertTrue(ticTacToe.checkWinner("X")); // Überprüfe, ob Spieler X gewonnen hat

			ticTacToe.resetGame();
			ticTacToe.makeMove(0, 2);
			ticTacToe.makeMove(1, 0);
			ticTacToe.makeMove(1, 1);
			ticTacToe.makeMove(2, 0);
			ticTacToe.makeMove(1, 2);
			ticTacToe.makeMove(0, 0);
			assertTrue(ticTacToe.checkWinner("O")); // Überprüfe, ob Spieler O gewonnen hat
		}
	}

	@Nested
	@DisplayName("Is Board Full")
	class IsBoardFullTests {

		/**
		 * boardNotFull(): Überprüft, ob das Spielfeld als nicht voll erkannt wird,
		 *  wenn es noch leere Zellen gibt.
		 */
		@Test
		@DisplayName("Board is not full")
		void boardNotFull() {
			TicTacToeGame ticTacToe = new TicTacToeGame();

			ticTacToe.makeMove(0, 0);
			ticTacToe.makeMove(0, 1);
			ticTacToe.makeMove(0, 2);
			ticTacToe.makeMove(1, 0);
			ticTacToe.makeMove(1, 1);
			ticTacToe.makeMove(1, 2);
			ticTacToe.makeMove(2, 0);
			ticTacToe.makeMove(2, 1);
			assertFalse(ticTacToe.isBoardFull()); // Überprüfe, ob das Spielfeld nicht voll ist
		}

		/**
		 * boardFull(): Überprüft, ob das Spielfeld als voll erkannt wird, 
		 * wenn alle Zellen belegt sind.
		 */
		@Test
		@DisplayName("Board is full")
		void boardFull() {
			TicTacToeGame ticTacToe = new TicTacToeGame();

			ticTacToe.makeMove(0, 0);
			ticTacToe.makeMove(0, 1);
			ticTacToe.makeMove(0, 2);
			ticTacToe.makeMove(1, 0);
			ticTacToe.makeMove(1, 1);
			ticTacToe.makeMove(1, 2);
			ticTacToe.makeMove(2, 0);
			ticTacToe.makeMove(2, 1);
			ticTacToe.makeMove(2, 2);
			assertTrue(ticTacToe.isBoardFull()); // Überprüfe, ob das Spielfeld voll ist
		}
	}

	/**
	 * 
	 * @author mahmoud
	 * resetGame(): Überprüft, ob das Spiel erfolgreich zurückgesetzt wird und 
	 * alle Zellen wieder den Wert null haben.
	 */
	@Nested
	@DisplayName("Reset Game")
	class ResetGameTests {

		@Test
		@DisplayName("Reset the game")
		void resetGame() {
			TicTacToeGame ticTacToe = new TicTacToeGame();

			ticTacToe.makeMove(0, 0);
			ticTacToe.makeMove(0, 1);
			ticTacToe.makeMove(1, 0);
			ticTacToe.makeMove(1, 1);
			ticTacToe.resetGame(); // Setze das Spiel zurück

			assertNull(ticTacToe.getGame()[0][0]); // Überprüfe, ob das Spielfeld an Position [0][0] null ist
			assertNull(ticTacToe.getGame()[0][1]); // Überprüfe, ob das Spielfeld an Position [0][1] null ist
			assertNull(ticTacToe.getGame()[1][0]); // Überprüfe, ob das Spielfeld an Position [1][0] null ist
			assertNull(ticTacToe.getGame()[1][1]); // Überprüfe, ob das Spielfeld an Position [1][1] null ist
		}
	}

	/**
	 * 
	 * @author mahmoud
	 * playCompleteGame(): Simuliert ein vollständiges Spiel und überprüft 
	 * den Gewinner sowie den Füllstand des Spielfelds.
	 */
	@Nested
	@DisplayName("Integration Tests")
	class IntegrationTests {

		@Test
		@DisplayName("Play a complete game")
		void playCompleteGame() {
			TicTacToeGame ticTacToe = new TicTacToeGame();

			ticTacToe.makeMove(0, 0);
			ticTacToe.makeMove(0, 1);
			ticTacToe.makeMove(1, 1);
			ticTacToe.makeMove(2, 0);
			ticTacToe.makeMove(2, 2);

			assertTrue(ticTacToe.checkWinner("X")); // Überprüfe, ob Spieler X gewonnen hat
			assertFalse(ticTacToe.isBoardFull()); // Überprüfe, ob das Spielfeld nicht voll ist

			ticTacToe.resetGame(); // Setze das Spiel zurück

			assertNull(ticTacToe.getGame()[0][0]); // Überprüfe, ob das Spielfeld an Position [0][0] null ist
			assertNull(ticTacToe.getGame()[0][1]); // Überprüfe, ob das Spielfeld an Position [0][1] null ist
			assertNull(ticTacToe.getGame()[1][1]); // Überprüfe, ob das Spielfeld an Position [1][1] null ist
			assertNull(ticTacToe.getGame()[2][0]); // Überprüfe, ob das Spielfeld an Position [2][0] null ist
			assertNull(ticTacToe.getGame()[2][2]); // Überprüfe, ob das Spielfeld an Position [2][2] null ist
		}
	}
}
