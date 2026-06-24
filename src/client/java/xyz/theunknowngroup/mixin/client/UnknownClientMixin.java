package xyz.theunknowngroup.mixin.client;


import com.mojang.authlib.minecraft.client.MinecraftClient;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MinecraftClient.class)
public class UnknownClientMixin {
    private void run(CallbackInfo info) {
        // This code is injected into the start of MinecraftClient.run()V
    }
}