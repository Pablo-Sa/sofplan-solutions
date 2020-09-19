package br.com.softplan.poc.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.softplan.poc.entity.LogCreateAndUpdate;
import br.com.softplan.poc.repository.LogCreateAndUpdateRepository;

@Service
public class LogCreateAndUpdateService {
	
	@Autowired
	public LogCreateAndUpdateRepository logCreateAndUpdateRepository;

	public LogCreateAndUpdate save(LogCreateAndUpdate log) {
        return logCreateAndUpdateRepository.save(log);
    }
	
	public Iterable<LogCreateAndUpdate> findAll() {
        return logCreateAndUpdateRepository.findAll();
	}
	
	public void update(Long id, Date date) {
        logCreateAndUpdateRepository.update(id, date);
	}
}