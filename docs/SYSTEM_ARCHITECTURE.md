# System Architecture

## Proposed MVP Architecture

```mermaid
flowchart TD
    A["React Frontend"] -->|HTTP / JSON| B["Spring Boot REST Controllers"]
    B --> C["Campaign Service"]
    B --> D["Bid Evaluation Service"]
    B --> E["Budget Service"]
    B --> F["Analytics Service"]
    C --> G["Spring Data JPA Repositories"]
    D --> G
    E --> G
    F --> G
    G --> H[("PostgreSQL Database")]
    I["Synthetic Event Generator"] --> B
```

## Implementation Status

- Implemented: Spring Boot campaign creation API, JPA persistence, PostgreSQL database.
- Planned: React frontend, bid evaluation, budget accounting, analytics, and synthetic event generator.

## Architecture Principles

- Separate presentation, business logic, and persistence.
- Validate inputs and business rules on the backend.
- Use precise decimal types for monetary values.
- Keep all campaign and performance data synthetic.
- Use REST/JSON for communication between the frontend and backend.