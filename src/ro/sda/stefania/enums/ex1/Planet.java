package ro.sda.stefania.enums.ex1;

public enum Planet {
    JUPITER("Jupiter", "Huge", 414124),
    PLUTO("Pluto", "Small", 4325435),
    TERRA("Terra", "Medium", 453543),
    SATURN("Saturn", "Extra Huge", 54354),
    ;

    private final String prettyName;
    private final String size;
    private final long distanceFromTerra;

    //by Default the constructor is private
    private Planet(String prettyName, String size, long distanceFromTerra) {
        this.prettyName = prettyName;
        this.size = size;
        this.distanceFromTerra = distanceFromTerra;
    }
    public  long getDistanceFromEarth (){
        return distanceFromTerra;
    }

    @Override
    public String toString() {
        return size + " " + prettyName;
    }
}

