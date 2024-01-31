package tic_tac_toe;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class TicTacToeGUI extends JFrame {
    private static final long serialVersionUID = 1L;
    private static final int BOARD_SIZE = 3;
    private static final int CELL_SIZE = 150;
    private JButton[][] buttons;
    private TicTacToeGame game;

    public TicTacToeGUI() {
        super("Tic-Tac-Toe");
        buttons = new JButton[BOARD_SIZE][BOARD_SIZE];
        game = new TicTacToeGame();
    }

    public void run() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(BOARD_SIZE, BOARD_SIZE));

        ButtonClickListener buttonClickListener = new ButtonClickListener();

        for (int row = 0; row < BOARD_SIZE; row++) {
            for (int col = 0; col < BOARD_SIZE; col++) {
                buttons[row][col] = new JButton();
                buttons[row][col].setFont(new Font(Font.SANS_SERIF, Font.BOLD, 50));
                buttons[row][col].addActionListener(buttonClickListener);
                add(buttons[row][col]);
            }
        }

        setSize(BOARD_SIZE * CELL_SIZE, BOARD_SIZE * CELL_SIZE);
        setVisible(true);
    }

    private class ButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();

            // Find the clicked button's position in the array
            for (int row = 0; row < BOARD_SIZE; row++) {
                for (int col = 0; col < BOARD_SIZE; col++) {
                    if (buttons[row][col] == clickedButton) {
                        makeMove(row, col);
                        return;
                    }
                }
            }
        }
    }

    public void makeMove(int row, int col) {
        if (game.getGame()[row][col] != null) {
            // Cell already occupied, do nothing
            return;
        }

        game.makeMove(row, col);
        buttons[row][col].setText(game.getGame()[row][col]);

        if (game.checkWinner("X")) {
            JOptionPane.showMessageDialog(this, "Player X wins!");
            game.resetGame();
            resetButtons();
        } else if (game.checkWinner("O")) {
            JOptionPane.showMessageDialog(this, "Player O wins!");
            game.resetGame();
            resetButtons();
        } else if (game.isBoardFull()) {
            JOptionPane.showMessageDialog(this, "It's a tie!");
            game.resetGame();
            resetButtons();
        }
    }

    private void resetButtons() {
        for (int row = 0; row < BOARD_SIZE; row++) {
            for (int col = 0; col < BOARD_SIZE; col++) {
                buttons[row][col].setText("");
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TicTacToeGUI ticTacToeGUI = new TicTacToeGUI();
            ticTacToeGUI.run();
        });
    }
}