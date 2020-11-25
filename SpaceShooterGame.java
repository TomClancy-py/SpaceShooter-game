package com.guddu.game;
import com.badlogic.gdx.grapics.*;
import com.badlogic.gdx.graphics.gd2;
import com.badlogic.gdx.*;

public class MyGame extends Game{

  

  GameScreen gamescreen;
  
  @Override
  public void create(){
  gameScreen = new GameScreen();
  setScreen(gameScreen);

  }


  @Override 
  public void render(){
  super.render();
  }

  

  @Override
  public void dispose(){
  gamescreen.dispose();
  
  }

  @Override 
  public void resize(int width, int height){
  gameScreen.resize(width, height);
  }






}

