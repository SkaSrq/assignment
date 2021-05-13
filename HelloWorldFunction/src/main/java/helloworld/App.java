package helloworld;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.lambda.runtime.Context;
import helloworld.Requests.Request;
import helloworld.entities.Therapist;

/**
 * Handler for requests to Lambda function.
 */
public class App {
    public static Object handleRequest (Request request, Context context) throws Exception {
        AmazonDynamoDB client = AmazonDynamoDBClientBuilder.defaultClient();
        DynamoDBMapper mapper = new DynamoDBMapper(client);
        Therapist therapist = null;
        switch (request.getHttpMethod())
        {
            case "GET":
                therapist = mapper.load(Therapist.class,request.getTherapist_id());
                if(therapist==null)
                {
                    throw new Exception("Therapist Not Found");
                }
                return therapist;
            case "POST":
                therapist = request.getTherapist();
                mapper.save(therapist);
                return therapist;
            default:
                break;
        }
        return null;
    }
}

