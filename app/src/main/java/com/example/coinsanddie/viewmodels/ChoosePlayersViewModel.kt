package com.example.coinsanddie.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.coinsanddie.types.NewPlayer

class ChoosePlayersViewModel : ViewModel() {
    val players = MutableLiveData<List<NewPlayer>>().apply {
        // The first two players cannot be removed from the game since the game needs
        // a minimum of 2 players. The first player cannot be toggled to be an
        // AI player because somebody has to play the game.
        this.value = (1..6).map {
            NewPlayer(
                canBeRemoved = it > 2,
                canBeToggled = it > 1
            )
        }
    }
}