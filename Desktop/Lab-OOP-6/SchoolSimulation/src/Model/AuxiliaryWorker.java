package Model;

public class AuxiliaryWorker extends Staff {
    public String job;

    public void setJob(String job) {
        this.job = job;
    }

    public String getJob(){
        return job;
    }


    public void cook() {
        System.out.println(getName() + ": The food will be ready soon. ");
    }

    public void burnFood() {
        System.out.println(getName() + ": AHHHH! The food is destroyed! ");
    }

    public void runOutOfIngredients() {
        System.out.println(getName() + ": We need more ingredients as soon as possible. ");
    }

    public void treat() {
        System.out.println(
                getName() + ": Let me see, so you have a headache...Here, take this pill and glass of water. ");
    }

    public void ignoreStudent() {
        System.out.println(getName() + ": *ignores student* ");
    }

    public void sendToClass() {
        System.out.println(getName() + ": You can go to your next class.  ");
    }

    public void sendHome() {
        System.out.println(getName() + ": You can go home, take care! ");
    }

    public void callAmbulance() {
        System.out.println(getName() + ": *calls ambulance because the state of the student isn't getting better*  ");
    }

    public void serveFood() {
        System.out.println(getName() + ": *serves food to everyone* ");
    }

    public void satisfied() {
        System.out.println(getName() + ": I am happy to hear that you guys are liking it!  ");
    }

    public void makeSmallerPortions() {
        System.out.println(getName() + ": *serves smaller portions*");
    }

    public void noFoodAnnouncement() {
        System.out.println(
                getName() + ": There will be no food today guys. Please get your lunch from the nearby mini market. ");
    }

    void sad() {
        System.out.println(getName() + ": * gets sad that everyone is disappointed in them* ");
    }

    void enterSchool() {
        System.out.println(getName() + ": *enters school grounds* ");
    }
}