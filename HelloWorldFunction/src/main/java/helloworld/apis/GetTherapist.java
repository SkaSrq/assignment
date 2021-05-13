package helloworld.apis;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBQueryExpression;
import com.amazonaws.services.dynamodbv2.document.*;
import com.amazonaws.services.dynamodbv2.document.spec.ScanSpec;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.ScanRequest;
import com.amazonaws.services.dynamodbv2.model.ScanResult;
import com.amazonaws.services.lambda.runtime.Context;
import helloworld.Requests.Request;
import helloworld.entities.Therapist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import static com.sun.xml.internal.fastinfoset.alphabet.BuiltInRestrictedAlphabets.table;

public class GetTherapist {
   static AmazonDynamoDB client = AmazonDynamoDBClientBuilder.defaultClient();
//   static DynamoDBMapper mapper = new DynamoDBMapper(client);
     static DynamoDB dynamoDB = new DynamoDB(client);
   static String tableName = "therapist";

    public static List<String> handleRequest (Request request, Context context) throws Exception
    {
        Table table = dynamoDB.getTable(tableName);
        List<String> myList = new ArrayList<String>();
        ScanSpec scanSpec = new ScanSpec().withProjectionExpression("name");
        ItemCollection<ScanOutcome> items = table.scan(scanSpec);
        for (Item item : items) {
            myList.add(item.toString());
        }

        return myList;
    }

}
