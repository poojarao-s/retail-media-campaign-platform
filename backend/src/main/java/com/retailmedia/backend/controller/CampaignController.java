
package com.retailmedia.backend.controller;

import com.retailmedia.backend.entity.Campaign;
import com.retailmedia.backend.service.CampaignService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/campaigns")
public class CampaignController {

    private final CampaignService campaignService;

    public CampaignController(CampaignService campaignService) {
        this.campaignService = campaignService;
    }

    @PostMapping
    public ResponseEntity<Campaign> createCampaign(
            @RequestBody Campaign campaign) {

        Campaign createdCampaign =
                campaignService.createCampaign(campaign);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(createdCampaign);
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<String> handleValidationError(
            IllegalArgumentException exception) {

        return ResponseEntity
                .badRequest()
                .body(exception.getMessage());
    }
}
