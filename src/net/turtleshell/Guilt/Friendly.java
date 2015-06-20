package net.turtleshell.Guilt;

import java.util.Random;

import org.bukkit.ChatColor;
import org.bukkit.entity.Bat;
import org.bukkit.entity.Chicken;
import org.bukkit.entity.Cow;
import org.bukkit.entity.Horse;
import org.bukkit.entity.IronGolem;
import org.bukkit.entity.MushroomCow;
import org.bukkit.entity.Ocelot;
import org.bukkit.entity.Pig;
import org.bukkit.entity.Player;
import org.bukkit.entity.Sheep;
import org.bukkit.entity.Snowman;
import org.bukkit.entity.Squid;
import org.bukkit.entity.Villager;
import org.bukkit.entity.Wolf;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

public class Friendly implements Listener {

    //Setup for RNG
    Random opt = new Random();
    int number;

    //Listener Setup
    @EventHandler
    public void onEntityDeath(EntityDeathEvent e){
        String msg = "";

        //Random Number Generator
        for(int counter=1; counter<=1; counter++){
            number = 1+opt.nextInt(5);
        }

        //Sheep setup
        if(e.getEntity() instanceof Sheep){
            Sheep s = (Sheep) e.getEntity();
            if(number == 1){
                msg = (ChatColor.RED + "Nooooo! It was just so fluffy");
            }else if(number == 2){
                msg = (ChatColor.RED + "Baaaaa Baaaaaa. It just meant I love you!");
            }else if(number == 3){
                msg = (ChatColor.RED + "I hope that wool keeps you warm at night.");
            }else if(number == 4){
                msg = (ChatColor.RED + "I sure hope he didn't have a little lamb to go home to!");
            }else if(number == 5){
                msg = (ChatColor.RED + "Could you see the look of hope in its eyes, BEFORE YOU CRUSHED IT!");
            }

            if(s.getKiller() instanceof Player){
                if(s.getKiller().hasPermission("guilt.use") || s.getKiller().isOp()){
                    s.getKiller().sendMessage(msg);
                }
            }

            //Pig setup
        }else if(e.getEntity() instanceof Pig){
            Pig pg = (Pig) e.getEntity();
            if(number == 1){
                msg = (ChatColor.RED + "Oink Oink I hope I taste good for you.");
            }else if(number == 2){
                msg = (ChatColor.RED + "NOOOOOOOO! Not Kevin Bacon, He was my only piggy pal");
            }else if(number == 3){
                msg = (ChatColor.RED + "He'll never see his friend Charlotte again.");
            }else if(number == 4){
                msg = (ChatColor.RED + "Man it better be worth the bacon.");
            }else if(number == 5){
                msg = (ChatColor.RED + "That poor sad piggy face. Almost seemed like it was crying.");
            }

            if(pg.getKiller() instanceof Player){
                if(pg.getKiller().hasPermission("guilt.use") || pg.getKiller().isOp()){
                    pg.getKiller().sendMessage(msg);
                }
            }

            //Cow setup
        }else if(e.getEntity() instanceof Cow){
            Cow cow = (Cow) e.getEntity();
            if(number == 1){
                msg = (ChatColor.RED + "MMMMMM beef. I wish I didn't have to die for it");
            }else if(number == 2){
                msg = (ChatColor.RED + "MOOOOOOOOOOOOOOOOOO! Wait I mean, NOOOOOOOOOOOOOOOOOOOOOO!");
            }else if(number == 3){
                msg = (ChatColor.RED + "Is the parent-less calf worth your one piece of leather?");
            }else if(number == 4){
                msg = (ChatColor.RED + "I don't think I smell like hambur- Wait why is there a sword in your hand?");
            }else if(number == 5){
                msg = (ChatColor.RED + "I could've been your best friend!");
            }

            if(cow.getKiller() instanceof Player){
                if(cow.getKiller().hasPermission("guilt.use") || cow.getKiller().isOp()){
                    cow.getKiller().sendMessage(msg);
                }
            }

            //Chicken setup
        }else if(e.getEntity() instanceof Chicken){
            Chicken ch = (Chicken) e.getEntity();
            if(number == 1){
                msg = (ChatColor.RED + "Look at all those feathers that are now covered in blood.");
            }else if(number == 2){
                msg = (ChatColor.RED + "I hope he didn't have a wife and eggs to go home too.");
            }else if(number == 3){
                msg = (ChatColor.RED + "Cluck Cluck BACAaa- Now hes dead.");
            }else if(number == 4){
                msg = (ChatColor.RED + "It's just soo much fun to kill a chicken - Said no one ever.");
            }else if(number == 5){
                msg = (ChatColor.RED + "Hopefully you don't serve me with my children.");
            }

            if(ch.getKiller() instanceof Player){
                if(ch.getKiller().hasPermission("guilt.use") || ch.getKiller().isOp()){
                    ch.getKiller().sendMessage(msg);
                }
            }

            //Wolf setup
        }else if(e.getEntity() instanceof Wolf){
            Wolf w = (Wolf) e.getEntity();
            if(number == 1){
                msg = (ChatColor.RED + "I just wanted a chance to be mans best friend.");
            }else if(number == 2){
                msg = (ChatColor.RED + "Woof I love you why are you hitting me?");
            }else if(number == 3){
                msg = (ChatColor.RED + "I could've protected you");
            }else if(number == 4){
                msg = (ChatColor.RED + "What do you even get for killing me?");
            }else if(number == 5){
                msg = (ChatColor.RED + "I hope you like every wolf ever hating you!");
            }

            if(w.getKiller() instanceof Player){
                if(w.getKiller().hasPermission("guilt.use") || w.getKiller().isOp()){
                    w.getKiller().sendMessage(msg);
                }
            }

            //Squid setup
        }else if(e.getEntity() instanceof Squid){
            Squid sq = (Squid) e.getEntity();
            if(number == 1){
                msg = (ChatColor.RED + "I could've been an octopus");
            }else if(number == 2){
                msg = (ChatColor.RED + "Why does everyone hate me.");
            }else if(number == 3){
                msg = (ChatColor.RED + "Just because I'm ugly dosnt mean I should die");
            }else if(number == 4){
                msg = (ChatColor.RED + "Glub Glub, Glub Glub");
            }else if(number == 5){
                msg = (ChatColor.RED + "You could'nt Love me even if you tried");
            }

            if(sq.getKiller() instanceof Player){
                if(sq.getKiller().hasPermission("guilt.use") || sq.getKiller().isOp()){
                    sq.getKiller().sendMessage(msg);
                }
            }

            //Ocelot setup
        }else if(e.getEntity() instanceof Ocelot){
            Ocelot oc = (Ocelot) e.getEntity();
            if(number == 1){
                msg = (ChatColor.RED + "Kittens need my love");
            }else if(number == 2){
                msg = (ChatColor.RED + "You promised me fish!");
            }else if(number == 3){
                msg = (ChatColor.RED + "Kitties are cute how could you!");
            }else if(number == 4){
                msg = (ChatColor.RED + "Meow was my way of saying please don't.");
            }else if(number == 5){
                msg = (ChatColor.RED + "It wasn't even worth it was it.");
            }

            if(oc.getKiller() instanceof Player){
                if(oc.getKiller().hasPermission("guilt.use") || oc.getKiller().isOp()){
                    oc.getKiller().sendMessage(msg);
                }
            }

            //Horse setup
        }else if(e.getEntity() instanceof Horse){
            Horse hr = (Horse) e.getEntity();
            if(number == 1){
                msg = (ChatColor.RED + "Why would you even do this.");
            }else if(number == 2){
                msg = (ChatColor.RED + "NOOOOOOOO! it only helps you!");
            }else if(number == 3){
                msg = (ChatColor.RED + "I hope that scream stays with you for life.");
            }else if(number == 4){
                msg = (ChatColor.RED + "That one had a foal.");
            }else if(number == 5){
                msg = (ChatColor.RED + "How do you even sleep at night!");
            }

            if(hr.getKiller() instanceof Player){
                if(hr.getKiller().hasPermission("guilt.use") || hr.getKiller().isOp()){
                    hr.getKiller().sendMessage(msg);
                }
            }

            //Villager setup
        }else if(e.getEntity() instanceof Villager){
            Villager vl = (Villager) e.getEntity();
            if(number == 1){
                msg = (ChatColor.RED + "Just cause it sounds like squidward dosnt mean it should die");
            }else if(number == 2){
                msg = (ChatColor.RED + "I guess I was just too annoying for you.");
            }else if(number == 3){
                msg = (ChatColor.RED + "Killing all of us makes you look like a psychopath!");
            }else if(number == 4){
                msg = (ChatColor.RED + "I just wanted to trade you for an Emerald.");
            }else if(number == 5){
                msg = (ChatColor.RED + "I would've given you a house in the village. You didn't have to kill me.");
            }

            if(vl.getKiller() instanceof Player){
                if(vl.getKiller().hasPermission("guilt.use") || vl.getKiller().isOp()){
                    vl.getKiller().sendMessage(msg);
                }
            }

            //Bat setup
        }else if(e.getEntity() instanceof Bat){
            Bat bat = (Bat) e.getEntity();
            if(number == 1){
                msg = (ChatColor.RED + "NANANANANANANANA DEADBAT!");
            }else if(number == 2){
                msg = (ChatColor.RED + "I don't even give you exp.");
            }else if(number == 3){
                msg = (ChatColor.RED + "But my squeking is just so cute.");
            }else if(number == 4){
                msg = (ChatColor.RED + "How could you! I couldn't even see you coming.");
            }else if(number == 5){
                msg = (ChatColor.RED + "Completely defenseless. Way to go!");
            }

            if(bat.getKiller() instanceof Player){
                if(bat.getKiller().hasPermission("guilt.use") || bat.getKiller().isOp()){
                    bat.getKiller().sendMessage(msg);
                }
            }
        }

        //MooShroom setup
        else if(e.getEntity() instanceof MushroomCow){
            MushroomCow mu = (MushroomCow) e.getEntity();

            if(number == 1){
                msg = (ChatColor.RED + "NOOOOO! Not my sweet mushrooms");
            }else if(number ==2){
                msg = (ChatColor.RED + "Its because I'm red Isn't it.");
            }else if(number ==3){
                msg = (ChatColor.RED + "You could've just used shears.");
            }else if(number == 4){
                msg = (ChatColor.RED + "You'll hear from my nether friends for this.");
            }else if(number == 5){
                msg = (ChatColor.RED + "I hope you make some good armor out of that leather, You're gonna need it.");
            }

            if(mu.getKiller() instanceof Player){
                if(mu.getKiller().hasPermission("guilt.use") || mu.getKiller().isOp()){
                    mu.getKiller().sendMessage(msg);
                }
            }
        }// Iron Golem setup
        else if(e.getEntity() instanceof IronGolem){
            IronGolem ig = (IronGolem) e.getEntity();
            if(number == 1){
                msg = (ChatColor.RED + "I was built to love you.");
            }else if(number == 2){
                msg = (ChatColor.RED + "Please put the rose on my grave.");
            }else if(number == 3){
                msg = (ChatColor.RED + "It protected you all through the night and this is how you repay it!");
            }else if(number == 4){
                msg = (ChatColor.RED + "It will never be worth the iron spent making it.");
            }else if(number == 5){
                msg = (ChatColor.RED + "Hey at least it killed that Zombie for you, Before you murdered it!");
            }
            if(ig.getKiller() instanceof Player){
                if(ig.getKiller().hasPermission("guilt.use") || ig.getKiller().isOp()){
                    ig.getKiller().sendMessage(msg);
                }
            }
        }// Snow Golem setup
        else if(e.getEntity() instanceof Snowman){
            Snowman sg = (Snowman) e.getEntity();
            if(number == 1){
                msg = (ChatColor.RED + "You could've just left me to melt.");
            }else if(number == 2){
                msg = (ChatColor.RED + "I didn't mean to get snow all over the place I swear.");
            }else if(number == 3){
                msg = (ChatColor.RED + "Did I scare you with my pumpkin face, I'm sorry.");
            }else if(number == 4){
                msg = (ChatColor.RED + "All it does is help you survive.");
            }else if(number == 5){
                msg = (ChatColor.RED + "I guess someones not in the Christmas spirit, MR. Grinch!");
            }
            if(sg.getKiller() instanceof Player){
                if(sg.getKiller().hasPermission("guilt.use") || sg.getKiller().isOp()){
                    sg.getKiller().sendMessage(msg);
                }
            }
        }
    }
}