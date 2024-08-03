package org.example.customDataTableType;

import io.cucumber.java.ParameterType;
import org.example.objects.Product;

public class CustomParameterType {

    @ParameterType(".*")
    public Product product(String productName){
        return new Product(productName.replace("\"",""));
    }
}
