package enums;

public enum Behaviour {

    SMOKE("smoke");


    private final String displayName;

    Behaviour(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }


}
