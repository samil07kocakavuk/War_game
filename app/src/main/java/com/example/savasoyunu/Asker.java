package com.example.savasoyunu;
import java.util.Random;

public class Asker {
    private int atesGucu;
    private int sans;

    public int getAtesGucu() {
        return atesGucu;
    }

    public void setAtesGucu(int atesGucu) {
        this.atesGucu = atesGucu;
    }

    public int getSans() {
        return sans;
    }

    public void setSans(int sans) {
        this.sans = sans;
    }

    public Asker(int atesGucu, int sans) {
        this.atesGucu = atesGucu;
        this.sans = sans;
    }
    public int atesEt(Oyuncu dusman){
        Random random = new Random();
        int isabet = random.nextInt(sans)*atesGucu;
        dusman.setCan(dusman.getCan()-isabet);
        return isabet;
    }
}
