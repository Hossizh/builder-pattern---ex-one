public enum Weapon {
    SWORD, AXE, DAGGER, HAMMER, BOW;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
