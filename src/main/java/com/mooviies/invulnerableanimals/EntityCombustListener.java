package com.mooviies.invulnerableanimals;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityCombustEvent;

public class EntityCombustListener implements Listener {
    @EventHandler(priority = EventPriority.HIGHEST)
    public void onEvent(EntityCombustEvent event)
    {
        switch(event.getEntityType())
        {
            case BAT:
            case COW:
            case PIG:
            case MULE:
            case WOLF:
            case HORSE:
            case SHEEP:
            case SQUID:
            case DONKEY:
            case OCELOT:
            case PARROT:
            case RABBIT:
            case CHICKEN:
            case VILLAGER:
            case POLAR_BEAR:
            case MUSHROOM_COW:
            case LLAMA:
                event.setCancelled(true);
                break;
        }
    }
}