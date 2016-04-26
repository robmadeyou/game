package com.game;

import com.abereth.G;
import com.abereth.game.Game;

public class Main
{
    public static void main (String[] args)
    {
        G.ARP = "./lib/Abereth/res/";
        Game g = new Game( 500, 500 );
        g.addView( new GameView( g ) );
        g.start();
    }
}
