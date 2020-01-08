package com.pennywise.web;

import com.pennywise.model.OxfordAPI;

import static com.pennywise.utility.OxfordAPICredentials.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController(value = "oxfordapicontroller")
@RequestMapping(value = "/dictionary")
public class OxfordController {

    @Autowired
    private RestTemplate restTemplate;

    public OxfordAPI getWord(){
        OxfordAPI randomWord = this.restTemplate.getForObject(
            //This URL expression must be concatenated with the authKey/authId
            oxfordAPIURL, OxfordAPI.class);
        return randomWord;
    }
}