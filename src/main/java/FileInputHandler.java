import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class FileInputHandler {


    public static MovieLibrary getMoviesToList(File file) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        MovieLibrary movieLibrary = mapper.readValue(file, MovieLibrary.class);
        return movieLibrary;
    }
}
