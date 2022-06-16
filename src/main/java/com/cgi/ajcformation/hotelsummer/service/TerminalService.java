package com.cgi.ajcformation.hotelsummer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import com.cgi.ajcformation.hotelsummer.model.RoleRest;
import com.cgi.ajcformation.hotelsummer.model.RoleRestNames;
import com.cgi.ajcformation.hotelsummer.repo.RoleRestRepository;

import lombok.var;

@Service
public class TerminalService implements CommandLineRunner {
	// @Autowired
	// BedRoomRepository bedroomrepo;
	// @Autowired
	// HotelRepository hotelRepo;
	// @Autowired
	// AdressRepository adressRepo;
	@Autowired
	RoleRestRepository roles_rest;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Serveur lancé");
		for (RoleRestNames role_name : RoleRestNames.values()) {
			var role = new RoleRest(role_name);
			// System.out.println(role.getName());
			// System.out.println("\n\n\n\n");
			if (!roles_rest.existsByName(role.getName())) {
				System.out.println("Création du rôle " + role.getName());
				roles_rest.save(role);
			}
		}
		System.out.println("Table roles_rest a été correctement générée");
		System.out.println();

		// Hotel hotel1 = new Hotel();
		// hotel1.setDescription("grand hotel");
		// hotel1.setName("Mercure");
		// hotel1.setNoteUser(2);
		// hotel1.setStarsNotation(3);
		//
		// Hotel hotel2 = new Hotel();
		// hotel2.setDescription("grand hotel");
		// hotel2.setName("Ibis");
		// hotel2.setNoteUser(4);
		// hotel2.setStarsNotation(2);
		//
		// Hotel hotel3 = new Hotel();
		// hotel3.setDescription("grand hotel");
		// hotel3.setName("Novotel");
		// hotel3.setNoteUser(2);
		// hotel3.setStarsNotation(4);
		//
		// hotelRepo.save(hotel1);
		// hotelRepo.save(hotel2);
		// hotelRepo.save(hotel3);
		//
		// BedRoom bedroom1 = new BedRoom();
		// bedroom1.setPrice(158);
		// bedroom1.setTypeBedroom("Suite");
		//
		// BedRoom bedroom2 = new BedRoom();
		// bedroom2.setPrice(88);
		// bedroom2.setTypeBedroom("Fun");
		//
		// BedRoom bedroom3 = new BedRoom();
		// bedroom3.setPrice(69);
		// bedroom3.setTypeBedroom("Famille");
		//
		// bedroomrepo.save(bedroom1);
		// bedroomrepo.save(bedroom2);
		// bedroomrepo.save(bedroom3);
		//
		//
		// Adress adress1 = new Adress();
		// adress1.setStreet("rue de Marseille");
		// adress1.setNumber(78);
		// adress1.setCp("69007");
		// adress1.setCity("Lyon");
		//
		// Adress adress2 = new Adress();
		// adress2.setStreet("rue de Paris");
		// adress2.setNumber(03);
		// adress2.setCp("75000");
		// adress2.setCity("Paris");
		//
		// Adress adress3 = new Adress();
		// adress3.setStreet("rue de oliviers");
		// adress3.setNumber(47);
		// adress3.setCp("16000");
		// adress3.setCity("Cognac");
		//
		// adressRepo.save(adress1);
		// adressRepo.save(adress2);
		// adressRepo.save(adress3);
		//
		//
		//
		// System.out.println(hotelRepo.findAll());

	}

}
