**Test Case ID**: TC-Login-002

**Test Case Title**: Verify login with invalid email

**Preconditions**
* User must already be signed up.
* User should be on the Login page

**Test Steps**
* Open Login page
* Enter incorrect email
* Enter valid password
* Click Login button

**Test Data**
* Email: test@ex.com
* Password: 123456

**Expected Result**
* System should display "Your email or password is correct"

**Actual Result**
* System displays error message correctly

**Status**
* Pass