public class App {
    public static void main(String[] args) throws Exception {
        OutdoorPrime op1 = new OutdoorPrime(01, "Sao Paulo");
        OutdoorPrime op2 = new OutdoorPrime(02, "Sao Paulo");
        OutdoorPrime op3 = new OutdoorPrime(03, "Rio de Janeiro");

        MarketingData mkd = new MarketingData();

        mkd.add(op1);
        mkd.add(op2);
        mkd.add(op3);

        mkd.setCampaing(
            "Campanha da coca cola", "Sao Paulo"
        );

        System.out.println(
            mkd.toString()
        );
    }
}
