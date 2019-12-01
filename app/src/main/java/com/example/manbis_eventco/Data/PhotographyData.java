package com.example.manbis_eventco.Data;

import com.example.manbis_eventco.R;

import java.util.ArrayList;

public class PhotographyData {

    private static String[] name = {
            "Riomotret",
            "Dierabachir Photography",
            "FD Photography",
            "Imagenic",
            "Lemotion Photo"
    };

    private static String[] desc = {
            "Full day, custom mural background, 2 movie video, max 20 printout (free custom size)",
            "Full day, 2 movie video, max 20 printout (free custom size)",
            "Full day, 1 movie video, max 10 printout (free custom size)",
            "Photo full day, 1 movie video, 5 print out (A0)",
            "Photo full day, 1 movie video, 5 print out (A0) + free photo album"
    };

    private static String[] price = {
            "IDR 30,000,000",
            "IDR 25,000,000",
            "IDR 15,000,000 ",
            "IDR 15,000,000 ",
            "IDR 17,000,000 "
    };

    private static String[] phoneNum = {
            "085887332990",
            "08123479432",
            "087788435921",
            "081287407345",
            "087864936455"
    };

    private static String[] address = {
            "Taman Pondok Jati K-20 , RT. 19 RW. 04 Geluran, Taman.",
            "Jl. Raya Nginden No.55",
            "Jl. Imam Bonjol 99",
            "Jalan Arif Rahman Hakim, Keputih, Sukolilo",
            "Jalan Raya Mulyosari No.77"
    };

    private static int[] images = {
            R.drawable.photography_rio,
            R.drawable.photography_dierabachir,
            R.drawable.photography_fd,
            R.drawable.photography_imagenic,
            R.drawable.photography_lemotion
    };

    public static ArrayList<Photography> getPhotographyData()
    {
        ArrayList<Photography>list_photograpghy = new ArrayList<>();
        for (int i = 0; i < name.length; i++) {
            Photography photography = new Photography();
            photography.setName(name[i]);
            photography.setPhoneNum(phoneNum[i]);
            photography.setPrice(price[i]);
            photography.setAddress(address[i]);
            photography.setImages(images[i]);

            list_photograpghy.add(photography);
        }
        return list_photograpghy;
    }


}
