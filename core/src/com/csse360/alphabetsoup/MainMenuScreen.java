package com.csse360.alphabetsoup;

/**
 * Creating the main menu screen for the user to choose if they want
 * to start the game or view the directions
 */

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Label;

public class MainMenuScreen implements Screen {
    final AlphabetSoup game;
    OrthographicCamera camera;

    // loading the welcome screen image from the internal files
    Texture welcomeScreen = new Texture(Gdx.files.internal("first-screen.png"));

    /**
     * Constructor for the MainMenuScreen
     * @param gam
     */
    public MainMenuScreen(final AlphabetSoup gam) {
        game = gam;

        camera = new OrthographicCamera();
        camera.setToOrtho(false, 800, 480);

    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0, 0, 0.2f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        camera.update();
        game.batch.setProjectionMatrix(camera.combined);

        game.batch.begin();
        game.batch.draw(welcomeScreen, 0, 0, 800, 480);
        game.batch.end();

        /**
         * Redirecting to the Alphabet Soup initial game screen if "S" is pressed
         * Redirecting to Directions Screen if "I" is pressed
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
