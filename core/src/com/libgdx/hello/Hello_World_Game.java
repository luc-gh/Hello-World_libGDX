package com.libgdx.hello;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class Hello_World_Game extends ApplicationAdapter {
	SpriteBatch batch;  //variável de desenho gráfico
	BitmapFont font;  //variável de fonte
	
	@Override
	public void create () {  //chamada uma vez quando seu jogo é aberto pela primeira vez
		batch = new SpriteBatch();
		font = new BitmapFont();
	}

	/*
	@Override
	public void resize (int width, int height){}

	chamada quando seu jogo é redimensionado, e uma vez depois create()é chamada com a largura e altura iniciais do jogo
	*/

	@Override
	public void render () {  //chamada para atualizar o jogo, várias vezes p/ segundo, conforme o FPS de cada dispositivo
		Gdx.gl.glClearColor(.25f,.25f,.25f,1); //Determina cor de fundo (usando classe Gdx)
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);  //
		batch.begin();
		font.draw(batch,"Hello World!",Gdx.graphics.getWidth()/2f,Gdx.graphics.getHeight()/2f);
		batch.end();
	}

	/*
	* @Override
	* public void pause(){}
	* - chamada Android quando o aplicativo é enviado p/ segundo plano na área de trabalho, logo antes dispose() de ser chamada
	*
	* @Override
	* public void resume(){}
	* - é chamada apenas no Android, quando o aplicativo é trazido de volta ao primeiro plano
	*/


	@Override
	public void dispose () {  //é chamada quando o jogo é encerrado
		batch.dispose();
	}
}
