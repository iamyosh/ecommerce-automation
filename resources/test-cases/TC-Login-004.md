**Test Case ID**: TC-Login-004

**Test Case Title**: Login with valid email and empty password field

**Preconditions**
* User must already be signed up.
* User should be on the Login page

**Test Steps**
* Open Login page
* Enter valid email
* Password field left empty
* Click Login button

**Test Data**
* Email: test@example.com
* Password: none

**Expected Result**
* System should display validation message "Please fill this field" for empty password field

**Actual Result**
* System displays validation message

**Status**
* Pass