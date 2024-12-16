package model.estrutura;

import java.util.*;

public class GrafoLista<T> {

	private Map<T, List<T> > map = new HashMap<>();
	
	public void add(T source) {
		map.put(source, new LinkedList<T>());
	}
	
	public void add(T source, T destination) {
		if(!map.containsKey(source)) {
			add(source);
		}
		if(!map.containsKey(destination)) {
			add(destination);
		}
		
		map.get(source).add(destination);
		map.get(destination).add(source);
	}
	
	public boolean has(T s) {
		return map.containsKey(s);
	}
	
	public boolean has(T s, T d) {
		return map.get(s).contains(d);
	}
	
	public int size() {
		return map.keySet().size();
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		
		for(T v: map.keySet()) {
			builder.append(v.toString() + ": ");
			for(T w: map.get(v)) {
				builder.append(w.toString() + " ");
			}
			builder.append("\n");
		}
		return (builder.toString());
	}
}
