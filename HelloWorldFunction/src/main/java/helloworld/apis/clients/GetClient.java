package helloworld.apis.clients;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.lambda.runtime.Context;
import helloworld.Requests.Request;
import helloworld.entities.Client;

public class GetClient {
    static AmazonDynamoDB client = AmazonDynamoDBClientBuilder.defaultClient();
    static DynamoDBMapper mapper = new DynamoDBMapper(client);
    static Client myClient = null;

    public static Object handleRequest (Client request, Context context) throws Exception
    {
        myClient = mapper.load(Client.class,request.getClient_id());
        if(myClient==null)
        {
            throw new Exception("Therapist Not Found");
        }
        return myClient;
    }

}
