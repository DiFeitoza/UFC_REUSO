public class MarketingData extends Marketing {
    private String campaign = "";
    
    public String getCampaign(){
        return campaign;
    }

    public void setCampaing(String campaign){
        this.campaign = campaign;
        notifyOutdoor();
    }

    @Override
    public String toString() {
        String response = "";
        for(Outdoor outdoor : this.outdoors){
            response = outdoor.toString() + "\n";
        }
        return response;
    }
}