package maratona;

import java.util.*;

public class plantaoduvidas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int vagas = scanner.nextInt();
        scanner.nextLine(); 

       
        Map<Integer, TreeSet<String>> categorias = new TreeMap<>();
        categorias.put(1, new TreeSet<>()); 
        categorias.put(2, new TreeSet<>()); 
        categorias.put(3, new TreeSet<>());
        categorias.put(4, new TreeSet<>()); 
        categorias.put(5, new TreeSet<>()); 
        categorias.put(6, new TreeSet<>()); 

        
        List<String> alunosExcedentes = new ArrayList<>();

       
        while (scanner.hasNextLine()) {
            String linha = scanner.nextLine().trim();
            if (linha.isEmpty()) break; 

           
            String[] partes = linha.split(" ");
            String nomeAluno = partes[0];
            for (int i = 1; i < partes.length; i++) {
                try {
                    int categoria = Integer.parseInt(partes[i]);
                    if (categorias.containsKey(categoria)) {
                        TreeSet<String> alunosCategoria = categorias.get(categoria);
                        if (alunosCategoria.size() < vagas) {
                            alunosCategoria.add(nomeAluno);
                        } else {
                            alunosExcedentes.add(nomeAluno);
                        }
                    } else {
                        System.err.println("Categoria inválida encontrada: " + categoria);
                    }
                } catch (NumberFormatException e) {
                    System.err.println("Categoria inválida encontrada: " + partes[i]);
                }
            }
        }

        
        String[] nomesCategorias = {
            "Algoritmos",
            "Boas Práticas",
            "Desempenho",
            "Fluxograma",
            "Interpretação de Enunciados",
            "Sintaxe da Linguagem"
        };

        
        for (int i = 1; i <= 6; i++) {
            TreeSet<String> alunos = categorias.get(i);

            
            System.out.println("------------------------------");
            System.out.println(nomesCategorias[i - 1].toUpperCase());
            System.out.println("------------------------------");

           
            if (alunos != null) {
                int count = 0;
                for (String aluno : alunos) {
                    System.out.println(aluno);
                    count++;
                    if (count == vagas) break; 
                }
            }

            System.out.println(); 
        }

       
        if (!alunosExcedentes.isEmpty()) {
            System.out.println("------------------------------");
            System.out.println("Fica para a próxima!");
            System.out.println("------------------------------");
            for (String aluno : alunosExcedentes) {
                System.out.println(aluno);
            }
        }

        scanner.close();
    }
}


