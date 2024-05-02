
package net.davrial.ancindicators.item.custom;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import net.davrial.ancindicators.procedures.AutomaticUniversalRecoloringProcedure;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;

import java.util.stream.Stream;

public class AutomaticUniversalRecoloringItem extends Item {
    public AutomaticUniversalRecoloringItem() {
        super(new Properties());
    }

    @Override
    public boolean isRepairable(ItemStack itemstack) {
        return false;
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        super.useOn(context);
        AutomaticUniversalRecoloringProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getItemInHand());
        return InteractionResult.SUCCESS;
    }
}
