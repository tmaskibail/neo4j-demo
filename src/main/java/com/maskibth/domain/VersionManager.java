package com.maskibth.domain;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.Set;

@NodeEntity
public class VersionManager {
    @GraphId
    private Long id;

    private String name;
    private String lock;

    @Relationship(type="CONTAINS", direction=Relationship.OUTGOING)
    private Set<Version> versions;
}
