package com.cgi.ajcformation.hotelsummer.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import com.cgi.ajcformation.hotelsummer.model.Adress;
import com.cgi.ajcformation.hotelsummer.model.BedRoom;
import com.cgi.ajcformation.hotelsummer.model.Hotel;
import com.cgi.ajcformation.hotelsummer.repo.AdressRepository;
import com.cgi.ajcformation.hotelsummer.repo.BedRoomRepository;
import com.cgi.ajcformation.hotelsummer.repo.HotelRepository;

@Service
public class TerminalService implements CommandLineRunner {
	@Autowired
	BedRoomRepository bedroomrepo;
	@Autowired
	HotelRepository hotelRepo;
	@Autowired
	AdressRepository adressRepo;
    @Override
    public void run(String... args) throws Exception {
	System.out.println("Serveur lancé");
	
	
//	Hotel hotel1 = new Hotel();
//	hotel1.setDescription("grand hotel");
//	hotel1.setName("Mercure");
//	hotel1.setNoteUser(2);
//	hotel1.setStarsNotation(3);
//	
//	Hotel hotel2 = new Hotel();
//	hotel2.setDescription("grand hotel");
//	hotel2.setName("Ibis");
//	hotel2.setNoteUser(4);
//	hotel2.setStarsNotation(2);
//	
//	Hotel hotel3 = new Hotel();
//	hotel3.setDescription("grand hotel");
//	hotel3.setName("Novotel");
//	hotel3.setNoteUser(2);
//	hotel3.setStarsNotation(4);
//	
//	hotelRepo.save(hotel1);
//	hotelRepo.save(hotel2);
//	hotelRepo.save(hotel3);
//	
//	BedRoom bedroom1 = new BedRoom();
//	bedroom1.setPrice(158);
//	bedroom1.setTypeBedroom("Suite");
//	
//	BedRoom bedroom2 = new BedRoom();
//	bedroom2.setPrice(88);
//	bedroom2.setTypeBedroom("Fun");
//	
//	BedRoom bedroom3 = new BedRoom();
//	bedroom3.setPrice(69);
//	bedroom3.setTypeBedroom("Famille");
//	
//	bedroomrepo.save(bedroom1);
//	bedroomrepo.save(bedroom2);
//	bedroomrepo.save(bedroom3);
//	
//	
//	Adress adress1 = new Adress();
//	adress1.setStreet("rue de Marseille");
//	adress1.setNumber(78);
//	adress1.setCp("69007");
//	adress1.setCity("Lyon");
//	
//	Adress adress2 = new Adress();
//	adress2.setStreet("rue de Paris");
//	adress2.setNumber(03);
//	adress2.setCp("75000");
//	adress2.setCity("Paris");
//	
//	Adress adress3 = new Adress();
//	adress3.setStreet("rue de oliviers");
//	adress3.setNumber(47);
//	adress3.setCp("16000");
//	adress3.setCity("Cognac");
//	
//	adressRepo.save(adress1);
//	adressRepo.save(adress2);
//	adressRepo.save(adress3);
//	
//
//	
//	System.out.println(hotelRepo.findAll());
	

	
    }

}
