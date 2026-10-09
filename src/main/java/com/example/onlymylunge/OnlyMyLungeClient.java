package com.example.onlymylunge;

import net.fabricmc.api.ClientModInitializer;

public final class OnlyMyLungeClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        // Filtering is handled in the client packet mixin.
    }
}
