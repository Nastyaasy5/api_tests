package common.nasa.api;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

public abstract class AbstractApiHelper {

    private Client nasaApiClient;
    private String baseNasaApiUrl;
    private static final String PLANTERY_PATH = "/planetary/apod";

    protected AbstractApiHelper(){
        this.baseNasaApiUrl = "https://api.nasa.gov";
        nasaApiClient = Client.create();
    }

    public String get(final String parameter){
        return nasaApiClient.resource(baseNasaApiUrl)
                .path(PLANTERY_PATH)
                .queryParam("api_key", "3ngYwP8ufgQzd5JVVoco3nEXKWlwdvu9zGJMCppN")
                .get(String.class);

    }
}
