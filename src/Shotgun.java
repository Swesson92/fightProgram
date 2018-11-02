public class Shotgun implements WeaponBehavior {

    @Override
    public int useWeapon() {
        return 45;
    }

    @Override
    public String toString() {
        return "Shotgun{}";
    }
}
