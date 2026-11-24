SELECT * FROM Currency;

SELECT * FROM Currency WHERE abbreviation = 'EUR';

SELECT COUNT(*) FROM Currency;

SELECT * FROM Currency WHERE rate = (SELECT MAX(rate) FROM Currency);