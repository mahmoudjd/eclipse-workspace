package oop.interfaces.game;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        RockPaperScissors rps = new RockPaperScissors();
        GamePlay.play(rps, scanner);
        System.out.println("======================");
        System.out.println("======================");
        ConnectFour ttt = new ConnectFour();
        GamePlay.play(ttt, scanner);        
        scanner.close();
    }
}
