**Q1. Test cases for upi payment feature in paytm**

Below are 2 test examples : - 

**Test Case ID:** UPI_Payment_001
Test Summary: Verify successful UPI payment initiation.

**Test Steps:**
1. Prerequisites:
   - User has a Paytm account.
   - Sufficient balance is available in the linked bank account.
   - The UPI payment feature is enabled for the user.

2. Open Paytm:
   - Open the Paytm application.
   - Log in with valid credentials.

3. Navigate to UPI Payment:
   - Select the "UPI Payments" option from the app's main menu.

4. Initiate Payment:
   - Click on the "Send Money via UPI" button.
   - Enter a valid UPI ID or select a contact from the phonebook.
   - Enter the amount and an optional description.
   - Choose the linked bank account.

5. Confirm Payment:
   - Review the payment details.
   - Click on the "Proceed" or "Send" button to initiate the UPI payment.

6. Authenticate:
   - Depending on the UPI method, authenticate the payment using a PIN or biometric verification.

7. Verify Payment Status:
   - Check the payment status on the confirmation screen.
   - Verify the transaction details in the transaction history.

**Prerequisites:**
- Valid Paytm account.
- Linked bank account with UPI enabled.
- Sufficient balance in the bank account.
- Access to a mobile device with the Paytm app installed.

**Browser:** Chrome, Paytm mobile application 

**Test Data:**
- UPI ID or Contact's UPI ID.
- Payment amount.
- Bank account details.

**Expected/Intended Results:**
- The UPI payment should be initiated successfully.
- The user should see a confirmation of the payment on the app.
- The transaction status should be updated in the transaction history.
- The recipient should receive the payment.

---

**Test Case ID:** UPI_Payment_002
Test Summary: Verify UPI payment failure due to insufficient balance.

**Test Steps:**
1. Prerequisites:
   - User has a Paytm account.
   - Insufficient balance in the linked bank account.
   - The UPI payment feature is enabled for the user.

2. Open Paytm:
   - Open the Paytm application.
   - Log in with valid credentials.

3. Navigate to UPI Payment:
   - Select the "UPI Payments" option from the app's main menu.

4. Initiate Payment:
   - Click on the "Send Money via UPI" button.
   - Enter a valid UPI ID or select a contact from the phonebook.
   - Enter an amount higher than the available balance.
   - Choose the linked bank account.

5. Verify Insufficient Balance Message:
   - Confirm that an error message is displayed indicating insufficient balance.
   - Ensure that the user is notified about the insufficient balance issue.

**Prerequisites:**
- Valid Paytm account.
- Linked bank account with UPI enabled.
- Insufficient balance in the bank account.
- Access to a mobile device with the Paytm app installed.

**Browser:** Chrome, Paytm Mobile application 

**Test Data:**
- UPI ID or Contact's UPI ID.
- Payment amount exceeding the available balance.

**Expected/Intended Results:**
- An error message should be displayed indicating insufficient balance.
- The UPI payment should not be processed.
- The user should be prompted to add funds or choose another payment method.

---
**Q2. Check for defects and fill up according to the format below.**

Below are three cases with **High , medium and low priority cases**:- 


**Defect ID:** D-001

**Descriptive Defect Name and Type:**
- Descriptive Defect Name: Unauthorized Login
- Type: Functional

**Defect Severity:** High

**Defect Priority:** High

**Defect Status:** Open

**Detailed Description:**
Users are able to log in without providing valid credentials, posing a security risk. This defect compromises the authentication mechanism, allowing unauthorized access to the system.

**Steps to Reproduce:**
1. Open the website login page.
2. Leave the username and password fields blank.
3. Click on the "Login" button.
4. Observe that the system allows access without valid credentials.

---

**Defect ID:** D-002

**Descriptive Defect Name and Type:**
- Descriptive Defect Name: Search Box Functionality
- Type: Functional

**Defect Severity:** Low 

**Defect Priority:** Low

**Defect Status:** Open

**Detailed Description:**
The search functionality in the search type box is not working as expected, hindering users' ability to efficiently search for content. This defect affects the core functionality of the search feature.

**Steps to Reproduce:**
1. Navigate to the website's search bar.
2. Enter a valid search query.
3. Press "Enter" or click the search icon.
4. Observe that the search results are either inaccurate or not displayed.


---


**Defect ID:** D-003

**Descriptive Defect Name and Type:**
- Descriptive Defect Name: Notification Accessibility
- Type: Functional

**Defect Severity:** Medium

**Defect Priority:** Medium

**Defect Status:** Open

**Detailed Description:**
Users are unable to check notifications within the application, impacting their ability to stay informed about important updates or messages. This defect affects the overall user experience and communication features.

**Steps to Reproduce:**
1. Log in to the website with valid credentials.
2. Look for the notifications icon or section.
3. Click on the notifications icon or navigate to the notifications section.
4. Observe that the notifications are not accessible or displayed as expected.

---

**Defect ID:** D-003

**Descriptive Defect Name and Type:**
- Descriptive Defect Name: Statement Viewing Issue
- Type: Functional

**Defect Severity:** High

**Defect Priority:** High

**Defect Status:** Open

**Detailed Description:**
Users are unable to view their statements within the application. This defect impacts the user's ability to access critical financial information, but it does not pose an immediate security threat.

**Steps to Reproduce:**
1. Log in to the website with valid credentials.
2. Navigate to the "Statements" section.
3. Attempt to view a statement.
4. Observe that the statement is not displayed as expected.
