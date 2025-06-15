package org.example.asserts;
import io.restassured.response.Response;
import static org.testng.Assert.assertEquals;
import static org.assertj.core.api.Assertions.*;

public class AssertActions {


    public void verifyResponseBody(String actual ,String expected ,String description){
        assertEquals(actual,expected,description);
    }



    public void verifyResponseBody(int actual, int expected ,String description){
        assertEquals(actual,expected,description);
    }


    public void verifyStatusCode(Response response, Integer excepted){
        assertEquals(response.getStatusCode(),excepted);
    }

    public static void verifyStringKey(String KeyExpect, String KeyAtual){
        //Assertj
        assertThat(KeyExpect).isNotNull();
        assertThat(KeyExpect).isNotNull().isNotBlank();
        assertThat(KeyExpect).isEqualTo(KeyAtual);


    }

    public static void verifyStringKeyNotNull(Integer KeyExpect){
        //Assertj
        assertThat(KeyExpect).isNotNull();
    }


    public static void verifyStringKeyNotNull(String KeyExpect){
        //Assertj
        assertThat(KeyExpect).isNotNull();
    }


}
