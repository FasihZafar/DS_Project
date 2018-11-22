package DijsktraAlgorithm;

import java.util.Scanner;

public class Edge 
{
    private double weight;
    private Vertex startVertex;
    private Vertex targetVertex;

    public Edge(double weight, Vertex startVertex, Vertex targetVertex) 
    { 
        int flg = 1;
        try
        {
            while(flg != 0)
            {
                if(weight < 0)
                {
                    System.out.println("Weight cannot be negative, Please Enter Again : ");
                    Scanner s = new Scanner(System.in);
                    weight = s.nextDouble();
                    this.weight = weight;
                }
                else
                {
                    this.weight = weight;
                    flg = 0;
                }   
            }   
            
        }
        catch(Exception e)
        {
            System.out.println("Exception occurred");
        }
        this.startVertex = startVertex;
        this.targetVertex = targetVertex;
    }

    public double getWeight() 
    {
        return weight;
    }

    public void setWeight(double weight) 
    {
        this.weight = weight;
    }

    public Vertex getStartVertex() 
    {
        return startVertex;
    }

    public void setStartVertex(Vertex startVertex) 
    {
        this.startVertex = startVertex;
    }

    public Vertex getTargetVertex()
    {
        return targetVertex;
    }

    public void setTargetVertex(Vertex targetVertex) 
    {
        this.targetVertex = targetVertex;
    }
    
}
