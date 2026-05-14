**Test Case ID**: TC-Checkout-Validation-002

**Test Case Title**: Verify system behavior when invalid card details are entered

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
* Enter invalid payment information
* Click "Pay and confirm order"

**Test Data**
* Product name: Blue Top
* Product name: Men Tshirt
* Product name: Sleeveless Dress
* Email: test@example.com
* Password: 123456
* Name on card: Yosh Edirisinghe
* Card number: hello
* Expiry date: 23/2029
* CVN: 123

**Expected Result**
* Payment should fail with appropriate error message
* Order should not be confirmed

**Actual Result**
* Checkout completed successfully with "Download invoice" button displayed

**Status**
* Fail

