import com.google.common.collect.ImmutableList;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);
    
    public static void main(String[] args) {
        ImmutableList<String> list = ImmutableList.of("Hello", "World");
        LOGGER.info("List: {}", list);
        
        String str = "   Example String   ";
        String trimmed = StringUtils.trim(str);
        LOGGER.info("Trimmed String: '{}'", trimmed);
    }
}
