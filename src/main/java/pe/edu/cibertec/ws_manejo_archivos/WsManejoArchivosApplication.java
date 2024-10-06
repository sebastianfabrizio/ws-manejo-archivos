package pe.edu.cibertec.ws_manejo_archivos;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pe.edu.cibertec.ws_manejo_archivos.service.FileService;


@RequiredArgsConstructor
@Slf4j
@SpringBootApplication

//aqui le indico que ejecuto por comando
public class WsManejoArchivosApplication implements CommandLineRunner {

	private final FileService fileService;

	public static void main(String[] args) {
		SpringApplication.run(WsManejoArchivosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("Create archive");
		fileService.crearArchivoEscribir();
		log.info("Leyendo archivos");
		fileService.abrirLeerArchivos();
	}
}
