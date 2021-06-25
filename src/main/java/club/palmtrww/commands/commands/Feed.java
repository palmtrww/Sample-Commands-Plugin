package club.palmtrww.commands.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Feed implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player player) {
            if (cmd.getName().equalsIgnoreCase("feed")) {
                player.setFoodLevel(20);
                player.sendMessage("You have been feed!");
            }
        }

        return false;
    }
}
