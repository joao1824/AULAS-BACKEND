package com.example._4;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


@RestController
public class Controller {

    @PostMapping("/nova-playlist")

    public String novaPlaylist(@RequestBody Playlist playlist) {
        return playlist.getId();
    }



}
