package DijsktraAlgorithm;

import java.util.ArrayList;
import java.util.List;

public class Vertex implements Comparable<Vertex> 
{
    private String name;
    private List<Edge> adjacencyList;
    private boolean visited;
    private Vertex predecessor;
    private double minDistance = Double.MAX_VALUE;

    public Vertex(String name)
    {
        this.name = name;
        this.adjacencyList = new ArrayList<>();
    }

    public void addNeighbour(Edge edge)
    {
        this.adjacencyList.add(edge);
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public List<Edge> getAdjacenciesList() 
    {
        return adjacencyList;
    }

    public void setAdjacencyList(List<Edge> adjacencyList)
    {
        this.adjacencyList = adjacencyList;
    }

    public boolean isVisited()
    {
        return visited;
    }

    public void setVisited(boolean visited) 
    {
        this.visited = visited;
    }

    public Vertex getPredecessor() 
    {
        return predecessor;
    }

    public void setPredecessor(Vertex predecessor) 
    {
        this.predecessor = predecessor;
    }

    public double getMinDistance() 
    {
        return minDistance;
    }

    public void setMinDistance(double minDistance) 
    {
        this.minDistance = minDistance;
    }

    @Override
    public String toString() 
    {
        return this.name;
    }

    @Override
    public int compareTo(Vertex otherVertex) 
    {
        return Double.compare(this.minDistance, otherVertex.getMinDistance());
    }
}
