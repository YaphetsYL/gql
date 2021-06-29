package com.sid.gql.resolvers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.sid.gql.entities.Pet;
import com.sid.gql.enums.Animal;

@Component
public class Query implements GraphQLQueryResolver {
    public List<Pet> pets() {
        List<Pet> pets = new ArrayList<>();

        Pet aPet = new Pet();
        aPet.setId(1l);
        aPet.setName("Bill");
        aPet.setAge(9);
        aPet.setType(Animal.MAMMOTH);

        pets.add(aPet);

        return pets;
    }
}
