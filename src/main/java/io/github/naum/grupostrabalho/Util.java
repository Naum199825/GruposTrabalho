
package io.github.naum.grupostrabalho;

import java.util.Locale;
import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;
import javax.json.bind.config.PropertyOrderStrategy;

/**
 *
 * @author Friedrich Naum
 */
public class Util {

    public static String toJson(Object object) {
        JsonbConfig config = new JsonbConfig()
                .withFormatting(true)
                // [ hh:mm:mm] é opcional para os casos de LocalDate
                .withDateFormat("dd/MM/yyyy[ hh:mm:ss]",
                        Locale.forLanguageTag("pt_BR")
//                        null
                        )
                .withPropertyOrderStrategy(
                        PropertyOrderStrategy
                                .LEXICOGRAPHICAL);
        return JsonbBuilder.create(config).toJson(object);
    }
}
