package hunt.preGameStart;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import java.util.HashMap;

public class preGame {

    public HashMap<Player, Player> players = new HashMap<Player, Player>();

    public enum gameStateTemp { //this is temp till I work out how to read the enum from the other class
        preGameTemp,
        midGameTemp,
        postGameTemp;
    }

    private gameStateTemp state = gameStateTemp.preGameTemp;

    @EventHandler
    public void join(PlayerJoinEvent event) {

        if (state != state.preGameTemp) {

            return;
        }

        Player player = event.getPlayer();

        players.put(event.getPlayer());

        if(players.size == 8) {
            state = gameStateTemp.midGameTemp;
        }

    }

    @EventHandler
    public void leave(PlayerQuitEvent event) {

    }

    public void listAdd(Player player) {


    }
}
