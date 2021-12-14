package com.csse360.alphabetsoup;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;


public class InfoScreen implements Screen {
    final AlphabetSoup game;
    OrthographicCamera camera;

    // loading the instructions screen images from the internal files

    Texture infoScreen = new Texture(Gdx.files.internal("how-to.png"));

    /**
     * Constructor for the InfoScreen
     * @param game
     */
    public InfoScreen(AlphabetSoup game) {
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
        game.batch.draw(infoScreen, 0, 0, 800, 480);
        game.batch.end();

        /**
         * Redirecting to the Alphabet Soup initial game screen if "Any key" is pressed
         */

        if(Gdx.input.isKeyPressed(Input.Keys.ANY_KEY)) {
            game.setScreen(new MainMenuScreen(game));
            //dispose();
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