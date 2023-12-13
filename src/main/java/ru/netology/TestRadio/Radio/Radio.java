package ru.netology.TestRadio.Radio;

public class Radio {

    private int currentStation;  // текущая станция

    private int currentVolume;  // текушая громкость

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {  // установка станции
        currentStation = newCurrentStation;
        if (newCurrentStation > 9) {
            return;
        }
        if (newCurrentStation < 0) {
            return;
        }

    }


    public void nextStation() {  //следующая радиостанция
        if (currentStation < 9) {
            currentStation = currentStation + 1;
        }else {
            currentStation = 0;
        }
    }

    public void previousStation() {  //предыдущая радиостанция
        if (currentStation > 0) {
            currentStation = currentStation - 0;
        } else {
            currentStation = 9;
        }
    }

    public void setCurrentVolume(int newCurrentVolume) {  // установка громкости
        currentVolume = newCurrentVolume;
        if (newCurrentVolume > 100) {
            return;
        }
        if (newCurrentVolume < 0) {
            return;
        }
    }

    public void increaseVolume() { // увеличить громкость на 1
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void reduceVolume() {  // уменьшить громкость на 1
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}
