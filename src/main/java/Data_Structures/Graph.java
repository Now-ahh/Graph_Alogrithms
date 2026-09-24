package Data_Structures;

import Exceptions.ArcNotPresentException;
import Exceptions.VertexNotPresentException;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Graph {

    private HashMap<Vertex, HashMap<Vertex, Integer>> adjacencyList = new HashMap<>();

    public Graph(HashMap<Vertex, HashMap<Vertex, Integer>> adjacencyList){
        this.adjacencyList = adjacencyList;
    }

    public Graph(){}

    public HashMap<Vertex, HashMap<Vertex, Integer>> getAdjacencyList() {
        return adjacencyList;
    }

    public void addArc(Vertex source, Vertex destination, int weight) throws VertexNotPresentException{
        if(!adjacencyList.containsKey(source)){
            throw new VertexNotPresentException("Starting vertex "+source+" is not present within the graph");
        }else if(!adjacencyList.containsKey(destination)){
            throw new VertexNotPresentException("Destination vertex "+destination+" is not present within the graph");
        }

        adjacencyList.get(source)
                .put(destination, weight);
    }

    public void addArc(Vertex source, Vertex destination) throws VertexNotPresentException{
        if(!adjacencyList.containsKey(source)){
            throw new VertexNotPresentException("Starting vertex "+source+" is not present within the graph");
        }else if(!adjacencyList.containsKey(destination)){
            throw new VertexNotPresentException("Destination vertex "+destination+" is not present within the graph");
        }

        adjacencyList.get(source)
                .put(destination, 0);
    }

    public Vertex addVertex(String name){
        Vertex newVertex = new Vertex(name);
        adjacencyList.put(newVertex,new HashMap<>());
        return newVertex;
    }


    public  Vertex addVertex(UUID uuid){
        Vertex newVertex = new Vertex(uuid);
        adjacencyList.put(newVertex,new HashMap<>());
        return newVertex;
    }

    public Vertex addVertex(){
        Vertex newVertex = new Vertex();
        adjacencyList.put(newVertex,new HashMap<>());
        return newVertex;
    }

    public Vertex addVertex(Vertex vertex){
        if(!adjacencyList.containsKey(vertex)) {
            adjacencyList.put(vertex, new HashMap<>());
        }
        return vertex;
    }

    public void removeVertex(Vertex vertexToRemove) throws VertexNotPresentException {
        if (!adjacencyList.containsKey(vertexToRemove)) {
            throw new VertexNotPresentException("Vertex " + vertexToRemove + " is not present within the graph");
        }
        adjacencyList.remove(vertexToRemove);
        for (Map<Vertex, Integer> values : adjacencyList.values()) {
            values.remove(vertexToRemove);
        }
    }

    public void removeArc(Vertex source, Vertex destination) throws VertexNotPresentException, ArcNotPresentException {
        if(!adjacencyList.containsKey(source)){
            throw new VertexNotPresentException("Starting vertex "+source+" is not present within the graph");
        }else if(!adjacencyList.get(source).containsKey(destination)){
            throw new ArcNotPresentException("An Arc between " + source + " and " + destination + " is not present within the graph");
        }
        adjacencyList.get(source).remove(destination);
    }
}

