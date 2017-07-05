package com.greekw.test;

import com.greekw.test.entity.HomeEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by wuwc on 2017/7/3.
 */
@SpringBootApplication
public class StartApplication implements CommandLineRunner {

    @Autowired
    private HomeEntity homeEntity;

    public static void main(String[] args) throws Exception {
        SpringApplication.run(StartApplication.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        System.out.println("\n" + homeEntity.toString());
        System.out.println();
    }
}
