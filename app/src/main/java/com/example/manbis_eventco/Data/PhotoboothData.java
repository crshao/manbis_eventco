package com.example.manbis_eventco.Data;

import java.util.ArrayList;

public class PhotoboothData {

    private static String name[] ={
            "Lolphotobooth.co",
            "iPhoto PhotoPrint",
            "PrintBooth Indonesia"
    };

    private static String price[] = {
            "6.000.000",
            "3.300.000",
            "3.500.000"
    };

    private static String desc[] = {
            "1. 3 hours unlimited with 4R/2'x6' photo strip print with custom photo template, props and online soft copy access \n" +
                    "2. 5,5 hours unlimited with 4R/2'x6' photo strip print with custom photo template, props and online soft copy access\n",
            "All package include : \n" +
                    "Professional photographer & assistant \n" +
                    "Studio lighting \n" +
                    "Direct photo 4R \n" +
                    "Exclusive photo frame \n" +
                    "Customized border on photo \n" +
                    "Fun props \n" +
                    "All data on flashdisk (also available for other requirement below 200 pcs)\n",
            "unlimited print photos | free design template photo | include 3 crew with smartphones | internet network | photo paper 4R with thermal printer | soft file inside goodie bag with Flashdisk on the spot/same day service | free social media promo | cute hat properties"
    };

    private static int images[] = {

    };

    public static ArrayList<Photobooth> getPhotoboohData()
    {
        ArrayList<Photobooth>list_photobooth = new ArrayList<>();
        for (int i = 0; i < name.length; i++) {
            Photobooth photobooth = new Photobooth();
            photobooth.setName(name[i]);
            photobooth.setDesc(desc[i]);
            photobooth.setPrice(price[i]);
            // photobooth.setImage(images[i]);

            list_photobooth.add(photobooth);
        }
        return list_photobooth;
    }

}
