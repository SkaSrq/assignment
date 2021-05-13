package helloworld.apis.clients;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.lambda.runtime.Context;
import helloworld.entities.Client;

public class PostClient {
    static AmazonDynamoDB client = AmazonDynamoDBClientBuilder.defaultClient();
    static DynamoDBMapper mapper = new DynamoDBMapper(client);
    public static Object handleRequest (Client myclient, Context context) throws Exception
    {
        mapper.save(myclient);
        return myclient;
    }
}
