package com.example.manbis_eventco.Data;

import java.util.ArrayList;

public class WeddingOccasionData {
    public static String[] name = {
            "Venue",
            "Catering",
            "Decoration & Lighting",
            "Photography & Videography",
            "Photobooth",
            "Entertainment",
    };

    public static ArrayList<WeddingOccasion> getWeddingOccasionData()
    {
        ArrayList<WeddingOccasion> weddingOccasionList = new ArrayList<>();
        for (int i = 0; i < name.length; i++) {
            WeddingOccasion weddingOccasion = new WeddingOccasion();
            weddingOccasion.setName(name[i]);
            weddingOccasionList.add(weddingOccasion);
        }
        return weddingOccasionList;
    }
}
