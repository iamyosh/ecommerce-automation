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