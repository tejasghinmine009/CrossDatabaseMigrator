package com.tejasghinmine.com.CrossDatabaseMigrator.util;

import com.tejasghinmine.com.CrossDatabaseMigrator.entity.MigrateDbRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class ScriptGenerator {

    public String generateScript(MigrateDbRequest migrateDbRequest, MultipartFile extractTable, MultipartFile insertTable, MultipartFile queryTable) {
        return null;
    }
}
