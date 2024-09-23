package com.example.savasoyunu;

public class Topcu extends Asker{
    private boolean topIsindi = false;
    public int atisSayisi;

    public int getAtisSayisi() {
        return atisSayisi;
    }

    public void setAtisSayisi(int atisSayisi) {
        this.atisSayisi = atisSayisi;
    }

    @Override
    public int atesEt(Oyuncu dusman) {
        if (topIsindi) {
            topIsindi = false;
            atisSayisi = 0;
            return 0;
        }
        atisSayisi++;
        if (atisSayisi == 3) {
            topIsindi = true;
        }
        int isabet = super.atesEt(dusman);
        return isabet;
    }

    public Topcu() {
        super(3,7);
        atisSayisi=0;
    }
}
