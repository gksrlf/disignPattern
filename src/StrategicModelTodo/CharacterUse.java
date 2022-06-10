package StrategicModelTodo;

public class CharacterUse {
    public static void main(String[] args) {
        Character king = new King();
        king.fight();

        Character queen = new Queen();
        queen.setWeaponBehavior(new KnifeBehavior());
        queen.fight();

        Character knight = new Knight();
        knight.fight();

        Character troll = new Troll();
        troll.fight();


    }
}
