package com.sfucsss.mountainmadness2020.bathroom;

public class Pin {
    double longitude;
    double latitude;
    char letter;

    Pin(double longitude, double latitude, char letter) {
        this.longitude = longitude;
        this.latitude = latitude;
        this.letter = letter;
    }
    public boolean equal(Pin pin) {
        return pin.longitude == this.longitude &&
                pin.latitude == this.latitude;
    }
}