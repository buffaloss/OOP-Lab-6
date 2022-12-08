package Controller;

import Model.simulationModel;
import View.simulationView;

public class simulationController {
    private simulationModel model;
    private simulationView view;

    public simulationController(simulationModel model,simulationView view){
        this.model=model;
        this.view=view;
    }

    public void updateView(){
        model.startSimulation();
        view.printSimulation(model.getDay(), model.get_no_incidents(), model.getEminenceStudent(), model.getEminenceStudent1(),model.getSalaryTeacher(), model.getSalaryNurse(), model.getSalaryCook(), model.getSchoolReputation(), model.getStudent1Name(),model.getStudent1Name(), model.getTeacherName(), model.getNurseName(), model.getCookName(),model.getSchoolName());

    }

    
}
