**Test Case ID**: TC-Checkout-Validation-001

**Test Case Title**: Verify that a logged-in user can successfully complete the checkout process

**Preconditions**
* User must be logged in
* Products added to cart
* User must be in checkout page

**Test Steps**
* Open website
* User must have account created prior
* Login with valid credentials
* Add products to cart
* Navigate to Cart page
* Click "Proceed to Checkout"
* Verify address details and item details
* Click "Place Order"
* Enter payment information
* Click "Pay and confirm order"

**Test Data**
* Product name: Blue Top
* Product name: Men Tshirt
* Product name: Sleeveless Dress
* Email: test@example.com
* Password: 123456
* Name on card: Yosh Edirisinghe
* Card number: 121314414887
* Expiry date: 23/2029
* CVN: 123

**Expected Result**
* Checkout completed successfully and order confirmation message received
* "Download invoice" button displayed

**Actual Result**
* Checkout completed successfully with "Download invoice" button displayed

**Status**
* Pass