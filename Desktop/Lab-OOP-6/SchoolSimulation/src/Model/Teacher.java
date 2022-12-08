package Model;

public class Teacher extends Staff {
    private String subject;
    

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void teaches() {
        System.out.println(getName() + ": Today we're gonna learn about something new and exciting! ");

    }

    public void givesObservation() {
        System.out.println(getName() + ": You should listen during the class!!! ");

    }

    public void parentMeeting() {
        System.out.println(getName()
                + ": To be honest, what I wanted to tell you today is.. your dear children aren't as respectful at school as they are at home...");
    }

    public void stopsFight() {
        System.out.println(getName() + ": Guys, stop!  You will get severly punished for this! ");
    }

    public void entersMeetingRoom() {
        System.out.println(getName() + ": Hello everyone! ");
    }

    public void argueParent() {
        System.out.println(getName()
                + ": This is very disrespectful! How dare you talk like that to me?! You're teh same as your brat! ");
    }

    public void calmParent() {
        System.out.println(getName() + ": I understand where you're coming from, but please calm down. ");
    }


    public void endsClass() {
        System.out.println(getName() + ": Thank you for today, don't forget to do your homework! ");
    }

    public void callParent() {
        System.out.println(getName() + ": *calls parent immediately* ");
    }
}