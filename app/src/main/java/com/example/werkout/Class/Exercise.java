package com.example.werkout.Class;

import org.bson.types.ObjectId;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Exercise extends RealmObject {
    @PrimaryKey
    ObjectId _id = new ObjectId();
    String _partition = "Exercise";
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
    private RealmList<String> muscles;
    private RealmList<String> muscles_secondary;
    private RealmList<String> equipment;

    public Exercise(int id, String license_author, String status, String description, String name, String name_original, String creation_date, String uuid, int license, int category, RealmList<String> muscles, RealmList<String> muscles_secondary, RealmList<String> equipment) {
        this.id = id;
        this.license_author = license_author;
        this.status = status;
        this.description = description;
        this.name = name;
        this.name_original = name_original;
        this.creation_date = creation_date;
        this.uuid = uuid;
        this.license = license;
        this.category = category;
        this.muscles = muscles;
        this.muscles_secondary = muscles_secondary;
        this.equipment = equipment;
    }

    public Exercise() {}


}
