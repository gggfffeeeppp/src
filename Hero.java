/**
 * FileName: Hero2
 * Author:   Cai Zhiyong
 * Date:     2020/5/19 18:17
 * Description: LOLHero
 * History:
 */

/**
 * 〈一句话功能简述〉<br>
 * 〈LOLHero〉
 *
 * @author: Cai Zhiyong
 * @date: 2020/5/19
 * @version: 1.0.0
 */
public class Hero {
    @Deprecated
    public void hackMap() {
        System.out.println(heroName);
    }

    static String copyright;

    static {
        System.out.println("初始化 copyright");
        copyright = "版权由Riot Games公司所有";
    }

    String heroName; // 英雄名
    Integer hp; // 血量
    Float armor; // 护甲值
    Float movementSpeed; // 移动速度
    Integer death; // 死亡次数
    Integer kill; // 杀敌次数
    Integer assists; // 助攻次数
    Integer gold; // 金币数
    Float attackSpeed; // 攻击速度
    String deathSpeak; // 死亡时说的话
    String killingSpeak; // 杀敌时说的话
    Integer killSoldier; //击杀小兵数

    float getArmor() {
        return armor;
    }

    void setArmor(float armor) {
        this.armor = armor;
    }

    void keng() {
        System.out.println("坑队友!");
    }

    void legendary() {
        System.out.println("超神");
    }

    float getHp() {
        return hp;
    }

    void addSpeed(Integer speed) {
        this.movementSpeed = this.movementSpeed + speed;
    }

    void recovery(Integer blood) {
        hp = hp + blood;
        System.out.println("回血量" + blood);
        System.out.println("回复后的血量" + hp);
    }
    public Hero() {

    }

    public Hero(String heroName, Integer hp, Float armor, Float movementSpeed, Integer kill) {
        this.heroName = heroName;
        this.hp = hp;
        this.armor = armor;
        this.movementSpeed = movementSpeed;
        this.kill = kill;
    }

    public static void main(String[] args) {
        Hero galen = new Hero("盖伦", 617, 26.7f, 349.8f, 8);
        // galen.heroName = "盖伦";
        // galen.hp = 617;
        // galen.armor = 26.7f;
        // galen.movementSpeed = 349.8f;
        galen.addSpeed(20);
        // System.out.println(galen.movementSpeed);
        // if (galen.kill >= 8) {
        //     galen.legendary();
        // }


        Hero teemo = new Hero("提莫", 383, 13.5f, 229.8f, 4);
        // teemo.heroName = "提莫";
        // teemo.hp = 383;
        // teemo.armor = 13.5f;
        // teemo.movementSpeed = 229.8f;
        // System.out.println(teemo.kill);
        System.out.println(galen);
        System.out.println(teemo);
        galen.hackMap();
    }


    @Override
    public String toString() {
        return "英雄:" + heroName + "/血量:" + hp + "/护甲:" + armor + "/移动速度:" + movementSpeed + "/击杀" + kill;
    }

}

