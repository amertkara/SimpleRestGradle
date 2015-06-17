package com.amertkara.simplerest.init;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.factory.GraphDatabaseFactory;

public class ServletContextClass implements ServletContextListener {
	private final String DB_PATH = "/tmp/neo4j";
	private GraphDatabaseService graphDb;
	
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		graphDb = new GraphDatabaseFactory().newEmbeddedDatabase(DB_PATH);
		registerShutdownHook(graphDb);
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		graphDb.shutdown();
	}
	
	private static void registerShutdownHook( final GraphDatabaseService graphDb )
	{
	    // Registers a shutdown hook for the Neo4j instance so that it
	    // shuts down nicely when the VM exits (even if you "Ctrl-C" the
	    // running application).
	    Runtime.getRuntime().addShutdownHook( new Thread()
	    {
	        @Override
	        public void run()
	        {
	            graphDb.shutdown();
	        }
	    } );
	}
}
