public enum Profession {
    WARRIOR,THIEF,PRIEST,MAGE;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
