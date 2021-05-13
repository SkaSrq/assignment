package helloworld.entities;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@DynamoDBTable(tableName="Map")
public class Map {
    @DynamoDBHashKey(attributeName="map_id")
    private int map_id;

    @DynamoDBAttribute(attributeName="status")
    private String status;

    @DynamoDBAttribute(attributeName="client_id")
    private int client_id;

    @DynamoDBAttribute(attributeName="therapist_id")
    private int therapist_id;

    @DynamoDBAttribute(attributeName="is_client_access_journal")
    private boolean is_client_access_journal;

    @DynamoDBAttribute(attributeName="requested_by")
    private String requested_by;
}
