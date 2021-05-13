package helloworld.entities;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName = "therapist")
public class Therapist {
    @DynamoDBHashKey(attributeName = "therapist_id")
    private int therapist_id;

    @DynamoDBAttribute(attributeName = "name")
    private String name;
    @DynamoDBAttribute(attributeName="email")
    private String email;
    @DynamoDBAttribute(attributeName="password")
    private String password;
    @DynamoDBAttribute(attributeName="is_available")
    private boolean is_available;

    public Therapist() {
    }

    public int getTherapist_id() {
        return therapist_id;
    }

    public Therapist(int therapist_id, String name, String email, String password, boolean is_available) {
        this.therapist_id = therapist_id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.is_available = is_available;
    }

    public void setTherapist_id(int therapist_id) {
        this.therapist_id = therapist_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isIs_available() {
        return is_available;
    }

    public void setIs_available(boolean is_available) {
        this.is_available = is_available;
    }
}
