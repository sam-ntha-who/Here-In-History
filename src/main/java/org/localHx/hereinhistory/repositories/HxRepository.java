package org.localHx.hereinhistory.repositories;

import org.localHx.hereinhistory.models.HistoricalData;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface HxRepository extends MongoRepository<HistoricalData, String> {

	
	
}
