package StrategicModelTodo;

public abstract class Character {
    WeaponBehavior weaponBehavior;

    public Character() { }

    public void fight() {
        weaponBehavior.useWeapon();
    }

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }
}
