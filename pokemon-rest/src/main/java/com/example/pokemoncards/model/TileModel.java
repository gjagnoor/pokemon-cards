package com.example.pokemoncards.model;

public class TileModel {
    String name;
    Integer position;
    Boolean open;
    String openURL;
    String closeURL;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Boolean getOpen() {
        return open;
    }

    public void setOpen(Boolean open) {
        this.open = open;
    }

    public String getOpenURL() {
        return openURL;
    }

    public void setOpenURL(String openURL) {
        this.openURL = openURL;
    }

    public String getCloseURL() {
        return closeURL;
    }

    public void setCloseURL(String closeURL) {
        this.closeURL = closeURL;
    }


}
