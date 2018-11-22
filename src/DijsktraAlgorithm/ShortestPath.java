package DijsktraAlgorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

public class ShortestPath
{
    private  static double distance;

    public void computePaths(Vertex sourceVertex) 
    {

        sourceVertex.setMinDistance(0);
        PriorityQueue<Vertex> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(sourceVertex);

        while (!priorityQueue.isEmpty()) 
        {

            Vertex actualVertex = priorityQueue.remove();

            for(Edge edge : actualVertex.getAdjacenciesList()) 
            {

                Vertex v = edge.getTargetVertex();
                Vertex u = edge.getStartVertex();

                double newDistance = actualVertex.getMinDistance() + edge.getWeight();
                 
                if (newDistance < v.getMinDistance()) 
                {
                    priorityQueue.remove(v);
                    v.setMinDistance(newDistance);
                    v.setPredecessor(actualVertex);
                    priorityQueue.add(v);
                }
            }
        }
    }

    public List<Vertex> getShortestPathTo(Vertex targetVertex)
    {
        List<Vertex> path = new ArrayList<>();

        for (Vertex vertex = targetVertex; vertex != null; vertex = vertex.getPredecessor()) 
        {
            path.add(vertex);
        }
        
        System.out.println("Distance: "+path.get(0).getMinDistance());
        
        Collections.reverse(path);
        
        return path;
    }
    
}

