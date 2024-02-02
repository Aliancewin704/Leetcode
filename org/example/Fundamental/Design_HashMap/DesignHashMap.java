package org.example.Fundamental.Design_HashMap;

public class DesignHashMap {

    int[] mapa;

    public DesignHashMap() {
        this.mapa = new int[1000001];
    }

    public void put(int key, int value) {
        if (value == 0) {
            mapa[key] = -2;
            return;
        }
        mapa[key] = value;
    }

    public int get(int key) {
        if (mapa[key] == 0) return -1;
        if (mapa[key] == -2) return 0;
        return mapa[key];
    }

    public void remove(int key) {
        mapa[key] = -1;
    }
}
