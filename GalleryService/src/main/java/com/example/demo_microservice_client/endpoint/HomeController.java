package com.example.demo_microservice_client.endpoint;

import com.example.demo_microservice_client.domain.Gallery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.core.env.Environment;
import java.util.List;

@RestController
@RequestMapping("/")
public class HomeController {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private Environment environment;

    @GetMapping("/{id}")
    public Gallery getGallery(@PathVariable int id){
        Gallery gallery = new Gallery();
        gallery.setId((long) id);
        List<Object> lstImage = restTemplate.getForObject("http://image-service/images",java.util.List.class);
        gallery.setImages(lstImage);
        return gallery;
    }
}
