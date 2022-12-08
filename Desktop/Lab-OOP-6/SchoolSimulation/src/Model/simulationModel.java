package Model;
import java.util.Random;

public class simulationModel {
    private School school;
    private Teacher teacher;
    private Parent parent;
    private Student student;
    private Student student1;
    private Adjunct adjunct;
    private AuxiliaryWorker worker1;
    private AuxiliaryWorker worker2;
    public int dd;
    public int no_incidents;

    public simulationModel(){
        school = new School();
        teacher = new Teacher();
        parent = new Parent();
        student = new Student();
        student1 = new Student();
        adjunct = new Adjunct();
        worker1 = new AuxiliaryWorker();
        worker2 = new AuxiliaryWorker();

        school.setName("Lyceum of Modern Languages and Management");
        school.setSurface(5120);
        school.setAnnualFunds(70000);
        school.setReputation(65);
        School.Location location = new School.Location();
        location.setCity("Chisinau");
        location.setAddress("Petru Rares 39");

        teacher.setID(23);
        teacher.setName("Maria Ghita");
        teacher.setSubject("Physical Education");
        teacher.setSalary(1200);

        parent.setName("Giana Dudnic");

        student.setID(97);
        student.setName("Cristina Dudnic");
        student.setGrade(11);
        student.setPresence("present");
        student.setEminence(60);

        student1.setID(56);
        student1.setName("Dan Chitic");
        student1.setGrade(10);
        student1.setPresence("present");
        student1.setEminence(95);

        adjunct.setID(44);
        adjunct.setName("Lucia Rabei");
        adjunct.setTask("Organize parent-teacher meeting ");
        adjunct.setSalary(2100);

        worker1.setID(55);
        worker1.setJob("Nurse");
        worker1.setName("Irina Arnadie");
        worker1.setSalary(1000);

        worker2.setID(76);
        worker2.setJob("Cook");
        worker2.setName("Arcadie Manolie");
        worker2.setSalary(950);
    }

    public void startSimulation(){
        int j = 1;
        float scene1;
        Random random = new Random();

        while (j == 1) {
            no_incidents = 0;
            scene1 = random.nextFloat();
            if (scene1 <= 0.4) {
                student.attendsClass();
                teacher.teaches();
                student.listensToTeacher();
                student.leavesClass();
                System.out.println();
            } else {
                student.attendsClass();
                teacher.teaches();
                student.sleepsDuringClass();
                teacher.givesObservation();
                float idk = random.nextFloat();
                if (idk <= 0.5) {
                    student.getsObservationBad();
                    student.modifyEminence(-20);
                    no_incidents += 1;
                } else if (idk > 0.5 && idk <= 0.75) {
                    student.getsObservationGood();
                    student.modifyEminence(5);
                } else {
                    student.getsObservationNeutral();
                }
                student.leavesClass();
                System.out.println();
            }

            scene1 = random.nextFloat();
            if (scene1 <= 0.85) {
                student1.attendsClass();
                teacher.teaches();
                student1.listensToTeacher();
                student1.leavesClass();
                System.out.println();
            } else {
                student1.attendsClass();
                teacher.teaches();
                student1.sleepsDuringClass();
                teacher.givesObservation();
                float idk = random.nextFloat();
                if (idk <= 0.5) {
                    student1.getsObservationBad();
                    student1.modifyEminence(-15);
                    no_incidents += 1;
                } else if (idk > 0.5 && idk <= 0.75) {
                    student1.getsObservationGood();
                    student1.modifyEminence(10);
                } else {
                    student1.getsObservationNeutral();
                }
                student1.leavesClass();

                System.out.println();
            }

            float scene2 = random.nextFloat();
            if (scene2 <= 0.3) {
                System.out.println();
                student.attendsClass();
                teacher.teaches();
                student.listensToTeacher();
                teacher.endsClass();
                student.eats();
                student.bathroom();
                student.smokesInBathroom();
                student1.smokeObservation();
                student.getsIntoFight();
                student1.getsIntoFight1();
                teacher.stopsFight();
                adjunct.organizeMeeting();
                parent.entersMeetingRoom();
                if (student.getEminence() < 15) {
                    adjunct.exmatriculation1();
                } else {
                    adjunct.punishment1();
                }
                if (student1.getEminence() < 20) {
                    adjunct.exmatriculation2();
                } else if (student1.getEminence() >= 20 && student1.getEminence() <= 70) {
                    adjunct.punishment2();
                } else {
                    adjunct.noPunishment();
                }
                no_incidents += 1;
                System.out.println();
            }

            if (student.getEminence() < 30) {
                System.out.println();
                adjunct.organizeMeeting();
                parent.entersMeetingRoom();
                teacher.entersMeetingRoom();
                teacher.parentMeeting();
                float option = random.nextFloat();
                if (option >= 0.7) {
                    System.out.println(parent.getName()
                            + ": I see, I didnt't know about that...I will make sure to talk to him/her at home. Thank you for letting me know. ");
                    parent.leaveMeeting();
                    student.modifyEminence(15);
                } else if (option < 0.7 && option >= 0.4) {
                    System.out.println(parent.getName() + ": Ah, they're children.. It is no nothing serious! ");
                    parent.leaveMeeting();
                } else {
                    System.out.println(parent.getName()
                            + ": What did you just say about my children?! I want to to talk to your superior about this! *Karen noises*");
                    float opt = random.nextFloat();
                    if (opt <= 0.3) {
                        teacher.argueParent();
                        adjunct.salaryCut();
                        teacher.modifySalary(-500);
                        adjunct.exmatriculation2();
                        no_incidents += 1;
                    } else {
                        teacher.calmParent();
                        parent.leaveMeeting();
                        teacher.modifySalary(200);
                    }
                }

            }

            if (student.getEminence() < 30) {
                System.out.println();
                adjunct.organizeMeeting();
                parent.entersMeetingRoom();
                teacher.entersMeetingRoom();
                teacher.parentMeeting();
                float option = random.nextFloat();
                if (option >= 0.7) {
                    System.out.println(parent.getName()
                            + ": I see, I didnt't know about that...I will make sure to talk to him/her at home. Thank you for letting me know. ");
                    parent.leaveMeeting();
                    student1.modifyEminence(15);
                } else if (option < 0.7 && option >= 0.4) {
                    System.out.println(parent.getName() + ": Ah, they're children.. It is no nothing serious! ");
                    parent.leaveMeeting();
                } else {
                    System.out.println(parent.getName()
                            + ": What did you just say about my children?! I want to to talk to your superior about this! *Karen noises*");
                    float opt = random.nextFloat();
                    if (opt <= 0.3) {
                        teacher.argueParent();
                        adjunct.salaryCut();
                        teacher.modifySalary(-200);
                        adjunct.exmatriculation2();
                        no_incidents += 1;
                    } else {
                        teacher.calmParent();
                        parent.leaveMeeting();
                        teacher.modifySalary(200);
                    }

                }

            }
            float scene3 = random.nextFloat();
            if (scene3 <= 0.65) {
                System.out.println();
                adjunct.hireStaff();
                worker1.enterSchool();
                student1.attendsClass();
                student1.eats();
                student1.listensToTeacher();
                student1.leavesClass();
                student1.getsSick();

                float opt3 = random.nextFloat();
                if (opt3 <= 0.15) {
                    worker1.treat();
                    worker1.callAmbulance();
                    teacher.callParent();
                    worker1.modifySalary(150);
                } else if (opt3 > 0.15 && opt3 <= 0.5) {
                    worker1.treat();
                    worker1.sendHome();
                    worker1.modifySalary(100);
                } else if (opt3 > 0.5 && opt3 <= 0.65) {
                    worker1.treat();
                    worker1.sendToClass();
                } else {
                    worker1.ignoreStudent();
                    student1.fileReport();
                    adjunct.organizeMeeting();
                    int opt4 = random.nextInt(1, 3);
                    if (opt4 == 1) {
                        adjunct.fireStaff();
                        worker1.modifySalary(-150);
                    } else {
                        adjunct.salaryCut();
                        worker1.modifySalary(-200);
                    }
                    no_incidents += 1;
                }
                System.out.println();

            }

            float scene4 = random.nextFloat();
            if (scene4 <= 0.15) {
                System.out.println();
                worker2.enterSchool();
                worker2.cook();
                int opt5 = random.nextInt(1, 4);
                if (opt5 == 1) {
                    worker2.serveFood();
                    student.eats();
                    worker2.satisfied();
                    worker2.modifySalary(100);

                } else if (opt5 == 2) {
                    worker2.runOutOfIngredients();
                    worker2.makeSmallerPortions();
                    worker2.serveFood();
                    student.eats();
                    int opt6 = random.nextInt(1, 3);
                    if (opt6 == 1) {
                        worker2.satisfied();
                        worker2.modifySalary(100);
                    } else {
                        student.complain();
                        worker2.sad();

                    }
                    no_incidents += 1;
                } else if (opt5 == 3) {
                    worker2.burnFood();
                    worker2.noFoodAnnouncement();
                    student.complain();
                    worker2.sad();
                    worker2.modifySalary(-250);
                    no_incidents += 1;

                }
                System.out.println();
            }

            int curr_rep = school.getReputation();
            if (no_incidents == 0) {
                curr_rep = curr_rep + 2;
                ;
            } else {
                curr_rep = curr_rep - no_incidents * 2 + (student.getEminence() + student1.getEminence()) / 20;

            }
    }
}

public int getDay(){
    return dd;
}

public int get_no_incidents(){
    return no_incidents;
}

public int getEminenceStudent(){
    return student.getEminence();
}

public int getEminenceStudent1(){
    return student1.getEminence();
}

public int getSalaryTeacher() {
    return teacher.getSalary();
}

public int getSalaryNurse() {
    return worker1.getSalary();
}

public int getSalaryCook() {
    return worker2.getSalary();
}

public int getSchoolReputation() {
    return school.getReputation();
}

public String getStudentName(){
    return student.name;
}

public String getStudent1Name(){
    return student1.name;
}

public String getTeacherName(){
    return teacher.name;
}

public String getNurseName(){
    return worker1.name;
}

public String getCookName(){
    return worker2.name;
}

public String getSchoolName() {
    return school.name;
}

public String getAdjunctName() {
    return adjunct.name;
}

}