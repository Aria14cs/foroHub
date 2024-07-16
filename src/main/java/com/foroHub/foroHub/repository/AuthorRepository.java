package com.foroHub.foroHub.repository;

import com.foroHub.foroHub.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
