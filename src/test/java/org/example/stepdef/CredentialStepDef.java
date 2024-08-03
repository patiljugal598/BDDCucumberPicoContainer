package org.example.stepdef;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import org.example.objects.Customer;

import java.util.List;

public class CredentialStepDef {

    @DataTableType
    public Customer customer(List<String> entry){
        return new Customer(entry.get(0),entry.get(1));
    }

    @Given("my credentials")
    public void my_credentials(DataTable dataTable) {
        List<String> list = dataTable.values();
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        List<String> list1 = dataTable.row(0);
        System.out.println(list1.get(0));
        System.out.println(list1.get(1));
    }


    @Given("multiple credentials")
    public void multiple_credentials(DataTable dataTable){
       List<List<String>> list = dataTable.asLists();
        System.out.println(list.get(0).get(0));
        System.out.println(list.get(0).get(1));
        System.out.println(list.get(1).get(0));
        System.out.println(list.get(1).get(1));
    }

    @Given("multiple credentials without datatable parameter")
    public void multiple_credentials_without_datatable_parameter(List<List<String>> list){
        System.out.println(list.get(0).get(0));
        System.out.println(list.get(0).get(1));
        System.out.println(list.get(1).get(0));
        System.out.println(list.get(1).get(1));    }

    @Given("multiple credentials without datatable type")
    public void multiple_credentials_without_datatable_type(List<Customer> customer){
        System.out.println(customer.get(0).getUserName());
        System.out.println(customer.get(0).getPassword());
        System.out.println(customer.get(1).getUserName());
        System.out.println(customer.get(1).getPassword());
    }
}
