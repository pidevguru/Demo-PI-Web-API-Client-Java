import pidevguru.piwebapi.ApiException;
import pidevguru.piwebapi.PIWebApiClient;
import pidevguru.piwebapi.models.PWALanding;

public class MavenSampleApp {
    public static void main(String[] args) throws ApiException {
        System.out.print("Hello world");
        PIWebApiClient piWebApiClient = new PIWebApiClient("https://marc-pi2018.marc.net/piwebapi", "marc.adm", "1", false, false);
        PWALanding response = piWebApiClient.getHome().get();
    }
}

