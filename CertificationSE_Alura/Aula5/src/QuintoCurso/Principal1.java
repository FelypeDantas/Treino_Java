package QuintoCurso;

public class Principal1 {
	public static void main(String[] args) {
		

	    Param p = new Param();
	    p.primitivo(10);
	    p.primitivo(10L);
	    p.primitivo(10F);
	    p.primitivo((short) 10);
	    p.primitivo((byte) 10);
	    p.primitivo('Z');
	    
	    p.referencia(new Object());
	    p.referencia(new Object());
	}

}
