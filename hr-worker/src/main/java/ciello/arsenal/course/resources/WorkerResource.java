package ciello.arsenal.course.resources;

import java.util.List;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ciello.arsenal.course.domain.Worker;
import ciello.arsenal.course.repositories.WorkerRepository;

@RestController
@RequestMapping(value = "/workers")
public class WorkerResource {
	
	@Autowired
	private static Logger logger = org.slf4j.LoggerFactory.getLogger(WorkerResource.class);
	
	@Autowired
	private Environment env;
	
	@Autowired
	private WorkerRepository workerRepository;
	
	@GetMapping
	private ResponseEntity<List<Worker>> findAll() {
		var workers = workerRepository.findAll();
		return ResponseEntity.ok(workers);
	}
	
	@GetMapping(value = "{id}")
	private ResponseEntity<Worker> findById(@PathVariable Long id) {
		
		logger.info("Port = " + env.getProperty("local.server.port"));
		
		var worker = workerRepository.findById(id).get();
		return ResponseEntity.ok(worker);
	}
}
