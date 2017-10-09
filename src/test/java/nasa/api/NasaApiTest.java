package nasa.api;

import common.nasa.api.NasaApiHelper;
import common.nasa.api.dto.NasaGetResponceDTO;
import common.nasa.api.utils.JsonUtil;
import org.junit.Test;

public class NasaApiTest {
    private NasaApiHelper nasaApiHelper = new NasaApiHelper();

    @Test
    public void testNasaGetRequest(){
        final String result = nasaApiHelper.getNsaResourceByParameter(null);
        final NasaGetResponceDTO dto = JsonUtil.parseJson(result, NasaGetResponceDTO.class);
    }
}
