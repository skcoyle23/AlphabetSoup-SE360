package com.csse360.alphabetsoup;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.OrthographicCamera;

public class GameScreen implements Screen {
    final AlphabetSoup game;

    OrthographicCamera camera;

    GameBoard gameBoard;
    Sound losingSound;
    Sound matchSound;


    public GameScreen(final AlphabetSoup game) {
        this.game = game;

        // Loading game sound effects
        losingSound = Gdx.audio.newSound(Gdx.files.internal("losing-sound.wav"));
        matchSound = Gdx.audio.newSound(Gdx.files.internal("match-sound.wav"));

        // Creating the camera
        camera = new OrthographicCamera();
        camera.setToOrtho(false, 800, 480);

        gameBoard.getBoard();
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        camera.update();



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
