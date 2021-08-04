package ciello.arsenal.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
	private WorkerRepository workerRepository;
	
	@GetMapping
	private ResponseEntity<List<Worker>> findAll() {
		var workers = workerRepository.findAll();
		return ResponseEntity.ok(workers);
	}
	
	@GetMapping(value = "{id}")
	private ResponseEntity<Worker> findById(@PathVariable Long id) {
		var worker = workerRepository.findById(id).get();
		return ResponseEntity.ok(worker);
	}
}
