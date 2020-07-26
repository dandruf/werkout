package com.example.werkout.Class;

public class Exercise {
    private Id _id;
    private int id;
    private String license_author;
    private String status;
    private String description;
    private String name;
    private String name_original;
    private String creation_date;
    private String uuid;
    private int license;
    private int category;
    private String[] muscles;
    private String[] muscles_secondary;
    private String[] equipment;

    public Id get_id() {
        return _id;
    }

    public void set_id(Id _id) {
        this._id = _id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLicense_author() {
        return license_author;
    }

    public void setLicense_author(String license_author) {
        this.license_author = license_author;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName_original() {
        return name_original;
    }

    public void setName_original(String name_original) {
        this.name_original = name_original;
    }

    public String getCreation_date() {
        return creation_date;
    }

    public void setCreation_date(String creation_date) {
        this.creation_date = creation_date;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public int getLicense() {
        return license;
    }

    public void setLicense(int license) {
        this.license = license;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public String[] getMuscles() {
        return muscles;
    }

    public void setMuscles(String[] muscles) {
        this.muscles = muscles;
    }

    public String[] getMuscles_secondary() {
        return muscles_secondary;
    }

    public void setMuscles_secondary(String[] muscles_secondary) {
        this.muscles_secondary = muscles_secondary;
    }

    public String[] getEquipment() {
        return equipment;
    }

    public void setEquipment(String[] equipment) {
        this.equipment = equipment;
    }
}
