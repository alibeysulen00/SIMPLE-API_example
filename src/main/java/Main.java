import kong.unirest.json.JSONObject;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

        public class Main {
            public static void main(String[] args) throws IOException, InterruptedException {


                // client (istemci) oluşturma
                Object client = HttpClient.newHttpClient();
                // request (sorgu) oluşturma
                Object request = HttpRequest.newBuilder()
                        .uri(URI.create("https://api.collectapi.com/health/dutyPharmacy?ilce=%C3%87ankaya&il=Ankara"))
                        .header("authorization", "apikey 6MWK3Amkt3GjrKo8xqdjuZ:0ZuvWmd2ejiz8bcGA67COW")
                        .header("content-type", "application/json")
                        .build();
                Object response = ((HttpClient) client).send((HttpRequest) request, HttpResponse.BodyHandlers.ofString());
                System.out.println(((HttpResponse<?>) response).body());



            }
        }


