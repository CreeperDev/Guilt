package net.turtleshell.Guilt;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class Guilt extends JavaPlugin {

    ConfigManager manager;
    Config config;


    //Enable and configuration file setup
    @Override
    public void onEnable(){

       /* manager = new ConfigManager(this);
        config = manager.getNewConfig("config.yml", new String[]{
                "Guilt 2.0!",
                "Please download config.yml",
                "at //placeholder//",
                "and replace this config."
        }); */


        Bukkit.getServer().getLogger().info(ChatColor.GREEN + "[" + getDescription().getName() + "]" + " Written By " + getDescription().getAuthors() + "  Is Enabled!");
        Bukkit.getServer().getPluginManager().registerEvents(new Friendly(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new Hostiles(), this);
    }

    @Override
	public boolean onCommand(CommandSender sender,Command cmd,String commandLabel,String[] args){
		if(commandLabel.equalsIgnoreCase("guilt")){
			if(args.length==0){
                sender.sendMessage(ChatColor.RED + "Please use /guilt help for a list of commands!");
                return true;
            }
            if(args[0].equalsIgnoreCase("help")){
                if(sender.hasPermission("guilt.help") || sender.isOp()){
                    sender.sendMessage(ChatColor.AQUA + "~~~~~~| Guilt Command List |~~~~~~");
                    sender.sendMessage(ChatColor.GREEN + "/guilt help --> " + ChatColor.DARK_PURPLE + "Shows full command list for Guilt plugin.");
                    sender.sendMessage(ChatColor.GREEN + "/guilt version --> " + ChatColor.DARK_PURPLE + "Shows current plugin version number.");
                    sender.sendMessage(ChatColor.GREEN + "/guilt reload --> " + ChatColor.DARK_PURPLE + "Reloads Guilt's config.yml");
                    return true;
                }else{
                    sender.sendMessage(ChatColor.RED + "You do not have permission for this command!");
                    return true;
                }
            }else if(args[0].equalsIgnoreCase("version")){
                if(sender.hasPermission("guilt.admin") || sender.isOp()){
                    sender.sendMessage(ChatColor.GREEN + "Guilt is running version " + ChatColor.DARK_PURPLE + getDescription().getVersion() + ChatColor.GREEN + " using Bukkit 1.8!");
                    return true;
                }else{
                    sender.sendMessage(ChatColor.RED + "You do not have permission for this command!");
                    return true;
                }
            }else if(args[0].equalsIgnoreCase("reload")){
                if(sender.hasPermission("guilt.admin") || sender.isOp()){
                    sender.sendMessage(ChatColor.AQUA + "Guilt is saving configuration");
                    config.reloadConfig();
                    config.saveConfig();
                    sender.sendMessage(ChatColor.AQUA + "Guilt has finished reloading");
                }
            }
		}

		return true;
	}

    //Disable
    @Override
    public void onDisable(){
        Bukkit.getServer().getLogger().info("[" + getDescription().getName() + "]" + "  Version " + getDescription().getVersion() + "  Is now Disabled");
    }
}

