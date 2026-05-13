**BUG-002- Missing validation for empty login fields**

**Summary**
* Login form does not properly validate empty email/password submission.

**Environment**
* Browser: Chrome 147
* OS: Windows 11
* Automation Tool: Selenium Webdriver
* Application URL: https://automationexercise.com/

**Steps to Reproduce**
* Go to Login page
* Leave email and password fields empty
* Click Login button

**Expected Result**
* System should display validation message like "Email is required" or "Password is required".

**Actual Result**
* System behavior is inconsistent

**Severity**
* Medium

**Priority**
* High

**Evidence**
* Screenshot attached: target/screenshots/BUG-002-missing-validation.png

