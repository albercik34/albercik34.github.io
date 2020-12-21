package io.github.albercik34.Test1;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{
	public void onEnable() { 
		Bukkit.getConsoleSender().sendMessage("Uruchamiam sie");
		
	}
	public void onDisable() { 
		Bukkit.getConsoleSender().sendMessage("Wylaczam sie");
		} 
}