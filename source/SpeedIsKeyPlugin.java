/*
 * Made by IntSPstudio
 * Bukkit plugin: Speed Is Key
 * ID: 340005001
 */
package com.intspstudio.bukkit.SpeedIsKeyPlugin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class SpeedIsKeyPlugin extends JavaPlugin {
	@Override
	public void onEnable() {
		getLogger().info("Enabling speediskey");
	}
	@Override
	public void onDisable() {
		getLogger().info("Disabling speediskey");
	}
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (cmd.getName().equalsIgnoreCase("speediskey") && sender instanceof Player) {
			Player player = (Player) sender;
			float currentSpeed =0f;
			currentSpeed = player.getWalkSpeed();
			if (currentSpeed < 1.0f) {
				player.setWalkSpeed(1.0f);
				player.setFlySpeed(1.0f);
			} else {
				player.setWalkSpeed(0.2f);
				player.setFlySpeed(0.2f);
			}
			return true;
		}
		return false;
	}
}