package Data_Structures;

public class TraversableVertex {
    private Vertex vertex;
    private int workingValue;
    private Vertex previousVertex;

    public TraversableVertex(Vertex vertex){
        this.vertex = vertex;
        workingValue = 0;
        previousVertex = null;
    }

    public Vertex getPreviousVertex() {
        return previousVertex;
    }

    public void setPreviousVertex(Vertex previousVertex) {
        this.previousVertex = previousVertex;
    }

    public int getWorkingValue() {
        return workingValue;
    }

    public void setWorkingValue(int workingValue) {
        this.workingValue = workingValue;
    }
}
