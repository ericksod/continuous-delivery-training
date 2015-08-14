package com.thoughtworks;

import spark.ModelAndView;
import spark.template.freemarker.FreeMarkerEngine;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.*;

public class SampleApplication {
    public static void main(String[] args) {
        port(Integer.valueOf(System.getenv("PORT")));
        staticFileLocation("/public");

        get("/hello/:name", (req, res) -> {
            String requestedName = req.params(":name");

            if(validateName(requestedName)) {
                return "Hello " + requestedName + ". You smell mighty fine today";
            }
            return "Please input a valid name (under 10 char)";
        });

        get("/", (request, response) -> {
            Map<String, Object> attributes = new HashMap<>();
            attributes.put("message", "Hello World!");

            return new ModelAndView(attributes, "index.ftl");
        }, new FreeMarkerEngine());
    }

    public static boolean validateName(String name) {
        return name.length() <= 10;
    }
}

