package org.example;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.example.entity.Player;

public class JpaProcessor implements Processor {

    @Override
    @Transactional
    public void process(Exchange exchange) throws Exception {

        Player player = Player.findByDescPlayer("SONHO");
        String playerDesc = player.getDescPlayer();

        exchange.getIn().setBody(playerDesc);

    }
}
