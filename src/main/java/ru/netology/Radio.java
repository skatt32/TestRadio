package ru.netology;

public class Radio {
    private int currentVolume;  // текушая громкость
    private int currentStation;  // текущая станция

    public int getCurrentVolume() {
        return currentVolume;
    }
    public int getCurrentStation() {
        return currentStation;
    }
    public void setCurrentStation(int newCurrentStation) {  // установка станции

        if (newCurrentStation > 9) {
            return;
        }
        if (newCurrentStation < 0) {
            return;
        }
        currentStation = newCurrentStation;
    }
    public void setCurrentVolume(int newCurrentVolume) {  // установка громкости
//       if (newCurrentVolume > 100) {
//           return;
//       }
//       if (newCurrentVolume < 0) {
//           return;
//       }
        currentVolume = newCurrentVolume;
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
    public void nextStation() {  //следующая радиостанция
        if (currentStation < 9) {
            currentStation = currentStation + 1;
        }else {
            currentStation = 0;
        }
    }
    public void previousStation() {  //предыдущая радиостанция
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        } else {
            currentStation = 9;
        }
    }
}
