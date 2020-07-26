package com.example.werkout;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import org.bson.Document;



public class Common {
    private static String DB_NAME = "werkoutData";
    private static String COLLECTION_NAME = "exercise";

    MongoClient mongoClient = new MongoClient();
    MongoClientURI uri = new MongoClientURI(
            "mongodb+srv://sarah:hobby@werkout.7uapf.gcp.mongodb.net/werkoutData?retryWrites=true&w=majority");

    MongoDatabase database = mongoClient.getDatabase("werkoutData");

    MongoCollection<Document> exercises = database.getCollection("exercise");
}