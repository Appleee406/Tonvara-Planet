package Tonvara.content;

import arc.graphics.*;
import arc.struct.*;
import mindustry.type.*;

public class TO_Items {
    public static Item wood, stone;

    // public static final Seq<Item> tonvaraItems = new Seq<>();

    public static void load(){
        wood = new Item("wood", Color.valueOf("8f4905")){{
            flammability = 1.0f;
        }};

        stone = new Item("stone", Color.darkGray);
    }
}
