
package com.example.demo;

public class reqdata {

    private Location location;

    private Current current;

    public reqdata() {
        this.location = new Location();
        this.current = new Current();
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Current getCurrent() {
        return current;
    }

    public void setCurrent(Current current) {
        this.current = current;
    }

}
