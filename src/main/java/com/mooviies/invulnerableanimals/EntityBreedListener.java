package com.mooviies.invulnerableanimals;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityBreedEvent;

public class EntityBreedListener implements Listener {
    @EventHandler(priority = EventPriority.HIGHEST)
    public void onEvent(EntityBreedEvent event)
    {
        switch(event.getEntityType())
        {
            case COW:
            case PIG:
            case MULE:
            case WOLF:
            case HORSE:
            case SHEEP:
            case DONKEY:
            case OCELOT:
            case PARROT:
            case RABBIT:
            case CHICKEN:
            case POLAR_BEAR:
            case MUSHROOM_COW:
            case LLAMA:
                event.setCancelled(true);
                break;
        }
    }
}