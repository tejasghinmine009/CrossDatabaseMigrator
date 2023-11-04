package com.tejasghinmine.com.CrossDatabaseMigrator.controller;

import com.tejasghinmine.com.CrossDatabaseMigrator.entity.MigrateDb;
import com.tejasghinmine.com.CrossDatabaseMigrator.service.MigrateDbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MigrateDbController {

    @Autowired
    MigrateDbService migrateDbService;

    @PostMapping("/migrate/db")
    public void migrateDb(@RequestBody MigrateDb migrateDb){
        String ans =  migrateDbService.migrateDb(migrateDb);
    }

}
