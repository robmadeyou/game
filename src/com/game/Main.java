package com.game;

import com.abereth.game.Game;

public class Main
{
    public static void main (String[] args)
    {
        Game g = new Game( 500, 500 );
        g.addView( new GameView( g ) );
        g.start();
    }
}
