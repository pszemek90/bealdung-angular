package com.pszemek.bealdungangular;

import com.pszemek.bealdungangular.module.entity.UserEntity;
import com.pszemek.bealdungangular.module.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.UUID;
import java.util.stream.Stream;

@SpringBootApplication
public class BealdungAngularApplication {

    public static void main(String[] args) {
        SpringApplication.run(BealdungAngularApplication.class, args);
    }

    @Bean
    CommandLineRunner init(UserRepository repository){
        return args -> {
            Stream.of("John", "Julie", "Jennifer", "Helen", "Rachel")
                    .forEach(name -> {
                        UserEntity entity = new UserEntity()
                                .setUuid(UUID.randomUUID().toString())
                                .setName(name)
                                .setEmail(name.toLowerCase() + "@domain.com");
                        repository.saveAndFlush(entity);
                    });
            repository.findAll().forEach(System.out::println);
        };
    }

}
