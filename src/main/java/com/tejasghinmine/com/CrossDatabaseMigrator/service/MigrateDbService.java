package com.tejasghinmine.com.CrossDatabaseMigrator.service;

import com.tejasghinmine.com.CrossDatabaseMigrator.entity.MigrateDbRequest;
import com.tejasghinmine.com.CrossDatabaseMigrator.util.ScriptGenerator;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import sun.font.Script;

@Service
public class MigrateDbService {

    public String migrateDb(final MigrateDbRequest migrateDbRequest, final MultipartFile extractTable, final MultipartFile insertTable,final MultipartFile queryTable ) {
        ScriptGenerator scriptGenerator = new ScriptGenerator();
        return scriptGenerator.generateScript(migrateDbRequest,extractTable,insertTable,queryTable);
    }
}
