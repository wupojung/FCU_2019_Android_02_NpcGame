public class Main {
    public static void main(String[] args) {

        Slime slime = new Slime(200,200,10,5);
        Soldier soldier = new Soldier(200,150,10,6);

        slime.Talk();
        soldier.Talk();

        slime.Attack(soldier); // 史萊姆攻擊士兵
        slime.ShowInfo();
        soldier.ShowInfo();

        slime.Defense(soldier) ; //史萊姆防禦士兵的攻擊
        slime.ShowInfo();
        soldier.ShowInfo();

        System.out.println("回合結束");
    }
}
