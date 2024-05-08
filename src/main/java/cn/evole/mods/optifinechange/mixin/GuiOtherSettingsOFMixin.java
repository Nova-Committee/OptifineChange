package cn.evole.mods.optifinechange.mixin;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.resources.I18n;
import net.optifine.gui.GuiOtherSettingsOF;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/**
 * GuiOtherSettingsOFMixin
 *
 * @author cnlimiter
 * @version 1.0
 * @description
 * @date 2024/5/8 下午2:28
 */
@Mixin(GuiOtherSettingsOF.class)
public abstract class GuiOtherSettingsOFMixin extends GuiScreen {

    @Inject(method = "initGui", at = @At(value = "INVOKE", target = "Ljava/util/List;add(Ljava/lang/Object;)Z", ordinal = 2, shift = At.Shift.BEFORE), cancellable = true)
    public void inject1(CallbackInfo ci) {
        this.buttonList.add(new GuiButton(200, this.width / 2 - 100, this.height / 6 + 168 + 11, I18n.format("gui.done", new Object[0])));
        ci.cancel();
    }
}
