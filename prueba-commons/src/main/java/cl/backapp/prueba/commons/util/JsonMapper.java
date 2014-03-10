package cl.backapp.prueba.commons.util;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig;

import java.text.SimpleDateFormat;
import java.util.Objects;

/**
 * Created by xfce on 10-03-14.
 */
public class JsonMapper extends ObjectMapper {
    JsonMapper() {
        super();
        this.configure(SerializationConfig.Feature.WRITE_DATES_AS_TIMESTAMPS, false);
        this.getSerializationConfig().setDateFormat(new SimpleDateFormat("dd-MM-yyy HH:mm"));
        //cambiar fechas
    }
}
