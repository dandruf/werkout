package com.example.werkout;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.ServerAddress;

import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;

import org.bson.Document;
import java.util.Arrays;
import com.mongodb.Block;

import com.mongodb.client.MongoCursor;
import static com.mongodb.client.model.Filters.*;
import com.mongodb.client.result.DeleteResult;
import static com.mongodb.client.model.Updates.*;
import com.mongodb.client.result.UpdateResult;

public class Common {
    private static String DB_NAME = "werkoutData";
    private static String COLLECTION_NAME = "exercise";

    MongoClient mongoClient = new MongoClient();
    MongoClientURI uri = new MongoClientURI(
            "mongodb+srv://sarah:hobby@werkout.7uapf.gcp.mongodb.net/werkoutData?retryWrites=true&w=majority");

    MongoClient mongoClient = new MongoClient(uri);
    MongoDatabase database = mongoClient.getDatabase("werkoutData");

}