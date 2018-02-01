package com.mooviies.invulnerableanimals;

import org.bukkit.plugin.java.JavaPlugin;

public class InvulnerableAnimals extends JavaPlugin{
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new EntityDamageListener(), this);
        getServer().getPluginManager().registerEvents(new EntityCombustListener(), this);
        getServer().getPluginManager().registerEvents(new EntityBreedListener(), this);
    }

    @Override
    public void onDisable() {

    }
}
