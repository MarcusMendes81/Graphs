package grafo_com_obj_vertice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;



import vertice.Vertice;

public class Grafo {
    private ArrayList<Vertice> grafo;

    public Grafo() {
        grafo = new ArrayList<Vertice>();
    }

    public void addVertice(Vertice vertice) {
        grafo.add(vertice);
    }

    @Override
    public String toString() {
        return "G =" + grafo + "";
    }

    public void show(Vertice src) {
        
    }

    public void BFS(Vertice vertice) {

        Queue<Vertice> fila = new LinkedList<Vertice>();
        
        fila.add(vertice);
        vertice.setDistance(0);

        while (!fila.isEmpty()) {
            Vertice value = fila.remove();
            System.out.print(value.getValor() + " ");
            for (Vertice v : value.getAdj()) {
                if(v.getDistance() == null){
                    v.setDistance(value.getDistance() + 1);
                    fila.add(v);
                }               
            }
        }
    }

}
