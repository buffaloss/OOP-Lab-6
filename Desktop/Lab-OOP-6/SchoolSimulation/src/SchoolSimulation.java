import Model.*;
import Controller.simulationController;
import View.simulationView;
import java.lang.Thread;

public class SchoolSimulation {

    public static void main(String[] args) {
        int l = 1;
        simulationModel model = new simulationModel();
        simulationView view = new simulationView();
        simulationController controller = new simulationController(model,view);

        while(l == 1){
            controller.updateView();
            wait(2000);
        }
    }
        
    public static void wait(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
}