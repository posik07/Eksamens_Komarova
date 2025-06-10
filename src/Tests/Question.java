package Tests;

public class Question {
    private String jautajums;
    private String[] opcijas;
    private int pareizaAtbilde; // 1 līdz 4

    public Question(String jautajums, String[] opcijas, int pareizaAtbilde) {
        this.jautajums = jautajums;
        this.opcijas = opcijas;
        this.pareizaAtbilde = pareizaAtbilde;
    }

    public String getJautajums() {
        return jautajums;
    }

    public String[] getOpcijas() {
        return opcijas;
    }

    public int getPareizaAtbilde() {
        return pareizaAtbilde;
    }
}
