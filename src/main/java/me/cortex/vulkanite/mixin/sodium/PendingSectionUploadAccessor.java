package me.cortex.vulkanite.mixin.sodium;

import net.caffeinemc.mods.sodium.client.gl.arena.PendingUpload;
import net.caffeinemc.mods.sodium.client.render.chunk.RenderSection;
import net.caffeinemc.mods.sodium.client.render.chunk.data.BuiltSectionMeshParts;
import net.caffeinemc.mods.sodium.client.render.chunk.region.RenderRegionManager;
import net.caffeinemc.mods.sodium.client.render.chunk.terrain.TerrainRenderPass;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(targets = {"net.caffeinemc.mods.sodium.client.render.chunk.region.RenderRegionManager$PendingSectionUpload"}, remap = false)
public interface PendingSectionUploadAccessor {
    @Accessor
    RenderSection getSection();
    @Accessor
    TerrainRenderPass getPass();
    @Accessor
    PendingUpload getVertexUpload();
}
