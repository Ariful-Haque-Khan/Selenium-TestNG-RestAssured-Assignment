# Project Title:  Selenium-TestNG-Rest Assured Automation for DailyFinance Website
## Project Summary

This project automates critical workflows for the [DailyFinance website](https://dailyfinance.roadtocareer.net) using **Selenium-TestNG**. The automation covers user registration, login, password reset, item management, profile updates, and admin dashboard validation. It includes end-to-end testing, negative test scenarios, and secure handling of sensitive data such as admin credentials.  


## Features  

1. **User Registration and Email Validation:**  
   - Automates user registration and validates the "Congratulations" email.  

2. **Password Reset Workflow:**  
   - Tests password reset functionality with valid and invalid inputs.  
   - Retrieves and validates reset emails from Gmail.  

3. **Item Management:**  
   - Adds random items to the user’s list and validates their presence.  

4. **Profile Update:**  
   - Updates the user email and validates login with the updated and old email.  

5. **Admin Dashboard Validation:**  
   - Securely logs in as admin and verifies user details via the admin dashboard.  

6. **Secure Data Handling:**  
   - Uses `config.properties` file for managing sensitive credentials.


## Tools and Technologies  

- **Programming Language:** Java  
- **Build Tool:** Gradle  
- **Web Automation:** Selenium WebDriver  
- **Test Framework:** TestNG  
- **API Testing:** Rest Assured  
- **Data Handling:** Simple JSON for JSON manipulation and CSV Parser for CSV-based data input  
- **Reporting:** Allure


## How to Run This Project  

### 1. Clone the Project  
Clone the repository using the following command:  
```bash
git clone <repository-url>
```
### 2. Open the Project in IntelliJ IDEA
- Open IntelliJ IDEA.
- Navigate to **File > Open**.
- Select the cloned folder and expand it.
- Choose Open as Project.
### 3. Run the Test Suite
Execute the following command to clean and run the test suite with admin credentials:

```bash
gradle clean test -Pemail="admin@test.com" -Ppassword="admin123"
```

### 4. Generate and Serve Allure Report
To generate the Allure report, use the following command:

```bash
allure generate allure-results --clean -o allure-report
``` 
To serve the Allure report in your browser, run:
```bash
allure serve allure-results
```

### Report 
![gmail2](https://github.com/user-attachments/assets/acc7f2bc-9cf3-4925-a245-ac92e6d0219a)

![image](https://github.com/user-attachments/assets/45d4ea09-006e-42f3-ae09-3fec59953547)

### Video 

full recording is attached [here](https://drive.google.com/file/d/1ha8t6Vd5GFd6k1vpb0npl5F7zKyydL-1/view?usp=sharing)

