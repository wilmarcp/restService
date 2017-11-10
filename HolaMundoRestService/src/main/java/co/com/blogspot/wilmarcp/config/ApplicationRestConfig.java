package co.com.blogspot.wilmarcp.config;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("rest")
public class ApplicationRestConfig extends Application{

	@Override
	public Set<Class<?>> getClasses(){
		Set<Class<?>> clases = new HashSet<>();
		
		
		return clases;
	}
}
