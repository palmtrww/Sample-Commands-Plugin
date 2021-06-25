package club.palmtrww.commands;

import club.palmtrww.commands.commands.*;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public class Cmd extends JavaPlugin{

    @Override
    public void onEnable() {

        getLogger().info("onEnable is called!");
        getCommand("fly").setExecutor(new Fly());
        getCommand("feed").setExecutor(new Feed());
        getCommand("god").setExecutor(new God());
    }

}
