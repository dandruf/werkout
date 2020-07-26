package com.example.werkout.Class;

import org.bson.types.ObjectId;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Difficulty extends RealmObject {
    @PrimaryKey
    ObjectId _id = new ObjectId();
    String _partition = "Difficulty";
    private int id;
    private String level;
    private int reps;

    public Difficulty(int id, String level, int reps) {
        this.id = id;
        this.level = level;
        this.reps = reps;
    }

    public Difficulty() {}

}