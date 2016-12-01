package com.maskibth.domain;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class Version {

    @GraphId
    private Long id;

    private String version;
    private String executionDate;
}
