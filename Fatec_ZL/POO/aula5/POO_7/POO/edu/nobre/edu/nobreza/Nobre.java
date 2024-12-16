package edu.nobreza;

import java.util.ArrayList;
import java.util.List;

public class Nobre {
    private Conselheiro conselheiro;
    private List<Soldado> soldados;

    public Nobre() {
        this.soldados = new ArrayList<>();
    }

    public void governar() {
        System.out.println("sou rico tenho conselheiro " + conselheiro + " e " + soldados);
    }

}
