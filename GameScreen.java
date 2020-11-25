package com.guddu.game.screen;

import com.badlogic.gdx.Screen;

public class GameScreen implements Screen{
	//Screen
	private Camera camera;
	private ViewPort viewport;
	//graphics 
	private SpriteBatch batch;
	private Texture background;
	
	//timing
	private int backgroundOffset;

	//world parameters	
	private final int GAME_WIDTH = 72;
	private final int GAME_HEIGHT = 128;

	GameScreen(){

		camera = new OrthographicCamera();
		viewport = new StretchViewport(WORLD_WIDTH, WORLD_HEIGHT, camera);
		background = new Texture("name of the image in the assests folder");
		backgroundOffset = 0;
		batch = new SpriteBatch();
	}
	
	@Override
	public void render(float deltaTime){
		batch.begin();

		//scrollin background
		backgroundOffset ++;
		if (backgroundOffset % WORLD_HEIGHT == 0){
			backgroundOffset = 0;
			
		}
		
		
		batch.draw(background, 0, -backgroundOffset, WORLD_WIDTH, WORLD_HEIGHT);
		batch.draw(background, 0, -backgroundOffset + WORLD_HEIGHT, WORLD_WIDTH, WORLD_HEIGHT);
		



		batch.end();
	}

	@Override
	public void resize(int p1, int p2){
		viewport.update(width, height,centerCamera true);
		batch.setProjectMatrix(camera.combined);
		
	}

	@Override 
	public void show(){
		
	}
	@Override 
	public void hide(){
			
	}
	@Override 
	public void pause(){
				
	}

	@Override 
	public void resume(){
					
	}

	@Override
	public void dispose(){
		
	}
		

}