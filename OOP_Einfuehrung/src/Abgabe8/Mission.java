package Abgabe8;

public class Mission {
    private double missionTime ;
    private int difficulty ;
    Mission (double missionTime, int difficulty){
        this.missionTime = missionTime ;
        this.difficulty = difficulty ;
    }
    public void adjustMissionTime(int zeit){
        this.missionTime-=zeit ;
    }

    public double getMissionTime() {
        return missionTime;
    }

    public void setMissionTime(double missionTime) {
        this.missionTime = missionTime;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }
}
