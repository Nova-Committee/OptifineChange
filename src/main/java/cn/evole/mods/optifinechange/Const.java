package cn.evole.mods.optifinechange;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import net.minecraft.util.ResourceLocation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Const
 *
 * @author cnlimiter
 * @version 1.0
 * @description
 * @date 2024/5/3 下午7:58
 */
public class Const {
    public static final String MOD_ID = "optifinechange";
    public static final String MOD_NAME = "OptifineChange";
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String DEPENDENCIES = "required-after:mixinbooter";
    public static Gson GSON = new GsonBuilder().setPrettyPrinting().serializeNulls().create();
    public static ResourceLocation rl(String name){
        return new ResourceLocation(MOD_ID, name);
    }

}
