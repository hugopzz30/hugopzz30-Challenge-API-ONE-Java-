import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaDivisa {

    public Divisa cambioDivisaUSD(){

        String direccion = "https://v6.exchangerate-api.com/v6/5900513978ea272433e00b69/latest/USD";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();

        try {
            HttpResponse<String> response = null;

            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            return new Gson().fromJson(response.body(), Divisa.class);

        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("No se ha encontrado esa divisa");
        }



    }

}
