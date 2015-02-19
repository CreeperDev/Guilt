package net.turtleshell.Guilt;

import java.util.Random;

import org.bukkit.ChatColor;
import org.bukkit.entity.Blaze;
import org.bukkit.entity.CaveSpider;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.Enderman;
import org.bukkit.entity.Ghast;
import org.bukkit.entity.PigZombie;
import org.bukkit.entity.Player;
import org.bukkit.entity.Skeleton;
import org.bukkit.entity.Spider;
import org.bukkit.entity.Witch;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

public class Hostiles implements Listener {

    //Setup for RNG
    Random opt = new Random();
    int number;

    //Listener Setup
    @EventHandler
    public void onEntityDeath(EntityDeathEvent e){
        String msg = "";

        //Random Number Generator
        for(int counter=1; counter<=1; counter ++){
            number = 1+opt.nextInt(5);
        }

        //Creeper setup
        if(e.getEntity() instanceof Creeper){
            Creeper cr = (Creeper) e.getEntity();

            if(number == 1){
                msg = (ChatColor.RED + "SSSSssssssss - I just wanted to be Friends.");
            }else if(number ==2){
                msg = (ChatColor.RED + "Oh so I suppose you think you're cool now.");
            }else if(number ==3){
                msg = (ChatColor.RED + "Please dont hit my friend behind you!");
            }else if(number == 4){
                msg = (ChatColor.RED + "Creepers just make the game more intresting!");
            }else if(number == 5){
                msg = (ChatColor.RED + "Im just gonna get you next time.");
            }

            if(cr.getKiller() instanceof Player){
                if(cr.getKiller().hasPermission("guilt.use") || cr.getKiller().isOp()){
                    cr.getKiller().sendMessage(msg);
                }
            }
        }

        //Ghast setup
        else if(e.getEntity() instanceof Ghast){
            Ghast gh = (Ghast) e.getEntity();

            if(number == 1){
                msg = (ChatColor.RED + "But... but... I had such a sweet face.");
            }else if(number ==2){
                msg = (ChatColor.RED + "I'm sorry I was just scared.");
            }else if(number ==3){
                msg = (ChatColor.RED + "Hey I never said I wanted the fireball back!");
            }else if(number == 4){
                msg = (ChatColor.RED + "Worst game of catch ever!");
            }else if(number == 5){
                msg = (ChatColor.RED + "I hope you enjoy my screams.");
            }

            if(gh.getKiller() instanceof Player){
                if(gh.getKiller().hasPermission("guilt.use") || gh.getKiller().isOp()){
                    gh.getKiller().sendMessage(msg);
                }
            }
        }

        //Pigman setup
        else if(e.getEntity() instanceof PigZombie){
            PigZombie pz = (PigZombie) e.getEntity();

            if(number == 1){
                msg = (ChatColor.RED + "It's cool my brothers will avenge me.");
            }else if(number ==2){
                msg = (ChatColor.RED + "Wow it didn't even attack you first.");
            }else if(number ==3){
                msg = (ChatColor.RED + "One nugget shouldnt be worth it.");
            }else if(number == 4){
                msg = (ChatColor.RED + "Haven't I already suffered enough, just look at my face.");
            }else if(number == 5){
                msg = (ChatColor.RED + "Sure I guess it's ok that you killed me for no reason.");
            }

            if(pz.getKiller() instanceof Player){
                if(pz.getKiller().hasPermission("guilt.use") || pz.getKiller().isOp()){
                    pz.getKiller().sendMessage(msg);
                }
            }
        }

        //Spider setup
        else if(e.getEntity() instanceof Spider){
            Spider sp = (Spider) e.getEntity();

            if(number == 1){
                msg = (ChatColor.RED + "I would've just given you the string.");
            }else if(number ==2){
                msg = (ChatColor.RED + "HI wanna be firen- Why are you hitting me?");
            }else if(number ==3){
                msg = (ChatColor.RED + "You didn't like my jumping kisses?");
            }else if(number == 4){
                msg = (ChatColor.RED + "Well I guess I shouldnt scare you anymore.");
            }else if(number == 5){
                msg = (ChatColor.RED + "It only had love inside It's eight eyes");
            }

            if(sp.getKiller() instanceof Player){
                if(sp.getKiller().hasPermission("guilt.use") || sp.getKiller().isOp()){
                    sp.getKiller().sendMessage(msg);
                }
            }
        }

        //CaveSpider setup
        else if(e.getEntity() instanceof CaveSpider){
            CaveSpider csp = (CaveSpider) e.getEntity();

            if(number == 1){
                msg = (ChatColor.RED + "I would've just given you the string.");
            }else if(number ==2){
                msg = (ChatColor.RED + "HI wanna be firen- Why are you hitting me?");
            }else if(number ==3){
                msg = (ChatColor.RED + "You didn't like my jumping kisses?");
            }else if(number == 4){
                msg = (ChatColor.RED + "Well I guess I shouldnt scare you anymore.");
            }else if(number == 5){
                msg = (ChatColor.RED + "It only had love inside It's eight eyes");
            }

            if(csp.getKiller() instanceof Player){
                if(csp.getKiller().hasPermission("guilt.use") || csp.getKiller().isOp()){
                    csp.getKiller().sendMessage(msg);
                }
            }
        }

        //Blaze setup
        else if(e.getEntity() instanceof Blaze){
            Blaze bl = (Blaze) e.getEntity();

            if(number == 1){
                msg = (ChatColor.RED + "I didn't mean to fireball you, I just get so excited.");
            }else if(number ==2){
                msg = (ChatColor.RED + "Just because it makes a cool sound when you hit it doesn't mean you should kill it.");
            }else if(number ==3){
                msg = (ChatColor.RED + "Do you even use blaze rods?");
            }else if(number == 4){
                msg = (ChatColor.RED + "Well you should just feel great now shouldn't you?");
            }else if(number == 5){
                msg = (ChatColor.RED + "Fireballs are the only way I know how to say hi.");
            }

            if(bl.getKiller() instanceof Player){
                if(bl.getKiller().hasPermission("guilt.use") || bl.getKiller().isOp()){
                    bl.getKiller().sendMessage(msg);
                }
            }
        }

        //Enderman setup
        else if(e.getEntity() instanceof Enderman){
            Enderman en = (Enderman) e.getEntity();

            if(number == 1){
                msg = (ChatColor.RED + "How many more times do I have to teleport before you get the hint?");
            }else if(number ==2){
                msg = (ChatColor.RED + "I hope my death rattle haunts you in your dreams.");
            }else if(number ==3){
                msg = (ChatColor.RED + "Kinda pointless when you're gonna lose to the EnderDragon anyway.");
            }else if(number == 4){
                msg = (ChatColor.RED + "How could you kill a frienderman!");
            }else if(number == 5){
                msg = (ChatColor.RED + "I was just trying to give you the block in my hand for your house.");
            }

            if(en.getKiller() instanceof Player){
                if(en.getKiller().hasPermission("guilt.use") || en.getKiller().isOp()){
                    en.getKiller().sendMessage(msg);
                }
            }
        }

        //Skeleton setup
        else if(e.getEntity() instanceof Skeleton){
            Skeleton sk = (Skeleton) e.getEntity();

            if(number == 1){
                msg = (ChatColor.RED + "I was shooting the creeper behind you I swear.");
            }else if(number ==2){
                msg = (ChatColor.RED + "I catch fire during the day, Isn't that enough for you?");
            }else if(number ==3){
                msg = (ChatColor.RED + "Next time I'll come riding my spider.");
            }else if(number == 4){
                msg = (ChatColor.RED + "You ruined my Robin Hood practice!");
            }else if(number == 5){
                msg = (ChatColor.RED + "It just wanted some food, look at how skinny it is.");
            }

            if(sk.getKiller() instanceof Player){
                if(sk.getKiller().hasPermission("guilt.use") || sk.getKiller().isOp()){
                    sk.getKiller().sendMessage(msg);
                }
            }
        }

        //Witch setup
        else if(e.getEntity() instanceof Witch){
            Witch wt = (Witch) e.getEntity();

            if(number == 1){
                msg = (ChatColor.RED + "That potion was just an experiment.");
            }else if(number ==2){
                msg = (ChatColor.RED + "Witchs can be good ya know, haven't you heard of the Good Witch?");
            }else if(number ==3){
                msg = (ChatColor.RED + "I know I'm ugly but It's not my fault.");
            }else if(number == 4){
                msg = (ChatColor.RED + "I guess now you can claim the hut, hope it was worth it.");
            }else if(number == 5){
                msg = (ChatColor.RED + "It doesn't even drop anything worth fighting for.");
            }

            if(wt.getKiller() instanceof Player){
                if(wt.getKiller().hasPermission("guilt.use") || wt.getKiller().isOp()){
                    wt.getKiller().sendMessage(msg);
                }
            }
        }

        //Zombie setup
        else if(e.getEntity() instanceof Zombie){
            Zombie zm = (Zombie) e.getEntity();

            if(number == 1){
                msg = (ChatColor.RED + "UNNNNNNN was my way of saying I love you.");
            }else if(number ==2){
                msg = (ChatColor.RED + "So just because I'm brainless I deserve to die.");
            }else if(number ==3){
                msg = (ChatColor.RED + "Real nice, It's not like rotten flesh is worth anything.");
            }else if(number == 4){
                msg = (ChatColor.RED + "I hope you turn into a zombie when you die, see how you like it.");
            }else if(number == 5){
                msg = (ChatColor.RED + "I just wanted you for your brrraaaaiiinnnnssss.");
            }

            if(zm.getKiller() instanceof Player){
                if(zm.getKiller().hasPermission("guilt.use") || zm.getKiller().isOp()){
                    zm.getKiller().sendMessage(msg);
                }
            }
        }
    }
}

