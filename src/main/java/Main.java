import com.google.common.base.CharMatcher;
import com.google.common.collect.ImmutableList;
import org.apache.commons.text.WordUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);
    
    public static void main(String[] args) {
        ImmutableList<String> list = ImmutableList.of("Hello", "World");
        LOGGER.info("List: {}", list);
        
        String str = "   example string   ";
        String trimmed = CharMatcher.whitespace().trimFrom(str);
        LOGGER.info("Trimmed String: '{}'", trimmed);
        
        String capitalized = WordUtils.capitalizeFully(trimmed);
        LOGGER.info("Capitalized String: '{}'", capitalized);
    }
}
