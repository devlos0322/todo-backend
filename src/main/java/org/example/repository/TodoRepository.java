package org.example.repository;

import org.example.model.TodoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
* 왜 Repository 쓰는가?
* JPA, repository
* repository : 데이터베이스와 인터페이스를 주고받기 위한 용도
* */
@Repository
public interface TodoRepository extends JpaRepository<TodoEntity, Long> {
}
