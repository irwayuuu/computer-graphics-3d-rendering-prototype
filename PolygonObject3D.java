/**
 * Represents a 3D graphical object applying geometric transformation data.
 */
public class PolygonObject3D {
    private String modelName;
    private int vertexCount;
    private int polygonCount;
    private String transformationState;

    // Constructor
    public PolygonObject3D(String modelName, int vertexCount, int polygonCount, String transformationState) {
        this.modelName = modelName;
        this.vertexCount = vertexCount;
        this.polygonCount = polygonCount;
        this.transformationState = transformationState;
    }

    // Render Pipeline Method
    public void renderPipeline() {
        System.out.println("--------------------------------------------------");
        System.out.println("Model Name: " + modelName);
        System.out.println("Vertices: " + vertexCount + " | Polygons: " + polygonCount);
        System.out.println("Pipeline Status: Pipeline projection & rasterization complete.");
        System.out.println("Transformation Applied: " + transformationState);
    }
}