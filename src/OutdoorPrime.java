public class OutdoorPrime implements Outdoor {
    private int id;
    private String location;
    private String content = "null";

    OutdoorPrime(int id, String location){
        this.id = id;
        this.location = location;
    }

    public String getLocation(){
        return location;
    }

    public void setContent(String content){
        this.content = content;
    }

    @Override
    public void update(Marketing marketing) {
        MarketingData mkd = (MarketingData) marketing;
        this.setContent(mkd.getCampaign());
    }

    @Override
    public String toString() {
        return "Outdoor " + id + " - " + location + "\n" + "Conteúdo: " + content + "\n";
    }
    
}
