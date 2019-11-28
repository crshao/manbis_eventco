package com.example.manbis_eventco.Data;

public class Photobooth {

    private static String name;
    private static String price;
    private static String desc;
    private static int images;

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Photobooth.name = name;
    }

    public static String getPrice() {
        return price;
    }

    public static void setPrice(String price) {
        Photobooth.price = price;
    }

    public static String getDesc() {
        return desc;
    }

    public static void setDesc(String desc) {
        Photobooth.desc = desc;
    }

    public static int getImages() {
        return images;
    }

    public static void setImages(int images) {
        Photobooth.images = images;
    }
}
