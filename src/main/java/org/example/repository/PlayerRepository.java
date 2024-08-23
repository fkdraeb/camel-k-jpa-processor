package org.example.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.example.entity.Player;

@ApplicationScoped
public class PlayerRepository implements PanacheRepository<Player> {


}
