package com.tejasghinmine.com.CrossDatabaseMigrator.controller;

import com.tejasghinmine.com.CrossDatabaseMigrator.entity.MigrateDbRequest;
import com.tejasghinmine.com.CrossDatabaseMigrator.service.MigrateDbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class MigrateDbController {

    @Autowired
    MigrateDbService migrateDbService;

    @PostMapping("/migrate/db")
    public void migrateDb(@RequestBody MigrateDbRequest migrateDbRequest,
                          @Validated @RequestParam("extract-table") MultipartFile extractTable,
                          @Validated @RequestParam("insert-table") MultipartFile insertTable,
                          @RequestParam("query-table") MultipartFile queryTable){
        String ans =  migrateDbService.migrateDb(migrateDbRequest,extractTable,insertTable,queryTable);
    }

}
