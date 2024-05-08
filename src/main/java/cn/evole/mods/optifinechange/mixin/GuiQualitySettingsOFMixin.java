package cn.evole.mods.optifinechange.mixin;

import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.settings.GameSettings;
import net.optifine.gui.GuiQualitySettingsOF;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/**
 * GuiQualitySettingsOFMixin
 *
 * @author cnlimiter
 * @version 1.0
 * @description
 * @date 2024/5/8 下午2:56
 */
@Mixin(GuiQualitySettingsOF.class)
public abstract class GuiQualitySettingsOFMixin extends GuiScreen {
    @Shadow private static GameSettings.Options[] enumOptions;

    @SuppressWarnings("check")
    @Inject(method = "<clinit>", at = @At(value = "HEAD"), cancellable = true)
    private static void inject1(CallbackInfo ci) {
        enumOptions = new GameSettings.Options[]{GameSettings.Options.MIPMAP_LEVELS, GameSettings.Options.MIPMAP_TYPE, GameSettings.Options.CLEAR_WATER, GameSettings.Options.RANDOM_ENTITIES, GameSettings.Options.BETTER_GRASS, GameSettings.Options.BETTER_SNOW, GameSettings.Options.CUSTOM_FONTS, GameSettings.Options.CUSTOM_COLORS, GameSettings.Options.CONNECTED_TEXTURES, GameSettings.Options.NATURAL_TEXTURES, GameSettings.Options.CUSTOM_SKY, GameSettings.Options.CUSTOM_ITEMS, GameSettings.Options.CUSTOM_ENTITY_MODELS, GameSettings.Options.CUSTOM_GUIS, GameSettings.Options.EMISSIVE_TEXTURES};
        ci.cancel();
    }
}
