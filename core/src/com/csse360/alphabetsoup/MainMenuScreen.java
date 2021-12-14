package com.csse360.alphabetsoup;

/**
 * Creating the main menu screen for the user to choose if they want
 * to start the game or view the directions
 */

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;

public class MainMenuScreen implements Screen {
    final AlphabetSoup game;
    OrthographicCamera camera;

    // loading the welcome screen image from the internal files
    Texture welcomeScreen = new Texture(Gdx.files.internal("first-screen.png"));

    /**
     * Constructor for the MainMenuScreen
     * @param game
     */
    public MainMenuScreen(AlphabetSoup game) {
        this.game = game;

        camera = new OrthographicCamera();
        camera.setToOrtho(false, 800, 480);
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0, 0, 0.2f, 1);

        camera.update();
        game.batch.setProjectionMatrix(camera.combined);

        game.batch.begin();
        game.batch.draw(welcomeScreen, 0, 0, 800, 480);
        game.batch.end();

        /**
         * Redirecting to the Alphabet Soup initial game screen if "S" is pressed
         */
        if(Gdx.input.isKeyPressed(Input.Keys.I)) {
            game.setScreen(new InfoScreen(game));
            //dispose();
        }


        if(Gdx.input.isKeyPressed(Input.Keys.S)) {
            game.setScreen(new GameScreen(game));
            dispose();
        }
    }


    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
