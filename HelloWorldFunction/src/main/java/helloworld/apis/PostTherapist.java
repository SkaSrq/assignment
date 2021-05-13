package helloworld.apis;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.lambda.runtime.Context;
import helloworld.Requests.Request;
import helloworld.entities.Therapist;

public class PostTherapist {
    static AmazonDynamoDB client = AmazonDynamoDBClientBuilder.defaultClient();
    static DynamoDBMapper mapper = new DynamoDBMapper(client);

    public static Object handleRequest (Therapist therapist, Context context) throws Exception
    {
        mapper.save(therapist);
        return therapist;
    }
}
