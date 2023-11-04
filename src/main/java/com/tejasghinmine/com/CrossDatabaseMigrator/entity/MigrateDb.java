package com.tejasghinmine.com.CrossDatabaseMigrator.entity;

import lombok.Data;

import javax.persistence.Entity;
import java.util.List;

@Entity
@Data
public class MigrateDb {
    private String extractTable;
    private String insertTable;
    private String queryTable;
    private List<String> queryTableAttributes;
}
