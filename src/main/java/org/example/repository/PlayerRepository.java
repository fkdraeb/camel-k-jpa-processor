package org.example.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.example.entity.Player;

@org.apache.camel.BindToRegistry("playerRepository")
public class PlayerRepository implements PanacheRepository<Player> {


}
