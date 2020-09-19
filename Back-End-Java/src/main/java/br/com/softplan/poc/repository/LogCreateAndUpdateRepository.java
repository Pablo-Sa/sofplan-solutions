package br.com.softplan.poc.repository;

import java.util.Date;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.softplan.poc.entity.LogCreateAndUpdate;

@Repository
public interface LogCreateAndUpdateRepository extends CrudRepository<LogCreateAndUpdate, Long> {

	@Transactional
	@Modifying 
	@Query(value = "update log_create_and_update set date_of_update = :date where id_people = :id", nativeQuery = true)
	void update(@Param("id") Long id, @Param("date") Date date);

}
