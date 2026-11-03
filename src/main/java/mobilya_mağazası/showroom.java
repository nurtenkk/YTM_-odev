package mobilya_mağazası;

public abstract class showroom {
    public abstract Chair createChair();

    public String display(){
        return "vitrinde " + createChair().describe();
    }

}
