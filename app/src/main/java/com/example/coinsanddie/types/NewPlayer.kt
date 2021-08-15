package com.example.coinsanddie.types

import androidx.databinding.ObservableBoolean

data class NewPlayer(
    var playerName: String = "",
    val isHuman: ObservableBoolean = ObservableBoolean(true),
    val canBeRemoved: Boolean = true,
    val canBeToggled: Boolean = true,
    // This field only true if a user can't be removed from the game.
    // Controls whether or not a player is the game or not.
    var isIncluded: ObservableBoolean = ObservableBoolean(!canBeRemoved)
)

