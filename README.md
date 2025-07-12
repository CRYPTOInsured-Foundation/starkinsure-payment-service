# StarkInsure Payment Service

The **StarkInsure Payment Service** is a Spring Boot microservice handling all payment flows for the StarkInsure DeFi insurance platform. Running on port `5004`, it enables secure premium payments, claim payouts, and liquidity pool transactions on StarkNet.

---

## 🔗 API Documentation  
[View Swagger Docs](http://localhost:9005/swagger-ui.html) | [StarkNet API Reference](https://www.starknet.io/api)

---

## ✨ Insurance Payment Features  
- **StarkNet Native Payments**:  
  - 🟣 STRK token processing  
  - 🔷 ETH bridging (L1→L2)  
  - 💱 Stablecoin conversions (USDC/USDT)  
- **Claim Automation**:  
  - Pragma Oracle-triggered payouts  
  - Multi-sig dispute resolution  
- **Risk Pool Features**:  
  - LP reward distribution (Cairo smart contract integration)  
  - Reinsurance capital allocation  

---

## 🛠️ Tech Stack  
| Component           | Technology                                                                 |
|---------------------|---------------------------------------------------------------------------|
| Framework           | [Spring Boot 3.2](https://spring.io/projects/spring-boot)                |
| StarkNet SDK       | [StarkNet.js](https://www.starknetjs.com/) + [starkli](https://github.com/xJonathanLEI/starkli) |
| Oracle             | [Pragma](https://pragmaoracle.com/) (StarkNet-native)                    |
| Database           | PostgreSQL + [TimescaleDB](https://www.timescale.com/)                   |

---

## 🚀 Quick Start  

### Prerequisites  
- Java 17+  
- PostgreSQL 15+ with TimescaleDB  
- StarkNet devnet (for testing)  

### Installation  
1. **Clone the repo**:  
   ```bash
   git clone https://github.com/CRYPTOInsured-Foundation/starkinsure-payment-service.git
   cd starkinsure-payment-service
   ```
2. Configure environment:
   ```bash
   cp src/main/resources/application.example.yml src/main/resources/application.yml
   ```
   - Edit application.yml:
     ```yaml
     server:
       port: 5004
     spring:
       datasource:
         url: jdbc:postgresql://localhost:5432/starkinsure_db
     stripe:
       api-key: your-stripe-key
     ```
3. Build and run:
   ```bash
   mvn spring-boot:run
   ```
## 🤝 Contributing

1. Fork the repository
2. Create your feature branch:
```bash
git checkout -b feat/your-feature
```
3. Commit changes following Conventional Commits
4. Push to the branch
5. Open a Pull Request
