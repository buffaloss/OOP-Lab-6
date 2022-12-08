package Model;
public class Adjunct extends Staff {
    
    public String task;

    public void setTask(String task) {
        this.task = task;
    }

    public String getTask() {
        return task;
    }
    public void hireStaff() {
        System.out.println(getName() + ": We believe you will be a great addition to our team! ");

    }

    public void fireStaff() {
        System.out.println(getName() + ": I am sorry to tell you that you will have to leave us... ");

    }

    public void organizeMeeting() {
        System.out.println(getName() + ": *contacts everyone who needs to be present at the meeting* ");

    }

    public void exmatriculation1() {
        System.out.println(
                getName() + ": The one who started the fight shall be exmatriculated. That is my final decision.");

    }

    public void punishment1() {
        System.out.println(getName()
                + ": The one who started the fight shall be severly punished. You will have to do 200 hours of community service this year. That is my final decision. ");

    }

    public void exmatriculation2() {
        System.out.println(getName() + ": And the one who continued the fight shall also be exmatriculated. ");

    }

    public void punishment2() {
        System.out.println(getName()
                + ": And the one who continued the fight shall also be severly punished. You will have to do 50 hours of community service this year.");

    }

    public void noPunishment() {
        System.out.println(getName() + ": And the one who just wanted to stop a bad deed should not get punished.  ");

    }

    public void salaryCut() {
        System.out.println(getName() + ": You mistake will not be ignored and therefore you get a pay cut. ");
    }

}