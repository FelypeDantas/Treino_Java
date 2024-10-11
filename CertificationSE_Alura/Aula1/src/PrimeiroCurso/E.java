package PrimeiroCurso;

import java.io.File;

class E {
    public boolean existe(String nome) {
        File f = new File(nome);
        return f.exists();
    }
}