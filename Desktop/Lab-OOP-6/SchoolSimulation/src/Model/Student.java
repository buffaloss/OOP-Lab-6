package Model;

import java.util.Random;

public class Student extends Person {
    private int grade;
    private String presence;
    private int eminence;

    Random random = new Random();

    public int getEminence() {
        return this.eminence;
    }

    public void setEminence(int eminence) {
        this.eminence = eminence;
    }

    public void modifyEminence(int eminence) {
        this.eminence = this.eminence + eminence;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getPresence() {
        return presence;
    }

    public void setPresence(String presence) {
        this.presence = presence;

    }

    // modify student's presence if he shows up later
    public void modifyPresence(String presence) {
        this.presence = presence;
    }

    public void attendsClass() {
        System.out.println(getName() + ": I am " + getPresence());
    }

    public void getsObservationBad() {
        System.out.println(getName() + ": whatever...leave me alone!");
    }

    public void getsObservationGood() {
        System.out.println(getName() + ": I'm sorry ma'am... it won't happen again.");
    }

    public void getsObservationNeutral() {
        System.out.println(getName() + ": *wakes up and stays silent* ");
    }

    public void listensToTeacher() {
        System.out.println(getName() + ": *attentinvely and quiestly listens* ");
    }

    public void sleepsDuringClass() {
        System.out.println(getName() + ": *zzzzZZZZZZ zzZZZzZZzzZZ*");
    }

    public void getsSick() {
        System.out.println(getName() + ": I don't feel well... ");
    }

    public void eats() {
        System.out.println(getName() + ": I'm so hungry i could eat everything on this table right now ");
    }

    public void getsIntoFight() {
        System.out.println(getName() + ": What did you justs say to me?! * starts throwing punches* ");
    }

    public void smokesInBathroom() {
        System.out.println(getName() + ": Ah, thank god i can smoke at least until the break is over.. ");
    }

    public void leavesClass() {
        System.out.println(getName() + ": *leaves classroom* ");

    }

    public void bathroom() {
        System.out.println(getName() + ": *enters bathroom* ");

    }

    public void smokeObservation() {
        System.out.println(
                getName() + ": I don't think you should be smoking here. At least wait until classes are over,dude. ");
    }

    public void getsIntoFight1() {
        System.out.println(getName() + ": I said what I said. Stop being so whiny and wait until classes are over.  ");

    }

    public void fileReport() {
        System.out.println(getName() + ": *files report on the nurse who neglected her duties* ");
    }

    public void satisfied() {
        System.out.println(getName() + ": *no complaints* ");

    }

    public void complain() {
        System.out.println(getName() + ": Ah really.. *disappointed* ");

    }
}