package okhttp;

import com.google.gson.Gson;
import dto.AllContactsDto;
import dto.ContactDto;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;

public class GetAllContactsTests {
    Gson gson = new Gson();
    OkHttpClient client = new OkHttpClient();
    String token = "...";

    @Test
    public void getAllContactsSuccessTest() throws IOException {

        Request request = new Request.Builder()
                .url("https://contactapp-telran-backend.herokuapp.com/v1/user/login/usernamepassword")
                .get()
                .addHeader("Authorization", token)
                .build();

        Response response = client.newCall(request).execute();

        Assert.assertTrue(response.isSuccessful());
        Assert.assertEquals(response.code(),200);

        AllContactsDto contactsDto = gson.fromJson(response.body().string(), AllContactsDto.class);

        List<ContactDto> contacts = contactsDto.getContacts();
        for (ContactDto c: contacts) {
            System.out.println(c.getId());
            System.out.println(c.getLastName());
            System.out.println("=======================================");
        }
    }
}
