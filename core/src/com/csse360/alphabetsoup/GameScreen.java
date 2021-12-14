package com.csse360.alphabetsoup;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;

public class GameScreen implements Screen {
    final AlphabetSoup game;

    OrthographicCamera camera;

    //GameBoard gameBoard = new GameBoard();
    Sound losingSound;
    Sound matchSound;

    Texture gameBoardImg = new Texture(Gdx.files.internal("game-board.PNG"));

    public GameScreen(final AlphabetSoup game) {
        this.game = game;

        // Loading game sound effects
        losingSound = Gdx.audio.newSound(Gdx.files.internal("losing-sound.wav"));
        matchSound = Gdx.audio.newSound(Gdx.files.internal("match-sound.wav"));

        // Creating the camera
        camera = new OrthographicCamera();
        camera.setToOrtho(false, 800, 480);

        //gameBoard.print();

    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0,0,0.2f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        // Tells the camera to update its matrices
        camera.update();

        game.batch.setProjectionMatrix(camera.combined);

        game.batch.begin();
        game.batch.draw(gameBoardImg, 125, 40, 579, 425);
        //gameBoard.getBoard();
        game.font.draw(game.batch, "Score: ", 0, 480);
        game.batch.end();

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
