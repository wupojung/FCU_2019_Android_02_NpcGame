public class Slime extends Avatar implements Npc {

    public Slime() {
        super(0, 0, 0, 0);
        name = "Slime";
    }

    public Slime(int hp, int mp, int atk, int def) {
        super(hp, mp, atk, def);
        name = "Slime";
    }

    @Override
    public void Talk() {
        System.out.println("Hi ~ I'm " + name);
    }

    @Override
    public void ShowInfo() {
        System.out.format("[%s] HP %d MP %d ATK %d DEF %d \n", name, HP, MP, ATK, DEF);
    }

    @Override
    public int Attack(Avatar target) {
        int result = 0;
        if (target.DEF < this.ATK) {
            result = this.ATK - target.DEF;
            target.HP -= result;
            System.out.format("%s 正在攻擊 %s\n", this.name, target.name);
        }
        return result;
    }

    @Override
    public int Defense(Avatar target) {
        int result = 0;
        if (this.DEF < target.ATK) {
            result = target.ATK - this.DEF;
            this.HP -= result;
            System.out.format("%s 正在防禦 %s 的攻擊\n", this.name, target.name);

        }
        return result;
    }
}
