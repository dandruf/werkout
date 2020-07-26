package com.example.werkout.Class;


import org.bson.types.ObjectId;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class User extends RealmObject {
    @PrimaryKey
    ObjectId _id = new ObjectId();
    String _partition = "User";
    private String user_id;
    private String name;

    public User(String _partition, String user_id, String name) {
        this._partition = _partition;
        this.user_id = user_id;
        this.name = name;
    }

    public User() {}
}

