package taankomm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class Rakendus {
	@RequestMapping("/geomeetriline_keskmine")
	String gk(String arv1, String arv2){
		if(arv1==null){return "andmed puuduvad";}
		int a1=Integer.parseInt(arv1);
		int a2=Integer.parseInt(arv2);
		return arv1+" ja "+arv2 +" geomeetriline keskmine on "+Math.sqrt(a1*a2);

	}

	@RequestMapping("/3arvu_geomeetriline_keskmine")
	String gk(String arv1, String arv2, String arv3){
		if(arv1==null){return "andmed puuduvad";}
		int a1=Integer.parseInt(arv1);
		int a2=Integer.parseInt(arv2);
		int a3=Integer.parseInt(arv3);
		return arv1+" , "+arv2+" ja "+arv3+" geomeetriline keskmine on "+Math.cbrt(a1*a2*a3);
	}

	@RequestMapping("hinnakalkulaator")
	String hk(String hind, String kogus, String klient){
		if(kogus==null){return "ostukorv on tyhi";}
		int a1=Integer.parseInt(hind);
		int a2=Integer.parseInt(kogus);
	 	if(!klient.equals(null){
			return "Kliendina on hind: " +((a1*a2)-((a1*a2)*0.1));
		} else{
			return "Klienikaarti ei ole, hind on: "+(a1*a2);
		}
	}

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
