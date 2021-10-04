package hunt.hunt;

import hunt.interactions.BlockInteractListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin implements org.bukkit.event.Listener {

    public enum gameState {
        preGame,
        midGame,
        postGame;
    }

    @Override
    public void onEnable() {
        // Plugin startup logic

        PluginManager pm = Bukkit.getPluginManager();
        pm.registerEvents((org.bukkit.event.Listener) this, this);
        pm.registerEvents((org.bukkit.event.Listener) new BlockInteractListener(), this);

        gameState state = gameState.preGame;

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
