package taankomm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class Rakendus {
	@RequestMapping("/algus")
    String tervitusfunktsioon() {
        return "Ahoi!";
    }

	@RequestMapping("/tervita")
	String tervitusfunktsioon3(String eesnimi){
		return "Tere, "+eesnimi;
	}

    //Lisage teine tervitusfunktsioon
	@RequestMapping("/algus2")
    String tervitusfunktsioon2() {
        return "Tere taas!";
    }

    public static void main(String[] args) {
		//System.getProperties().put("server.port", 4200);
        SpringApplication.run(Rakendus.class, args);
    }
}
