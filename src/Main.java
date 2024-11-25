public class Main {
    public static void main(String[] args) {

        Hero mage =
                new Hero.Builder(Profession.MAGE, "Hossein").withHairColor(HairColor.BLACK)
                        .withWeapon(Weapon.DAGGER).build();
        System.out.println(mage);

        Hero priest =
                new Hero.Builder(Profession.PRIEST,"Mahdi").withHairType(HairType.SHORT)
                        .withHairColor(HairColor.BROWN).withWeapon(Weapon.SWORD).build();
        System.out.println(priest);
        Hero thief =
                new Hero.Builder(Profession.THIEF,"Ali").withHairColor(HairColor.WHITE)
                        .withHairType(HairType.LONG_CURLY).withArmor(Armor.LEATHER).withWeapon(Weapon.BOW).build();
        System.out.println(thief);
        Hero warrior =
                new Hero.Builder(Profession.WARRIOR,"David").withHairColor(HairColor.BLONDE)
                        .withHairType(HairType.LONG_STRAIGHT).withArmor(Armor.CHAIN_MAIL).withWeapon(Weapon.AXE).build();
    }
}