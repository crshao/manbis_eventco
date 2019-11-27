package com.example.manbis_eventco.Data;

import java.util.ArrayList;

public class VenueData {

    public static String[] name = {
            "JW Marriott Surabaya",
            "Sheraton Surabaya Hotel & Towers",
            "Dyandra Convention Center Surabaya",
            "Ciputra Golf, Club & Resto Surabaya",
            "Pullman Surabaya City Center"
    };

    public static String[] desc = {
            ("JW Marriott Hotel Surabaya is the splendid choice for " +
                    "you who are seeking a luxurious treat for your " +
                    "wedding dream. Get pampered with the most excellent " +
                    "services and make your wedding dream come true by " +
                    "spending here. The highest quality service accompanying " +
                    "its extensive facilities will make you get the ultimate " +
                    "wedding experience. Enjoy luxurious treats and incomparable " +
                    "experience by staying at JW Marriott Hotel Surabaya."),
            ("Host a once-in-a-lifetime affair in the 804-square-meter Sheraton Grand " +
                    "Ballroom, which can also be separated into three smaller rooms. " +
                    "A romantic backdrop for both a ceremony and reception, it features " +
                    "the hotel's signature neutral palette with crimson accents and " +
                    "ornate carpeting. A similarly captivating attention to detail " +
                    "appears in the ornamental, recessed ceiling, which features " +
                    "sparkling chandeliers. The ballroom also features a 467-square-meter " +
                    "pre-function foyer. Ideal for pre-reception cocktails, it boast " +
                    "smooth marble floors, crown molding, and locally inspired accents." +
                    "Seven additional venues are available to accommodate wedding events of all types."),
            ("A world-class quality and fully-integrated venue for MICE activities, wedding " +
                    "or any personal/corporate events with values of prime location and personalised."),
            ("Ciputra Golf, Club & Resto Surabaya has various kinds of event locations to effer, " +
                    "from the outdor spot at the terrace and aquatic driving range to the glamorous " +
                    "ballroom on the top of Palimanan Resto. Lash green scenery, the enchanting lake " +
                    "side venue, the romantic lights at night, the biggest capacity from 300 until " +
                    "2000 people, this could actually be your dream wedding"),
            ("Pullman Surabaya City Center is the best choice to make your dream wedding come true. " +
                    "All the positive things will happen in here to fulfill your happiness on your happy day")
    };

    public static String[] price = {
            "IDR 550,500,000",
            "IDR 430,000,000",
            "IDR 575,000,000",
            "IDR 250,750,000",
            "IDR 300,000,000"
    };

    public static String[] address = {
            "Jalan Embong No. 85-89, Kedungdoro, Kec. Tegalsari, Surabaya, 60261",
            "Jalan Embong Malang No. 25-31, Kedungdoro, Tegalsari, Surabaya, 60261",
            "Jalan Basuki Rahmat No 93-105, Surabaya",
            "Jalan Citra Raya Utama, Lakarsanti, Surabaya, Jawa Timur, 60223",
            "Jalan Basuki Rahmat No. 67-73, Surabaya, Jawa Timur, 60271"
    };

    //IMAGE BELUM
    public static ArrayList<Venue> getVenueData()
    {
        ArrayList<Venue> list = new ArrayList<>();
        for (int i = 0; i < name.length; i++) {
            Venue venue = new Venue();
            venue.setName(name[i]);
            venue.setAddress(address[i]);
            venue.setDesc(desc[i]);
            venue.setPrice(price[i]);
            list.add(venue);
        }
        return list;
    }
}
