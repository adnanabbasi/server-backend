package com.adnanabbasi.server.service;

import com.adnanabbasi.server.model.Server;

import java.io.IOException;
import java.util.Collection;

public interface ServerService {
    Collection<Server> list(int limit);
    Server ping(String ipAddress) throws IOException;
    Server create(Server server);
    Server get(Long id);
    Server update(Server server);
    Boolean delete(Long id);
}
