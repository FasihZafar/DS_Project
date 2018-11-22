package DijsktraAlgorithm;

public class App {

    public static void main(String[] args) 
    {
        Vertex[] V = new Vertex [5];
        Vertex vertex1 = new Vertex("A");
        Vertex vertex2 = new Vertex("B");
        Vertex vertex3 = new Vertex("C");
        Vertex vertex4 = new Vertex("D");
        Vertex vertex5 = new Vertex("E");
        Vertex vertex6 = new Vertex("F");
        Vertex vertex7 = new Vertex("G");

        vertex1.addNeighbour(new Edge(5, vertex1, vertex3));
        
        vertex2.addNeighbour(new Edge(1, vertex2, vertex3));
        vertex2.addNeighbour(new Edge(4, vertex2, vertex1));
        
        vertex4.addNeighbour(new Edge(2, vertex4, vertex5));
        vertex4.addNeighbour(new Edge(3, vertex4, vertex6));
        
        vertex5.addNeighbour(new Edge(2, vertex5, vertex3));
        
        vertex6.addNeighbour(new Edge(3, vertex6, vertex5));
        vertex6.addNeighbour(new Edge(8, vertex6, vertex7));
        
        vertex7.addNeighbour(new Edge(1, vertex7, vertex5));
        
        
        ShortestPath shortestPath = new ShortestPath();
        shortestPath.computePaths(vertex1);

        System.out.println(shortestPath.getShortestPathTo(vertex3));

    }

}
