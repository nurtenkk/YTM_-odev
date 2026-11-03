package kahve_dükkanı;

public class Coffee {
    private final String name;
    private final String size;
    private final String milk;

    public Coffee(Builder builder) {
        this.name = builder.name;
        this.size=builder.size;
        this.milk=builder.milk;
    }
    public Builder builder(String name){
        return new Builder(name);
    }
    @Override
    public String toString(){
        if(milk.equals("süt yok")) {
        return name + size + "sütsüz";
        }
        return name + size + milk ;
    }

   public static class Builder {
    private String name;
    private String size="orta";
    private String milk="süt yok";

       public Builder (String name){
           if(name==null || name.isEmpty() ){
               throw new IllegalArgumentException("kahve adı zorunludur");
           } this.name=name;
       }




    public Builder size(String s) {
        size = s;
        return this;

    }

    public Builder milk(String m) {
        milk = m;
        return this;
    }

    public Coffee build() {
           if(name.equals("türk kahvesi") && milk.equals("süt yok")){
               throw new IllegalArgumentException("türk kahvesine süt eklenmez");
           }
        return new Coffee(this);
    }
}}