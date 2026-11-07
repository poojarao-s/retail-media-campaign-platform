
package com.retailmedia.backend.service;

import com.retailmedia.backend.entity.Campaign;
import com.retailmedia.backend.repository.CampaignRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

@Service
public class CampaignService {

    private final CampaignRepository campaignRepository;

    public CampaignService(CampaignRepository campaignRepository) {
        this.campaignRepository = campaignRepository;
    }

    @Transactional
    public Campaign createCampaign(Campaign campaign) {

        // Validate campaign name
        if (campaign.getCampaignName() == null ||
            campaign.getCampaignName().isBlank()) {
            throw new IllegalArgumentException(
                "Campaign name is required"
            );
        }

        // Validate advertiser ID
        if (campaign.getAdvertiserId() == null ||
            campaign.getAdvertiserId() <= 0) {
            throw new IllegalArgumentException(
                "A valid advertiser ID is required"
            );
        }

        // Validate advertising format
        if (!"PLA".equals(campaign.getAdFormat()) &&
            !"TOA".equals(campaign.getAdFormat())) {
            throw new IllegalArgumentException(
                "Ad format must be PLA or TOA"
            );
        }

        // Validate budget
        if (campaign.getTotalBudget() == null ||
            campaign.getTotalBudget().compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException(
                "Campaign budget must be greater than zero"
            );
        }

        // Validate bid amount
        if (campaign.getBidAmount() == null ||
            campaign.getBidAmount().compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException(
                "Bid amount must be greater than zero"
            );
        }

        // Validate dates
        if (campaign.getStartDate() == null ||
            campaign.getEndDate() == null ||
            campaign.getEndDate().isBefore(campaign.getStartDate())) {
            throw new IllegalArgumentException(
                "Campaign dates are invalid"
            );
        }

        // New campaigns always start as Draft
        campaign.setCampaignId(null);
        campaign.setStatus("Draft");

        return campaignRepository.save(campaign);
    }
}
