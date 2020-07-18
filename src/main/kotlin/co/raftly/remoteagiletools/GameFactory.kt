package co.raftly.remoteagiletools

import co.raftly.remoteagiletools.romanvoting.Player
import co.raftly.remoteagiletools.romanvoting.RomanVotingGame

class GameFactory {

    fun create(players: List<Player>) = RomanVotingGame(players)
}