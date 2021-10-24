public class MarketingData extends Marketing {
    private String campaign = "";
    
    public String getCampaign(){
        return campaign;
    }

    public void setCampaing(String campaign){
        this.campaign = campaign;
        notifyOutdoor();
    }

    public void setCampaing(String campaign, String city){
        this.campaign = campaign;
        notifyOutdoor(city);
    }

    @Override
    public String toString() {
        String response = "";
        for(Outdoor outdoor : this.outdoors){
            response += outdoor.toString() + "\n";
        }
        return response;
    }
}