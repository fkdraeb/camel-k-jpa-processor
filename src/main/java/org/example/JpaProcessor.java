package org.example;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.example.repository.PlayerRepository;

@ApplicationScoped
public class JpaProcessor implements Processor {

    @Inject
    PlayerRepository playerRepository;

    @Override
    public void process(Exchange exchange) throws Exception {

        String playerDesc = playerRepository.findById(1L).getDescPlayer();

        exchange.getIn().setBody(playerDesc);

    }
}
