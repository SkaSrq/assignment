package helloworld.Requests;

import helloworld.entities.Therapist;

public class Request {
    private String httpMethod;
    private int therapist_id;
    private Therapist therapist;

    public Request() {
    }

    public Request(String httpMethod, int therapist_id, Therapist therapist) {
        this.httpMethod = httpMethod;
        this.therapist_id = therapist_id;
        this.therapist = therapist;
    }

    public String getHttpMethod() {
        return httpMethod;
    }

    public void setHttpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
    }

    public int getTherapist_id() {
        return therapist_id;
    }

    public void setTherapist_id(int therapist_id) {
        this.therapist_id = therapist_id;
    }

    public Therapist getTherapist() {
        return therapist;
    }

    public void setTherapist(Therapist therapist) {
        this.therapist = therapist;
    }
}
