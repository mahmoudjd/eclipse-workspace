package hamurabi.main;

import java.util.Scanner;

import hamurabi.menus.TextInterface;

public class Codeopolis {

    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);

        TextInterface textInterface = new TextInterface(sc);

        textInterface.run();
    }
}