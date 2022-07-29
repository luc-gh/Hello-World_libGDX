package com.libgdx.hello;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.utils.ScreenUtils;

//Desenhos são feitos com OpenGL (Open Graphics Library)
//Classe ShapeRenderer vai ser usadas para este jogo simples, mas existem renderizadores mais avançados em libGDX

public class Hello_World_Game extends ApplicationAdapter {
	ShapeRenderer shape;
	
	@Override
	public void create () {
		shape = new ShapeRenderer();
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(.25f,.25f,.25f,1); //Determina cor de fundo (usando classe Gdx)
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		//Desenhando círculo na tela, com os parâmetros:
		shape.begin(ShapeRenderer.ShapeType.Filled); //tipo
		shape.setColor(0,1,0,1);         //cor (verde)
		shape.circle(200,100,75);        //posição e raio
		shape.end();
	}

	@Override
	public void dispose () {
		shape.dispose();
	}
}
