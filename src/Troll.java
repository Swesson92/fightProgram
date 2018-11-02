public class Troll extends Character{


    public Troll(String name, WeaponBehavior weapon) {
        super(name, weapon);
    }

    public void fight(Character opponent){
        if(weapon()==null){
            System.out.println("Hitting and kicking (using fists)!");
            opponent.takeDamage(5); // damage from an unarmed Knight is 5
        }else{
            System.out.println("-None shall pass!");
            System.out.println(name() + " nobly uses its " + weapon() + " against the simple " + opponent.name());
            opponent.takeDamage(weapon().useWeapon());
        }
        System.out.println(" Score after attack: " + this + " - " + opponent);
    }

}
