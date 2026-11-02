import java.util.ArrayList;
import java.util.List;

/**
 * Main execution class for the Computer Graphics 3D Rendering Prototype.
 * Author: Farrah Irwayu
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== UNIMAS Computer Graphics 3D Rendering Prototype ===");
        
        List<PolygonObject3D> sceneObjects = new ArrayList<>();
        sceneObjects.add(new PolygonObject3D("Cube Model", 8, 12, "Transformed (Rotation X, Y)"));
        sceneObjects.add(new PolygonObject3D("Pyramid Model", 5, 8, "Transformed (Scaling & Translation)"));

        for (PolygonObject3D obj : sceneObjects) {
            obj.renderPipeline();
        }
    }
}