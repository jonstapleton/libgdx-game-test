package com.mygdx.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mygdx.game.Game;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		// edit configuration
		config.title = "My New Drop Game";
		config.width = 800;
		config.height = 480;
		
		// run the game
		new LwjglApplication(new Game(), config);
	}
}
