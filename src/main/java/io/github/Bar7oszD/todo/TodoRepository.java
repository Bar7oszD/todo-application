package io.github.Bar7oszD.todo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "todos", path = "todos")
interface TodoRepository extends JpaRepository<Todo,Integer> {
}

