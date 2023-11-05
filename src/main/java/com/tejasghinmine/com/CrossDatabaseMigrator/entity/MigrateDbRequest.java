package com.tejasghinmine.com.CrossDatabaseMigrator.entity;

import lombok.Data;

import javax.persistence.Entity;
import java.util.List;

@Entity
@Data
public class MigrateDbRequest {
    private String extractTable;
    private String extractTableType;
    private String insertTable;
    private String insertTableType;
    private String queryTable;
    private String queryTableType;
    private List<String> queryTableAttributes;
}
