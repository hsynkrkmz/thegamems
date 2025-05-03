package com.thegames.thegamems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/player")
public class PlayerController {
	 @Autowired
	    private PlayerService playerService;

	    @GetMapping("/new")
	    public String home() {
	        playerService.newPlayer();
	    }
    }