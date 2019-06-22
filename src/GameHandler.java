public class GameHandler {
    /*
    * 這裡針對 "介面" 進行操作
    * */

    public Npc npc1;
    public Npc npc2;

    public GameHandler(Npc npc1, Npc npc2) {
        this.npc1 = npc1;
        this.npc2 = npc2;
    }

    public void Run(int times) {
        npc1.Talk();
        npc2.Talk();
        for (int i = 0; i < times; i++) {
            System.out.format("==>第%d回合\n", i);
            npc1.Attack((Avatar)npc2); // 史萊姆攻擊士兵
            npc1.Defense((Avatar)npc2); //史萊姆防禦士兵的攻擊
            System.out.println("--[Result]--");
            npc1.ShowInfo();
            npc2.ShowInfo();
            System.out.println("<==回合結束\n");
        }
    }
}
