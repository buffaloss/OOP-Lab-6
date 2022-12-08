package Model;


public class Parent extends Person {

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void leaveMeeting() {
        System.out.println(getName() + " : *leaves meeting* ");

    }

    public void entersMeetingRoom() {
        System.out.println(getName() + " * enters the room with a lot of other parents and teachers* ");
    }

}
