package co.raftly.remoteagiletools

import co.raftly.remoteagiletools.romanvoting.Player
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.collections.shouldContainExactly

class GameFactoryTest: StringSpec({

    "create creates a game with players" {
        val players = arrayListOf<Player>(
                Player("alice"),
                Player("bob")
        )
        val game = GameFactory().create(players)

        game.players shouldContainExactly players
    }
})