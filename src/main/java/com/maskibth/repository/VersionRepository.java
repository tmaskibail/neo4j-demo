package com.maskibth.repository;

import com.maskibth.domain.VersionManager;
import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VersionRepository extends GraphRepository<VersionManager> {



}
