**BUG-001- Incorrect test result (Login Test passes but LoginFails)**

**Summary**
* Automation test correctly reports login as successful even though the application displays and error message and user is not logged in.

**Environment**
* Browser: Chrome 147
* OS: Windows 11
* Automation Tool: Selenium Webdriver
* Application URL: https://automationexercise.com/

**Steps to Reproduce**
* Go to Login page
* Enter valid email and password
* Click Login button
* Observe system response
* Check automation test result

**Expected Result**
* User should successfully log in and be redirected to the dashboard or if login fails test should fail accordingly.

**Actual Result**
* Web application displays error message "Your email or password is incorrect!".
* User remains on Login page
* But automation test shows Passed

**Severity**
* High

**Priority**
* High

**Status**
* Open

**Evidence**
* Screenshot attached: resources/screenshots/BUG-01-failed-login.png 
