package com.libgdx.hello;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

//A animação requer 2 ações básicas (podem haver mais): armazenar estados e atualiza-los conforme o tempo

public class Hello_World_Game extends ApplicationAdapter {
	ShapeRenderer shape;

	float circleX = 200f;
	float circleY = 100f;

	float xVel = 120f;
	float yVel = 60f;

	@Override
	public void create () {
		shape = new ShapeRenderer();
	}

	@Override
	public void render () {
		//Animação:
		circleX += xVel * Gdx.graphics.getDeltaTime();
		circleY += yVel * Gdx.graphics.getDeltaTime();
		if(circleX < 0 || circleX > Gdx.graphics.getWidth()){xVel *= -1;}
		if(circleY < 0 || circleY > Gdx.graphics.getHeight()){yVel *= -1;}

		Gdx.gl.glClearColor(.25f,.25f,.25f,1); //Determina cor de fundo (usando classe Gdx)
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		shape.begin(ShapeRenderer.ShapeType.Filled); //tipo
		shape.setColor(0,1,0,1); //cor (verde)
		shape.circle(circleX, circleY,75); //posição e raio
		shape.end();
	}

	@Override
	public void dispose () {
		shape.dispose();
	}
}
