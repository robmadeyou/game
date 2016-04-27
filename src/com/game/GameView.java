package com.game;

import com.abereth.draw.shapes.Square;
import com.abereth.game.Game;
import com.abereth.game.View;
import com.abereth.gui.text.Text;
import com.abereth.input.Mouse;


public class GameView extends View
{
    public GameView(Game game)
    {
        super ( game );
    }

    @Override
    public void initialize ()
    {
        Text t = new Text ( "", 0, 0, 0, 0 );
        t.set ( "Awesome game 2k16 with a slice of toast and some beans" );
        add ( t );

    }

    @Override
    public void update(int delta)
    {
        if( Mouse.isLeftMouseClicked () )
        {
            add( new Square ( this.getMouseX (), this.getMouseY (), 20, 20 ) );
        }
    }
}
