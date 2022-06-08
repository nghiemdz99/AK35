package support;

import com.github.javafaker.Faker;
import com.github.javafaker.service.FakeValuesService;
import com.github.javafaker.service.RandomService;

import java.util.Locale;

public class JavaUntills {
    public static String gerenateEmail(){
        FakeValuesService fakeValuesService = new FakeValuesService(
                new Locale("vi"),new RandomService());
        String email = fakeValuesService.bothify("????##@gmail.com");
        return email;

    }
    public static String gerenateCustomerName(){
        Faker faker = new Faker();
        String customerName = faker.address().firstName()+faker.address().lastName();
        return customerName;
    }
    public static String gerenatePassword(){
        FakeValuesService fakeValuesService = new FakeValuesService(
                new Locale("vi"),new RandomService());
        String password = fakeValuesService.regexify("(a-z1-9){10}");
        return password;
    }

}
