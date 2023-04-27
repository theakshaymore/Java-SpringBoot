package com.example.demo.game;

public class GameRunner {

	
	public void run() {
		GamingConsole g1 = new Mario();
        g1.up();
        g1.down();
        g1.left();
        g1.right();

        GamingConsole g2 = new SuperMario();
        g2.up();
        g2.down();
        g2.left();
        g2.right();
    }
	

}
