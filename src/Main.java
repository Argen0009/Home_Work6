public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setName("Argen King");
        boss.setHealth(90000);
        boss.setDamage(100);
        Weapon bossWeapon = new Weapon(WeaponType.COLDWEAPON, "Sword");
        boss.setWeapon(bossWeapon);

        Skeleton majorSkeleton = new Skeleton();
        majorSkeleton.setName("Skeleton");
        majorSkeleton.setHealth(800);
        majorSkeleton.setDamage(25);
        majorSkeleton.setArrows(175);
        Weapon skeletonWeapon2 = new Weapon(WeaponType.INCENDIARY_WEAPONS, "Mod cocktail");
        majorSkeleton.setWeapon(skeletonWeapon2);

        Skeleton skeleton = new Skeleton();
        skeleton.setName("Skeleton");
        skeleton.setHealth(4000);
        skeleton.setDamage(50);
        skeleton.setArrows(100);
        Weapon skeletonWeapon1 = new Weapon(WeaponType.FIREARM, "AK47");
        skeleton.setWeapon(skeletonWeapon1);

        System.out.println(boss.printInfo());
        System.out.println(skeleton.printInfo());
        System.out.println(majorSkeleton.printInfo());
    }
}
