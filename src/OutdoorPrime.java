public class OutdoorPrime implements Outdoor {
    private int id;
    private String location;
    private String content = "";

    OutdoorPrime(int id, String location, String content){
        this.id = id;
        this.location = location;
        this.content = content;
    }

    public void setContent(String content){
        this.content = content;
    }

    @Override
    public void update(Marketing marketing) {
        MarketingData mkd = (MarketingData) marketing;
        this.setContent(mkd.getCampaign());
        System.out.println(this.toString()); 
    }

    @Override
    public String toString() {
        return id + " - " + location + "\n" + content + "\n";
    }
    
}
