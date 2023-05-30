package com.sprinboot_one_to_one.sprinboot_one_to_one.repo;

import com.sprinboot_one_to_one.sprinboot_one_to_one.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyRepository extends JpaRepository<Question, Long> {
}
