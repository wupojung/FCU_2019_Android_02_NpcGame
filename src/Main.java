public class Main {
    public static void main(String[] args) {

        Slime slime = new Slime(200, 200, 10, 5);
        Soldier soldier = new Soldier(200, 150, 10, 6);

        GameHandler handler = new GameHandler(slime, soldier);
        handler.Run(3); //模擬三次
    }
}
