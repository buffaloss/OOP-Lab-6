package Model;

public class School extends Entity {

    public String name;
    public int surface;
    private int annualFunds;
    public int reputation;

    static class Location {
        private String city;
        private String address;

        public String getCity() {
            return this.city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getAddress() {
            return this.address;
        }

        public void setAddress(String adress) {
            this.address = adress;
        }
    }

    public int getReputation() {
        return this.reputation;
    }

    public void setReputation(int reputation) {
        this.reputation = reputation;
    }

    public void modifyReputation(int reputation) {
        this.reputation = this.reputation + reputation;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSurface() {
        return this.surface;
    }

    public void setSurface(int surface) {
        this.surface = surface;
    }

    public int getAnnualFunds() {
        return this.annualFunds;
    }

    public void setAnnualFunds(int annualFunds) {
        this.annualFunds = annualFunds;
    }

    public void modifyAnnualFunds(int annualFunds) {
        this.annualFunds = this.annualFunds + annualFunds;
    }

}