# Retail Media Campaign Intelligence Platform

## Minimum Viable Product (MVP) Scope

### 1. Project Objective

Develop a full-stack retail media campaign management and analytics application using Java, Spring Boot, PostgreSQL, and React.

The platform will simulate how advertisers create advertising campaigns, compete for available advertising placements, manage budgets, and analyze campaign performance.

All advertising data, campaign rules, and bidding logic are fictional and independently designed for portfolio demonstration.

### 2. Target Users

**Advertiser:** Creates advertising campaigns and manages campaign budgets.

**Campaign Manager:** Monitors campaigns, bidding outcomes, and spending.

**Marketing Analyst:** Reviews campaign performance metrics and identifies optimization opportunities.

### 3. MVP Features — In Scope

**Campaign Management**
- Create PLA and TOA campaigns.
- Validate campaign information, bid amounts, budgets, and dates.
- View campaigns and their statuses.
- Update supported campaign fields and pause or activate campaigns.

**Bid Management**
- Evaluate eligible campaigns for a requested advertising placement.
- Filter by campaign status, dates, ad format, and available budget.
- Rank eligible campaigns by bid amount.
- Resolve tied bids using campaign ID.
- Allocate limited advertising placements.
- Record auction results.

**Budget Management**
- Record simulated billable advertising events.
- Track cumulative spending and remaining budget.
- Prevent spending beyond the campaign budget.
- Prevent duplicate charges.
- Flag campaigns at 90% budget utilization.

**Campaign Analytics**
- Generate or load synthetic impressions, clicks, conversions, spend, and attributed revenue.
- Calculate CTR, CPC, CVR, ROAS, CPA, and budget utilization.
- Display KPI summaries and campaign comparisons.
- Filter performance by campaign, format, status, and date range.
- Show performance trends and rule-based insights.

**Frontend**
- React campaign management interface.
- Campaign creation form.
- Campaign list and details.
- Bidding simulation controls.
- Budget monitoring view.
- Campaign analytics dashboard.

### 4. Out of Scope

The MVP will not include:

- Integration with real advertising networks.
- Real-money payment processing.
- Proprietary retail media bidding algorithms.
- Machine learning-based bid optimization.
- Production identity and access management.
- Third-party advertiser integrations.
- Real customer or retailer transaction data.
- Enterprise-scale auction throughput.
- Predictive campaign forecasting.

### 5. Technical Architecture

**Frontend:** React

**Backend:** Java and Spring Boot REST APIs

**Database:** PostgreSQL

**Development Environment:** GitHub Codespaces and Docker

**Version Control:** Git and GitHub

**Project Management:** Jira Scrum board

### 6. Success Criteria

The MVP will be considered complete when:

1. A user can create and manage a simulated advertising campaign.
2. The backend can evaluate campaigns and return deterministic bidding results.
3. Budget accounting prevents duplicate charges and overspending.
4. Synthetic performance data supports documented KPI calculations.
5. React screens display campaigns, budgets, and analytics correctly.
6. Core backend functionality is covered by automated tests.
7. API behavior is documented.
8. The application can be run reproducibly from the GitHub repository.
9. The repository contains clear setup instructions and architecture documentation.

### 7. Project Constraints

- All data must be synthetic.
- All business rules must be original and documented.
- No confidential employer information may be used.
- Monetary calculations must use precise decimal types.
- Backend validation must enforce the business rules.
- The first version will prioritize correctness and demonstrable functionality over production-scale performance.