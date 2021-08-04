package ciello.arsenal.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ciello.arsenal.course.domain.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {}
