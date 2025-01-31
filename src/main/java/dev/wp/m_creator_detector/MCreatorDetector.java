package dev.wp.m_creator_detector;

import dev.wp.m_creator_detector.mixin.MixinPlugin;
import net.neoforged.fml.common.Mod;

import java.util.List;

@Mod(MCreatorDetector.MOD_ID)
public class MCreatorDetector {
    public static final String MOD_ID = "m_creator_detector";

    public static final List<String> mcreatorMods = MixinPlugin.getMcreatorMods();
}
