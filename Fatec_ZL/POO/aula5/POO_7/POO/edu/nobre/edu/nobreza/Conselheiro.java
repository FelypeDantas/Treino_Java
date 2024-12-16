package edu.nobreza;

import java.util.ArrayList;
import java.util.List;

public class Conselheiro {
    private List<Bispo> bispos;

    public Conselheiro() {
        this.bispos = new ArrayList<>();
    }

    public List<Bispo> getBispos(){
        return bispos;
    }
}
