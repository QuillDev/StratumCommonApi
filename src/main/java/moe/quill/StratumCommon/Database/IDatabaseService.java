package moe.quill.StratumCommon.Database;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import org.bson.Document;

public interface IDatabaseService {
    MongoCollection<Document> getCollection(String collectionName);

    MongoClient getMongoClient();
}
