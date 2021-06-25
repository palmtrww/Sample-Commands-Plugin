package club.palmtrww.commands.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class God implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] strings) {
        if (sender instanceof Player player) {
            if (cmd.getName().equalsIgnoreCase("god")) {
                player.setInvulnerable(true);
                player.sendMessage("You now have god mode enabled!!!");
            }
        }
        return false;
    }
}
