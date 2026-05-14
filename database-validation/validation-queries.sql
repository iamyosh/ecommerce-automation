-- Verify user registration
SELECT *
FROM users
WHERE email = 'test@example.com';

-- Verify product count
SELECT COUNT(*)
FROM products;

-- Verify no negative order totals
SELECT *
FROM orders
WHERE total_amount < 0;

-- Verify duplicate emails
SELECT email, COUNT(*)
FROM users
GROUP BY email
HAVING COUNT(*) > 1;

-- Verify invalid emails
SELECT *
FROM users
WHERE email NOT LIKE '%@%';

-- Verify cart items
SELECT *
FROM cart
WHERE user_id = 1;

-- Verify order created
SELECT *
FROM orders
WHERE user_id = 1;

-- Verify payment status
SELECT *
FROM payments
WHERE payment_status = 'FAILED';

-- Verify empty product names
SELECT *
FROM products
WHERE product_name IS NULL;

--Verify order linked to valid user
SELECT orders.order_id, users.user_id
FROM orders
JOIN users
ON orders.user_id = users.user_id;