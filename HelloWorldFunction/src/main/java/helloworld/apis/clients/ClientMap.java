package helloworld.apis.clients;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.lambda.runtime.Context;
import helloworld.entities.Map;

public class ClientMap {
    static AmazonDynamoDB client = AmazonDynamoDBClientBuilder.defaultClient();
    static DynamoDBMapper mapper = new DynamoDBMapper(client);
    public static Object handleRequest (Map map, Context context) throws Exception
    {
        map.setStatus(true);
//        map.

        return map;
    }
}
