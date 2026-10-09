package com.example.onlymylunge.mixin;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.network.packet.s2c.play.PlaySoundFromEntityS2CPacket;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ClientPlayNetworkHandler.class)
public abstract class ClientPlayNetworkHandlerMixin {
    @Inject(method = "onPlaySoundFromEntity", at = @At("HEAD"), cancellable = true)
    private void onlyMyLunge$filterOtherPlayersLunge(PlaySoundFromEntityS2CPacket packet, CallbackInfo ci) {
        MinecraftClient client = MinecraftClient.getInstance();
        if (client.player == null) return;

        // Match by sound id (item.spear.lunge_1/2/3) so this works whether the
        // sound is a registered reference or a direct entry.
        String path = packet.getSound().value().id().getPath();
        boolean isLungeSound = path.startsWith("item.spear.lunge_");

        if (isLungeSound && packet.getEntityId() != client.player.getId()) {
            ci.cancel();
        }
    }
}
