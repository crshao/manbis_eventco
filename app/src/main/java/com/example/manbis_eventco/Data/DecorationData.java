package com.example.manbis_eventco.Data;

import com.example.manbis_eventco.R;

import java.util.ArrayList;

public class DecorationData {

    private static String[] name = {
            "SilverDust Decor",
            "Eden Design",
            "Elior Design",
            "Aplus Decor"
    };

    private static String[] price = {
            "120.000.000",
            "150.000.000",
            "45.000.000",
            "30.000.000"
    };

    private static String[] desc = {
            "registration table set ( console table, 5 photo frames, simple flower arrangements) \n" +
                    "1 set bridal table (6pax) \n" +
                    "guest table set (optional) \n" +
                    "15 sets for long table, 6 sets for round table\n" +
                    "150 tiffany chairs \n" +
                    "fairy lighting \n" +
                    "standard lighting ( Par LED & hallogen) \n" +
                    "genset\n",
            "Ballroom Decoration : Stage backdrop, garden decoration, catwalk and centerpoint decoration, gate entrance, standing flower, table setting VIP's area, Covers, Centerpoint \n" +
                    "Foyer Decoration : photo corner, photo gallery, backdrop for reception or angpao booth decoration and all the foyer's area decoration with fresh flowers or mixed flowers arrangement \n",
            "- Design illustrations (Floor Plan, Elevations, Details -- if needed) \n" +
                    "- Fresh flowers (No artificial flowers. Still possible with further discussion, also depends on the preferable spared budget) \n" +
                    "- Entrance gate \n" +
                    "- Reception desk\n" +
                    "- Guest book \n" +
                    "- Money box \n" +
                    "- Aisle decor \n" +
                    "- Semi-open stage background \n" +
                    "- Band stage background \n" +
                    "- Decorative lighting (ex. candles, lanterns, fairy lights, bulb / round lanterns, etc) \n",
            "Aisle decoration with fresh flower \n" +
                    "setup tabel with flower \n" +
                    "handbouqet \n" +
                    "etc\n" +
                    "\n"
    };

    private static int[] images = {
            R.drawable.decoration_silverdust,
            R.drawable.decoration_edendesign,
            R.drawable.decoration_elior,
            R.drawable.decoration_aplus
    };

    public static ArrayList<Decoration> getDecorationData()
    {
        ArrayList<Decoration> list_decor = new ArrayList<>();
        for (int i = 0; i < name.length; i++) {
            Decoration decoration = new Decoration();
            decoration.setName(name[i]);
            decoration.setDesc(desc[i]);
            decoration.setPrice(price[i]);
            decoration.setImage(images[i]);

            list_decor.add(decoration);
        }
        return list_decor;
    }

}
