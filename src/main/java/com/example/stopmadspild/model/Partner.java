package com.example.stopmadspild.model;

public class Partner {
    private int id;
    private String name;
    private String email;
    private String address;
    private String openingHours;
    private String whoIs;
    private String howMuch;
    private String sinceWhen;
    private String iconPictureLink;
    private String websiteLink;

    public Partner() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOpeningHours() {
        return openingHours;
    }

    public void setOpeningHours(String openingHours) {
        this.openingHours = openingHours;
    }

    public String getWhoIs() {
        return whoIs;
    }

    public void setWhoIs(String whoIs) {
        this.whoIs = whoIs;
    }

    public String getHowMuch() {
        return howMuch;
    }

    public void setHowMuch(String howMuch) {
        this.howMuch = howMuch;
    }

    public String getSinceWhen() {
        return sinceWhen;
    }

    public void setSinceWhen(String sinceWhen) {
        this.sinceWhen = sinceWhen;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIconPictureLink() {
        return iconPictureLink;
    }

    public void setIconPictureLink(String iconPictureLink) {
        this.iconPictureLink = iconPictureLink;
    }

    public String getWebsiteLink() {
        return websiteLink;
    }

    public void setWebsiteLink(String websiteLink) {
        this.websiteLink = websiteLink;
    }
}
