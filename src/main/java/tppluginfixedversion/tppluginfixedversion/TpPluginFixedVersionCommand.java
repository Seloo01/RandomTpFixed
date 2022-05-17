package tppluginfixedversion.tppluginfixedversion;

import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import java.util.Random;

public class TpPluginFixedVersionCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player) {
            Player player = (Player) sender;




            player.teleport(TeleportUtils.generateLocation(player));

        }









        return true;
    }
}