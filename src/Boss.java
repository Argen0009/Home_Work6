public class Boss extends GameEntity {
    private Weapon weapon;

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public String printInfo() {
        String info = getName() + " Information:\n" +
                "Health: " + getHealth() + "\n" +
                "Damage: " + getDamage() + "\n";
        if (weapon != null) {
            info += "Weapon Type: " + weapon.getWeaponType() + "\n" +
                    "Weapon Name: " + weapon.getWeaponName() + "\n";
        } else {
            info += "Weapon: None\n";
        }
        return info;
    }
}
