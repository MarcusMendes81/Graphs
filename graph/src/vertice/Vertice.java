package vertice;

import java.util.ArrayList;

public class Vertice {
    private int valor;
    private Integer distance;
    private ArrayList<Vertice> adj;

    public Vertice(int valor){
        this.valor = valor;
        this.distance = null;
        this.adj =new ArrayList<Vertice>();
    }

    public int getValor() {
        return valor;
    }


    public ArrayList<Vertice> getAdj() {
        return adj;
    }

    public void setAdj(Vertice vertice) {
        this.adj.add(vertice);
    }

    public Integer getDistance() {
        return distance;
    }
    

    @Override
    public String toString() {
        return "Vertice v=" + this.valor + ", d=" + this.distance + ", adj=" + this.adj + "";
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }
    
}
