package com.chiliasmstudio;

import com.google.inject.Inject;
import com.velocitypowered.api.event.proxy.ProxyInitializeEvent;
import com.velocitypowered.api.event.Subscribe;
import com.velocitypowered.api.plugin.Plugin;
import com.velocitypowered.api.proxy.ProxyServer;
import org.slf4j.Logger;

@Plugin(
        id = "worldprism",
        name = "worldPrism",
        version = "1.0",
        url = "https://example.org/",
        description = "ToDo",
        authors = {"ToDo"}
)
public class WorldPrism {
    private final ProxyServer proxyServer;
    private final Logger logger;

    @Inject
    public WorldPrism(ProxyServer proxyServer, Logger logger) {
        this.proxyServer = proxyServer;
        this.logger = logger;
    }

    @Subscribe
    public void onInitialize(ProxyInitializeEvent event) {
        logger.info("Hello world!");
        //server.getEventManager().register(this, new MyListener());
    }
    @Subscribe
    public void onProxyInitialization(ProxyInitializeEvent event) {
    }
}
