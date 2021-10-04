package me.jarva.origins_power_expansion.registry.actions.fabric;

import io.github.apace100.origins.power.factory.action.ActionFactory;
import io.github.apace100.origins.registry.ModRegistries;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;
import org.apache.commons.lang3.tuple.Triple;

public class BlockActionRegistryImpl {
    public static void register(ActionFactory<Triple<World, BlockPos, Direction>> actionFactory) {
        Registry.register(ModRegistries.BLOCK_ACTION, actionFactory.getSerializerId(), actionFactory);
    }
}
