public interface Npc {
    void Talk();
    void ShowInfo();
    int Attack(Avatar target);  //扣對方HP -= 我方攻擊力-對方防禦力
    int Defense(Avatar target); //扣我方HP -= 對方攻擊力-我方防禦力
}
