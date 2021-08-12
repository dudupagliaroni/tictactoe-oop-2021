package com.eduardo.jogo;

import static com.eduardo.jogo.PlayerNumber.PlayerMark.*;

public enum PlayerNumber {

    PLAYER_1(X), PLAYER_2(O);

    private PlayerMark mark;

    public PlayerMark getMark() {
        return mark;
    }

    PlayerNumber(PlayerMark mark) {
        this.mark = mark;
    }

    public enum PlayerMark {
        O, X, E
    }

}
