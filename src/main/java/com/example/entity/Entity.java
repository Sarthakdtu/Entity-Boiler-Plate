package com.example.entity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Entity {
    URL url;
    public Entity() throws IOException {
    }

    public String action(){
        return "Action Performed";
    }

    public String actionViaRequest() throws IOException {
        String res;
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        try {
            con.setRequestMethod("GET");
            StringBuilder content;
            try (BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()))) {
                String line;
                content = new StringBuilder();
                while ((line = in.readLine()) != null) {
                    content.append(line);
                }
            }
            res = content.toString();
        } finally {
            con.disconnect();
        }
        return res;
    }
}
