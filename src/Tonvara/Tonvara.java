package Tonvara;

import Tonvara.content.*;
import Tonvara.content.blocks.*;
import arc.util.*;
import mindustry.mod.*;

public class Tonvara extends Mod{

    public Tonvara(){
        Log.info("Loaded Tonvara constructor.");
    }

    @Override
    public void loadContent(){
        Log.info("Tonvara mod loading");

        TO_Sounds.load();
        TO_Attributes.load();
        TO_Liquids.load();
        TO_Items.load();

        /* Blocks */
        TO_ConduitBlocks.load();
        TO_CrafterBlocks.load();
        TO_DistributionBlocks.load();
        TO_ProductionBlocks.load();
        TO_EnvironmentBlocks.load();

        Log.info("Tonvara mod loaded");
    }
}
