package com.cgi.ajcformation.hotelsummer.service;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@Service
public class TerminalService implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
	System.out.println("Serveur lancé");
    }

}
