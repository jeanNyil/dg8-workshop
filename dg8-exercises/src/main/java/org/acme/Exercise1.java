package org.acme;

import org.infinispan.Cache;
import org.infinispan.configuration.cache.ConfigurationBuilder;
import org.infinispan.manager.DefaultCacheManager;

// Simple Map
public class Exercise1 {

    public static void main(String[] args) {
        // TODO: Construct a simple local cache manager with default configuration
        DefaultCacheManager cacheManager = new DefaultCacheManager();

        // TODO: Define local cache configuration
        cacheManager.defineConfiguration("local", new ConfigurationBuilder().build());

        // TODO: Obtain the local cache
        Cache<String, String> cache = cacheManager.getCache("local");

        // TODO: Store a value
        cache.put("name", "jEAN :-)");

        // TODO: Retrieve the value and print it out
        System.out.printf("name = %s\n", cache.get("name"));

        // TODO: Stop the cache manager and release all resources
        cacheManager.stop();

        System.exit(0);

    }

}