package core.repository;

import core.model.Passport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassportRepository
        extends JpaRepository<Passport, Integer> {



}