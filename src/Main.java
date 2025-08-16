public class Main {
    public static void main(String[] args) {
        CoinConsult consult = new CoinConsult();
        Coin coin = consult.findCoin("MXN");
        System.out.println(coin);
    }
}
