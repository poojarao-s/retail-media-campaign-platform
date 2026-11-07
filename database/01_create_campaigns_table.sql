
CREATE TABLE IF NOT EXISTS campaigns (
    campaign_id BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    advertiser_id BIGINT NOT NULL,
    campaign_name VARCHAR(150) NOT NULL,
    ad_format VARCHAR(10) NOT NULL,
    start_date DATE NOT NULL,
    end_date DATE NOT NULL,
    total_budget NUMERIC(12,2) NOT NULL,
    bid_amount NUMERIC(10,2) NOT NULL,
    status VARCHAR(20) NOT NULL DEFAULT 'Draft',
    created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,

    CONSTRAINT chk_ad_format
        CHECK (ad_format IN ('PLA', 'TOA')),

    CONSTRAINT chk_budget
        CHECK (total_budget > 0),

    CONSTRAINT chk_bid
        CHECK (bid_amount > 0),

    CONSTRAINT chk_dates
        CHECK (end_date >= start_date),

    CONSTRAINT chk_status
        CHECK (status IN ('Draft', 'Active', 'Paused', 'Completed'))
);
