package com.codouk.pointcoachingv2;

import com.codouk.pointcoachingv2.dao.ClientRepository;
import com.codouk.pointcoachingv2.dao.CoachRepository;
import com.codouk.pointcoachingv2.dao.FormuleRepository;
import com.codouk.pointcoachingv2.dao.PointRepository;
import com.codouk.pointcoachingv2.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class Pointcoachingv2Application implements CommandLineRunner {

    @Autowired
    private CoachRepository coachRepository;
    @Autowired
    private FormuleRepository formuleRepository;
    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private PointRepository pointRepository;

    public static void main(String[] args) {

        SpringApplication.run(Pointcoachingv2Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Coach coachMamadou = coachRepository.save(new Coach("mamadou","Mamadou"));
        Coach coachAngele = coachRepository.save(new Coach("angele","Angele"));
        Coach coachCodou = coachRepository.save(new Coach("codou", "Codou"));
        Coach coachYayah = coachRepository.save(new Coach("yayah", "Yayah"));

        Formule fBasic = formuleRepository.save(new Basic());
        Formule fSilver = formuleRepository.save(new Silver());
        Formule fGold = formuleRepository.save(new Gold());

        Client clMor = clientRepository.save(new Client("Seck","Mor",25,
                75,15,180, "Masculin","mor@gmail.com",
                "77 675 44 33","Senegal",new Date(),coachMamadou,fBasic));

        Client clAstou = clientRepository.save(new Client("Faye","Astou",32,
                117,30,186, "Feminin","astoufaye3@gmail.com",
                "78 985 44 42","Senegal",new Date(),coachAngele,fGold));

        Point point1 = pointRepository.save(new Point(new Date(),1,1,true,
                false,false,false,false,false,
                "Néant",clAstou));

    }
}
