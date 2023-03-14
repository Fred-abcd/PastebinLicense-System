package me.fred;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class LicenseChecker {
    private String pastebinRawUrl;
    private String licenseKey;

    public LicenseChecker(String pastebinRawUrl, String licenseKey) {
        this.pastebinRawUrl = pastebinRawUrl;
        this.licenseKey = licenseKey;
    }

    public boolean checkLicenseKey() throws IOException {
        HttpURLConnection connection = (HttpURLConnection) new URL(pastebinRawUrl).openConnection();
        connection.setRequestMethod("GET");

        int status = connection.getResponseCode();
        BufferedReader in = new BufferedReader(
                new InputStreamReader(connection.getInputStream()));
        String inputLine;
        StringBuffer content = new StringBuffer();
        while ((inputLine = in.readLine()) != null) {
            content.append(inputLine);
        }
        in.close();

        return content.toString().contains(licenseKey);
    }
}
