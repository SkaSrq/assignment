package helloworld.entities;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@DynamoDBTable(tableName="Client")
public class Client {
    @DynamoDBHashKey(attributeName="client_id")
    private int client_id;

    @DynamoDBAttribute(attributeName="name")
    private String name;

    @DynamoDBAttribute(attributeName="email")
    private String email;

    @DynamoDBAttribute(attributeName="password")
    private String password;

}
