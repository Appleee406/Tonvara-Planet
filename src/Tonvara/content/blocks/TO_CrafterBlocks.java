package Tonvara.content.blocks;

import Tonvara.content.TO_Items;
import Tonvara.content.TO_Liquids;

import mindustry.type.Category;
import mindustry.type.LiquidStack;
import mindustry.world.Block;
import mindustry.world.blocks.production.GenericCrafter;
import mindustry.world.draw.*;

import static mindustry.type.ItemStack.with;

public class TO_CrafterBlocks {
    public static Block woodOilExtractor;

    public static void load(){
        woodOilExtractor = new GenericCrafter("wood-oil-extractor"){
            {
                requirements(Category.crafting, with(
                        TO_Items.wood, 40,
                        TO_Items.stone, 30
                ));
                researchCost = with(
                        TO_Items.wood, 60,
                        TO_Items.stone, 60
                );

                drawer = new DrawMulti(
                        new DrawLiquidTile(TO_Liquids.woodOil),
                        new DrawRegion("-top"),
                        new DrawDefault()
                );

                consumeItem(TO_Items.wood, 2);
                outputLiquid = new LiquidStack(TO_Liquids.woodOil, 4f / 60f);

                itemCapacity = 5;
                liquidCapacity = 5f;
                craftTime = 0.6f * 60f;
                scaledHealth = 50;
                size = 2;

                rotateDraw = false;
                hasLiquids = hasItems = true;
                outputsLiquid = true;
            }};
    }
}
