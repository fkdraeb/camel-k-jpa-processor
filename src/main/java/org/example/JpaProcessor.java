package org.example;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.example.repository.PlayerRepository;

@ApplicationScoped
public class JpaProcessor implements Processor {

    @Override
    public void process(Exchange exchange) throws Exception {

        System.out.println(exchange.getContext().getRegistry().toString());
        PlayerRepository playerRepository = exchange.getContext().getRegistry().lookupByNameAndType("playerRepository", PlayerRepository.class);

        exchange.getIn().setBody(playerRepository.findById(1L).getDescPlayer());

    }
}
