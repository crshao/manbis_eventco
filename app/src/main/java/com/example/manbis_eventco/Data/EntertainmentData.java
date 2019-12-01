package com.example.manbis_eventco.Data;

import com.example.manbis_eventco.R;

import java.util.ArrayList;

public class EntertainmentData {

    private static String[] name = {
            "Malik Music Entertainment",
            "Prime Master of Ceremonies",
            "Party Band GoldStone",
            "Selecta Band",
            "Night Flight Music"
    };

    private static String[] price = {
            "2.000.000",
            "1.500.000",
            "3.250.000",
            "2.750.000",
            "4.000.000"
    };

    private static String[] desc = {
            "Live music will set the tone for any event. Perhaps it’s a band ,acoustic, mini orchestra and orchestra for your wedding, or a violin for your process entrance, or maybe a harpist for your private party and etc. Whatever the event, you will find talented musicians right here on Malik Entertainment.",
            "Master of Ceremonies (MC or emcee) is the host of your wedding and should make sure everyone is having a good time. A good wedding MC is more than someone who is good at public speaking or can tell a few jokes. They should make sure everything runs smoothly and introduce each person who is speaking, as well as important events.",
            "Forget about cheesy top 40 party covers bands and take your event to the next level with our all female band. Providing an amazing live music entertainment option, our corporate party band puts on a 100% live concert your guests won't forget. A one of a kind female party band, Goldstone party band brings you the very best talent London has to offer.",
            "Bringing you the very best live music entertainment. Delivering sensational soul and perfect pop with slick choreography and glistening harmonies our party covers band lift events to the highest level. Appearing with their own pianist or supported by backing tracks, the experienced all female band bring their West End experience to events both intimate and grand with ever a touch of old school glamour.",
            "All your favourite chart topping hits performed alongside dazzling dance routines and powerhouse vocals. Modern and complete with all the current hits, this show is suitable for weddings, corporate parties or celebrations of any kind. "

    };

    private static int images[] = {
            R.drawable.entertainment_malik,
            R.drawable.entertainment_mc,
            R.drawable.entertainment_goldstoneband,
            R.drawable.entertainment_selectaband,
            R.drawable.entertainment_nightflightmusic,
    };

    public static ArrayList<Entertainment> getEntertainmentData()
    {
        ArrayList<Entertainment> list_venue = new ArrayList<>();
        for (int i = 0; i < name.length; i++) {
                Entertainment entertainment = new Entertainment();
                entertainment.setName(name[i]);
                entertainment.setDesc(desc[i]);
                entertainment.setPrice(price[i]);
                entertainment.setImage(images[i]);

            list_venue.add(entertainment);
        }
        return list_venue;
    }


}
