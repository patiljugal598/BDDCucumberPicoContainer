package org.example.customDataTableType;

import io.cucumber.java.DataTableType;
import org.example.objects.BillingDetails;

import java.util.Map;

public class CustomDataTableType {
    @DataTableType
    public BillingDetails billingDetailsEntry(Map<String,String> map){
        return new BillingDetails(map.get("firstname"),
                map.get("lastname"),
                map.get("address_line1"),
                map.get("city"),
                map.get("zip"),
                map.get("email"));
    }
}
