public class Main {
    public static void main(String[] args) {
        Mosquito m = new Mosquito();
        Mosquito [] mas = m.makeMosquitos();
        Frog f = new Frog();
        f.catchMosq(mas);
    }
}