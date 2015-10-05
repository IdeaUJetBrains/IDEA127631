package example;



import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Olga Pavlova on 22/09/2015.
 */
@ApplicationPath("res")
public class ConfigRest extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        HashSet h = new HashSet<Class<?>>();
        h.add(HelloWorld.class);

        return h;

    }

}
