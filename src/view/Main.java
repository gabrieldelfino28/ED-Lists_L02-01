package view;

import fateczl.Lista.model.Lista;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Lista<Integer> l = new Lista<>();
        try{
            l.addFirst(10);
            l.addLast(5);
            l.addLast(8);
            l.addLast(1);
            l.addLast(9);
            l.addLast(2);
            l.addLast(4);
            l.addLast(7);
            l.addLast(3);
            l.addLast(6);
            System.out.println("Lista Original: ");
            for (int a = 0; a < l.size(); a++) {
                System.out.print(l.get(a) + " ");
            }

            for(int i = 0; i < l.size(); i++) {
                for (int j = 0; j < l.size() - 1; j++) {
                    int a = l.get(j);
                    int b = l.get(j+1);
                    if (a > b) {
                        l.remove(j);
                        l.remove(j);
                        l.add(a,j);
                        l.add(b,j);
                    }
                }
            }

            System.out.println("\nLista Ordenada: ");
            for (int a = 0; a < l.size(); a++) {
                System.out.print(l.get(a) + " ");
            }

        }catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
