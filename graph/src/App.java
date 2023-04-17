import grafo_com_obj_vertice.Grafo;
import vertice.Vertice;

public class App {
    public static void main(String[] args) throws Exception {
        Vertice v1 = new Vertice(1);
        Vertice v2 = new Vertice(2);
        Vertice v3 = new Vertice(3);
        Vertice v4 = new Vertice(4);
        Vertice v5 = new Vertice(5);
        Vertice v6 = new Vertice(6);

        


        Grafo grafo = new Grafo();
        grafo.addVertice(v1);grafo.addVertice(v2);grafo.addVertice(v3);grafo.addVertice(v4);grafo.addVertice(v5);
        
       
       
       grafo.BFS(v3);
    }
}
