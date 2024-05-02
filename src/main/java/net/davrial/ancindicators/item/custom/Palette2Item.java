
package net.davrial.ancindicators.item.custom;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import net.davrial.ancindicators.procedures.EraserRightclickedOnBlockProcedure;
import net.davrial.ancindicators.procedures.PalettetRightclickedOnBlockProcedure;
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
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.stream.Stream;

public class Palette2Item extends Item {
    public Palette2Item() {
        super(new Properties().durability(64));
    }


    @Override
    public int getEnchantmentValue() {
        return 15;
    }

    @Override
    public boolean hasCraftingRemainingItem(ItemStack stack) {
        return true;
    }

    @Override
    public ItemStack getCraftingRemainingItem(ItemStack itemstack) {
        ItemStack retval = new ItemStack(this);
        retval.setDamageValue(itemstack.getDamageValue() + 1);
        if (retval.getDamageValue() >= retval.getMaxDamage()) {
            return ItemStack.EMPTY;
        }
        return retval;
    }

    @Override
    public boolean isRepairable(ItemStack itemstack) {
        return false;
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        super.useOn(context);
        PalettetRightclickedOnBlockProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getItemInHand());
        return InteractionResult.SUCCESS;
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public boolean isFoil(ItemStack itemstack) {
        return true;
    }
}
