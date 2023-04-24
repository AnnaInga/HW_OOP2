package ru.netology.hw_oop2;

public class Radio {
    private int maxStation = 10;
    private int minStation = 0;   //Станции
    private int currentStation;


    private int currentVolume;  //Звук


    public Radio(int size) {
        maxStation = minStation + size - 1;
    }

    public Radio() {
        this.maxStation = minStation + maxStation - 1;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    } //звук


    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > maxStation) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void setMaxVolume() {
        currentVolume = 100;
    } //звук

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }


    public void nextStation() {
        if (currentStation < maxStation) {
            currentStation = currentStation + 1;
        } else {
            currentStation = 0;
        }
    }

    public void prevStation() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        } else {
            currentStation = maxStation;
        }
    }


    public void increaseVolume() {  //      звук увеличение
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = currentVolume;
        }
    }

    public void decreaseVolume() { // звук уменьшение
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = currentVolume;
        }
    }
}




