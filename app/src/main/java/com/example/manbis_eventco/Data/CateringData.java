package com.example.manbis_eventco.Data;

import java.util.ArrayList;

public class CateringData {

    private static String name [] = {
            "Aisya Catering",
            "Bintang Catering",
            "Marga Catering Service",
            "Jaya Kartini Catering",
            "RA Catering"
    };

    private static String price[] = {
            "40.000/Orang",
            "Contact for Price(Custom Available)",
            "30.000/Orang",
            "Contact for Price",
            "Contact for Price(Custom is Available)"
    };

    private static String phoneNum [] = {
            "081754647386",
            "(031)8295564",
            "(031)3818265",
            "(031)3536335",
            "081215339470"
    };

    private static String address [] = {
            "Baratajaya XX/91",
            "Jl. Dukuh Menanggal IX/2y, Surabaya",
            "Jalan Bronggalan Sawah Gang IV F No. 67, Tambaksari",
            "Jl. Tg Raja I No.25, Perak Bar., Kec. Krembangan",
            "Jl. Simo Tambaan Sekolahan No.99 A, Simomulyo, Kec. Sukomanunggal"
    };

    private static int image [] = {

    };

    public static ArrayList<Catering> getCateringData()
    {
        ArrayList<Catering>list_catering = new ArrayList<>();
        for (int i = 0; i < name.length; i++) {
            Catering catering = new Catering();
            catering.setName(name[i]);
            catering.setPhonenum(phoneNum[i]);
            catering.setPrice(price[i]);
            catering.setAddress(address[i]);
            //catering.setImage(images[i]);

            list_catering.add(catering);
        }
        return list_catering;
    }

}
