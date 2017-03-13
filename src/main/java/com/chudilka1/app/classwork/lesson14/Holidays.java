package com.chudilka1.app.classwork.lesson14;

public enum Holidays {
    NEW_YEAR(1, "January", "Kiyv", "New Year"),
    CHRISTMAS(7, "January", "Kiyv", "Crhistmas"),
    MARCH(8, "March", "Kiyv", "Women emancypacy");
    int date;
    String month;
    String place;
    String name;

    Holidays (int date, String month, String place, String name) {
        this.date = date;
        this.month = month;
        this.place = place;
        this.name = name;
    }

    public int getDate() {
        return date;
    }

    public String getMonth() {
        return month;
    }

    public String getPlace() {
        return place;
    }

    public String getName() {
        return name;
    }
}
