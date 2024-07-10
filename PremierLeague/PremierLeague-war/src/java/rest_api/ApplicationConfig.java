package rest_api;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;
import java.util.Set;

/**
 * 
 * Configuration class for RESTful API `Premier league`
 */
@ApplicationPath("premierLeague")
public class ApplicationConfig extends Application {
    
    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }
    
    /**
     * 
     * Here we must add others resources. Don't do it in method 'getClasses' -> other resources were added there
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(RestPlayer.class);
        resources.add(RestPremierLeagueInfo.class);
        resources.add(RestTeam.class);
    }
}
