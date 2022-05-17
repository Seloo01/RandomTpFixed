package tppluginfixedversion.tppluginfixedversion;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import java.util.Random;

import java.util.Random;

public class TeleportUtils {

    public static Location generateLocation(Player player){
        Random random = new Random();

        int x = random.nextInt(200);
        int y = 150;
        int z = random.nextInt(200);

        Location randomLocation = new Location(player.getWorld(), x, y, z);

        y = randomLocation.getWorld().getHighestBlockYAt(randomLocation);
        randomLocation.setY(y);

        return randomLocation;
    }
}


