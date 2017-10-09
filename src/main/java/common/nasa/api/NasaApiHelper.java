package common.nasa.api;

/**
 * Created by User on 09.10.2017.
 */
public class NasaApiHelper extends AbstractApiHelper {

    public NasaApiHelper() {
        super();
    }

    public String getNsaResourceByParameter(final String parameter){
        return get(parameter);
    }
}
