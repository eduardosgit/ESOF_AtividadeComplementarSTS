package br.edu.iftm.atividadeComplementar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
//public class AtividadeComplementarStsApplication implements CommandLineRunner{
	
@SpringBootApplication
public class AtividadeComplementarStsApplication {	
	
//	@Autowired
//	private AtividadeRepository repo;

	public static void main(String[] args) {
		SpringApplication.run(AtividadeComplementarStsApplication.class, args);
	}
		
//	@Override
//	public void run(String... args) throws Exception {
//		Atividade a1 = new Atividade();
//		a1.setNome("Simpós");
//		repo.save(a1);
//	}
}
