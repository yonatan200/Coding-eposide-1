package me.yonatan200.YouTube;

import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	Logger logger = Bukkit.getServer().getLogger();
	
	public void onEnable() {
		logger.info("Test enable!");
	}
	
	public void onDisable() {
		logger.info("Test disable!");
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd,
			String label, String[] args) {
		
		Player player = (Player) sender;
		
		if(cmd.getName().equalsIgnoreCase("hi")) {
			player.sendMessage("hello!");
			player.setGameMode(GameMode.SURVIVAL);
		}
		return false;
	}
}
