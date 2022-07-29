package com.libgdx.hello;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import com.libgdx.hello.Hello_World_Game;

public class DesktopLauncher {
	public static void main (String[] arg) {
		Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
		config.setForegroundFPS(60);
		config.setTitle("Hello World");
		config.setWindowedMode(400,400); //dimensões
		config.setResizable(false); //dimensões de tela inalteráveis
		new Lwjgl3Application(new Hello_World_Game(), config);
	}
}
