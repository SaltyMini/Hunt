package hunt.hunt;

import hunt.interactions.TestBlock;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic

        PluginManager pm = Bukkit.getPluginManager();
        pm.registerEvents((Listener) this, this);
        pm.registerEvents((Listener) new TestBlock(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
