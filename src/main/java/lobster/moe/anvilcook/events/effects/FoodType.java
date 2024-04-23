package lobster.moe.anvilcook.events.effects;

import java.util.Random;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.stats.Stats;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public interface FoodType {
  int judgeNum = 128;
  ResourceLocation getCunterResourceLocation();
  ResourceLocation getjudgeResourceLocation();
  void effect(ItemStack itemStack, ServerPlayer serverPlayer, Level level);
  default void addCounter(ServerPlayer serverPlayer) {
      serverPlayer.awardStat(getCunterResourceLocation(),1);
      int sweetCounter = serverPlayer.getStats().getValue(Stats.CUSTOM,getCunterResourceLocation());
      if (sweetCounter>=judgeNum && serverPlayer.getStats().getValue(Stats.CUSTOM,getjudgeResourceLocation())==0){
        Random RANDOM = new Random();
        if (RANDOM.nextDouble()>=0.5){
          serverPlayer.awardStat(getjudgeResourceLocation(),1);
        }else {
          serverPlayer.awardStat(getjudgeResourceLocation(),2);
        }
      }
    }

}
