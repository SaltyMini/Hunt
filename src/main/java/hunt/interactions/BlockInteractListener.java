package hunt.interactions;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import java.util.Objects;

public class BlockInteractListener implements Listener {

    @EventHandler
    public void Interact(PlayerInteractEvent event) {

        if(event.getClickedBlock() == null) {
            return;
        }

        Material block = event.getClickedBlock().getType();

       if(!(event.getAction().equals(Action.RIGHT_CLICK_BLOCK))) {
           return;
       }

       Player player = event.getPlayer();

        switch (block) {
            case RED_WOOL:
                        redWool(player);
                        break;
            case BLUE_WOOL:
                        blueWool(player);
                        break;
            default:
                break;

        }
    }

    public static void redWool(Player player) {

        player.sendMessage("You clicked red wool");

    }

    public static void blueWool(Player player) {

       player.sendMessage("You clicked blue wool");


    }

}
