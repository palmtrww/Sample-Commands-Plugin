package club.palmtrww.commands.commands;


import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Fly implements CommandExecutor{

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (commandSender instanceof Player player) {
            if (command.getName().equalsIgnoreCase("fly")) {
                player.setFlying(true);
                player.sendMessage("You now have fly!!");
            }
        }
        return false;
    }
}